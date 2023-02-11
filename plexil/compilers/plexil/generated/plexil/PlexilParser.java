// $ANTLR 3.5.2 /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g 2022-12-23 13:02:32

package plexil;

import plexil.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PlexilParser extends Parser {
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
		"WAITING_STATE_KYWD", "WAIT_KYWD", "WHILE_KYWD", "WS", "XOR_KYWD"
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PlexilParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PlexilParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PlexilParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g"; }


	    GlobalContext m_globalContext = new GlobalContext();
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



	public static class plexilPlan_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "plexilPlan"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:308:1: plexilPlan : ( declarations )? action EOF -> ^( PLEXIL ( declarations )? action ) ;
	public final PlexilParser.plexilPlan_return plexilPlan() throws RecognitionException {
		PlexilParser.plexilPlan_return retval = new PlexilParser.plexilPlan_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope declarations1 =null;
		ParserRuleReturnScope action2 =null;

		PlexilTreeNode EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
		RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");

		 m_paraphrases.push("in plan"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:311:2: ( ( declarations )? action EOF -> ^( PLEXIL ( declarations )? action ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:312:5: ( declarations )? action EOF
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:312:5: ( declarations )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==BOOLEAN_KYWD||LA1_0==COMMAND_KYWD||LA1_0==DATE_KYWD||LA1_0==DURATION_KYWD||LA1_0==INTEGER_KYWD||LA1_0==LIBRARY_ACTION_KYWD||LA1_0==REAL_KYWD||LA1_0==STRING_KYWD) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:312:5: declarations
					{
					pushFollow(FOLLOW_declarations_in_plexilPlan1262);
					declarations1=declarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declarations.add(declarations1.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_action_in_plexilPlan1265);
			action2=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_action.add(action2.getTree());
			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_plexilPlan1267); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: declarations, action
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 313:5: -> ^( PLEXIL ( declarations )? action )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:313:8: ^( PLEXIL ( declarations )? action )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(new PlexilPlanNode(PLEXIL), root_1);
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:313:33: ( declarations )?
				if ( stream_declarations.hasNext() ) {
					adaptor.addChild(root_1, stream_declarations.nextTree());
				}
				stream_declarations.reset();

				adaptor.addChild(root_1, stream_action.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plexilPlan"


	public static class declarations_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "declarations"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:317:1: declarations : ( declaration )+ -> ^( GLOBAL_DECLARATIONS ( declaration )+ ) ;
	public final PlexilParser.declarations_return declarations() throws RecognitionException {
		PlexilParser.declarations_return retval = new PlexilParser.declarations_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope declaration4 =null;

		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:317:14: ( ( declaration )+ -> ^( GLOBAL_DECLARATIONS ( declaration )+ ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:318:5: ( declaration )+
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:318:5: ( declaration )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BOOLEAN_KYWD||LA2_0==COMMAND_KYWD||LA2_0==DATE_KYWD||LA2_0==DURATION_KYWD||LA2_0==INTEGER_KYWD||LA2_0==LIBRARY_ACTION_KYWD||LA2_0==REAL_KYWD||LA2_0==STRING_KYWD) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:318:5: declaration
					{
					pushFollow(FOLLOW_declaration_in_declarations1301);
					declaration4=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declaration.add(declaration4.getTree());
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

			// AST REWRITE
			// elements: declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 319:5: -> ^( GLOBAL_DECLARATIONS ( declaration )+ )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:319:8: ^( GLOBAL_DECLARATIONS ( declaration )+ )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(new GlobalDeclarationsNode(GLOBAL_DECLARATIONS), root_1);
				if ( !(stream_declaration.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarations"


	public static class declaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:321:1: declaration options {k=5; } : ( commandDeclaration | lookupDeclaration | libraryActionDeclaration );
	public final PlexilParser.declaration_return declaration() throws RecognitionException {
		PlexilParser.declaration_return retval = new PlexilParser.declaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope commandDeclaration5 =null;
		ParserRuleReturnScope lookupDeclaration6 =null;
		ParserRuleReturnScope libraryActionDeclaration7 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:323:2: ( commandDeclaration | lookupDeclaration | libraryActionDeclaration )
			int alt3=3;
			switch ( input.LA(1) ) {
			case COMMAND_KYWD:
				{
				alt3=1;
				}
				break;
			case BOOLEAN_KYWD:
			case DATE_KYWD:
			case DURATION_KYWD:
			case INTEGER_KYWD:
			case REAL_KYWD:
			case STRING_KYWD:
				{
				switch ( input.LA(2) ) {
				case LBRACKET:
					{
					int LA3_4 = input.LA(3);
					if ( (LA3_4==INT) ) {
						int LA3_7 = input.LA(4);
						if ( (LA3_7==RBRACKET) ) {
							int LA3_8 = input.LA(5);
							if ( (LA3_8==COMMAND_KYWD) ) {
								alt3=1;
							}
							else if ( (LA3_8==LOOKUP_KYWD) ) {
								alt3=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 8, input);
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 7, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case COMMAND_KYWD:
					{
					alt3=1;
					}
					break;
				case LOOKUP_KYWD:
					{
					alt3=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LIBRARY_ACTION_KYWD:
				{
				alt3=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:324:5: commandDeclaration
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_commandDeclaration_in_declaration1342);
					commandDeclaration5=commandDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandDeclaration5.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:325:5: lookupDeclaration
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookupDeclaration_in_declaration1348);
					lookupDeclaration6=lookupDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupDeclaration6.getTree());

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:326:5: libraryActionDeclaration
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_libraryActionDeclaration_in_declaration1354);
					libraryActionDeclaration7=libraryActionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, libraryActionDeclaration7.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class commandDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "commandDeclaration"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:333:1: commandDeclaration : ( ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) ) | ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) ) ) ;
	public final PlexilParser.commandDeclaration_return commandDeclaration() throws RecognitionException {
		PlexilParser.commandDeclaration_return retval = new PlexilParser.commandDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMAND_KYWD8=null;
		Token NCNAME9=null;
		Token SEMICOLON11=null;
		Token COMMAND_KYWD13=null;
		Token NCNAME14=null;
		Token SEMICOLON16=null;
		ParserRuleReturnScope paramsSpec10 =null;
		ParserRuleReturnScope returnType12 =null;
		ParserRuleReturnScope paramsSpec15 =null;

		PlexilTreeNode COMMAND_KYWD8_tree=null;
		PlexilTreeNode NCNAME9_tree=null;
		PlexilTreeNode SEMICOLON11_tree=null;
		PlexilTreeNode COMMAND_KYWD13_tree=null;
		PlexilTreeNode NCNAME14_tree=null;
		PlexilTreeNode SEMICOLON16_tree=null;
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_COMMAND_KYWD=new RewriteRuleTokenStream(adaptor,"token COMMAND_KYWD");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType");
		RewriteRuleSubtreeStream stream_paramsSpec=new RewriteRuleSubtreeStream(adaptor,"rule paramsSpec");

		 m_paraphrases.push("in command declaration"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:336:2: ( ( ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) ) | ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) ) ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:337:5: ( ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) ) | ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) ) )
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:337:5: ( ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) ) | ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==COMMAND_KYWD) ) {
				alt6=1;
			}
			else if ( (LA6_0==BOOLEAN_KYWD||LA6_0==DATE_KYWD||LA6_0==DURATION_KYWD||LA6_0==INTEGER_KYWD||LA6_0==REAL_KYWD||LA6_0==STRING_KYWD) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:339:7: ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) )
					{
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:339:7: ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) )
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:339:9: COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON
					{
					COMMAND_KYWD8=(Token)match(input,COMMAND_KYWD,FOLLOW_COMMAND_KYWD_in_commandDeclaration1401); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMAND_KYWD.add(COMMAND_KYWD8);

					NCNAME9=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_commandDeclaration1403); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME9);

					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:339:29: ( paramsSpec )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==LPAREN) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:339:29: paramsSpec
							{
							pushFollow(FOLLOW_paramsSpec_in_commandDeclaration1405);
							paramsSpec10=paramsSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_paramsSpec.add(paramsSpec10.getTree());
							}
							break;

					}

					SEMICOLON11=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_commandDeclaration1408); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON11);

					// AST REWRITE
					// elements: NCNAME, paramsSpec, COMMAND_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 340:9: -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:340:12: ^( COMMAND_KYWD NCNAME ( paramsSpec )? )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(new CommandDeclarationNode(stream_COMMAND_KYWD.nextToken()), root_1);
						adaptor.addChild(root_1, stream_NCNAME.nextNode());
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:340:58: ( paramsSpec )?
						if ( stream_paramsSpec.hasNext() ) {
							adaptor.addChild(root_1, stream_paramsSpec.nextTree());
						}
						stream_paramsSpec.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:344:7: ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) )
					{
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:344:7: ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) )
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:344:9: returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON
					{
					pushFollow(FOLLOW_returnType_in_commandDeclaration1458);
					returnType12=returnType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_returnType.add(returnType12.getTree());
					COMMAND_KYWD13=(Token)match(input,COMMAND_KYWD,FOLLOW_COMMAND_KYWD_in_commandDeclaration1460); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMAND_KYWD.add(COMMAND_KYWD13);

					NCNAME14=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_commandDeclaration1462); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME14);

					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:344:40: ( paramsSpec )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==LPAREN) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:344:40: paramsSpec
							{
							pushFollow(FOLLOW_paramsSpec_in_commandDeclaration1464);
							paramsSpec15=paramsSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_paramsSpec.add(paramsSpec15.getTree());
							}
							break;

					}

					SEMICOLON16=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_commandDeclaration1467); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON16);

					// AST REWRITE
					// elements: NCNAME, returnType, paramsSpec, COMMAND_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 345:10: -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:345:13: ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(new CommandDeclarationNode(stream_COMMAND_KYWD.nextToken()), root_1);
						adaptor.addChild(root_1, stream_NCNAME.nextNode());
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:345:59: ( paramsSpec )?
						if ( stream_paramsSpec.hasNext() ) {
							adaptor.addChild(root_1, stream_paramsSpec.nextTree());
						}
						stream_paramsSpec.reset();

						adaptor.addChild(root_1, stream_returnType.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commandDeclaration"


	public static class lookupDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupDeclaration"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:352:1: lookupDeclaration : returnType LOOKUP_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( LOOKUP_KYWD NCNAME returnType ( paramsSpec )? ) ;
	public final PlexilParser.lookupDeclaration_return lookupDeclaration() throws RecognitionException {
		PlexilParser.lookupDeclaration_return retval = new PlexilParser.lookupDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LOOKUP_KYWD18=null;
		Token NCNAME19=null;
		Token SEMICOLON21=null;
		ParserRuleReturnScope returnType17 =null;
		ParserRuleReturnScope paramsSpec20 =null;

		PlexilTreeNode LOOKUP_KYWD18_tree=null;
		PlexilTreeNode NCNAME19_tree=null;
		PlexilTreeNode SEMICOLON21_tree=null;
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_LOOKUP_KYWD=new RewriteRuleTokenStream(adaptor,"token LOOKUP_KYWD");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType");
		RewriteRuleSubtreeStream stream_paramsSpec=new RewriteRuleSubtreeStream(adaptor,"rule paramsSpec");

		 m_paraphrases.push("in lookup declaration"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:355:2: ( returnType LOOKUP_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( LOOKUP_KYWD NCNAME returnType ( paramsSpec )? ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:357:5: returnType LOOKUP_KYWD NCNAME ( paramsSpec )? SEMICOLON
			{
			pushFollow(FOLLOW_returnType_in_lookupDeclaration1540);
			returnType17=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_returnType.add(returnType17.getTree());
			LOOKUP_KYWD18=(Token)match(input,LOOKUP_KYWD,FOLLOW_LOOKUP_KYWD_in_lookupDeclaration1542); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LOOKUP_KYWD.add(LOOKUP_KYWD18);

			NCNAME19=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_lookupDeclaration1544); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME19);

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:357:35: ( paramsSpec )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LPAREN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:357:35: paramsSpec
					{
					pushFollow(FOLLOW_paramsSpec_in_lookupDeclaration1546);
					paramsSpec20=paramsSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramsSpec.add(paramsSpec20.getTree());
					}
					break;

			}

			SEMICOLON21=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_lookupDeclaration1549); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON21);

			// AST REWRITE
			// elements: paramsSpec, returnType, NCNAME, LOOKUP_KYWD
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 358:5: -> ^( LOOKUP_KYWD NCNAME returnType ( paramsSpec )? )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:358:8: ^( LOOKUP_KYWD NCNAME returnType ( paramsSpec )? )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(new LookupDeclarationNode(stream_LOOKUP_KYWD.nextToken()), root_1);
				adaptor.addChild(root_1, stream_NCNAME.nextNode());
				adaptor.addChild(root_1, stream_returnType.nextTree());
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:358:63: ( paramsSpec )?
				if ( stream_paramsSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_paramsSpec.nextTree());
				}
				stream_paramsSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupDeclaration"


	public static class paramsSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "paramsSpec"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:361:1: paramsSpec : LPAREN ( paramsSpecGuts )? RPAREN -> ^( PARAMETERS ( paramsSpecGuts )? ) ;
	public final PlexilParser.paramsSpec_return paramsSpec() throws RecognitionException {
		PlexilParser.paramsSpec_return retval = new PlexilParser.paramsSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN22=null;
		Token RPAREN24=null;
		ParserRuleReturnScope paramsSpecGuts23 =null;

		PlexilTreeNode LPAREN22_tree=null;
		PlexilTreeNode RPAREN24_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_paramsSpecGuts=new RewriteRuleSubtreeStream(adaptor,"rule paramsSpecGuts");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:361:12: ( LPAREN ( paramsSpecGuts )? RPAREN -> ^( PARAMETERS ( paramsSpecGuts )? ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:362:5: LPAREN ( paramsSpecGuts )? RPAREN
			{
			LPAREN22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_paramsSpec1584); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN22);

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:362:12: ( paramsSpecGuts )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ANY_KYWD||LA8_0==BOOLEAN_KYWD||LA8_0==DATE_KYWD||LA8_0==DURATION_KYWD||LA8_0==ELLIPSIS||LA8_0==INTEGER_KYWD||LA8_0==REAL_KYWD||LA8_0==STRING_KYWD) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:362:12: paramsSpecGuts
					{
					pushFollow(FOLLOW_paramsSpecGuts_in_paramsSpec1586);
					paramsSpecGuts23=paramsSpecGuts();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramsSpecGuts.add(paramsSpecGuts23.getTree());
					}
					break;

			}

			RPAREN24=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_paramsSpec1589); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN24);

			// AST REWRITE
			// elements: paramsSpecGuts
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 363:3: -> ^( PARAMETERS ( paramsSpecGuts )? )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:363:6: ^( PARAMETERS ( paramsSpecGuts )? )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:363:19: ( paramsSpecGuts )?
				if ( stream_paramsSpecGuts.hasNext() ) {
					adaptor.addChild(root_1, stream_paramsSpecGuts.nextTree());
				}
				stream_paramsSpecGuts.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramsSpec"


	public static class paramsSpecGuts_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "paramsSpecGuts"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:366:1: paramsSpecGuts : ( ( paramSpec ( COMMA ! paramSpec )* ( COMMA ! ELLIPSIS )? ) | ELLIPSIS );
	public final PlexilParser.paramsSpecGuts_return paramsSpecGuts() throws RecognitionException {
		PlexilParser.paramsSpecGuts_return retval = new PlexilParser.paramsSpecGuts_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMA26=null;
		Token COMMA28=null;
		Token ELLIPSIS29=null;
		Token ELLIPSIS30=null;
		ParserRuleReturnScope paramSpec25 =null;
		ParserRuleReturnScope paramSpec27 =null;

		PlexilTreeNode COMMA26_tree=null;
		PlexilTreeNode COMMA28_tree=null;
		PlexilTreeNode ELLIPSIS29_tree=null;
		PlexilTreeNode ELLIPSIS30_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:366:16: ( ( paramSpec ( COMMA ! paramSpec )* ( COMMA ! ELLIPSIS )? ) | ELLIPSIS )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ANY_KYWD||LA11_0==BOOLEAN_KYWD||LA11_0==DATE_KYWD||LA11_0==DURATION_KYWD||LA11_0==INTEGER_KYWD||LA11_0==REAL_KYWD||LA11_0==STRING_KYWD) ) {
				alt11=1;
			}
			else if ( (LA11_0==ELLIPSIS) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:367:7: ( paramSpec ( COMMA ! paramSpec )* ( COMMA ! ELLIPSIS )? )
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:367:7: ( paramSpec ( COMMA ! paramSpec )* ( COMMA ! ELLIPSIS )? )
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:367:9: paramSpec ( COMMA ! paramSpec )* ( COMMA ! ELLIPSIS )?
					{
					pushFollow(FOLLOW_paramSpec_in_paramsSpecGuts1618);
					paramSpec25=paramSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramSpec25.getTree());

					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:367:19: ( COMMA ! paramSpec )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							int LA9_1 = input.LA(2);
							if ( (LA9_1==ANY_KYWD||LA9_1==BOOLEAN_KYWD||LA9_1==DATE_KYWD||LA9_1==DURATION_KYWD||LA9_1==INTEGER_KYWD||LA9_1==REAL_KYWD||LA9_1==STRING_KYWD) ) {
								alt9=1;
							}

						}

						switch (alt9) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:367:21: COMMA ! paramSpec
							{
							COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsSpecGuts1622); if (state.failed) return retval;
							pushFollow(FOLLOW_paramSpec_in_paramsSpecGuts1625);
							paramSpec27=paramSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramSpec27.getTree());

							}
							break;

						default :
							break loop9;
						}
					}

					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:367:41: ( COMMA ! ELLIPSIS )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==COMMA) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:367:43: COMMA ! ELLIPSIS
							{
							COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsSpecGuts1632); if (state.failed) return retval;
							ELLIPSIS29=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_paramsSpecGuts1635); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ELLIPSIS29_tree = (PlexilTreeNode)adaptor.create(ELLIPSIS29);
							adaptor.addChild(root_0, ELLIPSIS29_tree);
							}

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:368:9: ELLIPSIS
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					ELLIPSIS30=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_paramsSpecGuts1650); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELLIPSIS30_tree = (PlexilTreeNode)adaptor.create(ELLIPSIS30);
					adaptor.addChild(root_0, ELLIPSIS30_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramsSpecGuts"


	public static class paramSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "paramSpec"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:371:1: paramSpec options {k=2; } : ( ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT ) | ( baseTypeName NCNAME LBRACKET )=> baseTypeName NCNAME LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT NCNAME ) | paramTypeName ^ ( NCNAME )? );
	public final PlexilParser.paramSpec_return paramSpec() throws RecognitionException {
		PlexilParser.paramSpec_return retval = new PlexilParser.paramSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LBRACKET32=null;
		Token INT33=null;
		Token RBRACKET34=null;
		Token NCNAME36=null;
		Token LBRACKET37=null;
		Token INT38=null;
		Token RBRACKET39=null;
		Token NCNAME41=null;
		ParserRuleReturnScope baseTypeName31 =null;
		ParserRuleReturnScope baseTypeName35 =null;
		ParserRuleReturnScope paramTypeName40 =null;

		PlexilTreeNode LBRACKET32_tree=null;
		PlexilTreeNode INT33_tree=null;
		PlexilTreeNode RBRACKET34_tree=null;
		PlexilTreeNode NCNAME36_tree=null;
		PlexilTreeNode LBRACKET37_tree=null;
		PlexilTreeNode INT38_tree=null;
		PlexilTreeNode RBRACKET39_tree=null;
		PlexilTreeNode NCNAME41_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_baseTypeName=new RewriteRuleSubtreeStream(adaptor,"rule baseTypeName");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:373:2: ( ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT ) | ( baseTypeName NCNAME LBRACKET )=> baseTypeName NCNAME LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT NCNAME ) | paramTypeName ^ ( NCNAME )? )
			int alt13=3;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BOOLEAN_KYWD||LA13_0==DATE_KYWD||LA13_0==DURATION_KYWD||LA13_0==INTEGER_KYWD||LA13_0==REAL_KYWD||LA13_0==STRING_KYWD) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==LBRACKET) && (synpred1_Plexil())) {
					alt13=1;
				}
				else if ( (LA13_1==NCNAME) ) {
					int LA13_4 = input.LA(3);
					if ( (synpred2_Plexil()) ) {
						alt13=2;
					}
					else if ( (true) ) {
						alt13=3;
					}

				}
				else if ( (LA13_1==COMMA||LA13_1==RPAREN) ) {
					alt13=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA13_0==ANY_KYWD) ) {
				alt13=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:374:5: ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET
					{
					pushFollow(FOLLOW_baseTypeName_in_paramSpec1691);
					baseTypeName31=baseTypeName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_baseTypeName.add(baseTypeName31.getTree());
					LBRACKET32=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_paramSpec1693); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET32);

					INT33=(Token)match(input,INT,FOLLOW_INT_in_paramSpec1695); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT33);

					RBRACKET34=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_paramSpec1697); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET34);

					// AST REWRITE
					// elements: baseTypeName, INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 375:42: -> ^( ARRAY_TYPE baseTypeName INT )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:375:45: ^( ARRAY_TYPE baseTypeName INT )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_TYPE, "ARRAY_TYPE"), root_1);
						adaptor.addChild(root_1, stream_baseTypeName.nextTree());
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:376:5: ( baseTypeName NCNAME LBRACKET )=> baseTypeName NCNAME LBRACKET INT RBRACKET
					{
					pushFollow(FOLLOW_baseTypeName_in_paramSpec1729);
					baseTypeName35=baseTypeName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_baseTypeName.add(baseTypeName35.getTree());
					NCNAME36=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_paramSpec1731); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME36);

					LBRACKET37=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_paramSpec1733); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET37);

					INT38=(Token)match(input,INT,FOLLOW_INT_in_paramSpec1735); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT38);

					RBRACKET39=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_paramSpec1737); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET39);

					// AST REWRITE
					// elements: INT, NCNAME, baseTypeName
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 377:49: -> ^( ARRAY_TYPE baseTypeName INT NCNAME )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:377:52: ^( ARRAY_TYPE baseTypeName INT NCNAME )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_TYPE, "ARRAY_TYPE"), root_1);
						adaptor.addChild(root_1, stream_baseTypeName.nextTree());
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_1, stream_NCNAME.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:378:5: paramTypeName ^ ( NCNAME )?
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_paramTypeName_in_paramSpec1755);
					paramTypeName40=paramTypeName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(paramTypeName40.getTree(), root_0);
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:378:20: ( NCNAME )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==NCNAME) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:378:20: NCNAME
							{
							NCNAME41=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_paramSpec1758); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NCNAME41_tree = (PlexilTreeNode)adaptor.create(NCNAME41);
							adaptor.addChild(root_0, NCNAME41_tree);
							}

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramSpec"


	public static class paramTypeName_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "paramTypeName"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:381:1: paramTypeName : ( ANY_KYWD | BOOLEAN_KYWD | INTEGER_KYWD | REAL_KYWD | STRING_KYWD | DATE_KYWD | DURATION_KYWD );
	public final PlexilParser.paramTypeName_return paramTypeName() throws RecognitionException {
		PlexilParser.paramTypeName_return retval = new PlexilParser.paramTypeName_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set42=null;

		PlexilTreeNode set42_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:382:5: ( ANY_KYWD | BOOLEAN_KYWD | INTEGER_KYWD | REAL_KYWD | STRING_KYWD | DATE_KYWD | DURATION_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set42=input.LT(1);
			if ( input.LA(1)==ANY_KYWD||input.LA(1)==BOOLEAN_KYWD||input.LA(1)==DATE_KYWD||input.LA(1)==DURATION_KYWD||input.LA(1)==INTEGER_KYWD||input.LA(1)==REAL_KYWD||input.LA(1)==STRING_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set42));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramTypeName"


	public static class returnType_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "returnType"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:391:1: returnType : returnTypeSpec -> ^( RETURNS_KYWD returnTypeSpec ) ;
	public final PlexilParser.returnType_return returnType() throws RecognitionException {
		PlexilParser.returnType_return retval = new PlexilParser.returnType_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope returnTypeSpec43 =null;

		RewriteRuleSubtreeStream stream_returnTypeSpec=new RewriteRuleSubtreeStream(adaptor,"rule returnTypeSpec");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:391:12: ( returnTypeSpec -> ^( RETURNS_KYWD returnTypeSpec ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:392:5: returnTypeSpec
			{
			pushFollow(FOLLOW_returnTypeSpec_in_returnType1838);
			returnTypeSpec43=returnTypeSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_returnTypeSpec.add(returnTypeSpec43.getTree());
			// AST REWRITE
			// elements: returnTypeSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 392:20: -> ^( RETURNS_KYWD returnTypeSpec )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:392:23: ^( RETURNS_KYWD returnTypeSpec )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(RETURNS_KYWD, "RETURNS_KYWD"), root_1);
				adaptor.addChild(root_1, stream_returnTypeSpec.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "returnType"


	public static class returnTypeSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "returnTypeSpec"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:395:1: returnTypeSpec : ( ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT ) | baseTypeName );
	public final PlexilParser.returnTypeSpec_return returnTypeSpec() throws RecognitionException {
		PlexilParser.returnTypeSpec_return retval = new PlexilParser.returnTypeSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LBRACKET45=null;
		Token INT46=null;
		Token RBRACKET47=null;
		ParserRuleReturnScope baseTypeName44 =null;
		ParserRuleReturnScope baseTypeName48 =null;

		PlexilTreeNode LBRACKET45_tree=null;
		PlexilTreeNode INT46_tree=null;
		PlexilTreeNode RBRACKET47_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleSubtreeStream stream_baseTypeName=new RewriteRuleSubtreeStream(adaptor,"rule baseTypeName");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:395:16: ( ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT ) | baseTypeName )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==BOOLEAN_KYWD||LA14_0==DATE_KYWD||LA14_0==DURATION_KYWD||LA14_0==INTEGER_KYWD||LA14_0==REAL_KYWD||LA14_0==STRING_KYWD) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==LBRACKET) && (synpred3_Plexil())) {
					alt14=1;
				}
				else if ( (LA14_1==COMMAND_KYWD||LA14_1==LOOKUP_KYWD) ) {
					alt14=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:396:5: ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET
					{
					pushFollow(FOLLOW_baseTypeName_in_returnTypeSpec1874);
					baseTypeName44=baseTypeName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_baseTypeName.add(baseTypeName44.getTree());
					LBRACKET45=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_returnTypeSpec1876); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET45);

					INT46=(Token)match(input,INT,FOLLOW_INT_in_returnTypeSpec1878); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT46);

					RBRACKET47=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_returnTypeSpec1880); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET47);

					// AST REWRITE
					// elements: INT, baseTypeName
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 397:42: -> ^( ARRAY_TYPE baseTypeName INT )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:397:45: ^( ARRAY_TYPE baseTypeName INT )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_TYPE, "ARRAY_TYPE"), root_1);
						adaptor.addChild(root_1, stream_baseTypeName.nextTree());
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:398:5: baseTypeName
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_baseTypeName_in_returnTypeSpec1896);
					baseTypeName48=baseTypeName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, baseTypeName48.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "returnTypeSpec"


	public static class baseTypeName_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "baseTypeName"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:401:1: baseTypeName : ( BOOLEAN_KYWD | INTEGER_KYWD | REAL_KYWD | STRING_KYWD | DATE_KYWD | DURATION_KYWD );
	public final PlexilParser.baseTypeName_return baseTypeName() throws RecognitionException {
		PlexilParser.baseTypeName_return retval = new PlexilParser.baseTypeName_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set49=null;

		PlexilTreeNode set49_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:401:14: ( BOOLEAN_KYWD | INTEGER_KYWD | REAL_KYWD | STRING_KYWD | DATE_KYWD | DURATION_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set49=input.LT(1);
			if ( input.LA(1)==BOOLEAN_KYWD||input.LA(1)==DATE_KYWD||input.LA(1)==DURATION_KYWD||input.LA(1)==INTEGER_KYWD||input.LA(1)==REAL_KYWD||input.LA(1)==STRING_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set49));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "baseTypeName"


	public static class libraryActionDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "libraryActionDeclaration"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:410:1: libraryActionDeclaration : LIBRARY_ACTION_KYWD ^ NCNAME ( libraryInterfaceSpec )? SEMICOLON !;
	public final PlexilParser.libraryActionDeclaration_return libraryActionDeclaration() throws RecognitionException {
		PlexilParser.libraryActionDeclaration_return retval = new PlexilParser.libraryActionDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LIBRARY_ACTION_KYWD50=null;
		Token NCNAME51=null;
		Token SEMICOLON53=null;
		ParserRuleReturnScope libraryInterfaceSpec52 =null;

		PlexilTreeNode LIBRARY_ACTION_KYWD50_tree=null;
		PlexilTreeNode NCNAME51_tree=null;
		PlexilTreeNode SEMICOLON53_tree=null;

		 m_paraphrases.push("in library action declaration"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:413:2: ( LIBRARY_ACTION_KYWD ^ NCNAME ( libraryInterfaceSpec )? SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:414:5: LIBRARY_ACTION_KYWD ^ NCNAME ( libraryInterfaceSpec )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			LIBRARY_ACTION_KYWD50=(Token)match(input,LIBRARY_ACTION_KYWD,FOLLOW_LIBRARY_ACTION_KYWD_in_libraryActionDeclaration1966); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LIBRARY_ACTION_KYWD50_tree = (PlexilTreeNode)adaptor.create(LIBRARY_ACTION_KYWD50);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(LIBRARY_ACTION_KYWD50_tree, root_0);
			}

			NCNAME51=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_libraryActionDeclaration1969); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME51_tree = (PlexilTreeNode)adaptor.create(NCNAME51);
			adaptor.addChild(root_0, NCNAME51_tree);
			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:414:33: ( libraryInterfaceSpec )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==LPAREN) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:414:33: libraryInterfaceSpec
					{
					pushFollow(FOLLOW_libraryInterfaceSpec_in_libraryActionDeclaration1971);
					libraryInterfaceSpec52=libraryInterfaceSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, libraryInterfaceSpec52.getTree());

					}
					break;

			}

			SEMICOLON53=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_libraryActionDeclaration1974); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "libraryActionDeclaration"


	public static class libraryInterfaceSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "libraryInterfaceSpec"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:417:1: libraryInterfaceSpec : LPAREN ( libraryParamSpec ( COMMA libraryParamSpec )* )? RPAREN -> ^( PARAMETERS ( libraryParamSpec )* ) ;
	public final PlexilParser.libraryInterfaceSpec_return libraryInterfaceSpec() throws RecognitionException {
		PlexilParser.libraryInterfaceSpec_return retval = new PlexilParser.libraryInterfaceSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN54=null;
		Token COMMA56=null;
		Token RPAREN58=null;
		ParserRuleReturnScope libraryParamSpec55 =null;
		ParserRuleReturnScope libraryParamSpec57 =null;

		PlexilTreeNode LPAREN54_tree=null;
		PlexilTreeNode COMMA56_tree=null;
		PlexilTreeNode RPAREN58_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_libraryParamSpec=new RewriteRuleSubtreeStream(adaptor,"rule libraryParamSpec");

		 m_paraphrases.push("in library action interface declaration"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:420:2: ( LPAREN ( libraryParamSpec ( COMMA libraryParamSpec )* )? RPAREN -> ^( PARAMETERS ( libraryParamSpec )* ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:421:5: LPAREN ( libraryParamSpec ( COMMA libraryParamSpec )* )? RPAREN
			{
			LPAREN54=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_libraryInterfaceSpec1999); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN54);

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:421:12: ( libraryParamSpec ( COMMA libraryParamSpec )* )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= IN_KYWD && LA17_0 <= IN_OUT_KYWD)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:421:14: libraryParamSpec ( COMMA libraryParamSpec )*
					{
					pushFollow(FOLLOW_libraryParamSpec_in_libraryInterfaceSpec2003);
					libraryParamSpec55=libraryParamSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_libraryParamSpec.add(libraryParamSpec55.getTree());
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:421:31: ( COMMA libraryParamSpec )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==COMMA) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:421:33: COMMA libraryParamSpec
							{
							COMMA56=(Token)match(input,COMMA,FOLLOW_COMMA_in_libraryInterfaceSpec2007); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA56);

							pushFollow(FOLLOW_libraryParamSpec_in_libraryInterfaceSpec2009);
							libraryParamSpec57=libraryParamSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_libraryParamSpec.add(libraryParamSpec57.getTree());
							}
							break;

						default :
							break loop16;
						}
					}

					}
					break;

			}

			RPAREN58=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_libraryInterfaceSpec2017); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN58);

			// AST REWRITE
			// elements: libraryParamSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 422:5: -> ^( PARAMETERS ( libraryParamSpec )* )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:422:8: ^( PARAMETERS ( libraryParamSpec )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:422:21: ( libraryParamSpec )*
				while ( stream_libraryParamSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_libraryParamSpec.nextTree());
				}
				stream_libraryParamSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "libraryInterfaceSpec"


	public static class libraryParamSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "libraryParamSpec"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:425:1: libraryParamSpec : ( IN_KYWD ^| IN_OUT_KYWD ^) baseTypeName ( ( NCNAME LBRACKET )=> NCNAME LBRACKET ! INT RBRACKET !| NCNAME ) ;
	public final PlexilParser.libraryParamSpec_return libraryParamSpec() throws RecognitionException {
		PlexilParser.libraryParamSpec_return retval = new PlexilParser.libraryParamSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token IN_KYWD59=null;
		Token IN_OUT_KYWD60=null;
		Token NCNAME62=null;
		Token LBRACKET63=null;
		Token INT64=null;
		Token RBRACKET65=null;
		Token NCNAME66=null;
		ParserRuleReturnScope baseTypeName61 =null;

		PlexilTreeNode IN_KYWD59_tree=null;
		PlexilTreeNode IN_OUT_KYWD60_tree=null;
		PlexilTreeNode NCNAME62_tree=null;
		PlexilTreeNode LBRACKET63_tree=null;
		PlexilTreeNode INT64_tree=null;
		PlexilTreeNode RBRACKET65_tree=null;
		PlexilTreeNode NCNAME66_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:425:18: ( ( IN_KYWD ^| IN_OUT_KYWD ^) baseTypeName ( ( NCNAME LBRACKET )=> NCNAME LBRACKET ! INT RBRACKET !| NCNAME ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:426:2: ( IN_KYWD ^| IN_OUT_KYWD ^) baseTypeName ( ( NCNAME LBRACKET )=> NCNAME LBRACKET ! INT RBRACKET !| NCNAME )
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:426:2: ( IN_KYWD ^| IN_OUT_KYWD ^)
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==IN_KYWD) ) {
				alt18=1;
			}
			else if ( (LA18_0==IN_OUT_KYWD) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:426:4: IN_KYWD ^
					{
					IN_KYWD59=(Token)match(input,IN_KYWD,FOLLOW_IN_KYWD_in_libraryParamSpec2043); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IN_KYWD59_tree = (PlexilTreeNode)adaptor.create(IN_KYWD59);
					root_0 = (PlexilTreeNode)adaptor.becomeRoot(IN_KYWD59_tree, root_0);
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:426:15: IN_OUT_KYWD ^
					{
					IN_OUT_KYWD60=(Token)match(input,IN_OUT_KYWD,FOLLOW_IN_OUT_KYWD_in_libraryParamSpec2048); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IN_OUT_KYWD60_tree = (PlexilTreeNode)adaptor.create(IN_OUT_KYWD60);
					root_0 = (PlexilTreeNode)adaptor.becomeRoot(IN_OUT_KYWD60_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_baseTypeName_in_libraryParamSpec2054);
			baseTypeName61=baseTypeName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, baseTypeName61.getTree());

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:428:2: ( ( NCNAME LBRACKET )=> NCNAME LBRACKET ! INT RBRACKET !| NCNAME )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==NCNAME) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==LBRACKET) && (synpred4_Plexil())) {
					alt19=1;
				}
				else if ( (LA19_1==COMMA||LA19_1==RPAREN) ) {
					alt19=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:428:4: ( NCNAME LBRACKET )=> NCNAME LBRACKET ! INT RBRACKET !
					{
					NCNAME62=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_libraryParamSpec2067); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME62_tree = (PlexilTreeNode)adaptor.create(NCNAME62);
					adaptor.addChild(root_0, NCNAME62_tree);
					}

					LBRACKET63=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_libraryParamSpec2069); if (state.failed) return retval;
					INT64=(Token)match(input,INT,FOLLOW_INT_in_libraryParamSpec2072); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT64_tree = (PlexilTreeNode)adaptor.create(INT64);
					adaptor.addChild(root_0, INT64_tree);
					}

					RBRACKET65=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_libraryParamSpec2074); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:429:4: NCNAME
					{
					NCNAME66=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_libraryParamSpec2081); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME66_tree = (PlexilTreeNode)adaptor.create(NCNAME66);
					adaptor.addChild(root_0, NCNAME66_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "libraryParamSpec"


	public static class action_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "action"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:437:1: action : (actionId= NCNAME COLON )? rest= baseAction -> ^( ACTION ( $actionId)? $rest) ;
	public final PlexilParser.action_return action() throws RecognitionException {
		PlexilParser.action_return retval = new PlexilParser.action_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token actionId=null;
		Token COLON67=null;
		ParserRuleReturnScope rest =null;

		PlexilTreeNode actionId_tree=null;
		PlexilTreeNode COLON67_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_baseAction=new RewriteRuleSubtreeStream(adaptor,"rule baseAction");

		 m_paraphrases.push("in action"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:440:2: ( (actionId= NCNAME COLON )? rest= baseAction -> ^( ACTION ( $actionId)? $rest) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:441:5: (actionId= NCNAME COLON )? rest= baseAction
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:441:5: (actionId= NCNAME COLON )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==NCNAME) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==COLON) ) {
					alt20=1;
				}
			}
			switch (alt20) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:441:6: actionId= NCNAME COLON
					{
					actionId=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_action2116); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCNAME.add(actionId);

					COLON67=(Token)match(input,COLON,FOLLOW_COLON_in_action2118); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON.add(COLON67);

					}
					break;

			}

			pushFollow(FOLLOW_baseAction_in_action2125);
			rest=baseAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_baseAction.add(rest.getTree());
			// AST REWRITE
			// elements: actionId, rest
			// token labels: actionId
			// rule labels: rest, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_actionId=new RewriteRuleTokenStream(adaptor,"token actionId",actionId);
			RewriteRuleSubtreeStream stream_rest=new RewriteRuleSubtreeStream(adaptor,"rule rest",rest!=null?rest.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 443:5: -> ^( ACTION ( $actionId)? $rest)
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:443:8: ^( ACTION ( $actionId)? $rest)
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ACTION, "ACTION"), root_1);
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:443:18: ( $actionId)?
				if ( stream_actionId.hasNext() ) {
					adaptor.addChild(root_1, stream_actionId.nextNode());
				}
				stream_actionId.reset();

				adaptor.addChild(root_1, stream_rest.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "action"


	public static class baseAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "baseAction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:446:1: baseAction : ( ifAction | forAction | onCommandAction | onMessageAction | doAction | whileAction | block | simpleAction );
	public final PlexilParser.baseAction_return baseAction() throws RecognitionException {
		PlexilParser.baseAction_return retval = new PlexilParser.baseAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope ifAction68 =null;
		ParserRuleReturnScope forAction69 =null;
		ParserRuleReturnScope onCommandAction70 =null;
		ParserRuleReturnScope onMessageAction71 =null;
		ParserRuleReturnScope doAction72 =null;
		ParserRuleReturnScope whileAction73 =null;
		ParserRuleReturnScope block74 =null;
		ParserRuleReturnScope simpleAction75 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:446:12: ( ifAction | forAction | onCommandAction | onMessageAction | doAction | whileAction | block | simpleAction )
			int alt21=8;
			switch ( input.LA(1) ) {
			case IF_KYWD:
				{
				alt21=1;
				}
				break;
			case FOR_KYWD:
				{
				alt21=2;
				}
				break;
			case ON_COMMAND_KYWD:
				{
				alt21=3;
				}
				break;
			case ON_MESSAGE_KYWD:
				{
				alt21=4;
				}
				break;
			case DO_KYWD:
				{
				alt21=5;
				}
				break;
			case WHILE_KYWD:
				{
				alt21=6;
				}
				break;
			case CHECKED_SEQUENCE_KYWD:
			case CONCURRENCE_KYWD:
			case LBRACE:
			case SEQUENCE_KYWD:
			case TRY_KYWD:
			case UNCHECKED_SEQUENCE_KYWD:
				{
				alt21=7;
				}
				break;
			case LIBRARY_CALL_KYWD:
			case LPAREN:
			case NCNAME:
			case REQUEST_KYWD:
			case SYNCHRONOUS_COMMAND_KYWD:
			case UPDATE_KYWD:
			case WAIT_KYWD:
				{
				alt21=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:447:6: ifAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_ifAction_in_baseAction2157);
					ifAction68=ifAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifAction68.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:448:8: forAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_forAction_in_baseAction2166);
					forAction69=forAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forAction69.getTree());

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:449:8: onCommandAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_onCommandAction_in_baseAction2175);
					onCommandAction70=onCommandAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, onCommandAction70.getTree());

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:450:8: onMessageAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_onMessageAction_in_baseAction2184);
					onMessageAction71=onMessageAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, onMessageAction71.getTree());

					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:451:8: doAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_doAction_in_baseAction2193);
					doAction72=doAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doAction72.getTree());

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:452:8: whileAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_whileAction_in_baseAction2202);
					whileAction73=whileAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileAction73.getTree());

					}
					break;
				case 7 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:453:8: block
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_block_in_baseAction2211);
					block74=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block74.getTree());

					}
					break;
				case 8 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:454:8: simpleAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_simpleAction_in_baseAction2220);
					simpleAction75=simpleAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleAction75.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "baseAction"


	public static class simpleAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "simpleAction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:458:1: simpleAction : ( ( NCNAME ( LBRACKET | EQUALS ) )=> assignment | ( ( NCNAME LPAREN ) | LPAREN )=> commandInvocation SEMICOLON !| libraryCall | request | update | synchCmd | waitBuiltin );
	public final PlexilParser.simpleAction_return simpleAction() throws RecognitionException {
		PlexilParser.simpleAction_return retval = new PlexilParser.simpleAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token SEMICOLON78=null;
		ParserRuleReturnScope assignment76 =null;
		ParserRuleReturnScope commandInvocation77 =null;
		ParserRuleReturnScope libraryCall79 =null;
		ParserRuleReturnScope request80 =null;
		ParserRuleReturnScope update81 =null;
		ParserRuleReturnScope synchCmd82 =null;
		ParserRuleReturnScope waitBuiltin83 =null;

		PlexilTreeNode SEMICOLON78_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:458:14: ( ( NCNAME ( LBRACKET | EQUALS ) )=> assignment | ( ( NCNAME LPAREN ) | LPAREN )=> commandInvocation SEMICOLON !| libraryCall | request | update | synchCmd | waitBuiltin )
			int alt22=7;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==NCNAME) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==LBRACKET) && (synpred5_Plexil())) {
					alt22=1;
				}
				else if ( (LA22_1==EQUALS) && (synpred5_Plexil())) {
					alt22=1;
				}
				else if ( (LA22_1==LPAREN) && (synpred6_Plexil())) {
					alt22=2;
				}

			}
			else if ( (LA22_0==LPAREN) && (synpred6_Plexil())) {
				alt22=2;
			}
			else if ( (LA22_0==LIBRARY_CALL_KYWD) ) {
				alt22=3;
			}
			else if ( (LA22_0==REQUEST_KYWD) ) {
				alt22=4;
			}
			else if ( (LA22_0==UPDATE_KYWD) ) {
				alt22=5;
			}
			else if ( (LA22_0==SYNCHRONOUS_COMMAND_KYWD) ) {
				alt22=6;
			}
			else if ( (LA22_0==WAIT_KYWD) ) {
				alt22=7;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:459:5: ( NCNAME ( LBRACKET | EQUALS ) )=> assignment
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_simpleAction2249);
					assignment76=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment76.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:460:5: ( ( NCNAME LPAREN ) | LPAREN )=> commandInvocation SEMICOLON !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_commandInvocation_in_simpleAction2269);
					commandInvocation77=commandInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandInvocation77.getTree());

					SEMICOLON78=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_simpleAction2271); if (state.failed) return retval;
					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:461:5: libraryCall
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_libraryCall_in_simpleAction2278);
					libraryCall79=libraryCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, libraryCall79.getTree());

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:462:5: request
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_request_in_simpleAction2284);
					request80=request();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, request80.getTree());

					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:463:5: update
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_update_in_simpleAction2290);
					update81=update();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, update81.getTree());

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:464:5: synchCmd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_synchCmd_in_simpleAction2296);
					synchCmd82=synchCmd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, synchCmd82.getTree());

					}
					break;
				case 7 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:465:5: waitBuiltin
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_waitBuiltin_in_simpleAction2302);
					waitBuiltin83=waitBuiltin();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, waitBuiltin83.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleAction"


	public static class forAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "forAction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:468:1: forAction : FOR_KYWD LPAREN baseTypeName NCNAME EQUALS loopvarinit= expression SEMICOLON endtest= expression SEMICOLON loopvarupdate= expression RPAREN action -> ^( FOR_KYWD ^( VARIABLE_DECLARATION baseTypeName NCNAME $loopvarinit) $endtest $loopvarupdate action ) ;
	public final PlexilParser.forAction_return forAction() throws RecognitionException {
		PlexilParser.forAction_return retval = new PlexilParser.forAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token FOR_KYWD84=null;
		Token LPAREN85=null;
		Token NCNAME87=null;
		Token EQUALS88=null;
		Token SEMICOLON89=null;
		Token SEMICOLON90=null;
		Token RPAREN91=null;
		ParserRuleReturnScope loopvarinit =null;
		ParserRuleReturnScope endtest =null;
		ParserRuleReturnScope loopvarupdate =null;
		ParserRuleReturnScope baseTypeName86 =null;
		ParserRuleReturnScope action92 =null;

		PlexilTreeNode FOR_KYWD84_tree=null;
		PlexilTreeNode LPAREN85_tree=null;
		PlexilTreeNode NCNAME87_tree=null;
		PlexilTreeNode EQUALS88_tree=null;
		PlexilTreeNode SEMICOLON89_tree=null;
		PlexilTreeNode SEMICOLON90_tree=null;
		PlexilTreeNode RPAREN91_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_FOR_KYWD=new RewriteRuleTokenStream(adaptor,"token FOR_KYWD");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_baseTypeName=new RewriteRuleSubtreeStream(adaptor,"rule baseTypeName");
		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");

		 m_paraphrases.push("in \"for\" statement"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:471:2: ( FOR_KYWD LPAREN baseTypeName NCNAME EQUALS loopvarinit= expression SEMICOLON endtest= expression SEMICOLON loopvarupdate= expression RPAREN action -> ^( FOR_KYWD ^( VARIABLE_DECLARATION baseTypeName NCNAME $loopvarinit) $endtest $loopvarupdate action ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:472:5: FOR_KYWD LPAREN baseTypeName NCNAME EQUALS loopvarinit= expression SEMICOLON endtest= expression SEMICOLON loopvarupdate= expression RPAREN action
			{
			FOR_KYWD84=(Token)match(input,FOR_KYWD,FOLLOW_FOR_KYWD_in_forAction2327); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR_KYWD.add(FOR_KYWD84);

			LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forAction2334); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN85);

			pushFollow(FOLLOW_baseTypeName_in_forAction2336);
			baseTypeName86=baseTypeName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_baseTypeName.add(baseTypeName86.getTree());
			NCNAME87=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_forAction2338); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME87);

			EQUALS88=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_forAction2340); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS88);

			pushFollow(FOLLOW_expression_in_forAction2344);
			loopvarinit=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(loopvarinit.getTree());
			SEMICOLON89=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forAction2350); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON89);

			pushFollow(FOLLOW_expression_in_forAction2354);
			endtest=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(endtest.getTree());
			SEMICOLON90=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forAction2360); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON90);

			pushFollow(FOLLOW_expression_in_forAction2364);
			loopvarupdate=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(loopvarupdate.getTree());
			RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forAction2370); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);

			pushFollow(FOLLOW_action_in_forAction2376);
			action92=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_action.add(action92.getTree());
			// AST REWRITE
			// elements: endtest, action, loopvarupdate, FOR_KYWD, loopvarinit, NCNAME, baseTypeName
			// token labels: 
			// rule labels: loopvarupdate, loopvarinit, endtest, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_loopvarupdate=new RewriteRuleSubtreeStream(adaptor,"rule loopvarupdate",loopvarupdate!=null?loopvarupdate.getTree():null);
			RewriteRuleSubtreeStream stream_loopvarinit=new RewriteRuleSubtreeStream(adaptor,"rule loopvarinit",loopvarinit!=null?loopvarinit.getTree():null);
			RewriteRuleSubtreeStream stream_endtest=new RewriteRuleSubtreeStream(adaptor,"rule endtest",endtest!=null?endtest.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 478:5: -> ^( FOR_KYWD ^( VARIABLE_DECLARATION baseTypeName NCNAME $loopvarinit) $endtest $loopvarupdate action )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:478:8: ^( FOR_KYWD ^( VARIABLE_DECLARATION baseTypeName NCNAME $loopvarinit) $endtest $loopvarupdate action )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_FOR_KYWD.nextNode(), root_1);
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:478:19: ^( VARIABLE_DECLARATION baseTypeName NCNAME $loopvarinit)
				{
				PlexilTreeNode root_2 = (PlexilTreeNode)adaptor.nil();
				root_2 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_2);
				adaptor.addChild(root_2, stream_baseTypeName.nextTree());
				adaptor.addChild(root_2, stream_NCNAME.nextNode());
				adaptor.addChild(root_2, stream_loopvarinit.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_endtest.nextTree());
				adaptor.addChild(root_1, stream_loopvarupdate.nextTree());
				adaptor.addChild(root_1, stream_action.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forAction"


	public static class ifAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "ifAction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:483:1: ifAction : IF_KYWD ^ expression consequentAction ( ELSEIF_KYWD ! expression consequentAction )* ( ELSE_KYWD ! action )? ( ENDIF_KYWD !)? ( SEMICOLON !)? ;
	public final PlexilParser.ifAction_return ifAction() throws RecognitionException {
		PlexilParser.ifAction_return retval = new PlexilParser.ifAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token IF_KYWD93=null;
		Token ELSEIF_KYWD96=null;
		Token ELSE_KYWD99=null;
		Token ENDIF_KYWD101=null;
		Token SEMICOLON102=null;
		ParserRuleReturnScope expression94 =null;
		ParserRuleReturnScope consequentAction95 =null;
		ParserRuleReturnScope expression97 =null;
		ParserRuleReturnScope consequentAction98 =null;
		ParserRuleReturnScope action100 =null;

		PlexilTreeNode IF_KYWD93_tree=null;
		PlexilTreeNode ELSEIF_KYWD96_tree=null;
		PlexilTreeNode ELSE_KYWD99_tree=null;
		PlexilTreeNode ENDIF_KYWD101_tree=null;
		PlexilTreeNode SEMICOLON102_tree=null;

		 m_paraphrases.push("in \"if\" statement"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:486:2: ( IF_KYWD ^ expression consequentAction ( ELSEIF_KYWD ! expression consequentAction )* ( ELSE_KYWD ! action )? ( ENDIF_KYWD !)? ( SEMICOLON !)? )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:487:5: IF_KYWD ^ expression consequentAction ( ELSEIF_KYWD ! expression consequentAction )* ( ELSE_KYWD ! action )? ( ENDIF_KYWD !)? ( SEMICOLON !)?
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			IF_KYWD93=(Token)match(input,IF_KYWD,FOLLOW_IF_KYWD_in_ifAction2432); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF_KYWD93_tree = (PlexilTreeNode)adaptor.create(IF_KYWD93);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(IF_KYWD93_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_ifAction2435);
			expression94=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression94.getTree());

			pushFollow(FOLLOW_consequentAction_in_ifAction2437);
			consequentAction95=consequentAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, consequentAction95.getTree());

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:488:5: ( ELSEIF_KYWD ! expression consequentAction )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==ELSEIF_KYWD) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:488:6: ELSEIF_KYWD ! expression consequentAction
					{
					ELSEIF_KYWD96=(Token)match(input,ELSEIF_KYWD,FOLLOW_ELSEIF_KYWD_in_ifAction2444); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ifAction2447);
					expression97=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression97.getTree());

					pushFollow(FOLLOW_consequentAction_in_ifAction2449);
					consequentAction98=consequentAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, consequentAction98.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:489:5: ( ELSE_KYWD ! action )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ELSE_KYWD) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:489:6: ELSE_KYWD ! action
					{
					ELSE_KYWD99=(Token)match(input,ELSE_KYWD,FOLLOW_ELSE_KYWD_in_ifAction2458); if (state.failed) return retval;
					pushFollow(FOLLOW_action_in_ifAction2461);
					action100=action();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, action100.getTree());

					}
					break;

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:490:15: ( ENDIF_KYWD !)?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==ENDIF_KYWD) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:490:15: ENDIF_KYWD !
					{
					ENDIF_KYWD101=(Token)match(input,ENDIF_KYWD,FOLLOW_ENDIF_KYWD_in_ifAction2469); if (state.failed) return retval;
					}
					break;

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:491:14: ( SEMICOLON !)?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==SEMICOLON) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:491:14: SEMICOLON !
					{
					SEMICOLON102=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_ifAction2477); if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifAction"


	public static class consequentAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "consequentAction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:494:1: consequentAction : (actionId= NCNAME COLON )? rest= consequent -> ^( ACTION ( $actionId)? $rest) ;
	public final PlexilParser.consequentAction_return consequentAction() throws RecognitionException {
		PlexilParser.consequentAction_return retval = new PlexilParser.consequentAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token actionId=null;
		Token COLON103=null;
		ParserRuleReturnScope rest =null;

		PlexilTreeNode actionId_tree=null;
		PlexilTreeNode COLON103_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_consequent=new RewriteRuleSubtreeStream(adaptor,"rule consequent");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:494:18: ( (actionId= NCNAME COLON )? rest= consequent -> ^( ACTION ( $actionId)? $rest) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:495:5: (actionId= NCNAME COLON )? rest= consequent
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:495:5: (actionId= NCNAME COLON )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==NCNAME) ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1==COLON) ) {
					alt27=1;
				}
			}
			switch (alt27) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:495:6: actionId= NCNAME COLON
					{
					actionId=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_consequentAction2496); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCNAME.add(actionId);

					COLON103=(Token)match(input,COLON,FOLLOW_COLON_in_consequentAction2498); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON.add(COLON103);

					}
					break;

			}

			pushFollow(FOLLOW_consequent_in_consequentAction2505);
			rest=consequent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_consequent.add(rest.getTree());
			// AST REWRITE
			// elements: rest, actionId
			// token labels: actionId
			// rule labels: rest, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_actionId=new RewriteRuleTokenStream(adaptor,"token actionId",actionId);
			RewriteRuleSubtreeStream stream_rest=new RewriteRuleSubtreeStream(adaptor,"rule rest",rest!=null?rest.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 497:5: -> ^( ACTION ( $actionId)? $rest)
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:497:8: ^( ACTION ( $actionId)? $rest)
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ACTION, "ACTION"), root_1);
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:497:18: ( $actionId)?
				if ( stream_actionId.hasNext() ) {
					adaptor.addChild(root_1, stream_actionId.nextNode());
				}
				stream_actionId.reset();

				adaptor.addChild(root_1, stream_rest.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "consequentAction"


	public static class consequent_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "consequent"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:500:1: consequent : ( forAction | onCommandAction | onMessageAction | doAction | whileAction | block | simpleAction );
	public final PlexilParser.consequent_return consequent() throws RecognitionException {
		PlexilParser.consequent_return retval = new PlexilParser.consequent_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope forAction104 =null;
		ParserRuleReturnScope onCommandAction105 =null;
		ParserRuleReturnScope onMessageAction106 =null;
		ParserRuleReturnScope doAction107 =null;
		ParserRuleReturnScope whileAction108 =null;
		ParserRuleReturnScope block109 =null;
		ParserRuleReturnScope simpleAction110 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:500:12: ( forAction | onCommandAction | onMessageAction | doAction | whileAction | block | simpleAction )
			int alt28=7;
			switch ( input.LA(1) ) {
			case FOR_KYWD:
				{
				alt28=1;
				}
				break;
			case ON_COMMAND_KYWD:
				{
				alt28=2;
				}
				break;
			case ON_MESSAGE_KYWD:
				{
				alt28=3;
				}
				break;
			case DO_KYWD:
				{
				alt28=4;
				}
				break;
			case WHILE_KYWD:
				{
				alt28=5;
				}
				break;
			case CHECKED_SEQUENCE_KYWD:
			case CONCURRENCE_KYWD:
			case LBRACE:
			case SEQUENCE_KYWD:
			case TRY_KYWD:
			case UNCHECKED_SEQUENCE_KYWD:
				{
				alt28=6;
				}
				break;
			case LIBRARY_CALL_KYWD:
			case LPAREN:
			case NCNAME:
			case REQUEST_KYWD:
			case SYNCHRONOUS_COMMAND_KYWD:
			case UPDATE_KYWD:
			case WAIT_KYWD:
				{
				alt28=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:501:2: forAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_forAction_in_consequent2533);
					forAction104=forAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forAction104.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:502:4: onCommandAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_onCommandAction_in_consequent2538);
					onCommandAction105=onCommandAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, onCommandAction105.getTree());

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:503:4: onMessageAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_onMessageAction_in_consequent2543);
					onMessageAction106=onMessageAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, onMessageAction106.getTree());

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:504:4: doAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_doAction_in_consequent2548);
					doAction107=doAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doAction107.getTree());

					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:505:4: whileAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_whileAction_in_consequent2553);
					whileAction108=whileAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileAction108.getTree());

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:506:4: block
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_block_in_consequent2558);
					block109=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block109.getTree());

					}
					break;
				case 7 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:507:4: simpleAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_simpleAction_in_consequent2563);
					simpleAction110=simpleAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleAction110.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "consequent"


	public static class onCommandAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "onCommandAction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:510:1: onCommandAction : ON_COMMAND_KYWD ^ expression ( paramsSpec )? action ;
	public final PlexilParser.onCommandAction_return onCommandAction() throws RecognitionException {
		PlexilParser.onCommandAction_return retval = new PlexilParser.onCommandAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token ON_COMMAND_KYWD111=null;
		ParserRuleReturnScope expression112 =null;
		ParserRuleReturnScope paramsSpec113 =null;
		ParserRuleReturnScope action114 =null;

		PlexilTreeNode ON_COMMAND_KYWD111_tree=null;

		 m_paraphrases.push("in \"OnCommand\" statement"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:513:2: ( ON_COMMAND_KYWD ^ expression ( paramsSpec )? action )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:514:5: ON_COMMAND_KYWD ^ expression ( paramsSpec )? action
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			ON_COMMAND_KYWD111=(Token)match(input,ON_COMMAND_KYWD,FOLLOW_ON_COMMAND_KYWD_in_onCommandAction2589); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ON_COMMAND_KYWD111_tree = (PlexilTreeNode)adaptor.create(ON_COMMAND_KYWD111);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(ON_COMMAND_KYWD111_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_onCommandAction2592);
			expression112=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression112.getTree());

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:514:33: ( paramsSpec )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==LPAREN) ) {
				switch ( input.LA(2) ) {
					case DATE_KYWD:
						{
						alt29=1;
						}
						break;
					case ANY_KYWD:
					case BOOLEAN_KYWD:
					case ELLIPSIS:
					case INTEGER_KYWD:
					case REAL_KYWD:
					case RPAREN:
					case STRING_KYWD:
						{
						alt29=1;
						}
						break;
					case DURATION_KYWD:
						{
						alt29=1;
						}
						break;
				}
			}
			switch (alt29) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:514:33: paramsSpec
					{
					pushFollow(FOLLOW_paramsSpec_in_onCommandAction2594);
					paramsSpec113=paramsSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramsSpec113.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_action_in_onCommandAction2597);
			action114=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, action114.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "onCommandAction"


	public static class onMessageAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "onMessageAction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:517:1: onMessageAction : ON_MESSAGE_KYWD ^ expression action ;
	public final PlexilParser.onMessageAction_return onMessageAction() throws RecognitionException {
		PlexilParser.onMessageAction_return retval = new PlexilParser.onMessageAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token ON_MESSAGE_KYWD115=null;
		ParserRuleReturnScope expression116 =null;
		ParserRuleReturnScope action117 =null;

		PlexilTreeNode ON_MESSAGE_KYWD115_tree=null;

		 m_paraphrases.push("in \"OnMessage\" statement"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:520:2: ( ON_MESSAGE_KYWD ^ expression action )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:521:5: ON_MESSAGE_KYWD ^ expression action
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			ON_MESSAGE_KYWD115=(Token)match(input,ON_MESSAGE_KYWD,FOLLOW_ON_MESSAGE_KYWD_in_onMessageAction2622); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ON_MESSAGE_KYWD115_tree = new OnMessageNode(ON_MESSAGE_KYWD115) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(ON_MESSAGE_KYWD115_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_onMessageAction2628);
			expression116=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression116.getTree());

			pushFollow(FOLLOW_action_in_onMessageAction2630);
			action117=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, action117.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "onMessageAction"


	public static class whileAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "whileAction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:524:1: whileAction : WHILE_KYWD ^ expression action ;
	public final PlexilParser.whileAction_return whileAction() throws RecognitionException {
		PlexilParser.whileAction_return retval = new PlexilParser.whileAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token WHILE_KYWD118=null;
		ParserRuleReturnScope expression119 =null;
		ParserRuleReturnScope action120 =null;

		PlexilTreeNode WHILE_KYWD118_tree=null;

		 m_paraphrases.push("in \"while\" statement"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:527:2: ( WHILE_KYWD ^ expression action )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:528:5: WHILE_KYWD ^ expression action
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			WHILE_KYWD118=(Token)match(input,WHILE_KYWD,FOLLOW_WHILE_KYWD_in_whileAction2655); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHILE_KYWD118_tree = (PlexilTreeNode)adaptor.create(WHILE_KYWD118);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(WHILE_KYWD118_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_whileAction2658);
			expression119=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression119.getTree());

			pushFollow(FOLLOW_action_in_whileAction2660);
			action120=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, action120.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileAction"


	public static class doAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "doAction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:532:1: doAction : DO_KYWD ^ action WHILE_KYWD ! expression SEMICOLON !;
	public final PlexilParser.doAction_return doAction() throws RecognitionException {
		PlexilParser.doAction_return retval = new PlexilParser.doAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token DO_KYWD121=null;
		Token WHILE_KYWD123=null;
		Token SEMICOLON125=null;
		ParserRuleReturnScope action122 =null;
		ParserRuleReturnScope expression124 =null;

		PlexilTreeNode DO_KYWD121_tree=null;
		PlexilTreeNode WHILE_KYWD123_tree=null;
		PlexilTreeNode SEMICOLON125_tree=null;

		 m_paraphrases.push("in \"do\" statement"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:535:2: ( DO_KYWD ^ action WHILE_KYWD ! expression SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:536:5: DO_KYWD ^ action WHILE_KYWD ! expression SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			DO_KYWD121=(Token)match(input,DO_KYWD,FOLLOW_DO_KYWD_in_doAction2686); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DO_KYWD121_tree = (PlexilTreeNode)adaptor.create(DO_KYWD121);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(DO_KYWD121_tree, root_0);
			}

			pushFollow(FOLLOW_action_in_doAction2689);
			action122=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, action122.getTree());

			WHILE_KYWD123=(Token)match(input,WHILE_KYWD,FOLLOW_WHILE_KYWD_in_doAction2691); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_doAction2694);
			expression124=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression124.getTree());

			SEMICOLON125=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_doAction2696); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doAction"


	public static class synchCmd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "synchCmd"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:539:1: synchCmd : SYNCHRONOUS_COMMAND_KYWD ^ ( commandWithAssignment | commandInvocation ) ( TIMEOUT_KYWD ! expression ( COMMA ! expression )? )? SEMICOLON !;
	public final PlexilParser.synchCmd_return synchCmd() throws RecognitionException {
		PlexilParser.synchCmd_return retval = new PlexilParser.synchCmd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token SYNCHRONOUS_COMMAND_KYWD126=null;
		Token TIMEOUT_KYWD129=null;
		Token COMMA131=null;
		Token SEMICOLON133=null;
		ParserRuleReturnScope commandWithAssignment127 =null;
		ParserRuleReturnScope commandInvocation128 =null;
		ParserRuleReturnScope expression130 =null;
		ParserRuleReturnScope expression132 =null;

		PlexilTreeNode SYNCHRONOUS_COMMAND_KYWD126_tree=null;
		PlexilTreeNode TIMEOUT_KYWD129_tree=null;
		PlexilTreeNode COMMA131_tree=null;
		PlexilTreeNode SEMICOLON133_tree=null;

		 m_paraphrases.push("in \"SynchronousCommand\" statement"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:542:2: ( SYNCHRONOUS_COMMAND_KYWD ^ ( commandWithAssignment | commandInvocation ) ( TIMEOUT_KYWD ! expression ( COMMA ! expression )? )? SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:543:5: SYNCHRONOUS_COMMAND_KYWD ^ ( commandWithAssignment | commandInvocation ) ( TIMEOUT_KYWD ! expression ( COMMA ! expression )? )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			SYNCHRONOUS_COMMAND_KYWD126=(Token)match(input,SYNCHRONOUS_COMMAND_KYWD,FOLLOW_SYNCHRONOUS_COMMAND_KYWD_in_synchCmd2722); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SYNCHRONOUS_COMMAND_KYWD126_tree = (PlexilTreeNode)adaptor.create(SYNCHRONOUS_COMMAND_KYWD126);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(SYNCHRONOUS_COMMAND_KYWD126_tree, root_0);
			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:544:5: ( commandWithAssignment | commandInvocation )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==NCNAME) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==EQUALS||LA30_1==LBRACKET) ) {
					alt30=1;
				}
				else if ( (LA30_1==LPAREN) ) {
					alt30=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA30_0==LPAREN) ) {
				alt30=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:544:7: commandWithAssignment
					{
					pushFollow(FOLLOW_commandWithAssignment_in_synchCmd2731);
					commandWithAssignment127=commandWithAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandWithAssignment127.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:544:31: commandInvocation
					{
					pushFollow(FOLLOW_commandInvocation_in_synchCmd2735);
					commandInvocation128=commandInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandInvocation128.getTree());

					}
					break;

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:545:2: ( TIMEOUT_KYWD ! expression ( COMMA ! expression )? )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==TIMEOUT_KYWD) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:545:4: TIMEOUT_KYWD ! expression ( COMMA ! expression )?
					{
					TIMEOUT_KYWD129=(Token)match(input,TIMEOUT_KYWD,FOLLOW_TIMEOUT_KYWD_in_synchCmd2742); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_synchCmd2745);
					expression130=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression130.getTree());

					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:545:29: ( COMMA ! expression )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==COMMA) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:545:31: COMMA ! expression
							{
							COMMA131=(Token)match(input,COMMA,FOLLOW_COMMA_in_synchCmd2749); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_synchCmd2752);
							expression132=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression132.getTree());

							}
							break;

					}

					}
					break;

			}

			SEMICOLON133=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synchCmd2761); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "synchCmd"


	public static class waitBuiltin_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "waitBuiltin"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:549:1: waitBuiltin : WAIT_KYWD ^ expression ( COMMA ! ( variable | INT | DOUBLE ) )? SEMICOLON !;
	public final PlexilParser.waitBuiltin_return waitBuiltin() throws RecognitionException {
		PlexilParser.waitBuiltin_return retval = new PlexilParser.waitBuiltin_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token WAIT_KYWD134=null;
		Token COMMA136=null;
		Token INT138=null;
		Token DOUBLE139=null;
		Token SEMICOLON140=null;
		ParserRuleReturnScope expression135 =null;
		ParserRuleReturnScope variable137 =null;

		PlexilTreeNode WAIT_KYWD134_tree=null;
		PlexilTreeNode COMMA136_tree=null;
		PlexilTreeNode INT138_tree=null;
		PlexilTreeNode DOUBLE139_tree=null;
		PlexilTreeNode SEMICOLON140_tree=null;

		 m_paraphrases.push("in \"Wait\" statement"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:552:2: ( WAIT_KYWD ^ expression ( COMMA ! ( variable | INT | DOUBLE ) )? SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:553:2: WAIT_KYWD ^ expression ( COMMA ! ( variable | INT | DOUBLE ) )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			WAIT_KYWD134=(Token)match(input,WAIT_KYWD,FOLLOW_WAIT_KYWD_in_waitBuiltin2784); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WAIT_KYWD134_tree = (PlexilTreeNode)adaptor.create(WAIT_KYWD134);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(WAIT_KYWD134_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_waitBuiltin2787);
			expression135=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression135.getTree());

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:553:24: ( COMMA ! ( variable | INT | DOUBLE ) )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==COMMA) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:553:25: COMMA ! ( variable | INT | DOUBLE )
					{
					COMMA136=(Token)match(input,COMMA,FOLLOW_COMMA_in_waitBuiltin2790); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:553:32: ( variable | INT | DOUBLE )
					int alt33=3;
					switch ( input.LA(1) ) {
					case NCNAME:
						{
						alt33=1;
						}
						break;
					case INT:
						{
						alt33=2;
						}
						break;
					case DOUBLE:
						{
						alt33=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}
					switch (alt33) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:553:33: variable
							{
							pushFollow(FOLLOW_variable_in_waitBuiltin2794);
							variable137=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variable137.getTree());

							}
							break;
						case 2 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:553:42: INT
							{
							INT138=(Token)match(input,INT,FOLLOW_INT_in_waitBuiltin2796); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							INT138_tree = (PlexilTreeNode)adaptor.create(INT138);
							adaptor.addChild(root_0, INT138_tree);
							}

							}
							break;
						case 3 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:553:46: DOUBLE
							{
							DOUBLE139=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_waitBuiltin2798); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DOUBLE139_tree = (PlexilTreeNode)adaptor.create(DOUBLE139);
							adaptor.addChild(root_0, DOUBLE139_tree);
							}

							}
							break;

					}

					}
					break;

			}

			SEMICOLON140=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_waitBuiltin2803); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "waitBuiltin"


	public static class block_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:559:1: block : (variant= sequenceVariantKywd LBRACE -> $variant|lb= LBRACE -> BLOCK[$lb] ) ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* RBRACE -> ^( $block ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* ) ;
	public final PlexilParser.block_return block() throws RecognitionException {
		PlexilParser.block_return retval = new PlexilParser.block_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token lb=null;
		Token LBRACE141=null;
		Token RBRACE146=null;
		ParserRuleReturnScope variant =null;
		ParserRuleReturnScope comment142 =null;
		ParserRuleReturnScope nodeDeclaration143 =null;
		ParserRuleReturnScope nodeAttribute144 =null;
		ParserRuleReturnScope action145 =null;

		PlexilTreeNode lb_tree=null;
		PlexilTreeNode LBRACE141_tree=null;
		PlexilTreeNode RBRACE146_tree=null;
		RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
		RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
		RewriteRuleSubtreeStream stream_nodeAttribute=new RewriteRuleSubtreeStream(adaptor,"rule nodeAttribute");
		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
		RewriteRuleSubtreeStream stream_sequenceVariantKywd=new RewriteRuleSubtreeStream(adaptor,"rule sequenceVariantKywd");
		RewriteRuleSubtreeStream stream_nodeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule nodeDeclaration");

		 m_paraphrases.push("in block"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:562:2: ( (variant= sequenceVariantKywd LBRACE -> $variant|lb= LBRACE -> BLOCK[$lb] ) ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* RBRACE -> ^( $block ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:563:5: (variant= sequenceVariantKywd LBRACE -> $variant|lb= LBRACE -> BLOCK[$lb] ) ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* RBRACE
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:563:5: (variant= sequenceVariantKywd LBRACE -> $variant|lb= LBRACE -> BLOCK[$lb] )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==CHECKED_SEQUENCE_KYWD||LA35_0==CONCURRENCE_KYWD||LA35_0==SEQUENCE_KYWD||(LA35_0 >= TRY_KYWD && LA35_0 <= UNCHECKED_SEQUENCE_KYWD)) ) {
				alt35=1;
			}
			else if ( (LA35_0==LBRACE) ) {
				alt35=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:563:6: variant= sequenceVariantKywd LBRACE
					{
					pushFollow(FOLLOW_sequenceVariantKywd_in_block2836);
					variant=sequenceVariantKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sequenceVariantKywd.add(variant.getTree());
					LBRACE141=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2838); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE141);

					// AST REWRITE
					// elements: variant
					// token labels: 
					// rule labels: variant, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_variant=new RewriteRuleSubtreeStream(adaptor,"rule variant",variant!=null?variant.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 563:41: -> $variant
					{
						adaptor.addChild(root_0, stream_variant.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:564:8: lb= LBRACE
					{
					lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2854); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACE.add(lb);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 564:18: -> BLOCK[$lb]
					{
						adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(BLOCK, lb));
					}


					retval.tree = root_0;
					}

					}
					break;

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:565:5: ( comment )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==COMMENT_KYWD) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:565:5: comment
					{
					pushFollow(FOLLOW_comment_in_block2866);
					comment142=comment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_comment.add(comment142.getTree());
					}
					break;

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:566:5: ( nodeDeclaration )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==BOOLEAN_KYWD||LA37_0==DATE_KYWD||LA37_0==DURATION_KYWD||LA37_0==INTEGER_KYWD||(LA37_0 >= IN_KYWD && LA37_0 <= IN_OUT_KYWD)||LA37_0==REAL_KYWD||LA37_0==STRING_KYWD) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:566:5: nodeDeclaration
					{
					pushFollow(FOLLOW_nodeDeclaration_in_block2873);
					nodeDeclaration143=nodeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nodeDeclaration.add(nodeDeclaration143.getTree());
					}
					break;

				default :
					break loop37;
				}
			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:567:5: ( nodeAttribute )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==END_CONDITION_KYWD||LA38_0==EXIT_CONDITION_KYWD||LA38_0==INVARIANT_CONDITION_KYWD||LA38_0==POST_CONDITION_KYWD||(LA38_0 >= PRE_CONDITION_KYWD && LA38_0 <= PRIORITY_KYWD)||LA38_0==REPEAT_CONDITION_KYWD||LA38_0==RESOURCE_KYWD||LA38_0==SKIP_CONDITION_KYWD||LA38_0==START_CONDITION_KYWD) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:567:5: nodeAttribute
					{
					pushFollow(FOLLOW_nodeAttribute_in_block2880);
					nodeAttribute144=nodeAttribute();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nodeAttribute.add(nodeAttribute144.getTree());
					}
					break;

				default :
					break loop38;
				}
			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:568:5: ( action )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==CHECKED_SEQUENCE_KYWD||LA39_0==CONCURRENCE_KYWD||LA39_0==DO_KYWD||LA39_0==FOR_KYWD||LA39_0==IF_KYWD||LA39_0==LBRACE||LA39_0==LIBRARY_CALL_KYWD||LA39_0==LPAREN||LA39_0==NCNAME||(LA39_0 >= ON_COMMAND_KYWD && LA39_0 <= ON_MESSAGE_KYWD)||LA39_0==REQUEST_KYWD||LA39_0==SEQUENCE_KYWD||LA39_0==SYNCHRONOUS_COMMAND_KYWD||(LA39_0 >= TRY_KYWD && LA39_0 <= UPDATE_KYWD)||(LA39_0 >= WAIT_KYWD && LA39_0 <= WHILE_KYWD)) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:568:5: action
					{
					pushFollow(FOLLOW_action_in_block2887);
					action145=action();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_action.add(action145.getTree());
					}
					break;

				default :
					break loop39;
				}
			}

			RBRACE146=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2894); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE146);

			// AST REWRITE
			// elements: comment, nodeDeclaration, action, block, nodeAttribute
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 570:2: -> ^( $block ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:570:5: ^( $block ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_retval.nextNode(), root_1);
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:570:14: ( comment )?
				if ( stream_comment.hasNext() ) {
					adaptor.addChild(root_1, stream_comment.nextTree());
				}
				stream_comment.reset();

				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:570:23: ( nodeDeclaration )*
				while ( stream_nodeDeclaration.hasNext() ) {
					adaptor.addChild(root_1, stream_nodeDeclaration.nextTree());
				}
				stream_nodeDeclaration.reset();

				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:570:40: ( nodeAttribute )*
				while ( stream_nodeAttribute.hasNext() ) {
					adaptor.addChild(root_1, stream_nodeAttribute.nextTree());
				}
				stream_nodeAttribute.reset();

				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:570:55: ( action )*
				while ( stream_action.hasNext() ) {
					adaptor.addChild(root_1, stream_action.nextTree());
				}
				stream_action.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class sequenceVariantKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "sequenceVariantKywd"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:573:1: sequenceVariantKywd : ( CONCURRENCE_KYWD | SEQUENCE_KYWD | CHECKED_SEQUENCE_KYWD | UNCHECKED_SEQUENCE_KYWD | TRY_KYWD );
	public final PlexilParser.sequenceVariantKywd_return sequenceVariantKywd() throws RecognitionException {
		PlexilParser.sequenceVariantKywd_return retval = new PlexilParser.sequenceVariantKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set147=null;

		PlexilTreeNode set147_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:573:21: ( CONCURRENCE_KYWD | SEQUENCE_KYWD | CHECKED_SEQUENCE_KYWD | UNCHECKED_SEQUENCE_KYWD | TRY_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set147=input.LT(1);
			if ( input.LA(1)==CHECKED_SEQUENCE_KYWD||input.LA(1)==CONCURRENCE_KYWD||input.LA(1)==SEQUENCE_KYWD||(input.LA(1) >= TRY_KYWD && input.LA(1) <= UNCHECKED_SEQUENCE_KYWD) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set147));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sequenceVariantKywd"


	public static class comment_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "comment"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:581:1: comment : COMMENT_KYWD ^ STRING SEMICOLON !;
	public final PlexilParser.comment_return comment() throws RecognitionException {
		PlexilParser.comment_return retval = new PlexilParser.comment_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMENT_KYWD148=null;
		Token STRING149=null;
		Token SEMICOLON150=null;

		PlexilTreeNode COMMENT_KYWD148_tree=null;
		PlexilTreeNode STRING149_tree=null;
		PlexilTreeNode SEMICOLON150_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:581:9: ( COMMENT_KYWD ^ STRING SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:581:11: COMMENT_KYWD ^ STRING SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			COMMENT_KYWD148=(Token)match(input,COMMENT_KYWD,FOLLOW_COMMENT_KYWD_in_comment2962); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COMMENT_KYWD148_tree = (PlexilTreeNode)adaptor.create(COMMENT_KYWD148);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(COMMENT_KYWD148_tree, root_0);
			}

			STRING149=(Token)match(input,STRING,FOLLOW_STRING_in_comment2965); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STRING149_tree = (PlexilTreeNode)adaptor.create(STRING149);
			adaptor.addChild(root_0, STRING149_tree);
			}

			SEMICOLON150=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_comment2967); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comment"


	public static class nodeDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeDeclaration"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:583:1: nodeDeclaration : ( interfaceDeclaration | variableDeclaration );
	public final PlexilParser.nodeDeclaration_return nodeDeclaration() throws RecognitionException {
		PlexilParser.nodeDeclaration_return retval = new PlexilParser.nodeDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope interfaceDeclaration151 =null;
		ParserRuleReturnScope variableDeclaration152 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:583:17: ( interfaceDeclaration | variableDeclaration )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( ((LA40_0 >= IN_KYWD && LA40_0 <= IN_OUT_KYWD)) ) {
				alt40=1;
			}
			else if ( (LA40_0==BOOLEAN_KYWD||LA40_0==DATE_KYWD||LA40_0==DURATION_KYWD||LA40_0==INTEGER_KYWD||LA40_0==REAL_KYWD||LA40_0==STRING_KYWD) ) {
				alt40=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:584:5: interfaceDeclaration
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_nodeDeclaration2981);
					interfaceDeclaration151=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration151.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:585:5: variableDeclaration
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_nodeDeclaration2987);
					variableDeclaration152=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration152.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeDeclaration"


	public static class nodeAttribute_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeAttribute"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:587:1: nodeAttribute : ( nodeCondition | priority | resource );
	public final PlexilParser.nodeAttribute_return nodeAttribute() throws RecognitionException {
		PlexilParser.nodeAttribute_return retval = new PlexilParser.nodeAttribute_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope nodeCondition153 =null;
		ParserRuleReturnScope priority154 =null;
		ParserRuleReturnScope resource155 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:587:15: ( nodeCondition | priority | resource )
			int alt41=3;
			switch ( input.LA(1) ) {
			case END_CONDITION_KYWD:
			case EXIT_CONDITION_KYWD:
			case INVARIANT_CONDITION_KYWD:
			case POST_CONDITION_KYWD:
			case PRE_CONDITION_KYWD:
			case REPEAT_CONDITION_KYWD:
			case SKIP_CONDITION_KYWD:
			case START_CONDITION_KYWD:
				{
				alt41=1;
				}
				break;
			case PRIORITY_KYWD:
				{
				alt41=2;
				}
				break;
			case RESOURCE_KYWD:
				{
				alt41=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:588:5: nodeCondition
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCondition_in_nodeAttribute2999);
					nodeCondition153=nodeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCondition153.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:589:5: priority
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_priority_in_nodeAttribute3005);
					priority154=priority();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, priority154.getTree());

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:590:5: resource
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_resource_in_nodeAttribute3011);
					resource155=resource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, resource155.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeAttribute"


	public static class nodeCondition_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeCondition"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:593:1: nodeCondition : conditionKywd ^ expression SEMICOLON !;
	public final PlexilParser.nodeCondition_return nodeCondition() throws RecognitionException {
		PlexilParser.nodeCondition_return retval = new PlexilParser.nodeCondition_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token SEMICOLON158=null;
		ParserRuleReturnScope conditionKywd156 =null;
		ParserRuleReturnScope expression157 =null;

		PlexilTreeNode SEMICOLON158_tree=null;

		 m_paraphrases.push("in condition"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:596:2: ( conditionKywd ^ expression SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:597:5: conditionKywd ^ expression SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_conditionKywd_in_nodeCondition3037);
			conditionKywd156=conditionKywd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(conditionKywd156.getTree(), root_0);
			pushFollow(FOLLOW_expression_in_nodeCondition3040);
			expression157=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression157.getTree());

			SEMICOLON158=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_nodeCondition3042); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeCondition"


	public static class conditionKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "conditionKywd"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:599:1: conditionKywd : ( END_CONDITION_KYWD | EXIT_CONDITION_KYWD | INVARIANT_CONDITION_KYWD | POST_CONDITION_KYWD | PRE_CONDITION_KYWD | REPEAT_CONDITION_KYWD | SKIP_CONDITION_KYWD | START_CONDITION_KYWD );
	public final PlexilParser.conditionKywd_return conditionKywd() throws RecognitionException {
		PlexilParser.conditionKywd_return retval = new PlexilParser.conditionKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set159=null;

		PlexilTreeNode set159_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:599:15: ( END_CONDITION_KYWD | EXIT_CONDITION_KYWD | INVARIANT_CONDITION_KYWD | POST_CONDITION_KYWD | PRE_CONDITION_KYWD | REPEAT_CONDITION_KYWD | SKIP_CONDITION_KYWD | START_CONDITION_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set159=input.LT(1);
			if ( input.LA(1)==END_CONDITION_KYWD||input.LA(1)==EXIT_CONDITION_KYWD||input.LA(1)==INVARIANT_CONDITION_KYWD||input.LA(1)==POST_CONDITION_KYWD||input.LA(1)==PRE_CONDITION_KYWD||input.LA(1)==REPEAT_CONDITION_KYWD||input.LA(1)==SKIP_CONDITION_KYWD||input.LA(1)==START_CONDITION_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set159));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionKywd"


	public static class resource_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "resource"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:610:1: resource : RESOURCE_KYWD ^ NAME_KYWD ! EQUALS ! expression ( COMMA ! ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression ) )* SEMICOLON !;
	public final PlexilParser.resource_return resource() throws RecognitionException {
		PlexilParser.resource_return retval = new PlexilParser.resource_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token RESOURCE_KYWD160=null;
		Token NAME_KYWD161=null;
		Token EQUALS162=null;
		Token COMMA164=null;
		Token LOWER_BOUND_KYWD165=null;
		Token EQUALS166=null;
		Token UPPER_BOUND_KYWD168=null;
		Token EQUALS169=null;
		Token RELEASE_AT_TERM_KYWD171=null;
		Token EQUALS172=null;
		Token PRIORITY_KYWD174=null;
		Token EQUALS175=null;
		Token SEMICOLON176=null;
		ParserRuleReturnScope pe =null;
		ParserRuleReturnScope expression163 =null;
		ParserRuleReturnScope expression167 =null;
		ParserRuleReturnScope expression170 =null;
		ParserRuleReturnScope expression173 =null;

		PlexilTreeNode RESOURCE_KYWD160_tree=null;
		PlexilTreeNode NAME_KYWD161_tree=null;
		PlexilTreeNode EQUALS162_tree=null;
		PlexilTreeNode COMMA164_tree=null;
		PlexilTreeNode LOWER_BOUND_KYWD165_tree=null;
		PlexilTreeNode EQUALS166_tree=null;
		PlexilTreeNode UPPER_BOUND_KYWD168_tree=null;
		PlexilTreeNode EQUALS169_tree=null;
		PlexilTreeNode RELEASE_AT_TERM_KYWD171_tree=null;
		PlexilTreeNode EQUALS172_tree=null;
		PlexilTreeNode PRIORITY_KYWD174_tree=null;
		PlexilTreeNode EQUALS175_tree=null;
		PlexilTreeNode SEMICOLON176_tree=null;

		 m_paraphrases.push("in resource"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:613:2: ( RESOURCE_KYWD ^ NAME_KYWD ! EQUALS ! expression ( COMMA ! ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression ) )* SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:614:5: RESOURCE_KYWD ^ NAME_KYWD ! EQUALS ! expression ( COMMA ! ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression ) )* SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			RESOURCE_KYWD160=(Token)match(input,RESOURCE_KYWD,FOLLOW_RESOURCE_KYWD_in_resource3123); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RESOURCE_KYWD160_tree = (PlexilTreeNode)adaptor.create(RESOURCE_KYWD160);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(RESOURCE_KYWD160_tree, root_0);
			}

			NAME_KYWD161=(Token)match(input,NAME_KYWD,FOLLOW_NAME_KYWD_in_resource3126); if (state.failed) return retval;
			EQUALS162=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_resource3129); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_resource3132);
			expression163=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression163.getTree());

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:615:9: ( COMMA ! ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression ) )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==COMMA) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:615:11: COMMA ! ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression )
					{
					COMMA164=(Token)match(input,COMMA,FOLLOW_COMMA_in_resource3144); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:616:11: ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression )
					int alt42=4;
					switch ( input.LA(1) ) {
					case LOWER_BOUND_KYWD:
						{
						alt42=1;
						}
						break;
					case UPPER_BOUND_KYWD:
						{
						alt42=2;
						}
						break;
					case RELEASE_AT_TERM_KYWD:
						{
						alt42=3;
						}
						break;
					case PRIORITY_KYWD:
						{
						alt42=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 42, 0, input);
						throw nvae;
					}
					switch (alt42) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:616:13: LOWER_BOUND_KYWD EQUALS ! expression
							{
							LOWER_BOUND_KYWD165=(Token)match(input,LOWER_BOUND_KYWD,FOLLOW_LOWER_BOUND_KYWD_in_resource3159); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LOWER_BOUND_KYWD165_tree = (PlexilTreeNode)adaptor.create(LOWER_BOUND_KYWD165);
							adaptor.addChild(root_0, LOWER_BOUND_KYWD165_tree);
							}

							EQUALS166=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_resource3161); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_resource3164);
							expression167=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression167.getTree());

							}
							break;
						case 2 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:617:13: UPPER_BOUND_KYWD EQUALS ! expression
							{
							UPPER_BOUND_KYWD168=(Token)match(input,UPPER_BOUND_KYWD,FOLLOW_UPPER_BOUND_KYWD_in_resource3178); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							UPPER_BOUND_KYWD168_tree = (PlexilTreeNode)adaptor.create(UPPER_BOUND_KYWD168);
							adaptor.addChild(root_0, UPPER_BOUND_KYWD168_tree);
							}

							EQUALS169=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_resource3180); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_resource3183);
							expression170=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression170.getTree());

							}
							break;
						case 3 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:618:9: RELEASE_AT_TERM_KYWD EQUALS ! expression
							{
							RELEASE_AT_TERM_KYWD171=(Token)match(input,RELEASE_AT_TERM_KYWD,FOLLOW_RELEASE_AT_TERM_KYWD_in_resource3193); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							RELEASE_AT_TERM_KYWD171_tree = (PlexilTreeNode)adaptor.create(RELEASE_AT_TERM_KYWD171);
							adaptor.addChild(root_0, RELEASE_AT_TERM_KYWD171_tree);
							}

							EQUALS172=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_resource3195); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_resource3198);
							expression173=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression173.getTree());

							}
							break;
						case 4 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:619:8: PRIORITY_KYWD EQUALS !pe= expression
							{
							PRIORITY_KYWD174=(Token)match(input,PRIORITY_KYWD,FOLLOW_PRIORITY_KYWD_in_resource3207); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PRIORITY_KYWD174_tree = (PlexilTreeNode)adaptor.create(PRIORITY_KYWD174);
							adaptor.addChild(root_0, PRIORITY_KYWD174_tree);
							}

							EQUALS175=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_resource3209); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_resource3214);
							pe=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, pe.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop43;
				}
			}

			SEMICOLON176=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_resource3247); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "resource"


	public static class priority_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "priority"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:625:1: priority : PRIORITY_KYWD ^ INT SEMICOLON !;
	public final PlexilParser.priority_return priority() throws RecognitionException {
		PlexilParser.priority_return retval = new PlexilParser.priority_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PRIORITY_KYWD177=null;
		Token INT178=null;
		Token SEMICOLON179=null;

		PlexilTreeNode PRIORITY_KYWD177_tree=null;
		PlexilTreeNode INT178_tree=null;
		PlexilTreeNode SEMICOLON179_tree=null;

		 m_paraphrases.push("in priority"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:628:2: ( PRIORITY_KYWD ^ INT SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:628:4: PRIORITY_KYWD ^ INT SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			PRIORITY_KYWD177=(Token)match(input,PRIORITY_KYWD,FOLLOW_PRIORITY_KYWD_in_priority3269); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRIORITY_KYWD177_tree = new PriorityNode(PRIORITY_KYWD177) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(PRIORITY_KYWD177_tree, root_0);
			}

			INT178=(Token)match(input,INT,FOLLOW_INT_in_priority3275); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			INT178_tree = (PlexilTreeNode)adaptor.create(INT178);
			adaptor.addChild(root_0, INT178_tree);
			}

			SEMICOLON179=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_priority3277); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "priority"


	public static class interfaceDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "interfaceDeclaration"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:630:1: interfaceDeclaration : ( in | inOut );
	public final PlexilParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		PlexilParser.interfaceDeclaration_return retval = new PlexilParser.interfaceDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope in180 =null;
		ParserRuleReturnScope inOut181 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:630:22: ( in | inOut )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==IN_KYWD) ) {
				alt44=1;
			}
			else if ( (LA44_0==IN_OUT_KYWD) ) {
				alt44=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:630:24: in
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_in_in_interfaceDeclaration3287);
					in180=in();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in180.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:630:29: inOut
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_inOut_in_interfaceDeclaration3291);
					inOut181=inOut();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, inOut181.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "interfaceDeclaration"


	public static class in_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "in"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:636:1: in : IN_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !;
	public final PlexilParser.in_return in() throws RecognitionException {
		PlexilParser.in_return retval = new PlexilParser.in_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token IN_KYWD182=null;
		Token NCNAME183=null;
		Token COMMA184=null;
		Token NCNAME185=null;
		Token SEMICOLON187=null;
		ParserRuleReturnScope interfaceDeclarations186 =null;

		PlexilTreeNode IN_KYWD182_tree=null;
		PlexilTreeNode NCNAME183_tree=null;
		PlexilTreeNode COMMA184_tree=null;
		PlexilTreeNode NCNAME185_tree=null;
		PlexilTreeNode SEMICOLON187_tree=null;

		 m_paraphrases.push("in \"In\" declaration"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:639:2: ( IN_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:640:5: IN_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			IN_KYWD182=(Token)match(input,IN_KYWD,FOLLOW_IN_KYWD_in_in3320); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IN_KYWD182_tree = (PlexilTreeNode)adaptor.create(IN_KYWD182);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(IN_KYWD182_tree, root_0);
			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:641:7: ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==NCNAME) ) {
				alt46=1;
			}
			else if ( (LA46_0==BOOLEAN_KYWD||LA46_0==DATE_KYWD||LA46_0==DURATION_KYWD||LA46_0==INTEGER_KYWD||LA46_0==REAL_KYWD||LA46_0==STRING_KYWD) ) {
				alt46=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:641:9: ( NCNAME ( COMMA ! NCNAME )* )
					{
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:641:9: ( NCNAME ( COMMA ! NCNAME )* )
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:641:10: NCNAME ( COMMA ! NCNAME )*
					{
					NCNAME183=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_in3333); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME183_tree = (PlexilTreeNode)adaptor.create(NCNAME183);
					adaptor.addChild(root_0, NCNAME183_tree);
					}

					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:641:17: ( COMMA ! NCNAME )*
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==COMMA) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:641:18: COMMA ! NCNAME
							{
							COMMA184=(Token)match(input,COMMA,FOLLOW_COMMA_in_in3336); if (state.failed) return retval;
							NCNAME185=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_in3339); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NCNAME185_tree = (PlexilTreeNode)adaptor.create(NCNAME185);
							adaptor.addChild(root_0, NCNAME185_tree);
							}

							}
							break;

						default :
							break loop45;
						}
					}

					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:642:6: interfaceDeclarations
					{
					pushFollow(FOLLOW_interfaceDeclarations_in_in3349);
					interfaceDeclarations186=interfaceDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclarations186.getTree());

					}
					break;

			}

			SEMICOLON187=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_in3364); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "in"


	public static class inOut_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "inOut"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:647:1: inOut : IN_OUT_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !;
	public final PlexilParser.inOut_return inOut() throws RecognitionException {
		PlexilParser.inOut_return retval = new PlexilParser.inOut_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token IN_OUT_KYWD188=null;
		Token NCNAME189=null;
		Token COMMA190=null;
		Token NCNAME191=null;
		Token SEMICOLON193=null;
		ParserRuleReturnScope interfaceDeclarations192 =null;

		PlexilTreeNode IN_OUT_KYWD188_tree=null;
		PlexilTreeNode NCNAME189_tree=null;
		PlexilTreeNode COMMA190_tree=null;
		PlexilTreeNode NCNAME191_tree=null;
		PlexilTreeNode SEMICOLON193_tree=null;

		 m_paraphrases.push("in \"InOut\" declaration"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:650:2: ( IN_OUT_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:651:5: IN_OUT_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			IN_OUT_KYWD188=(Token)match(input,IN_OUT_KYWD,FOLLOW_IN_OUT_KYWD_in_inOut3391); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IN_OUT_KYWD188_tree = (PlexilTreeNode)adaptor.create(IN_OUT_KYWD188);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(IN_OUT_KYWD188_tree, root_0);
			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:652:7: ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==NCNAME) ) {
				alt48=1;
			}
			else if ( (LA48_0==BOOLEAN_KYWD||LA48_0==DATE_KYWD||LA48_0==DURATION_KYWD||LA48_0==INTEGER_KYWD||LA48_0==REAL_KYWD||LA48_0==STRING_KYWD) ) {
				alt48=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:652:9: ( NCNAME ( COMMA ! NCNAME )* )
					{
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:652:9: ( NCNAME ( COMMA ! NCNAME )* )
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:652:10: NCNAME ( COMMA ! NCNAME )*
					{
					NCNAME189=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_inOut3403); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME189_tree = (PlexilTreeNode)adaptor.create(NCNAME189);
					adaptor.addChild(root_0, NCNAME189_tree);
					}

					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:652:17: ( COMMA ! NCNAME )*
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==COMMA) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:652:18: COMMA ! NCNAME
							{
							COMMA190=(Token)match(input,COMMA,FOLLOW_COMMA_in_inOut3406); if (state.failed) return retval;
							NCNAME191=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_inOut3409); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NCNAME191_tree = (PlexilTreeNode)adaptor.create(NCNAME191);
							adaptor.addChild(root_0, NCNAME191_tree);
							}

							}
							break;

						default :
							break loop47;
						}
					}

					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:653:6: interfaceDeclarations
					{
					pushFollow(FOLLOW_interfaceDeclarations_in_inOut3419);
					interfaceDeclarations192=interfaceDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclarations192.getTree());

					}
					break;

			}

			SEMICOLON193=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_inOut3434); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inOut"


	public static class interfaceDeclarations_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "interfaceDeclarations"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:658:1: interfaceDeclarations : tn= baseTypeName ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )* ;
	public final PlexilParser.interfaceDeclarations_return interfaceDeclarations() throws RecognitionException {
		PlexilParser.interfaceDeclarations_return retval = new PlexilParser.interfaceDeclarations_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMA196=null;
		ParserRuleReturnScope tn =null;
		ParserRuleReturnScope arrayVariableDecl194 =null;
		ParserRuleReturnScope scalarVariableDecl195 =null;
		ParserRuleReturnScope arrayVariableDecl197 =null;
		ParserRuleReturnScope scalarVariableDecl198 =null;

		PlexilTreeNode COMMA196_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:658:23: (tn= baseTypeName ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )* )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:659:5: tn= baseTypeName ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )*
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_baseTypeName_in_interfaceDeclarations3452);
			tn=baseTypeName();
			state._fsp--;
			if (state.failed) return retval;
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:660:5: ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==NCNAME) ) {
				int LA49_1 = input.LA(2);
				if ( (LA49_1==LBRACKET) && (synpred7_Plexil())) {
					alt49=1;
				}
				else if ( (LA49_1==COMMA||LA49_1==EQUALS||LA49_1==SEMICOLON) ) {
					alt49=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:660:7: ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start]
					{
					pushFollow(FOLLOW_arrayVariableDecl_in_interfaceDeclarations3469);
					arrayVariableDecl194=arrayVariableDecl((tn!=null?(tn.start):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayVariableDecl194.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:661:7: scalarVariableDecl[$tn.start]
					{
					pushFollow(FOLLOW_scalarVariableDecl_in_interfaceDeclarations3479);
					scalarVariableDecl195=scalarVariableDecl((tn!=null?(tn.start):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalarVariableDecl195.getTree());

					}
					break;

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:663:2: ( COMMA ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==COMMA) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:663:4: COMMA ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
					{
					COMMA196=(Token)match(input,COMMA,FOLLOW_COMMA_in_interfaceDeclarations3491); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:664:7: ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==NCNAME) ) {
						int LA50_1 = input.LA(2);
						if ( (LA50_1==LBRACKET) && (synpred8_Plexil())) {
							alt50=1;
						}
						else if ( (LA50_1==COMMA||LA50_1==EQUALS||LA50_1==SEMICOLON) ) {
							alt50=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 50, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}

					switch (alt50) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:664:9: ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start]
							{
							pushFollow(FOLLOW_arrayVariableDecl_in_interfaceDeclarations3510);
							arrayVariableDecl197=arrayVariableDecl((tn!=null?(tn.start):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayVariableDecl197.getTree());

							}
							break;
						case 2 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:665:9: scalarVariableDecl[$tn.start]
							{
							pushFollow(FOLLOW_scalarVariableDecl_in_interfaceDeclarations3522);
							scalarVariableDecl198=scalarVariableDecl((tn!=null?(tn.start):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, scalarVariableDecl198.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop51;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "interfaceDeclarations"


	public static class variable_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:670:1: variable : NCNAME ;
	public final PlexilParser.variable_return variable() throws RecognitionException {
		PlexilParser.variable_return retval = new PlexilParser.variable_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME199=null;

		PlexilTreeNode NCNAME199_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:670:10: ( NCNAME )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:670:12: NCNAME
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			NCNAME199=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_variable3546); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME199_tree = new VariableNode(NCNAME199) ;
			adaptor.addChild(root_0, NCNAME199_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:672:1: variableDeclaration : tn= baseTypeName ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )* SEMICOLON -> ^( VARIABLE_DECLARATIONS ( scalarVariableDecl )* ( arrayVariableDecl )* ) ;
	public final PlexilParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		PlexilParser.variableDeclaration_return retval = new PlexilParser.variableDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMA202=null;
		Token SEMICOLON205=null;
		ParserRuleReturnScope tn =null;
		ParserRuleReturnScope arrayVariableDecl200 =null;
		ParserRuleReturnScope scalarVariableDecl201 =null;
		ParserRuleReturnScope arrayVariableDecl203 =null;
		ParserRuleReturnScope scalarVariableDecl204 =null;

		PlexilTreeNode COMMA202_tree=null;
		PlexilTreeNode SEMICOLON205_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleSubtreeStream stream_arrayVariableDecl=new RewriteRuleSubtreeStream(adaptor,"rule arrayVariableDecl");
		RewriteRuleSubtreeStream stream_baseTypeName=new RewriteRuleSubtreeStream(adaptor,"rule baseTypeName");
		RewriteRuleSubtreeStream stream_scalarVariableDecl=new RewriteRuleSubtreeStream(adaptor,"rule scalarVariableDecl");

		 m_paraphrases.push("in variable declaration"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:675:2: (tn= baseTypeName ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )* SEMICOLON -> ^( VARIABLE_DECLARATIONS ( scalarVariableDecl )* ( arrayVariableDecl )* ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:676:5: tn= baseTypeName ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )* SEMICOLON
			{
			pushFollow(FOLLOW_baseTypeName_in_variableDeclaration3576);
			tn=baseTypeName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_baseTypeName.add(tn.getTree());
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:677:5: ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==NCNAME) ) {
				int LA52_1 = input.LA(2);
				if ( (LA52_1==LBRACKET) && (synpred9_Plexil())) {
					alt52=1;
				}
				else if ( (LA52_1==COMMA||LA52_1==EQUALS||LA52_1==SEMICOLON) ) {
					alt52=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:677:7: ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start]
					{
					pushFollow(FOLLOW_arrayVariableDecl_in_variableDeclaration3592);
					arrayVariableDecl200=arrayVariableDecl((tn!=null?(tn.start):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arrayVariableDecl.add(arrayVariableDecl200.getTree());
					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:678:7: scalarVariableDecl[$tn.start]
					{
					pushFollow(FOLLOW_scalarVariableDecl_in_variableDeclaration3602);
					scalarVariableDecl201=scalarVariableDecl((tn!=null?(tn.start):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_scalarVariableDecl.add(scalarVariableDecl201.getTree());
					}
					break;

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:680:5: ( COMMA ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==COMMA) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:680:7: COMMA ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
					{
					COMMA202=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableDeclaration3617); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA202);

					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:681:4: ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==NCNAME) ) {
						int LA53_1 = input.LA(2);
						if ( (LA53_1==LBRACKET) && (synpred10_Plexil())) {
							alt53=1;
						}
						else if ( (LA53_1==COMMA||LA53_1==EQUALS||LA53_1==SEMICOLON) ) {
							alt53=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 53, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:681:6: ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start]
							{
							pushFollow(FOLLOW_arrayVariableDecl_in_variableDeclaration3633);
							arrayVariableDecl203=arrayVariableDecl((tn!=null?(tn.start):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayVariableDecl.add(arrayVariableDecl203.getTree());
							}
							break;
						case 2 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:682:6: scalarVariableDecl[$tn.start]
							{
							pushFollow(FOLLOW_scalarVariableDecl_in_variableDeclaration3642);
							scalarVariableDecl204=scalarVariableDecl((tn!=null?(tn.start):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_scalarVariableDecl.add(scalarVariableDecl204.getTree());
							}
							break;

					}

					}
					break;

				default :
					break loop54;
				}
			}

			SEMICOLON205=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableDeclaration3658); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON205);

			// AST REWRITE
			// elements: scalarVariableDecl, arrayVariableDecl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 686:5: -> ^( VARIABLE_DECLARATIONS ( scalarVariableDecl )* ( arrayVariableDecl )* )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:686:8: ^( VARIABLE_DECLARATIONS ( scalarVariableDecl )* ( arrayVariableDecl )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(VARIABLE_DECLARATIONS, "VARIABLE_DECLARATIONS"), root_1);
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:686:32: ( scalarVariableDecl )*
				while ( stream_scalarVariableDecl.hasNext() ) {
					adaptor.addChild(root_1, stream_scalarVariableDecl.nextTree());
				}
				stream_scalarVariableDecl.reset();

				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:686:52: ( arrayVariableDecl )*
				while ( stream_arrayVariableDecl.hasNext() ) {
					adaptor.addChild(root_1, stream_arrayVariableDecl.nextTree());
				}
				stream_arrayVariableDecl.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class scalarVariableDecl_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "scalarVariableDecl"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:689:1: scalarVariableDecl[Token typeName] : NCNAME ( EQUALS literalScalarValue )? -> ^( VARIABLE_DECLARATION NCNAME ( literalScalarValue )? ) ;
	public final PlexilParser.scalarVariableDecl_return scalarVariableDecl(Token typeName) throws RecognitionException {
		PlexilParser.scalarVariableDecl_return retval = new PlexilParser.scalarVariableDecl_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME206=null;
		Token EQUALS207=null;
		ParserRuleReturnScope literalScalarValue208 =null;

		PlexilTreeNode NCNAME206_tree=null;
		PlexilTreeNode EQUALS207_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_literalScalarValue=new RewriteRuleSubtreeStream(adaptor,"rule literalScalarValue");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:689:36: ( NCNAME ( EQUALS literalScalarValue )? -> ^( VARIABLE_DECLARATION NCNAME ( literalScalarValue )? ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:690:5: NCNAME ( EQUALS literalScalarValue )?
			{
			NCNAME206=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_scalarVariableDecl3690); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME206);

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:690:12: ( EQUALS literalScalarValue )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==EQUALS) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:690:14: EQUALS literalScalarValue
					{
					EQUALS207=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scalarVariableDecl3694); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS207);

					pushFollow(FOLLOW_literalScalarValue_in_scalarVariableDecl3696);
					literalScalarValue208=literalScalarValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literalScalarValue.add(literalScalarValue208.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: literalScalarValue, NCNAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 691:5: -> ^( VARIABLE_DECLARATION NCNAME ( literalScalarValue )? )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:691:8: ^( VARIABLE_DECLARATION NCNAME ( literalScalarValue )? )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, new PlexilTreeNode(typeName));
				adaptor.addChild(root_1, stream_NCNAME.nextNode());
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:691:70: ( literalScalarValue )?
				if ( stream_literalScalarValue.hasNext() ) {
					adaptor.addChild(root_1, stream_literalScalarValue.nextTree());
				}
				stream_literalScalarValue.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scalarVariableDecl"


	public static class arrayVariableDecl_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "arrayVariableDecl"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:694:1: arrayVariableDecl[Token typeName] : NCNAME LBRACKET INT RBRACKET ( EQUALS literalValue )? -> ^( ARRAY_VARIABLE_DECLARATION NCNAME INT ( literalValue )? ) ;
	public final PlexilParser.arrayVariableDecl_return arrayVariableDecl(Token typeName) throws RecognitionException {
		PlexilParser.arrayVariableDecl_return retval = new PlexilParser.arrayVariableDecl_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME209=null;
		Token LBRACKET210=null;
		Token INT211=null;
		Token RBRACKET212=null;
		Token EQUALS213=null;
		ParserRuleReturnScope literalValue214 =null;

		PlexilTreeNode NCNAME209_tree=null;
		PlexilTreeNode LBRACKET210_tree=null;
		PlexilTreeNode INT211_tree=null;
		PlexilTreeNode RBRACKET212_tree=null;
		PlexilTreeNode EQUALS213_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleSubtreeStream stream_literalValue=new RewriteRuleSubtreeStream(adaptor,"rule literalValue");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:694:35: ( NCNAME LBRACKET INT RBRACKET ( EQUALS literalValue )? -> ^( ARRAY_VARIABLE_DECLARATION NCNAME INT ( literalValue )? ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:695:5: NCNAME LBRACKET INT RBRACKET ( EQUALS literalValue )?
			{
			NCNAME209=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_arrayVariableDecl3732); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME209);

			LBRACKET210=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayVariableDecl3734); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET210);

			INT211=(Token)match(input,INT,FOLLOW_INT_in_arrayVariableDecl3736); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INT.add(INT211);

			RBRACKET212=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayVariableDecl3738); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET212);

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:695:34: ( EQUALS literalValue )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==EQUALS) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:695:36: EQUALS literalValue
					{
					EQUALS213=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_arrayVariableDecl3742); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS213);

					pushFollow(FOLLOW_literalValue_in_arrayVariableDecl3744);
					literalValue214=literalValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literalValue.add(literalValue214.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: NCNAME, INT, literalValue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 696:2: -> ^( ARRAY_VARIABLE_DECLARATION NCNAME INT ( literalValue )? )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:696:5: ^( ARRAY_VARIABLE_DECLARATION NCNAME INT ( literalValue )? )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_VARIABLE_DECLARATION, "ARRAY_VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, new PlexilTreeNode(typeName));
				adaptor.addChild(root_1, stream_NCNAME.nextNode());
				adaptor.addChild(root_1, stream_INT.nextNode());
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:696:77: ( literalValue )?
				if ( stream_literalValue.hasNext() ) {
					adaptor.addChild(root_1, stream_literalValue.nextTree());
				}
				stream_literalValue.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayVariableDecl"


	public static class literalScalarValue_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "literalScalarValue"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:699:1: literalScalarValue : ( booleanLiteral | INT | DOUBLE | STRING | unaryMinus | dateLiteral | durationLiteral );
	public final PlexilParser.literalScalarValue_return literalScalarValue() throws RecognitionException {
		PlexilParser.literalScalarValue_return retval = new PlexilParser.literalScalarValue_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token INT216=null;
		Token DOUBLE217=null;
		Token STRING218=null;
		ParserRuleReturnScope booleanLiteral215 =null;
		ParserRuleReturnScope unaryMinus219 =null;
		ParserRuleReturnScope dateLiteral220 =null;
		ParserRuleReturnScope durationLiteral221 =null;

		PlexilTreeNode INT216_tree=null;
		PlexilTreeNode DOUBLE217_tree=null;
		PlexilTreeNode STRING218_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:699:20: ( booleanLiteral | INT | DOUBLE | STRING | unaryMinus | dateLiteral | durationLiteral )
			int alt57=7;
			switch ( input.LA(1) ) {
			case FALSE_KYWD:
			case TRUE_KYWD:
				{
				alt57=1;
				}
				break;
			case INT:
				{
				alt57=2;
				}
				break;
			case DOUBLE:
				{
				alt57=3;
				}
				break;
			case STRING:
				{
				alt57=4;
				}
				break;
			case MINUS:
				{
				alt57=5;
				}
				break;
			case DATE_KYWD:
				{
				alt57=6;
				}
				break;
			case DURATION_KYWD:
				{
				alt57=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:700:5: booleanLiteral
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_booleanLiteral_in_literalScalarValue3780);
					booleanLiteral215=booleanLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral215.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:700:22: INT
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					INT216=(Token)match(input,INT,FOLLOW_INT_in_literalScalarValue3784); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT216_tree = (PlexilTreeNode)adaptor.create(INT216);
					adaptor.addChild(root_0, INT216_tree);
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:700:28: DOUBLE
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					DOUBLE217=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_literalScalarValue3788); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOUBLE217_tree = (PlexilTreeNode)adaptor.create(DOUBLE217);
					adaptor.addChild(root_0, DOUBLE217_tree);
					}

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:700:37: STRING
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					STRING218=(Token)match(input,STRING,FOLLOW_STRING_in_literalScalarValue3792); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING218_tree = (PlexilTreeNode)adaptor.create(STRING218);
					adaptor.addChild(root_0, STRING218_tree);
					}

					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:700:46: unaryMinus
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_unaryMinus_in_literalScalarValue3796);
					unaryMinus219=unaryMinus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryMinus219.getTree());

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:701:5: dateLiteral
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_dateLiteral_in_literalScalarValue3804);
					dateLiteral220=dateLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dateLiteral220.getTree());

					}
					break;
				case 7 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:701:19: durationLiteral
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_durationLiteral_in_literalScalarValue3808);
					durationLiteral221=durationLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durationLiteral221.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literalScalarValue"


	public static class literalArrayValue_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "literalArrayValue"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:703:1: literalArrayValue : HASHPAREN ( literalScalarValue )* RPAREN -> ^( ARRAY_LITERAL ( literalScalarValue )* ) ;
	public final PlexilParser.literalArrayValue_return literalArrayValue() throws RecognitionException {
		PlexilParser.literalArrayValue_return retval = new PlexilParser.literalArrayValue_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token HASHPAREN222=null;
		Token RPAREN224=null;
		ParserRuleReturnScope literalScalarValue223 =null;

		PlexilTreeNode HASHPAREN222_tree=null;
		PlexilTreeNode RPAREN224_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_HASHPAREN=new RewriteRuleTokenStream(adaptor,"token HASHPAREN");
		RewriteRuleSubtreeStream stream_literalScalarValue=new RewriteRuleSubtreeStream(adaptor,"rule literalScalarValue");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:703:19: ( HASHPAREN ( literalScalarValue )* RPAREN -> ^( ARRAY_LITERAL ( literalScalarValue )* ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:704:5: HASHPAREN ( literalScalarValue )* RPAREN
			{
			HASHPAREN222=(Token)match(input,HASHPAREN,FOLLOW_HASHPAREN_in_literalArrayValue3821); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_HASHPAREN.add(HASHPAREN222);

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:704:15: ( literalScalarValue )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==DATE_KYWD||LA58_0==DOUBLE||LA58_0==DURATION_KYWD||LA58_0==FALSE_KYWD||LA58_0==INT||LA58_0==MINUS||LA58_0==STRING||LA58_0==TRUE_KYWD) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:704:15: literalScalarValue
					{
					pushFollow(FOLLOW_literalScalarValue_in_literalArrayValue3823);
					literalScalarValue223=literalScalarValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literalScalarValue.add(literalScalarValue223.getTree());
					}
					break;

				default :
					break loop58;
				}
			}

			RPAREN224=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_literalArrayValue3826); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN224);

			// AST REWRITE
			// elements: literalScalarValue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 705:5: -> ^( ARRAY_LITERAL ( literalScalarValue )* )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:705:8: ^( ARRAY_LITERAL ( literalScalarValue )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_LITERAL, "ARRAY_LITERAL"), root_1);
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:705:24: ( literalScalarValue )*
				while ( stream_literalScalarValue.hasNext() ) {
					adaptor.addChild(root_1, stream_literalScalarValue.nextTree());
				}
				stream_literalScalarValue.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literalArrayValue"


	public static class literalValue_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "literalValue"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:708:1: literalValue : ( literalScalarValue | literalArrayValue );
	public final PlexilParser.literalValue_return literalValue() throws RecognitionException {
		PlexilParser.literalValue_return retval = new PlexilParser.literalValue_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope literalScalarValue225 =null;
		ParserRuleReturnScope literalArrayValue226 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:708:14: ( literalScalarValue | literalArrayValue )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==DATE_KYWD||LA59_0==DOUBLE||LA59_0==DURATION_KYWD||LA59_0==FALSE_KYWD||LA59_0==INT||LA59_0==MINUS||LA59_0==STRING||LA59_0==TRUE_KYWD) ) {
				alt59=1;
			}
			else if ( (LA59_0==HASHPAREN) ) {
				alt59=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:708:16: literalScalarValue
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_literalScalarValue_in_literalValue3850);
					literalScalarValue225=literalScalarValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literalScalarValue225.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:708:37: literalArrayValue
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_literalArrayValue_in_literalValue3854);
					literalArrayValue226=literalArrayValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literalArrayValue226.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literalValue"


	public static class booleanLiteral_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "booleanLiteral"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:710:1: booleanLiteral : ( TRUE_KYWD | FALSE_KYWD );
	public final PlexilParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
		PlexilParser.booleanLiteral_return retval = new PlexilParser.booleanLiteral_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set227=null;

		PlexilTreeNode set227_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:710:16: ( TRUE_KYWD | FALSE_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set227=input.LT(1);
			if ( input.LA(1)==FALSE_KYWD||input.LA(1)==TRUE_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set227));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanLiteral"


	public static class realValue_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "realValue"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:712:1: realValue : ( DOUBLE | INT );
	public final PlexilParser.realValue_return realValue() throws RecognitionException {
		PlexilParser.realValue_return retval = new PlexilParser.realValue_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set228=null;

		PlexilTreeNode set228_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:712:11: ( DOUBLE | INT )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set228=input.LT(1);
			if ( input.LA(1)==DOUBLE||input.LA(1)==INT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set228));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "realValue"


	public static class lookupArrayReference_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupArrayReference"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:716:1: lookupArrayReference : lookup LBRACKET expression RBRACKET -> ^( ARRAY_REF lookup expression ) ;
	public final PlexilParser.lookupArrayReference_return lookupArrayReference() throws RecognitionException {
		PlexilParser.lookupArrayReference_return retval = new PlexilParser.lookupArrayReference_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LBRACKET230=null;
		Token RBRACKET232=null;
		ParserRuleReturnScope lookup229 =null;
		ParserRuleReturnScope expression231 =null;

		PlexilTreeNode LBRACKET230_tree=null;
		PlexilTreeNode RBRACKET232_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleSubtreeStream stream_lookup=new RewriteRuleSubtreeStream(adaptor,"rule lookup");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:716:22: ( lookup LBRACKET expression RBRACKET -> ^( ARRAY_REF lookup expression ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:717:5: lookup LBRACKET expression RBRACKET
			{
			pushFollow(FOLLOW_lookup_in_lookupArrayReference3895);
			lookup229=lookup();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lookup.add(lookup229.getTree());
			LBRACKET230=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_lookupArrayReference3897); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET230);

			pushFollow(FOLLOW_expression_in_lookupArrayReference3899);
			expression231=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression231.getTree());
			RBRACKET232=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_lookupArrayReference3901); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET232);

			// AST REWRITE
			// elements: expression, lookup
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 718:5: -> ^( ARRAY_REF lookup expression )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:718:8: ^( ARRAY_REF lookup expression )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_REF, "ARRAY_REF"), root_1);
				adaptor.addChild(root_1, stream_lookup.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupArrayReference"


	public static class simpleArrayReference_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "simpleArrayReference"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:721:1: simpleArrayReference : variable LBRACKET expression RBRACKET -> ^( ARRAY_REF variable expression ) ;
	public final PlexilParser.simpleArrayReference_return simpleArrayReference() throws RecognitionException {
		PlexilParser.simpleArrayReference_return retval = new PlexilParser.simpleArrayReference_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LBRACKET234=null;
		Token RBRACKET236=null;
		ParserRuleReturnScope variable233 =null;
		ParserRuleReturnScope expression235 =null;

		PlexilTreeNode LBRACKET234_tree=null;
		PlexilTreeNode RBRACKET236_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:721:22: ( variable LBRACKET expression RBRACKET -> ^( ARRAY_REF variable expression ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:722:5: variable LBRACKET expression RBRACKET
			{
			pushFollow(FOLLOW_variable_in_simpleArrayReference3930);
			variable233=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variable.add(variable233.getTree());
			LBRACKET234=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_simpleArrayReference3932); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET234);

			pushFollow(FOLLOW_expression_in_simpleArrayReference3934);
			expression235=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression235.getTree());
			RBRACKET236=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_simpleArrayReference3936); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET236);

			// AST REWRITE
			// elements: variable, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 723:5: -> ^( ARRAY_REF variable expression )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:723:8: ^( ARRAY_REF variable expression )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_REF, "ARRAY_REF"), root_1);
				adaptor.addChild(root_1, stream_variable.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleArrayReference"


	public static class commandInvocation_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "commandInvocation"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:726:1: commandInvocation : ( NCNAME -> ^( COMMAND_KYWD NCNAME ) | LPAREN expression RPAREN -> expression ) LPAREN ( argumentList )? RPAREN -> ^( COMMAND $commandInvocation ( argumentList )? ) ;
	public final PlexilParser.commandInvocation_return commandInvocation() throws RecognitionException {
		PlexilParser.commandInvocation_return retval = new PlexilParser.commandInvocation_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME237=null;
		Token LPAREN238=null;
		Token RPAREN240=null;
		Token LPAREN241=null;
		Token RPAREN243=null;
		ParserRuleReturnScope expression239 =null;
		ParserRuleReturnScope argumentList242 =null;

		PlexilTreeNode NCNAME237_tree=null;
		PlexilTreeNode LPAREN238_tree=null;
		PlexilTreeNode RPAREN240_tree=null;
		PlexilTreeNode LPAREN241_tree=null;
		PlexilTreeNode RPAREN243_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_argumentList=new RewriteRuleSubtreeStream(adaptor,"rule argumentList");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 m_paraphrases.push("in command"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:729:2: ( ( NCNAME -> ^( COMMAND_KYWD NCNAME ) | LPAREN expression RPAREN -> expression ) LPAREN ( argumentList )? RPAREN -> ^( COMMAND $commandInvocation ( argumentList )? ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:730:5: ( NCNAME -> ^( COMMAND_KYWD NCNAME ) | LPAREN expression RPAREN -> expression ) LPAREN ( argumentList )? RPAREN
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:730:5: ( NCNAME -> ^( COMMAND_KYWD NCNAME ) | LPAREN expression RPAREN -> expression )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==NCNAME) ) {
				alt60=1;
			}
			else if ( (LA60_0==LPAREN) ) {
				alt60=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:730:7: NCNAME
					{
					NCNAME237=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_commandInvocation3978); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME237);

					// AST REWRITE
					// elements: NCNAME
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 730:14: -> ^( COMMAND_KYWD NCNAME )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:730:17: ^( COMMAND_KYWD NCNAME )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(COMMAND_KYWD, "COMMAND_KYWD"), root_1);
						adaptor.addChild(root_1, stream_NCNAME.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:731:7: LPAREN expression RPAREN
					{
					LPAREN238=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_commandInvocation3994); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN238);

					pushFollow(FOLLOW_expression_in_commandInvocation3996);
					expression239=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression239.getTree());
					RPAREN240=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_commandInvocation3998); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN240);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 731:32: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

			}

			LPAREN241=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_commandInvocation4014); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN241);

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:733:12: ( argumentList )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==ABS_KYWD||LA61_0==ARRAY_MAX_SIZE_KYWD||LA61_0==ARRAY_SIZE_KYWD||LA61_0==BAR||LA61_0==CEIL_KYWD||LA61_0==CHILD_KYWD||(LA61_0 >= COMMAND_ACCEPTED_KYWD && LA61_0 <= COMMAND_FAILED_KYWD)||(LA61_0 >= COMMAND_RCVD_KYWD && LA61_0 <= COMMAND_SUCCESS_KYWD)||LA61_0==DATE_KYWD||LA61_0==DOUBLE||LA61_0==DURATION_KYWD||(LA61_0 >= EXECUTING_STATE_KYWD && LA61_0 <= EXITED_KYWD)||LA61_0==FAILING_STATE_KYWD||(LA61_0 >= FAILURE_OUTCOME_KYWD && LA61_0 <= FLOOR_KYWD)||LA61_0==HASHPAREN||(LA61_0 >= INACTIVE_STATE_KYWD && LA61_0 <= INT)||LA61_0==INTERRUPTED_OUTCOME_KYWD||LA61_0==INVARIANT_CONDITION_FAILED_KYWD||(LA61_0 >= IS_KNOWN_KYWD && LA61_0 <= ITERATION_ENDED_STATE_KYWD)||(LA61_0 >= LOOKUP_KYWD && LA61_0 <= LOOKUP_ON_CHANGE_KYWD)||LA61_0==LPAREN||(LA61_0 >= MAX_KYWD && LA61_0 <= MIN_KYWD)||LA61_0==NCNAME||(LA61_0 >= NODE_EXECUTING_KYWD && LA61_0 <= NODE_FINISHED_KYWD)||(LA61_0 >= NODE_INACTIVE_KYWD && LA61_0 <= NODE_SUCCEEDED_KYWD)||(LA61_0 >= NODE_WAITING_KYWD && LA61_0 <= NO_CHILD_FAILED_KYWD)||(LA61_0 >= PARENT_EXITED_KYWD && LA61_0 <= PARENT_KYWD)||LA61_0==POST_CONDITION_FAILED_KYWD||LA61_0==PRE_CONDITION_FAILED_KYWD||LA61_0==REAL_TO_INT_KYWD||LA61_0==ROUND_KYWD||LA61_0==SELF_KYWD||(LA61_0 >= SIBLING_KYWD && LA61_0 <= SKIPPED_OUTCOME_KYWD)||LA61_0==SQRT_KYWD||LA61_0==STRING||(LA61_0 >= STRLEN_KYWD && LA61_0 <= SUCCESS_OUTCOME_KYWD)||(LA61_0 >= TRUE_KYWD && LA61_0 <= TRUNC_KYWD)||LA61_0==WAITING_STATE_KYWD) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:733:12: argumentList
					{
					pushFollow(FOLLOW_argumentList_in_commandInvocation4016);
					argumentList242=argumentList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_argumentList.add(argumentList242.getTree());
					}
					break;

			}

			RPAREN243=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_commandInvocation4019); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN243);

			// AST REWRITE
			// elements: argumentList, commandInvocation
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 734:5: -> ^( COMMAND $commandInvocation ( argumentList )? )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:734:8: ^( COMMAND $commandInvocation ( argumentList )? )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(new CommandNode(COMMAND), root_1);
				adaptor.addChild(root_1, stream_retval.nextTree());
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:734:50: ( argumentList )?
				if ( stream_argumentList.hasNext() ) {
					adaptor.addChild(root_1, stream_argumentList.nextTree());
				}
				stream_argumentList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commandInvocation"


	public static class commandWithAssignment_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "commandWithAssignment"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:738:1: commandWithAssignment : assignmentLHS EQUALS commandInvocation -> ^( ASSIGNMENT assignmentLHS commandInvocation ) ;
	public final PlexilParser.commandWithAssignment_return commandWithAssignment() throws RecognitionException {
		PlexilParser.commandWithAssignment_return retval = new PlexilParser.commandWithAssignment_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token EQUALS245=null;
		ParserRuleReturnScope assignmentLHS244 =null;
		ParserRuleReturnScope commandInvocation246 =null;

		PlexilTreeNode EQUALS245_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleSubtreeStream stream_commandInvocation=new RewriteRuleSubtreeStream(adaptor,"rule commandInvocation");
		RewriteRuleSubtreeStream stream_assignmentLHS=new RewriteRuleSubtreeStream(adaptor,"rule assignmentLHS");

		 m_paraphrases.push("in command"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:741:2: ( assignmentLHS EQUALS commandInvocation -> ^( ASSIGNMENT assignmentLHS commandInvocation ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:742:5: assignmentLHS EQUALS commandInvocation
			{
			pushFollow(FOLLOW_assignmentLHS_in_commandWithAssignment4064);
			assignmentLHS244=assignmentLHS();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignmentLHS.add(assignmentLHS244.getTree());
			EQUALS245=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_commandWithAssignment4066); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS245);

			pushFollow(FOLLOW_commandInvocation_in_commandWithAssignment4068);
			commandInvocation246=commandInvocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commandInvocation.add(commandInvocation246.getTree());
			// AST REWRITE
			// elements: commandInvocation, assignmentLHS
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 743:2: -> ^( ASSIGNMENT assignmentLHS commandInvocation )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:743:5: ^( ASSIGNMENT assignmentLHS commandInvocation )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
				adaptor.addChild(root_1, stream_assignmentLHS.nextTree());
				adaptor.addChild(root_1, stream_commandInvocation.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commandWithAssignment"


	public static class argumentList_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "argumentList"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:746:1: argumentList : argument ( COMMA argument )* -> ^( ARGUMENT_LIST ( argument )* ) ;
	public final PlexilParser.argumentList_return argumentList() throws RecognitionException {
		PlexilParser.argumentList_return retval = new PlexilParser.argumentList_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMA248=null;
		ParserRuleReturnScope argument247 =null;
		ParserRuleReturnScope argument249 =null;

		PlexilTreeNode COMMA248_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:746:14: ( argument ( COMMA argument )* -> ^( ARGUMENT_LIST ( argument )* ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:747:5: argument ( COMMA argument )*
			{
			pushFollow(FOLLOW_argument_in_argumentList4098);
			argument247=argument();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_argument.add(argument247.getTree());
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:747:14: ( COMMA argument )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==COMMA) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:747:15: COMMA argument
					{
					COMMA248=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentList4101); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA248);

					pushFollow(FOLLOW_argument_in_argumentList4103);
					argument249=argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_argument.add(argument249.getTree());
					}
					break;

				default :
					break loop62;
				}
			}

			// AST REWRITE
			// elements: argument
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 748:5: -> ^( ARGUMENT_LIST ( argument )* )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:748:8: ^( ARGUMENT_LIST ( argument )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST"), root_1);
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:748:24: ( argument )*
				while ( stream_argument.hasNext() ) {
					adaptor.addChild(root_1, stream_argument.nextTree());
				}
				stream_argument.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "argumentList"


	public static class argument_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "argument"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:751:1: argument : expression ;
	public final PlexilParser.argument_return argument() throws RecognitionException {
		PlexilParser.argument_return retval = new PlexilParser.argument_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope expression250 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:751:10: ( expression )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:751:12: expression
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_expression_in_argument4129);
			expression250=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression250.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "argument"


	public static class assignment_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:753:1: assignment : assignmentLHS EQUALS assignmentRHS SEMICOLON -> ^( ASSIGNMENT assignmentLHS assignmentRHS ) ;
	public final PlexilParser.assignment_return assignment() throws RecognitionException {
		PlexilParser.assignment_return retval = new PlexilParser.assignment_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token EQUALS252=null;
		Token SEMICOLON254=null;
		ParserRuleReturnScope assignmentLHS251 =null;
		ParserRuleReturnScope assignmentRHS253 =null;

		PlexilTreeNode EQUALS252_tree=null;
		PlexilTreeNode SEMICOLON254_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleSubtreeStream stream_assignmentLHS=new RewriteRuleSubtreeStream(adaptor,"rule assignmentLHS");
		RewriteRuleSubtreeStream stream_assignmentRHS=new RewriteRuleSubtreeStream(adaptor,"rule assignmentRHS");

		 m_paraphrases.push("in assignment statement"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:756:2: ( assignmentLHS EQUALS assignmentRHS SEMICOLON -> ^( ASSIGNMENT assignmentLHS assignmentRHS ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:757:5: assignmentLHS EQUALS assignmentRHS SEMICOLON
			{
			pushFollow(FOLLOW_assignmentLHS_in_assignment4153);
			assignmentLHS251=assignmentLHS();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignmentLHS.add(assignmentLHS251.getTree());
			EQUALS252=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignment4155); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS252);

			pushFollow(FOLLOW_assignmentRHS_in_assignment4157);
			assignmentRHS253=assignmentRHS();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignmentRHS.add(assignmentRHS253.getTree());
			SEMICOLON254=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignment4159); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON254);

			// AST REWRITE
			// elements: assignmentLHS, assignmentRHS
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 758:5: -> ^( ASSIGNMENT assignmentLHS assignmentRHS )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:758:8: ^( ASSIGNMENT assignmentLHS assignmentRHS )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
				adaptor.addChild(root_1, stream_assignmentLHS.nextTree());
				adaptor.addChild(root_1, stream_assignmentRHS.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class assignmentLHS_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "assignmentLHS"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:761:1: assignmentLHS : ( ( NCNAME LBRACKET )=> simpleArrayReference | variable );
	public final PlexilParser.assignmentLHS_return assignmentLHS() throws RecognitionException {
		PlexilParser.assignmentLHS_return retval = new PlexilParser.assignmentLHS_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope simpleArrayReference255 =null;
		ParserRuleReturnScope variable256 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:761:15: ( ( NCNAME LBRACKET )=> simpleArrayReference | variable )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==NCNAME) ) {
				int LA63_1 = input.LA(2);
				if ( (LA63_1==LBRACKET) && (synpred11_Plexil())) {
					alt63=1;
				}
				else if ( (LA63_1==EQUALS) ) {
					alt63=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:762:5: ( NCNAME LBRACKET )=> simpleArrayReference
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_simpleArrayReference_in_assignmentLHS4202);
					simpleArrayReference255=simpleArrayReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleArrayReference255.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:765:5: variable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_variable_in_assignmentLHS4213);
					variable256=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable256.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignmentLHS"


	public static class assignmentRHS_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "assignmentRHS"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:769:1: assignmentRHS : ( ( NCNAME LPAREN )=> commandInvocation | ( LPAREN expression RPAREN LPAREN )=> commandInvocation | expression );
	public final PlexilParser.assignmentRHS_return assignmentRHS() throws RecognitionException {
		PlexilParser.assignmentRHS_return retval = new PlexilParser.assignmentRHS_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope commandInvocation257 =null;
		ParserRuleReturnScope commandInvocation258 =null;
		ParserRuleReturnScope expression259 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:769:15: ( ( NCNAME LPAREN )=> commandInvocation | ( LPAREN expression RPAREN LPAREN )=> commandInvocation | expression )
			int alt64=3;
			alt64 = dfa64.predict(input);
			switch (alt64) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:770:4: ( NCNAME LPAREN )=> commandInvocation
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_commandInvocation_in_assignmentRHS4234);
					commandInvocation257=commandInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandInvocation257.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:772:4: ( LPAREN expression RPAREN LPAREN )=> commandInvocation
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_commandInvocation_in_assignmentRHS4254);
					commandInvocation258=commandInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandInvocation258.getTree());

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:774:4: expression
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_expression_in_assignmentRHS4262);
					expression259=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression259.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignmentRHS"


	public static class update_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "update"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:781:1: update : UPDATE_KYWD ^ ( pair ( COMMA ! pair )* )? SEMICOLON !;
	public final PlexilParser.update_return update() throws RecognitionException {
		PlexilParser.update_return retval = new PlexilParser.update_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token UPDATE_KYWD260=null;
		Token COMMA262=null;
		Token SEMICOLON264=null;
		ParserRuleReturnScope pair261 =null;
		ParserRuleReturnScope pair263 =null;

		PlexilTreeNode UPDATE_KYWD260_tree=null;
		PlexilTreeNode COMMA262_tree=null;
		PlexilTreeNode SEMICOLON264_tree=null;

		 m_paraphrases.push("in \"Update\" statement"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:784:2: ( UPDATE_KYWD ^ ( pair ( COMMA ! pair )* )? SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:785:5: UPDATE_KYWD ^ ( pair ( COMMA ! pair )* )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			UPDATE_KYWD260=(Token)match(input,UPDATE_KYWD,FOLLOW_UPDATE_KYWD_in_update4291); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			UPDATE_KYWD260_tree = (PlexilTreeNode)adaptor.create(UPDATE_KYWD260);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(UPDATE_KYWD260_tree, root_0);
			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:785:18: ( pair ( COMMA ! pair )* )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==NCNAME) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:785:20: pair ( COMMA ! pair )*
					{
					pushFollow(FOLLOW_pair_in_update4296);
					pair261=pair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pair261.getTree());

					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:785:25: ( COMMA ! pair )*
					loop65:
					while (true) {
						int alt65=2;
						int LA65_0 = input.LA(1);
						if ( (LA65_0==COMMA) ) {
							alt65=1;
						}

						switch (alt65) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:785:27: COMMA ! pair
							{
							COMMA262=(Token)match(input,COMMA,FOLLOW_COMMA_in_update4300); if (state.failed) return retval;
							pushFollow(FOLLOW_pair_in_update4303);
							pair263=pair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, pair263.getTree());

							}
							break;

						default :
							break loop65;
						}
					}

					}
					break;

			}

			SEMICOLON264=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_update4311); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "update"


	public static class request_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "request"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:793:1: request : REQUEST_KYWD ^ NCNAME ( pair ( COMMA ! pair )* )? SEMICOLON !;
	public final PlexilParser.request_return request() throws RecognitionException {
		PlexilParser.request_return retval = new PlexilParser.request_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token REQUEST_KYWD265=null;
		Token NCNAME266=null;
		Token COMMA268=null;
		Token SEMICOLON270=null;
		ParserRuleReturnScope pair267 =null;
		ParserRuleReturnScope pair269 =null;

		PlexilTreeNode REQUEST_KYWD265_tree=null;
		PlexilTreeNode NCNAME266_tree=null;
		PlexilTreeNode COMMA268_tree=null;
		PlexilTreeNode SEMICOLON270_tree=null;

		 m_paraphrases.push("in \"Request\" statement"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:796:2: ( REQUEST_KYWD ^ NCNAME ( pair ( COMMA ! pair )* )? SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:796:4: REQUEST_KYWD ^ NCNAME ( pair ( COMMA ! pair )* )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			REQUEST_KYWD265=(Token)match(input,REQUEST_KYWD,FOLLOW_REQUEST_KYWD_in_request4338); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			REQUEST_KYWD265_tree = (PlexilTreeNode)adaptor.create(REQUEST_KYWD265);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(REQUEST_KYWD265_tree, root_0);
			}

			NCNAME266=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_request4341); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME266_tree = (PlexilTreeNode)adaptor.create(NCNAME266);
			adaptor.addChild(root_0, NCNAME266_tree);
			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:796:25: ( pair ( COMMA ! pair )* )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==NCNAME) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:796:27: pair ( COMMA ! pair )*
					{
					pushFollow(FOLLOW_pair_in_request4345);
					pair267=pair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pair267.getTree());

					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:796:32: ( COMMA ! pair )*
					loop67:
					while (true) {
						int alt67=2;
						int LA67_0 = input.LA(1);
						if ( (LA67_0==COMMA) ) {
							alt67=1;
						}

						switch (alt67) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:796:34: COMMA ! pair
							{
							COMMA268=(Token)match(input,COMMA,FOLLOW_COMMA_in_request4349); if (state.failed) return retval;
							pushFollow(FOLLOW_pair_in_request4352);
							pair269=pair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, pair269.getTree());

							}
							break;

						default :
							break loop67;
						}
					}

					}
					break;

			}

			SEMICOLON270=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_request4360); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "request"


	public static class pair_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "pair"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:800:1: pair : NCNAME EQUALS ! expression ;
	public final PlexilParser.pair_return pair() throws RecognitionException {
		PlexilParser.pair_return retval = new PlexilParser.pair_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME271=null;
		Token EQUALS272=null;
		ParserRuleReturnScope expression273 =null;

		PlexilTreeNode NCNAME271_tree=null;
		PlexilTreeNode EQUALS272_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:800:6: ( NCNAME EQUALS ! expression )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:800:8: NCNAME EQUALS ! expression
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			NCNAME271=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_pair4372); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME271_tree = (PlexilTreeNode)adaptor.create(NCNAME271);
			adaptor.addChild(root_0, NCNAME271_tree);
			}

			EQUALS272=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pair4374); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_pair4377);
			expression273=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression273.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pair"


	public static class libraryCall_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "libraryCall"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:806:1: libraryCall : LIBRARY_CALL_KYWD ^ libraryNodeIdRef ( aliasSpecs )? SEMICOLON !;
	public final PlexilParser.libraryCall_return libraryCall() throws RecognitionException {
		PlexilParser.libraryCall_return retval = new PlexilParser.libraryCall_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LIBRARY_CALL_KYWD274=null;
		Token SEMICOLON277=null;
		ParserRuleReturnScope libraryNodeIdRef275 =null;
		ParserRuleReturnScope aliasSpecs276 =null;

		PlexilTreeNode LIBRARY_CALL_KYWD274_tree=null;
		PlexilTreeNode SEMICOLON277_tree=null;

		 m_paraphrases.push("in library action call"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:809:2: ( LIBRARY_CALL_KYWD ^ libraryNodeIdRef ( aliasSpecs )? SEMICOLON !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:810:3: LIBRARY_CALL_KYWD ^ libraryNodeIdRef ( aliasSpecs )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			LIBRARY_CALL_KYWD274=(Token)match(input,LIBRARY_CALL_KYWD,FOLLOW_LIBRARY_CALL_KYWD_in_libraryCall4403); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LIBRARY_CALL_KYWD274_tree = (PlexilTreeNode)adaptor.create(LIBRARY_CALL_KYWD274);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(LIBRARY_CALL_KYWD274_tree, root_0);
			}

			pushFollow(FOLLOW_libraryNodeIdRef_in_libraryCall4406);
			libraryNodeIdRef275=libraryNodeIdRef();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, libraryNodeIdRef275.getTree());

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:810:39: ( aliasSpecs )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==LPAREN) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:810:41: aliasSpecs
					{
					pushFollow(FOLLOW_aliasSpecs_in_libraryCall4410);
					aliasSpecs276=aliasSpecs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aliasSpecs276.getTree());

					}
					break;

			}

			SEMICOLON277=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_libraryCall4415); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "libraryCall"


	public static class libraryNodeIdRef_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "libraryNodeIdRef"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:812:1: libraryNodeIdRef : NCNAME ;
	public final PlexilParser.libraryNodeIdRef_return libraryNodeIdRef() throws RecognitionException {
		PlexilParser.libraryNodeIdRef_return retval = new PlexilParser.libraryNodeIdRef_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME278=null;

		PlexilTreeNode NCNAME278_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:812:18: ( NCNAME )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:812:20: NCNAME
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			NCNAME278=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_libraryNodeIdRef4425); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME278_tree = (PlexilTreeNode)adaptor.create(NCNAME278);
			adaptor.addChild(root_0, NCNAME278_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "libraryNodeIdRef"


	public static class aliasSpecs_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "aliasSpecs"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:814:1: aliasSpecs : LPAREN ( aliasSpec ( COMMA aliasSpec )* )? RPAREN -> ^( ALIASES ( aliasSpec )* ) ;
	public final PlexilParser.aliasSpecs_return aliasSpecs() throws RecognitionException {
		PlexilParser.aliasSpecs_return retval = new PlexilParser.aliasSpecs_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN279=null;
		Token COMMA281=null;
		Token RPAREN283=null;
		ParserRuleReturnScope aliasSpec280 =null;
		ParserRuleReturnScope aliasSpec282 =null;

		PlexilTreeNode LPAREN279_tree=null;
		PlexilTreeNode COMMA281_tree=null;
		PlexilTreeNode RPAREN283_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_aliasSpec=new RewriteRuleSubtreeStream(adaptor,"rule aliasSpec");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:814:12: ( LPAREN ( aliasSpec ( COMMA aliasSpec )* )? RPAREN -> ^( ALIASES ( aliasSpec )* ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:815:3: LPAREN ( aliasSpec ( COMMA aliasSpec )* )? RPAREN
			{
			LPAREN279=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_aliasSpecs4436); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN279);

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:815:10: ( aliasSpec ( COMMA aliasSpec )* )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==NCNAME) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:815:12: aliasSpec ( COMMA aliasSpec )*
					{
					pushFollow(FOLLOW_aliasSpec_in_aliasSpecs4440);
					aliasSpec280=aliasSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aliasSpec.add(aliasSpec280.getTree());
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:815:22: ( COMMA aliasSpec )*
					loop70:
					while (true) {
						int alt70=2;
						int LA70_0 = input.LA(1);
						if ( (LA70_0==COMMA) ) {
							alt70=1;
						}

						switch (alt70) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:815:24: COMMA aliasSpec
							{
							COMMA281=(Token)match(input,COMMA,FOLLOW_COMMA_in_aliasSpecs4444); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA281);

							pushFollow(FOLLOW_aliasSpec_in_aliasSpecs4446);
							aliasSpec282=aliasSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_aliasSpec.add(aliasSpec282.getTree());
							}
							break;

						default :
							break loop70;
						}
					}

					}
					break;

			}

			RPAREN283=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_aliasSpecs4454); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN283);

			// AST REWRITE
			// elements: aliasSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 816:3: -> ^( ALIASES ( aliasSpec )* )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:816:6: ^( ALIASES ( aliasSpec )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ALIASES, "ALIASES"), root_1);
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:816:16: ( aliasSpec )*
				while ( stream_aliasSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_aliasSpec.nextTree());
				}
				stream_aliasSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aliasSpecs"


	public static class aliasSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "aliasSpec"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:819:1: aliasSpec : NCNAME EQUALS expression -> ^( ALIAS NCNAME expression ) ;
	public final PlexilParser.aliasSpec_return aliasSpec() throws RecognitionException {
		PlexilParser.aliasSpec_return retval = new PlexilParser.aliasSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME284=null;
		Token EQUALS285=null;
		ParserRuleReturnScope expression286 =null;

		PlexilTreeNode NCNAME284_tree=null;
		PlexilTreeNode EQUALS285_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:819:11: ( NCNAME EQUALS expression -> ^( ALIAS NCNAME expression ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:820:3: NCNAME EQUALS expression
			{
			NCNAME284=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_aliasSpec4478); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME284);

			EQUALS285=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_aliasSpec4480); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS285);

			pushFollow(FOLLOW_expression_in_aliasSpec4482);
			expression286=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression286.getTree());
			// AST REWRITE
			// elements: NCNAME, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 821:9: -> ^( ALIAS NCNAME expression )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:821:12: ^( ALIAS NCNAME expression )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ALIAS, "ALIAS"), root_1);
				adaptor.addChild(root_1, stream_NCNAME.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aliasSpec"


	public static class nodeParameterName_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeParameterName"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:824:1: nodeParameterName : NCNAME ;
	public final PlexilParser.nodeParameterName_return nodeParameterName() throws RecognitionException {
		PlexilParser.nodeParameterName_return retval = new PlexilParser.nodeParameterName_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME287=null;

		PlexilTreeNode NCNAME287_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:824:19: ( NCNAME )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:824:21: NCNAME
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			NCNAME287=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_nodeParameterName4510); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME287_tree = (PlexilTreeNode)adaptor.create(NCNAME287);
			adaptor.addChild(root_0, NCNAME287_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeParameterName"


	public static class expression_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:835:1: expression : logicalOr ;
	public final PlexilParser.expression_return expression() throws RecognitionException {
		PlexilParser.expression_return retval = new PlexilParser.expression_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope logicalOr288 =null;


		 m_paraphrases.push("in expression"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:838:2: ( logicalOr )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:838:4: logicalOr
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_logicalOr_in_expression4539);
			logicalOr288=logicalOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalOr288.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class logicalOr_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "logicalOr"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:846:1: logicalOr : (o1= logicalXOR -> $o1) ( OR_KYWD on= logicalXOR -> ^( OR_KYWD $logicalOr $on) )* ;
	public final PlexilParser.logicalOr_return logicalOr() throws RecognitionException {
		PlexilParser.logicalOr_return retval = new PlexilParser.logicalOr_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token OR_KYWD289=null;
		ParserRuleReturnScope o1 =null;
		ParserRuleReturnScope on =null;

		PlexilTreeNode OR_KYWD289_tree=null;
		RewriteRuleTokenStream stream_OR_KYWD=new RewriteRuleTokenStream(adaptor,"token OR_KYWD");
		RewriteRuleSubtreeStream stream_logicalXOR=new RewriteRuleSubtreeStream(adaptor,"rule logicalXOR");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:846:11: ( (o1= logicalXOR -> $o1) ( OR_KYWD on= logicalXOR -> ^( OR_KYWD $logicalOr $on) )* )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:847:4: (o1= logicalXOR -> $o1) ( OR_KYWD on= logicalXOR -> ^( OR_KYWD $logicalOr $on) )*
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:847:4: (o1= logicalXOR -> $o1)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:847:6: o1= logicalXOR
			{
			pushFollow(FOLLOW_logicalXOR_in_logicalOr4561);
			o1=logicalXOR();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicalXOR.add(o1.getTree());
			// AST REWRITE
			// elements: o1
			// token labels: 
			// rule labels: o1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_o1=new RewriteRuleSubtreeStream(adaptor,"rule o1",o1!=null?o1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 847:20: -> $o1
			{
				adaptor.addChild(root_0, stream_o1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:848:4: ( OR_KYWD on= logicalXOR -> ^( OR_KYWD $logicalOr $on) )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==OR_KYWD) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:848:6: OR_KYWD on= logicalXOR
					{
					OR_KYWD289=(Token)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_logicalOr4575); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OR_KYWD.add(OR_KYWD289);

					pushFollow(FOLLOW_logicalXOR_in_logicalOr4579);
					on=logicalXOR();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalXOR.add(on.getTree());
					// AST REWRITE
					// elements: OR_KYWD, logicalOr, on
					// token labels: 
					// rule labels: retval, on
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_on=new RewriteRuleSubtreeStream(adaptor,"rule on",on!=null?on.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 849:6: -> ^( OR_KYWD $logicalOr $on)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:849:9: ^( OR_KYWD $logicalOr $on)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_OR_KYWD.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_on.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop72;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalOr"


	public static class logicalXOR_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "logicalXOR"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:855:1: logicalXOR : (x1= logicalAnd -> $x1) ( XOR_KYWD xn= logicalAnd -> ^( XOR_KYWD $logicalXOR $xn) )* ;
	public final PlexilParser.logicalXOR_return logicalXOR() throws RecognitionException {
		PlexilParser.logicalXOR_return retval = new PlexilParser.logicalXOR_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token XOR_KYWD290=null;
		ParserRuleReturnScope x1 =null;
		ParserRuleReturnScope xn =null;

		PlexilTreeNode XOR_KYWD290_tree=null;
		RewriteRuleTokenStream stream_XOR_KYWD=new RewriteRuleTokenStream(adaptor,"token XOR_KYWD");
		RewriteRuleSubtreeStream stream_logicalAnd=new RewriteRuleSubtreeStream(adaptor,"rule logicalAnd");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:855:12: ( (x1= logicalAnd -> $x1) ( XOR_KYWD xn= logicalAnd -> ^( XOR_KYWD $logicalXOR $xn) )* )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:856:5: (x1= logicalAnd -> $x1) ( XOR_KYWD xn= logicalAnd -> ^( XOR_KYWD $logicalXOR $xn) )*
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:856:5: (x1= logicalAnd -> $x1)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:856:7: x1= logicalAnd
			{
			pushFollow(FOLLOW_logicalAnd_in_logicalXOR4622);
			x1=logicalAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicalAnd.add(x1.getTree());
			// AST REWRITE
			// elements: x1
			// token labels: 
			// rule labels: x1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_x1=new RewriteRuleSubtreeStream(adaptor,"rule x1",x1!=null?x1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 856:21: -> $x1
			{
				adaptor.addChild(root_0, stream_x1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:857:5: ( XOR_KYWD xn= logicalAnd -> ^( XOR_KYWD $logicalXOR $xn) )*
			loop73:
			while (true) {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==XOR_KYWD) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:857:7: XOR_KYWD xn= logicalAnd
					{
					XOR_KYWD290=(Token)match(input,XOR_KYWD,FOLLOW_XOR_KYWD_in_logicalXOR4637); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_XOR_KYWD.add(XOR_KYWD290);

					pushFollow(FOLLOW_logicalAnd_in_logicalXOR4641);
					xn=logicalAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalAnd.add(xn.getTree());
					// AST REWRITE
					// elements: xn, XOR_KYWD, logicalXOR
					// token labels: 
					// rule labels: xn, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_xn=new RewriteRuleSubtreeStream(adaptor,"rule xn",xn!=null?xn.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 858:7: -> ^( XOR_KYWD $logicalXOR $xn)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:858:10: ^( XOR_KYWD $logicalXOR $xn)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_XOR_KYWD.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_xn.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop73;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalXOR"


	public static class logicalAnd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "logicalAnd"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:864:1: logicalAnd : (a1= equality -> $a1) ( AND_KYWD an= equality -> ^( AND_KYWD $logicalAnd $an) )* ;
	public final PlexilParser.logicalAnd_return logicalAnd() throws RecognitionException {
		PlexilParser.logicalAnd_return retval = new PlexilParser.logicalAnd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token AND_KYWD291=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope an =null;

		PlexilTreeNode AND_KYWD291_tree=null;
		RewriteRuleTokenStream stream_AND_KYWD=new RewriteRuleTokenStream(adaptor,"token AND_KYWD");
		RewriteRuleSubtreeStream stream_equality=new RewriteRuleSubtreeStream(adaptor,"rule equality");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:864:12: ( (a1= equality -> $a1) ( AND_KYWD an= equality -> ^( AND_KYWD $logicalAnd $an) )* )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:865:4: (a1= equality -> $a1) ( AND_KYWD an= equality -> ^( AND_KYWD $logicalAnd $an) )*
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:865:4: (a1= equality -> $a1)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:865:6: a1= equality
			{
			pushFollow(FOLLOW_equality_in_logicalAnd4686);
			a1=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_equality.add(a1.getTree());
			// AST REWRITE
			// elements: a1
			// token labels: 
			// rule labels: a1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 865:18: -> $a1
			{
				adaptor.addChild(root_0, stream_a1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:866:4: ( AND_KYWD an= equality -> ^( AND_KYWD $logicalAnd $an) )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==AND_KYWD) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:866:6: AND_KYWD an= equality
					{
					AND_KYWD291=(Token)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_logicalAnd4700); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AND_KYWD.add(AND_KYWD291);

					pushFollow(FOLLOW_equality_in_logicalAnd4704);
					an=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_equality.add(an.getTree());
					// AST REWRITE
					// elements: AND_KYWD, logicalAnd, an
					// token labels: 
					// rule labels: an, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_an=new RewriteRuleSubtreeStream(adaptor,"rule an",an!=null?an.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 867:6: -> ^( AND_KYWD $logicalAnd $an)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:867:9: ^( AND_KYWD $logicalAnd $an)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_AND_KYWD.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_an.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop74;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalAnd"


	public static class equality_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "equality"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:877:1: equality : (e1= relational -> $e1) ( equalityOp en= relational -> ^( equalityOp $equality $en) )? ;
	public final PlexilParser.equality_return equality() throws RecognitionException {
		PlexilParser.equality_return retval = new PlexilParser.equality_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope en =null;
		ParserRuleReturnScope equalityOp292 =null;

		RewriteRuleSubtreeStream stream_equalityOp=new RewriteRuleSubtreeStream(adaptor,"rule equalityOp");
		RewriteRuleSubtreeStream stream_relational=new RewriteRuleSubtreeStream(adaptor,"rule relational");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:877:10: ( (e1= relational -> $e1) ( equalityOp en= relational -> ^( equalityOp $equality $en) )? )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:878:5: (e1= relational -> $e1) ( equalityOp en= relational -> ^( equalityOp $equality $en) )?
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:878:5: (e1= relational -> $e1)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:878:7: e1= relational
			{
			pushFollow(FOLLOW_relational_in_equality4751);
			e1=relational();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_relational.add(e1.getTree());
			// AST REWRITE
			// elements: e1
			// token labels: 
			// rule labels: e1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 878:21: -> $e1
			{
				adaptor.addChild(root_0, stream_e1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:879:5: ( equalityOp en= relational -> ^( equalityOp $equality $en) )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==DEQUALS||LA75_0==NEQUALS) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:879:7: equalityOp en= relational
					{
					pushFollow(FOLLOW_equalityOp_in_equality4765);
					equalityOp292=equalityOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_equalityOp.add(equalityOp292.getTree());
					pushFollow(FOLLOW_relational_in_equality4769);
					en=relational();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relational.add(en.getTree());
					// AST REWRITE
					// elements: equality, equalityOp, en
					// token labels: 
					// rule labels: en, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_en=new RewriteRuleSubtreeStream(adaptor,"rule en",en!=null?en.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 880:4: -> ^( equalityOp $equality $en)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:880:7: ^( equalityOp $equality $en)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_equalityOp.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_en.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equality"


	public static class equalityOp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "equalityOp"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:884:1: equalityOp : ( DEQUALS | NEQUALS );
	public final PlexilParser.equalityOp_return equalityOp() throws RecognitionException {
		PlexilParser.equalityOp_return retval = new PlexilParser.equalityOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set293=null;

		PlexilTreeNode set293_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:884:12: ( DEQUALS | NEQUALS )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set293=input.LT(1);
			if ( input.LA(1)==DEQUALS||input.LA(1)==NEQUALS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set293));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equalityOp"


	public static class relational_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "relational"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:891:1: relational : (a1= additive -> $a1) ( relationalOp an= additive -> ^( relationalOp $relational $an) )? ;
	public final PlexilParser.relational_return relational() throws RecognitionException {
		PlexilParser.relational_return retval = new PlexilParser.relational_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope an =null;
		ParserRuleReturnScope relationalOp294 =null;

		RewriteRuleSubtreeStream stream_relationalOp=new RewriteRuleSubtreeStream(adaptor,"rule relationalOp");
		RewriteRuleSubtreeStream stream_additive=new RewriteRuleSubtreeStream(adaptor,"rule additive");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:891:12: ( (a1= additive -> $a1) ( relationalOp an= additive -> ^( relationalOp $relational $an) )? )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:892:5: (a1= additive -> $a1) ( relationalOp an= additive -> ^( relationalOp $relational $an) )?
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:892:5: (a1= additive -> $a1)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:892:7: a1= additive
			{
			pushFollow(FOLLOW_additive_in_relational4829);
			a1=additive();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_additive.add(a1.getTree());
			// AST REWRITE
			// elements: a1
			// token labels: 
			// rule labels: a1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 892:19: -> $a1
			{
				adaptor.addChild(root_0, stream_a1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:893:2: ( relationalOp an= additive -> ^( relationalOp $relational $an) )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==GEQ||LA76_0==GREATER||(LA76_0 >= LEQ && LA76_0 <= LESS)) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:893:4: relationalOp an= additive
					{
					pushFollow(FOLLOW_relationalOp_in_relational4841);
					relationalOp294=relationalOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relationalOp.add(relationalOp294.getTree());
					pushFollow(FOLLOW_additive_in_relational4845);
					an=additive();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_additive.add(an.getTree());
					// AST REWRITE
					// elements: relationalOp, an, relational
					// token labels: 
					// rule labels: an, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_an=new RewriteRuleSubtreeStream(adaptor,"rule an",an!=null?an.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 894:4: -> ^( relationalOp $relational $an)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:894:7: ^( relationalOp $relational $an)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_relationalOp.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_an.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relational"


	public static class relationalOp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "relationalOp"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:898:1: relationalOp : ( GREATER | GEQ | LESS | LEQ );
	public final PlexilParser.relationalOp_return relationalOp() throws RecognitionException {
		PlexilParser.relationalOp_return retval = new PlexilParser.relationalOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set295=null;

		PlexilTreeNode set295_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:898:14: ( GREATER | GEQ | LESS | LEQ )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set295=input.LT(1);
			if ( input.LA(1)==GEQ||input.LA(1)==GREATER||(input.LA(1) >= LEQ && input.LA(1) <= LESS) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set295));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relationalOp"


	public static class additive_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "additive"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:909:1: additive : (m1= multiplicative -> $m1) ( addOp mn= multiplicative -> ^( addOp $additive $mn) )* ;
	public final PlexilParser.additive_return additive() throws RecognitionException {
		PlexilParser.additive_return retval = new PlexilParser.additive_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope mn =null;
		ParserRuleReturnScope addOp296 =null;

		RewriteRuleSubtreeStream stream_addOp=new RewriteRuleSubtreeStream(adaptor,"rule addOp");
		RewriteRuleSubtreeStream stream_multiplicative=new RewriteRuleSubtreeStream(adaptor,"rule multiplicative");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:909:10: ( (m1= multiplicative -> $m1) ( addOp mn= multiplicative -> ^( addOp $additive $mn) )* )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:910:5: (m1= multiplicative -> $m1) ( addOp mn= multiplicative -> ^( addOp $additive $mn) )*
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:910:5: (m1= multiplicative -> $m1)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:910:7: m1= multiplicative
			{
			pushFollow(FOLLOW_multiplicative_in_additive4922);
			m1=multiplicative();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_multiplicative.add(m1.getTree());
			// AST REWRITE
			// elements: m1
			// token labels: 
			// rule labels: m1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"rule m1",m1!=null?m1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 910:25: -> $m1
			{
				adaptor.addChild(root_0, stream_m1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:911:5: ( addOp mn= multiplicative -> ^( addOp $additive $mn) )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==MINUS||LA77_0==PLUS) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:911:7: addOp mn= multiplicative
					{
					pushFollow(FOLLOW_addOp_in_additive4937);
					addOp296=addOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_addOp.add(addOp296.getTree());
					pushFollow(FOLLOW_multiplicative_in_additive4941);
					mn=multiplicative();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiplicative.add(mn.getTree());
					// AST REWRITE
					// elements: mn, additive, addOp
					// token labels: 
					// rule labels: mn, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_mn=new RewriteRuleSubtreeStream(adaptor,"rule mn",mn!=null?mn.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 912:4: -> ^( addOp $additive $mn)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:912:7: ^( addOp $additive $mn)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_addOp.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_mn.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop77;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive"


	public static class addOp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "addOp"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:916:1: addOp : ( PLUS | MINUS );
	public final PlexilParser.addOp_return addOp() throws RecognitionException {
		PlexilParser.addOp_return retval = new PlexilParser.addOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set297=null;

		PlexilTreeNode set297_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:916:7: ( PLUS | MINUS )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set297=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set297));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addOp"


	public static class multiplicative_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "multiplicative"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:923:1: multiplicative : (u1= unary -> $u1) ( multOp un= unary -> ^( multOp $multiplicative $un) )* ;
	public final PlexilParser.multiplicative_return multiplicative() throws RecognitionException {
		PlexilParser.multiplicative_return retval = new PlexilParser.multiplicative_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope u1 =null;
		ParserRuleReturnScope un =null;
		ParserRuleReturnScope multOp298 =null;

		RewriteRuleSubtreeStream stream_multOp=new RewriteRuleSubtreeStream(adaptor,"rule multOp");
		RewriteRuleSubtreeStream stream_unary=new RewriteRuleSubtreeStream(adaptor,"rule unary");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:923:16: ( (u1= unary -> $u1) ( multOp un= unary -> ^( multOp $multiplicative $un) )* )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:924:5: (u1= unary -> $u1) ( multOp un= unary -> ^( multOp $multiplicative $un) )*
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:924:5: (u1= unary -> $u1)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:924:7: u1= unary
			{
			pushFollow(FOLLOW_unary_in_multiplicative5002);
			u1=unary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unary.add(u1.getTree());
			// AST REWRITE
			// elements: u1
			// token labels: 
			// rule labels: u1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_u1=new RewriteRuleSubtreeStream(adaptor,"rule u1",u1!=null?u1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 924:16: -> $u1
			{
				adaptor.addChild(root_0, stream_u1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:925:5: ( multOp un= unary -> ^( multOp $multiplicative $un) )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==ASTERISK||LA78_0==MOD_KYWD||LA78_0==PERCENT||LA78_0==SLASH) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:925:7: multOp un= unary
					{
					pushFollow(FOLLOW_multOp_in_multiplicative5017);
					multOp298=multOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multOp.add(multOp298.getTree());
					pushFollow(FOLLOW_unary_in_multiplicative5021);
					un=unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary.add(un.getTree());
					// AST REWRITE
					// elements: un, multiplicative, multOp
					// token labels: 
					// rule labels: un, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_un=new RewriteRuleSubtreeStream(adaptor,"rule un",un!=null?un.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 926:7: -> ^( multOp $multiplicative $un)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:926:10: ^( multOp $multiplicative $un)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_multOp.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_un.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop78;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicative"


	public static class multOp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "multOp"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:930:1: multOp : ( ASTERISK | SLASH | PERCENT | MOD_KYWD );
	public final PlexilParser.multOp_return multOp() throws RecognitionException {
		PlexilParser.multOp_return retval = new PlexilParser.multOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set299=null;

		PlexilTreeNode set299_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:930:8: ( ASTERISK | SLASH | PERCENT | MOD_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set299=input.LT(1);
			if ( input.LA(1)==ASTERISK||input.LA(1)==MOD_KYWD||input.LA(1)==PERCENT||input.LA(1)==SLASH ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set299));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multOp"


	public static class unary_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:944:1: unary : ( unaryMinus | unaryOp ^ quantity | quantity );
	public final PlexilParser.unary_return unary() throws RecognitionException {
		PlexilParser.unary_return retval = new PlexilParser.unary_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope unaryMinus300 =null;
		ParserRuleReturnScope unaryOp301 =null;
		ParserRuleReturnScope quantity302 =null;
		ParserRuleReturnScope quantity303 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:944:7: ( unaryMinus | unaryOp ^ quantity | quantity )
			int alt79=3;
			switch ( input.LA(1) ) {
			case MINUS:
				{
				switch ( input.LA(2) ) {
				case INT:
					{
					alt79=1;
					}
					break;
				case DOUBLE:
					{
					alt79=1;
					}
					break;
				case LPAREN:
					{
					alt79=1;
					}
					break;
				case BAR:
					{
					alt79=1;
					}
					break;
				case ABS_KYWD:
				case ARRAY_MAX_SIZE_KYWD:
				case ARRAY_SIZE_KYWD:
				case CEIL_KYWD:
				case FLOOR_KYWD:
				case REAL_TO_INT_KYWD:
				case ROUND_KYWD:
				case SQRT_KYWD:
				case STRLEN_KYWD:
				case TRUNC_KYWD:
					{
					alt79=1;
					}
					break;
				case MAX_KYWD:
				case MIN_KYWD:
					{
					alt79=1;
					}
					break;
				case IS_KNOWN_KYWD:
					{
					alt79=1;
					}
					break;
				case LOOKUP_KYWD:
					{
					alt79=1;
					}
					break;
				case LOOKUP_ON_CHANGE_KYWD:
					{
					alt79=1;
					}
					break;
				case LOOKUP_NOW_KYWD:
					{
					alt79=1;
					}
					break;
				case MESSAGE_RECEIVED_KYWD:
					{
					alt79=1;
					}
					break;
				case NODE_EXECUTING_KYWD:
				case NODE_FAILED_KYWD:
				case NODE_FINISHED_KYWD:
				case NODE_INACTIVE_KYWD:
				case NODE_INVARIANT_FAILED_KYWD:
				case NODE_ITERATION_ENDED_KYWD:
				case NODE_ITERATION_FAILED_KYWD:
				case NODE_ITERATION_SUCCEEDED_KYWD:
				case NODE_PARENT_FAILED_KYWD:
				case NODE_POSTCONDITION_FAILED_KYWD:
				case NODE_PRECONDITION_FAILED_KYWD:
				case NODE_SKIPPED_KYWD:
				case NODE_SUCCEEDED_KYWD:
				case NODE_WAITING_KYWD:
				case NO_CHILD_FAILED_KYWD:
					{
					alt79=1;
					}
					break;
				case NCNAME:
					{
					alt79=1;
					}
					break;
				case CHILD_KYWD:
					{
					alt79=1;
					}
					break;
				case SIBLING_KYWD:
					{
					alt79=1;
					}
					break;
				case PARENT_KYWD:
				case SELF_KYWD:
					{
					alt79=1;
					}
					break;
				case FALSE_KYWD:
				case TRUE_KYWD:
					{
					alt79=1;
					}
					break;
				case STRING:
					{
					alt79=1;
					}
					break;
				case MINUS:
					{
					alt79=1;
					}
					break;
				case DATE_KYWD:
					{
					alt79=1;
					}
					break;
				case DURATION_KYWD:
					{
					alt79=1;
					}
					break;
				case HASHPAREN:
					{
					alt79=1;
					}
					break;
				case COMMAND_ACCEPTED_KYWD:
				case COMMAND_DENIED_KYWD:
				case COMMAND_FAILED_KYWD:
				case COMMAND_RCVD_KYWD:
				case COMMAND_SENT_KYWD:
				case COMMAND_SUCCESS_KYWD:
					{
					alt79=1;
					}
					break;
				case EXITED_KYWD:
				case INVARIANT_CONDITION_FAILED_KYWD:
				case PARENT_EXITED_KYWD:
				case PARENT_FAILED_KYWD:
				case POST_CONDITION_FAILED_KYWD:
				case PRE_CONDITION_FAILED_KYWD:
					{
					alt79=1;
					}
					break;
				case EXECUTING_STATE_KYWD:
				case FAILING_STATE_KYWD:
				case FINISHED_STATE_KYWD:
				case FINISHING_STATE_KYWD:
				case INACTIVE_STATE_KYWD:
				case ITERATION_ENDED_STATE_KYWD:
				case WAITING_STATE_KYWD:
					{
					alt79=1;
					}
					break;
				case FAILURE_OUTCOME_KYWD:
				case INTERRUPTED_OUTCOME_KYWD:
				case SKIPPED_OUTCOME_KYWD:
				case SUCCESS_OUTCOME_KYWD:
					{
					alt79=1;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 79, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NOT_KYWD:
				{
				alt79=2;
				}
				break;
			case ABS_KYWD:
			case ARRAY_MAX_SIZE_KYWD:
			case ARRAY_SIZE_KYWD:
			case BAR:
			case CEIL_KYWD:
			case CHILD_KYWD:
			case COMMAND_ACCEPTED_KYWD:
			case COMMAND_DENIED_KYWD:
			case COMMAND_FAILED_KYWD:
			case COMMAND_RCVD_KYWD:
			case COMMAND_SENT_KYWD:
			case COMMAND_SUCCESS_KYWD:
			case DATE_KYWD:
			case DOUBLE:
			case DURATION_KYWD:
			case EXECUTING_STATE_KYWD:
			case EXITED_KYWD:
			case FAILING_STATE_KYWD:
			case FAILURE_OUTCOME_KYWD:
			case FALSE_KYWD:
			case FINISHED_STATE_KYWD:
			case FINISHING_STATE_KYWD:
			case FLOOR_KYWD:
			case HASHPAREN:
			case INACTIVE_STATE_KYWD:
			case INT:
			case INTERRUPTED_OUTCOME_KYWD:
			case INVARIANT_CONDITION_FAILED_KYWD:
			case IS_KNOWN_KYWD:
			case ITERATION_ENDED_STATE_KYWD:
			case LOOKUP_KYWD:
			case LOOKUP_NOW_KYWD:
			case LOOKUP_ON_CHANGE_KYWD:
			case LPAREN:
			case MAX_KYWD:
			case MESSAGE_RECEIVED_KYWD:
			case MIN_KYWD:
			case NCNAME:
			case NODE_EXECUTING_KYWD:
			case NODE_FAILED_KYWD:
			case NODE_FINISHED_KYWD:
			case NODE_INACTIVE_KYWD:
			case NODE_INVARIANT_FAILED_KYWD:
			case NODE_ITERATION_ENDED_KYWD:
			case NODE_ITERATION_FAILED_KYWD:
			case NODE_ITERATION_SUCCEEDED_KYWD:
			case NODE_PARENT_FAILED_KYWD:
			case NODE_POSTCONDITION_FAILED_KYWD:
			case NODE_PRECONDITION_FAILED_KYWD:
			case NODE_SKIPPED_KYWD:
			case NODE_SUCCEEDED_KYWD:
			case NODE_WAITING_KYWD:
			case NO_CHILD_FAILED_KYWD:
			case PARENT_EXITED_KYWD:
			case PARENT_FAILED_KYWD:
			case PARENT_KYWD:
			case POST_CONDITION_FAILED_KYWD:
			case PRE_CONDITION_FAILED_KYWD:
			case REAL_TO_INT_KYWD:
			case ROUND_KYWD:
			case SELF_KYWD:
			case SIBLING_KYWD:
			case SKIPPED_OUTCOME_KYWD:
			case SQRT_KYWD:
			case STRING:
			case STRLEN_KYWD:
			case SUCCESS_OUTCOME_KYWD:
			case TRUE_KYWD:
			case TRUNC_KYWD:
			case WAITING_STATE_KYWD:
				{
				alt79=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:944:9: unaryMinus
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_unaryMinus_in_unary5095);
					unaryMinus300=unaryMinus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryMinus300.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:945:9: unaryOp ^ quantity
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_unaryOp_in_unary5105);
					unaryOp301=unaryOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(unaryOp301.getTree(), root_0);
					pushFollow(FOLLOW_quantity_in_unary5108);
					quantity302=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity302.getTree());

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:946:9: quantity
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_quantity_in_unary5118);
					quantity303=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity303.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary"


	public static class unaryOp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "unaryOp"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:949:1: unaryOp : NOT_KYWD ;
	public final PlexilParser.unaryOp_return unaryOp() throws RecognitionException {
		PlexilParser.unaryOp_return retval = new PlexilParser.unaryOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NOT_KYWD304=null;

		PlexilTreeNode NOT_KYWD304_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:949:9: ( NOT_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:949:11: NOT_KYWD
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			NOT_KYWD304=(Token)match(input,NOT_KYWD,FOLLOW_NOT_KYWD_in_unaryOp5133); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NOT_KYWD304_tree = (PlexilTreeNode)adaptor.create(NOT_KYWD304);
			adaptor.addChild(root_0, NOT_KYWD304_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryOp"


	public static class unaryMinus_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "unaryMinus"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:951:1: unaryMinus : ( ( MINUS i= INT ) -> ^( NEG_INT $i) | ( MINUS d= DOUBLE ) -> ^( NEG_DOUBLE $d) | MINUS ^ quantity );
	public final PlexilParser.unaryMinus_return unaryMinus() throws RecognitionException {
		PlexilParser.unaryMinus_return retval = new PlexilParser.unaryMinus_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token i=null;
		Token d=null;
		Token MINUS305=null;
		Token MINUS306=null;
		Token MINUS307=null;
		ParserRuleReturnScope quantity308 =null;

		PlexilTreeNode i_tree=null;
		PlexilTreeNode d_tree=null;
		PlexilTreeNode MINUS305_tree=null;
		PlexilTreeNode MINUS306_tree=null;
		PlexilTreeNode MINUS307_tree=null;
		RewriteRuleTokenStream stream_DOUBLE=new RewriteRuleTokenStream(adaptor,"token DOUBLE");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:951:12: ( ( MINUS i= INT ) -> ^( NEG_INT $i) | ( MINUS d= DOUBLE ) -> ^( NEG_DOUBLE $d) | MINUS ^ quantity )
			int alt80=3;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==MINUS) ) {
				switch ( input.LA(2) ) {
				case INT:
					{
					alt80=1;
					}
					break;
				case DOUBLE:
					{
					alt80=2;
					}
					break;
				case ABS_KYWD:
				case ARRAY_MAX_SIZE_KYWD:
				case ARRAY_SIZE_KYWD:
				case BAR:
				case CEIL_KYWD:
				case CHILD_KYWD:
				case COMMAND_ACCEPTED_KYWD:
				case COMMAND_DENIED_KYWD:
				case COMMAND_FAILED_KYWD:
				case COMMAND_RCVD_KYWD:
				case COMMAND_SENT_KYWD:
				case COMMAND_SUCCESS_KYWD:
				case DATE_KYWD:
				case DURATION_KYWD:
				case EXECUTING_STATE_KYWD:
				case EXITED_KYWD:
				case FAILING_STATE_KYWD:
				case FAILURE_OUTCOME_KYWD:
				case FALSE_KYWD:
				case FINISHED_STATE_KYWD:
				case FINISHING_STATE_KYWD:
				case FLOOR_KYWD:
				case HASHPAREN:
				case INACTIVE_STATE_KYWD:
				case INTERRUPTED_OUTCOME_KYWD:
				case INVARIANT_CONDITION_FAILED_KYWD:
				case IS_KNOWN_KYWD:
				case ITERATION_ENDED_STATE_KYWD:
				case LOOKUP_KYWD:
				case LOOKUP_NOW_KYWD:
				case LOOKUP_ON_CHANGE_KYWD:
				case LPAREN:
				case MAX_KYWD:
				case MESSAGE_RECEIVED_KYWD:
				case MINUS:
				case MIN_KYWD:
				case NCNAME:
				case NODE_EXECUTING_KYWD:
				case NODE_FAILED_KYWD:
				case NODE_FINISHED_KYWD:
				case NODE_INACTIVE_KYWD:
				case NODE_INVARIANT_FAILED_KYWD:
				case NODE_ITERATION_ENDED_KYWD:
				case NODE_ITERATION_FAILED_KYWD:
				case NODE_ITERATION_SUCCEEDED_KYWD:
				case NODE_PARENT_FAILED_KYWD:
				case NODE_POSTCONDITION_FAILED_KYWD:
				case NODE_PRECONDITION_FAILED_KYWD:
				case NODE_SKIPPED_KYWD:
				case NODE_SUCCEEDED_KYWD:
				case NODE_WAITING_KYWD:
				case NO_CHILD_FAILED_KYWD:
				case PARENT_EXITED_KYWD:
				case PARENT_FAILED_KYWD:
				case PARENT_KYWD:
				case POST_CONDITION_FAILED_KYWD:
				case PRE_CONDITION_FAILED_KYWD:
				case REAL_TO_INT_KYWD:
				case ROUND_KYWD:
				case SELF_KYWD:
				case SIBLING_KYWD:
				case SKIPPED_OUTCOME_KYWD:
				case SQRT_KYWD:
				case STRING:
				case STRLEN_KYWD:
				case SUCCESS_OUTCOME_KYWD:
				case TRUE_KYWD:
				case TRUNC_KYWD:
				case WAITING_STATE_KYWD:
					{
					alt80=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 80, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:951:14: ( MINUS i= INT )
					{
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:951:14: ( MINUS i= INT )
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:951:15: MINUS i= INT
					{
					MINUS305=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryMinus5143); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS305);

					i=(Token)match(input,INT,FOLLOW_INT_in_unaryMinus5147); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(i);

					}

					// AST REWRITE
					// elements: i
					// token labels: i
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 951:28: -> ^( NEG_INT $i)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:951:31: ^( NEG_INT $i)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NEG_INT, "NEG_INT"), root_1);
						adaptor.addChild(root_1, stream_i.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:952:14: ( MINUS d= DOUBLE )
					{
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:952:14: ( MINUS d= DOUBLE )
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:952:15: MINUS d= DOUBLE
					{
					MINUS306=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryMinus5173); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS306);

					d=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_unaryMinus5177); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE.add(d);

					}

					// AST REWRITE
					// elements: d
					// token labels: d
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 952:31: -> ^( NEG_DOUBLE $d)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:952:34: ^( NEG_DOUBLE $d)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NEG_DOUBLE, "NEG_DOUBLE"), root_1);
						adaptor.addChild(root_1, stream_d.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:953:14: MINUS ^ quantity
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					MINUS307=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryMinus5202); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS307_tree = (PlexilTreeNode)adaptor.create(MINUS307);
					root_0 = (PlexilTreeNode)adaptor.becomeRoot(MINUS307_tree, root_0);
					}

					pushFollow(FOLLOW_quantity_in_unaryMinus5205);
					quantity308=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity308.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryMinus"


	public static class dateLiteral_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "dateLiteral"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:956:1: dateLiteral : ( DATE_KYWD LPAREN s= STRING RPAREN ) -> ^( DATE_LITERAL $s) ;
	public final PlexilParser.dateLiteral_return dateLiteral() throws RecognitionException {
		PlexilParser.dateLiteral_return retval = new PlexilParser.dateLiteral_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token s=null;
		Token DATE_KYWD309=null;
		Token LPAREN310=null;
		Token RPAREN311=null;

		PlexilTreeNode s_tree=null;
		PlexilTreeNode DATE_KYWD309_tree=null;
		PlexilTreeNode LPAREN310_tree=null;
		PlexilTreeNode RPAREN311_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_DATE_KYWD=new RewriteRuleTokenStream(adaptor,"token DATE_KYWD");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:956:13: ( ( DATE_KYWD LPAREN s= STRING RPAREN ) -> ^( DATE_LITERAL $s) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:956:15: ( DATE_KYWD LPAREN s= STRING RPAREN )
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:956:15: ( DATE_KYWD LPAREN s= STRING RPAREN )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:956:16: DATE_KYWD LPAREN s= STRING RPAREN
			{
			DATE_KYWD309=(Token)match(input,DATE_KYWD,FOLLOW_DATE_KYWD_in_dateLiteral5226); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DATE_KYWD.add(DATE_KYWD309);

			LPAREN310=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateLiteral5228); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN310);

			s=(Token)match(input,STRING,FOLLOW_STRING_in_dateLiteral5232); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STRING.add(s);

			RPAREN311=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateLiteral5234); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN311);

			}

			// AST REWRITE
			// elements: s
			// token labels: s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 956:50: -> ^( DATE_LITERAL $s)
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:956:53: ^( DATE_LITERAL $s)
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(DATE_LITERAL, "DATE_LITERAL"), root_1);
				adaptor.addChild(root_1, stream_s.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dateLiteral"


	public static class durationLiteral_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "durationLiteral"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:958:1: durationLiteral : ( DURATION_KYWD LPAREN s= STRING RPAREN ) -> ^( DURATION_LITERAL $s) ;
	public final PlexilParser.durationLiteral_return durationLiteral() throws RecognitionException {
		PlexilParser.durationLiteral_return retval = new PlexilParser.durationLiteral_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token s=null;
		Token DURATION_KYWD312=null;
		Token LPAREN313=null;
		Token RPAREN314=null;

		PlexilTreeNode s_tree=null;
		PlexilTreeNode DURATION_KYWD312_tree=null;
		PlexilTreeNode LPAREN313_tree=null;
		PlexilTreeNode RPAREN314_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_DURATION_KYWD=new RewriteRuleTokenStream(adaptor,"token DURATION_KYWD");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:958:17: ( ( DURATION_KYWD LPAREN s= STRING RPAREN ) -> ^( DURATION_LITERAL $s) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:958:19: ( DURATION_KYWD LPAREN s= STRING RPAREN )
			{
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:958:19: ( DURATION_KYWD LPAREN s= STRING RPAREN )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:958:20: DURATION_KYWD LPAREN s= STRING RPAREN
			{
			DURATION_KYWD312=(Token)match(input,DURATION_KYWD,FOLLOW_DURATION_KYWD_in_durationLiteral5254); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DURATION_KYWD.add(DURATION_KYWD312);

			LPAREN313=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_durationLiteral5256); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN313);

			s=(Token)match(input,STRING,FOLLOW_STRING_in_durationLiteral5260); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STRING.add(s);

			RPAREN314=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_durationLiteral5262); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN314);

			}

			// AST REWRITE
			// elements: s
			// token labels: s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 958:58: -> ^( DURATION_LITERAL $s)
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:958:61: ^( DURATION_LITERAL $s)
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(DURATION_LITERAL, "DURATION_LITERAL"), root_1);
				adaptor.addChild(root_1, stream_s.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durationLiteral"


	public static class quantity_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "quantity"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:966:1: quantity : ( LPAREN ! expression RPAREN !| BAR expression BAR -> ^( ABS_KYWD expression ) | oneArgFn ^ LPAREN ! expression RPAREN !| twoArgFn ^ LPAREN ! expression COMMA ! expression RPAREN !| isKnownExp | ( lookupExpr LBRACKET )=> lookupArrayReference | lookupExpr | messageReceivedExp | nodeStatePredicateExp | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD )=> nodeStateVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd )=> nodeTimepointValue | ( NCNAME LBRACKET )=> simpleArrayReference | variable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD )=> nodeStateVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd )=> nodeTimepointValue | literalValue | nodeCommandHandleKywd | nodeFailureKywd | nodeStateKywd | nodeOutcomeKywd );
	public final PlexilParser.quantity_return quantity() throws RecognitionException {
		PlexilParser.quantity_return retval = new PlexilParser.quantity_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN315=null;
		Token RPAREN317=null;
		Token BAR318=null;
		Token BAR320=null;
		Token LPAREN322=null;
		Token RPAREN324=null;
		Token LPAREN326=null;
		Token COMMA328=null;
		Token RPAREN330=null;
		ParserRuleReturnScope expression316 =null;
		ParserRuleReturnScope expression319 =null;
		ParserRuleReturnScope oneArgFn321 =null;
		ParserRuleReturnScope expression323 =null;
		ParserRuleReturnScope twoArgFn325 =null;
		ParserRuleReturnScope expression327 =null;
		ParserRuleReturnScope expression329 =null;
		ParserRuleReturnScope isKnownExp331 =null;
		ParserRuleReturnScope lookupArrayReference332 =null;
		ParserRuleReturnScope lookupExpr333 =null;
		ParserRuleReturnScope messageReceivedExp334 =null;
		ParserRuleReturnScope nodeStatePredicateExp335 =null;
		ParserRuleReturnScope nodeCommandHandleVariable336 =null;
		ParserRuleReturnScope nodeFailureVariable337 =null;
		ParserRuleReturnScope nodeOutcomeVariable338 =null;
		ParserRuleReturnScope nodeStateVariable339 =null;
		ParserRuleReturnScope nodeTimepointValue340 =null;
		ParserRuleReturnScope simpleArrayReference341 =null;
		ParserRuleReturnScope variable342 =null;
		ParserRuleReturnScope nodeCommandHandleVariable343 =null;
		ParserRuleReturnScope nodeFailureVariable344 =null;
		ParserRuleReturnScope nodeOutcomeVariable345 =null;
		ParserRuleReturnScope nodeStateVariable346 =null;
		ParserRuleReturnScope nodeTimepointValue347 =null;
		ParserRuleReturnScope literalValue348 =null;
		ParserRuleReturnScope nodeCommandHandleKywd349 =null;
		ParserRuleReturnScope nodeFailureKywd350 =null;
		ParserRuleReturnScope nodeStateKywd351 =null;
		ParserRuleReturnScope nodeOutcomeKywd352 =null;

		PlexilTreeNode LPAREN315_tree=null;
		PlexilTreeNode RPAREN317_tree=null;
		PlexilTreeNode BAR318_tree=null;
		PlexilTreeNode BAR320_tree=null;
		PlexilTreeNode LPAREN322_tree=null;
		PlexilTreeNode RPAREN324_tree=null;
		PlexilTreeNode LPAREN326_tree=null;
		PlexilTreeNode COMMA328_tree=null;
		PlexilTreeNode RPAREN330_tree=null;
		RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:966:10: ( LPAREN ! expression RPAREN !| BAR expression BAR -> ^( ABS_KYWD expression ) | oneArgFn ^ LPAREN ! expression RPAREN !| twoArgFn ^ LPAREN ! expression COMMA ! expression RPAREN !| isKnownExp | ( lookupExpr LBRACKET )=> lookupArrayReference | lookupExpr | messageReceivedExp | nodeStatePredicateExp | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD )=> nodeStateVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd )=> nodeTimepointValue | ( NCNAME LBRACKET )=> simpleArrayReference | variable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD )=> nodeStateVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd )=> nodeTimepointValue | literalValue | nodeCommandHandleKywd | nodeFailureKywd | nodeStateKywd | nodeOutcomeKywd )
			int alt81=26;
			alt81 = dfa81.predict(input);
			switch (alt81) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:967:5: LPAREN ! expression RPAREN !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					LPAREN315=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_quantity5291); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_quantity5294);
					expression316=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression316.getTree());

					RPAREN317=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_quantity5296); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:968:5: BAR expression BAR
					{
					BAR318=(Token)match(input,BAR,FOLLOW_BAR_in_quantity5303); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BAR.add(BAR318);

					pushFollow(FOLLOW_expression_in_quantity5305);
					expression319=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression319.getTree());
					BAR320=(Token)match(input,BAR,FOLLOW_BAR_in_quantity5307); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BAR.add(BAR320);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 968:24: -> ^( ABS_KYWD expression )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:968:27: ^( ABS_KYWD expression )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ABS_KYWD, "ABS_KYWD"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:969:5: oneArgFn ^ LPAREN ! expression RPAREN !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_oneArgFn_in_quantity5321);
					oneArgFn321=oneArgFn();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(oneArgFn321.getTree(), root_0);
					LPAREN322=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_quantity5324); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_quantity5327);
					expression323=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression323.getTree());

					RPAREN324=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_quantity5329); if (state.failed) return retval;
					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:970:5: twoArgFn ^ LPAREN ! expression COMMA ! expression RPAREN !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_twoArgFn_in_quantity5336);
					twoArgFn325=twoArgFn();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(twoArgFn325.getTree(), root_0);
					LPAREN326=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_quantity5339); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_quantity5342);
					expression327=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression327.getTree());

					COMMA328=(Token)match(input,COMMA,FOLLOW_COMMA_in_quantity5344); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_quantity5347);
					expression329=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression329.getTree());

					RPAREN330=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_quantity5349); if (state.failed) return retval;
					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:971:5: isKnownExp
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_isKnownExp_in_quantity5356);
					isKnownExp331=isKnownExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, isKnownExp331.getTree());

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:972:5: ( lookupExpr LBRACKET )=> lookupArrayReference
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookupArrayReference_in_quantity5370);
					lookupArrayReference332=lookupArrayReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupArrayReference332.getTree());

					}
					break;
				case 7 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:973:5: lookupExpr
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookupExpr_in_quantity5376);
					lookupExpr333=lookupExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupExpr333.getTree());

					}
					break;
				case 8 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:974:5: messageReceivedExp
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_messageReceivedExp_in_quantity5382);
					messageReceivedExp334=messageReceivedExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, messageReceivedExp334.getTree());

					}
					break;
				case 9 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:975:5: nodeStatePredicateExp
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStatePredicateExp_in_quantity5388);
					nodeStatePredicateExp335=nodeStatePredicateExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStatePredicateExp335.getTree());

					}
					break;
				case 10 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:976:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCommandHandleVariable_in_quantity5415);
					nodeCommandHandleVariable336=nodeCommandHandleVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCommandHandleVariable336.getTree());

					}
					break;
				case 11 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:977:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD )=> nodeFailureVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeFailureVariable_in_quantity5442);
					nodeFailureVariable337=nodeFailureVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeFailureVariable337.getTree());

					}
					break;
				case 12 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:978:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeOutcomeVariable_in_quantity5469);
					nodeOutcomeVariable338=nodeOutcomeVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeOutcomeVariable338.getTree());

					}
					break;
				case 13 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:979:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD )=> nodeStateVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStateVariable_in_quantity5496);
					nodeStateVariable339=nodeStateVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStateVariable339.getTree());

					}
					break;
				case 14 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:980:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd )=> nodeTimepointValue
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeTimepointValue_in_quantity5523);
					nodeTimepointValue340=nodeTimepointValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeTimepointValue340.getTree());

					}
					break;
				case 15 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:981:5: ( NCNAME LBRACKET )=> simpleArrayReference
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_simpleArrayReference_in_quantity5537);
					simpleArrayReference341=simpleArrayReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleArrayReference341.getTree());

					}
					break;
				case 16 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:982:5: variable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_variable_in_quantity5543);
					variable342=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable342.getTree());

					}
					break;
				case 17 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:984:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCommandHandleVariable_in_quantity5573);
					nodeCommandHandleVariable343=nodeCommandHandleVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCommandHandleVariable343.getTree());

					}
					break;
				case 18 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:985:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD )=> nodeFailureVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeFailureVariable_in_quantity5602);
					nodeFailureVariable344=nodeFailureVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeFailureVariable344.getTree());

					}
					break;
				case 19 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:986:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeOutcomeVariable_in_quantity5631);
					nodeOutcomeVariable345=nodeOutcomeVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeOutcomeVariable345.getTree());

					}
					break;
				case 20 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:987:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD )=> nodeStateVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStateVariable_in_quantity5660);
					nodeStateVariable346=nodeStateVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStateVariable346.getTree());

					}
					break;
				case 21 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:988:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd )=> nodeTimepointValue
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeTimepointValue_in_quantity5689);
					nodeTimepointValue347=nodeTimepointValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeTimepointValue347.getTree());

					}
					break;
				case 22 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:989:5: literalValue
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_literalValue_in_quantity5695);
					literalValue348=literalValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literalValue348.getTree());

					}
					break;
				case 23 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:990:5: nodeCommandHandleKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCommandHandleKywd_in_quantity5701);
					nodeCommandHandleKywd349=nodeCommandHandleKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCommandHandleKywd349.getTree());

					}
					break;
				case 24 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:991:5: nodeFailureKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeFailureKywd_in_quantity5707);
					nodeFailureKywd350=nodeFailureKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeFailureKywd350.getTree());

					}
					break;
				case 25 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:992:5: nodeStateKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStateKywd_in_quantity5713);
					nodeStateKywd351=nodeStateKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStateKywd351.getTree());

					}
					break;
				case 26 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:993:5: nodeOutcomeKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeOutcomeKywd_in_quantity5719);
					nodeOutcomeKywd352=nodeOutcomeKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeOutcomeKywd352.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantity"


	public static class oneArgFn_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "oneArgFn"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:997:1: oneArgFn : ( SQRT_KYWD | ABS_KYWD | CEIL_KYWD | FLOOR_KYWD | ROUND_KYWD | TRUNC_KYWD | REAL_TO_INT_KYWD | STRLEN_KYWD | ARRAY_SIZE_KYWD | ARRAY_MAX_SIZE_KYWD );
	public final PlexilParser.oneArgFn_return oneArgFn() throws RecognitionException {
		PlexilParser.oneArgFn_return retval = new PlexilParser.oneArgFn_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set353=null;

		PlexilTreeNode set353_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:997:10: ( SQRT_KYWD | ABS_KYWD | CEIL_KYWD | FLOOR_KYWD | ROUND_KYWD | TRUNC_KYWD | REAL_TO_INT_KYWD | STRLEN_KYWD | ARRAY_SIZE_KYWD | ARRAY_MAX_SIZE_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set353=input.LT(1);
			if ( input.LA(1)==ABS_KYWD||input.LA(1)==ARRAY_MAX_SIZE_KYWD||input.LA(1)==ARRAY_SIZE_KYWD||input.LA(1)==CEIL_KYWD||input.LA(1)==FLOOR_KYWD||input.LA(1)==REAL_TO_INT_KYWD||input.LA(1)==ROUND_KYWD||input.LA(1)==SQRT_KYWD||input.LA(1)==STRLEN_KYWD||input.LA(1)==TRUNC_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set353));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgFn"


	public static class twoArgFn_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "twoArgFn"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1010:1: twoArgFn : ( MAX_KYWD | MIN_KYWD );
	public final PlexilParser.twoArgFn_return twoArgFn() throws RecognitionException {
		PlexilParser.twoArgFn_return retval = new PlexilParser.twoArgFn_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set354=null;

		PlexilTreeNode set354_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1010:10: ( MAX_KYWD | MIN_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set354=input.LT(1);
			if ( input.LA(1)==MAX_KYWD||input.LA(1)==MIN_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set354));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "twoArgFn"


	public static class isKnownExp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "isKnownExp"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1014:1: isKnownExp : IS_KNOWN_KYWD ^ LPAREN ! quantity RPAREN !;
	public final PlexilParser.isKnownExp_return isKnownExp() throws RecognitionException {
		PlexilParser.isKnownExp_return retval = new PlexilParser.isKnownExp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token IS_KNOWN_KYWD355=null;
		Token LPAREN356=null;
		Token RPAREN358=null;
		ParserRuleReturnScope quantity357 =null;

		PlexilTreeNode IS_KNOWN_KYWD355_tree=null;
		PlexilTreeNode LPAREN356_tree=null;
		PlexilTreeNode RPAREN358_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1014:12: ( IS_KNOWN_KYWD ^ LPAREN ! quantity RPAREN !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1015:4: IS_KNOWN_KYWD ^ LPAREN ! quantity RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			IS_KNOWN_KYWD355=(Token)match(input,IS_KNOWN_KYWD,FOLLOW_IS_KNOWN_KYWD_in_isKnownExp5820); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IS_KNOWN_KYWD355_tree = new IsKnownNode(IS_KNOWN_KYWD355) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(IS_KNOWN_KYWD355_tree, root_0);
			}

			LPAREN356=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isKnownExp5826); if (state.failed) return retval;
			pushFollow(FOLLOW_quantity_in_isKnownExp5829);
			quantity357=quantity();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity357.getTree());

			RPAREN358=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isKnownExp5831); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "isKnownExp"


	public static class nodeStatePredicate_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeStatePredicate"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1017:1: nodeStatePredicate : ( NODE_EXECUTING_KYWD | NODE_FAILED_KYWD | NODE_FINISHED_KYWD | NODE_INACTIVE_KYWD | NODE_INVARIANT_FAILED_KYWD | NODE_ITERATION_ENDED_KYWD | NODE_ITERATION_FAILED_KYWD | NODE_ITERATION_SUCCEEDED_KYWD | NODE_PARENT_FAILED_KYWD | NODE_POSTCONDITION_FAILED_KYWD | NODE_PRECONDITION_FAILED_KYWD | NODE_SKIPPED_KYWD | NODE_SUCCEEDED_KYWD | NODE_WAITING_KYWD | NO_CHILD_FAILED_KYWD );
	public final PlexilParser.nodeStatePredicate_return nodeStatePredicate() throws RecognitionException {
		PlexilParser.nodeStatePredicate_return retval = new PlexilParser.nodeStatePredicate_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set359=null;

		PlexilTreeNode set359_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1017:20: ( NODE_EXECUTING_KYWD | NODE_FAILED_KYWD | NODE_FINISHED_KYWD | NODE_INACTIVE_KYWD | NODE_INVARIANT_FAILED_KYWD | NODE_ITERATION_ENDED_KYWD | NODE_ITERATION_FAILED_KYWD | NODE_ITERATION_SUCCEEDED_KYWD | NODE_PARENT_FAILED_KYWD | NODE_POSTCONDITION_FAILED_KYWD | NODE_PRECONDITION_FAILED_KYWD | NODE_SKIPPED_KYWD | NODE_SUCCEEDED_KYWD | NODE_WAITING_KYWD | NO_CHILD_FAILED_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set359=input.LT(1);
			if ( (input.LA(1) >= NODE_EXECUTING_KYWD && input.LA(1) <= NODE_FINISHED_KYWD)||(input.LA(1) >= NODE_INACTIVE_KYWD && input.LA(1) <= NODE_SUCCEEDED_KYWD)||input.LA(1)==NODE_WAITING_KYWD||input.LA(1)==NO_CHILD_FAILED_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set359));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeStatePredicate"


	public static class nodeStatePredicateExp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeStatePredicateExp"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1035:1: nodeStatePredicateExp : nodeStatePredicate ^ LPAREN ! nodeReference RPAREN !;
	public final PlexilParser.nodeStatePredicateExp_return nodeStatePredicateExp() throws RecognitionException {
		PlexilParser.nodeStatePredicateExp_return retval = new PlexilParser.nodeStatePredicateExp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN361=null;
		Token RPAREN363=null;
		ParserRuleReturnScope nodeStatePredicate360 =null;
		ParserRuleReturnScope nodeReference362 =null;

		PlexilTreeNode LPAREN361_tree=null;
		PlexilTreeNode RPAREN363_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1035:23: ( nodeStatePredicate ^ LPAREN ! nodeReference RPAREN !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1035:25: nodeStatePredicate ^ LPAREN ! nodeReference RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_nodeStatePredicate_in_nodeStatePredicateExp5939);
			nodeStatePredicate360=nodeStatePredicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(nodeStatePredicate360.getTree(), root_0);
			LPAREN361=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_nodeStatePredicateExp5942); if (state.failed) return retval;
			pushFollow(FOLLOW_nodeReference_in_nodeStatePredicateExp5945);
			nodeReference362=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeReference362.getTree());

			RPAREN363=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_nodeStatePredicateExp5947); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeStatePredicateExp"


	public static class nodeStateKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeStateKywd"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1037:1: nodeStateKywd : ( EXECUTING_STATE_KYWD | FAILING_STATE_KYWD | FINISHED_STATE_KYWD | FINISHING_STATE_KYWD | INACTIVE_STATE_KYWD | ITERATION_ENDED_STATE_KYWD | WAITING_STATE_KYWD );
	public final PlexilParser.nodeStateKywd_return nodeStateKywd() throws RecognitionException {
		PlexilParser.nodeStateKywd_return retval = new PlexilParser.nodeStateKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set364=null;

		PlexilTreeNode set364_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1037:15: ( EXECUTING_STATE_KYWD | FAILING_STATE_KYWD | FINISHED_STATE_KYWD | FINISHING_STATE_KYWD | INACTIVE_STATE_KYWD | ITERATION_ENDED_STATE_KYWD | WAITING_STATE_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set364=input.LT(1);
			if ( input.LA(1)==EXECUTING_STATE_KYWD||input.LA(1)==FAILING_STATE_KYWD||(input.LA(1) >= FINISHED_STATE_KYWD && input.LA(1) <= FINISHING_STATE_KYWD)||input.LA(1)==INACTIVE_STATE_KYWD||input.LA(1)==ITERATION_ENDED_STATE_KYWD||input.LA(1)==WAITING_STATE_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set364));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeStateKywd"


	public static class messageReceivedExp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "messageReceivedExp"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1047:1: messageReceivedExp : MESSAGE_RECEIVED_KYWD ^ LPAREN ! STRING RPAREN !;
	public final PlexilParser.messageReceivedExp_return messageReceivedExp() throws RecognitionException {
		PlexilParser.messageReceivedExp_return retval = new PlexilParser.messageReceivedExp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token MESSAGE_RECEIVED_KYWD365=null;
		Token LPAREN366=null;
		Token STRING367=null;
		Token RPAREN368=null;

		PlexilTreeNode MESSAGE_RECEIVED_KYWD365_tree=null;
		PlexilTreeNode LPAREN366_tree=null;
		PlexilTreeNode STRING367_tree=null;
		PlexilTreeNode RPAREN368_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1047:20: ( MESSAGE_RECEIVED_KYWD ^ LPAREN ! STRING RPAREN !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1048:3: MESSAGE_RECEIVED_KYWD ^ LPAREN ! STRING RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			MESSAGE_RECEIVED_KYWD365=(Token)match(input,MESSAGE_RECEIVED_KYWD,FOLLOW_MESSAGE_RECEIVED_KYWD_in_messageReceivedExp6017); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			MESSAGE_RECEIVED_KYWD365_tree = (PlexilTreeNode)adaptor.create(MESSAGE_RECEIVED_KYWD365);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(MESSAGE_RECEIVED_KYWD365_tree, root_0);
			}

			LPAREN366=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_messageReceivedExp6020); if (state.failed) return retval;
			STRING367=(Token)match(input,STRING,FOLLOW_STRING_in_messageReceivedExp6023); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STRING367_tree = (PlexilTreeNode)adaptor.create(STRING367);
			adaptor.addChild(root_0, STRING367_tree);
			}

			RPAREN368=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_messageReceivedExp6025); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "messageReceivedExp"


	public static class nodeState_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeState"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1051:1: nodeState : ( nodeStateVariable | nodeStateKywd );
	public final PlexilParser.nodeState_return nodeState() throws RecognitionException {
		PlexilParser.nodeState_return retval = new PlexilParser.nodeState_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope nodeStateVariable369 =null;
		ParserRuleReturnScope nodeStateKywd370 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1051:11: ( nodeStateVariable | nodeStateKywd )
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==CHILD_KYWD||LA82_0==NCNAME||LA82_0==PARENT_KYWD||LA82_0==SELF_KYWD||LA82_0==SIBLING_KYWD) ) {
				alt82=1;
			}
			else if ( (LA82_0==EXECUTING_STATE_KYWD||LA82_0==FAILING_STATE_KYWD||(LA82_0 >= FINISHED_STATE_KYWD && LA82_0 <= FINISHING_STATE_KYWD)||LA82_0==INACTIVE_STATE_KYWD||LA82_0==ITERATION_ENDED_STATE_KYWD||LA82_0==WAITING_STATE_KYWD) ) {
				alt82=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1051:13: nodeStateVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStateVariable_in_nodeState6036);
					nodeStateVariable369=nodeStateVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStateVariable369.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1051:33: nodeStateKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStateKywd_in_nodeState6040);
					nodeStateKywd370=nodeStateKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStateKywd370.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeState"


	public static class nodeStateVariable_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeStateVariable"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1053:1: nodeStateVariable : nodeReference PERIOD ! STATE_KYWD ^;
	public final PlexilParser.nodeStateVariable_return nodeStateVariable() throws RecognitionException {
		PlexilParser.nodeStateVariable_return retval = new PlexilParser.nodeStateVariable_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PERIOD372=null;
		Token STATE_KYWD373=null;
		ParserRuleReturnScope nodeReference371 =null;

		PlexilTreeNode PERIOD372_tree=null;
		PlexilTreeNode STATE_KYWD373_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1053:19: ( nodeReference PERIOD ! STATE_KYWD ^)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1053:21: nodeReference PERIOD ! STATE_KYWD ^
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_nodeReference_in_nodeStateVariable6049);
			nodeReference371=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeReference371.getTree());

			PERIOD372=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeStateVariable6051); if (state.failed) return retval;
			STATE_KYWD373=(Token)match(input,STATE_KYWD,FOLLOW_STATE_KYWD_in_nodeStateVariable6054); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STATE_KYWD373_tree = new NodeVariableNode(STATE_KYWD373) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(STATE_KYWD373_tree, root_0);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeStateVariable"


	public static class nodeOutcome_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeOutcome"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1055:1: nodeOutcome : ( nodeOutcomeVariable | nodeOutcomeKywd );
	public final PlexilParser.nodeOutcome_return nodeOutcome() throws RecognitionException {
		PlexilParser.nodeOutcome_return retval = new PlexilParser.nodeOutcome_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope nodeOutcomeVariable374 =null;
		ParserRuleReturnScope nodeOutcomeKywd375 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1055:13: ( nodeOutcomeVariable | nodeOutcomeKywd )
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==CHILD_KYWD||LA83_0==NCNAME||LA83_0==PARENT_KYWD||LA83_0==SELF_KYWD||LA83_0==SIBLING_KYWD) ) {
				alt83=1;
			}
			else if ( (LA83_0==FAILURE_OUTCOME_KYWD||LA83_0==INTERRUPTED_OUTCOME_KYWD||LA83_0==SKIPPED_OUTCOME_KYWD||LA83_0==SUCCESS_OUTCOME_KYWD) ) {
				alt83=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}

			switch (alt83) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1055:15: nodeOutcomeVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeOutcomeVariable_in_nodeOutcome6067);
					nodeOutcomeVariable374=nodeOutcomeVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeOutcomeVariable374.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1055:37: nodeOutcomeKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeOutcomeKywd_in_nodeOutcome6071);
					nodeOutcomeKywd375=nodeOutcomeKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeOutcomeKywd375.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeOutcome"


	public static class nodeOutcomeVariable_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeOutcomeVariable"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1057:1: nodeOutcomeVariable : nodeReference PERIOD ! OUTCOME_KYWD ^;
	public final PlexilParser.nodeOutcomeVariable_return nodeOutcomeVariable() throws RecognitionException {
		PlexilParser.nodeOutcomeVariable_return retval = new PlexilParser.nodeOutcomeVariable_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PERIOD377=null;
		Token OUTCOME_KYWD378=null;
		ParserRuleReturnScope nodeReference376 =null;

		PlexilTreeNode PERIOD377_tree=null;
		PlexilTreeNode OUTCOME_KYWD378_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1057:21: ( nodeReference PERIOD ! OUTCOME_KYWD ^)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1057:23: nodeReference PERIOD ! OUTCOME_KYWD ^
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_nodeReference_in_nodeOutcomeVariable6080);
			nodeReference376=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeReference376.getTree());

			PERIOD377=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeOutcomeVariable6082); if (state.failed) return retval;
			OUTCOME_KYWD378=(Token)match(input,OUTCOME_KYWD,FOLLOW_OUTCOME_KYWD_in_nodeOutcomeVariable6085); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			OUTCOME_KYWD378_tree = new NodeVariableNode(OUTCOME_KYWD378) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(OUTCOME_KYWD378_tree, root_0);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeOutcomeVariable"


	public static class nodeOutcomeKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeOutcomeKywd"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1059:1: nodeOutcomeKywd : ( SUCCESS_OUTCOME_KYWD | FAILURE_OUTCOME_KYWD | SKIPPED_OUTCOME_KYWD | INTERRUPTED_OUTCOME_KYWD );
	public final PlexilParser.nodeOutcomeKywd_return nodeOutcomeKywd() throws RecognitionException {
		PlexilParser.nodeOutcomeKywd_return retval = new PlexilParser.nodeOutcomeKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set379=null;

		PlexilTreeNode set379_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1059:17: ( SUCCESS_OUTCOME_KYWD | FAILURE_OUTCOME_KYWD | SKIPPED_OUTCOME_KYWD | INTERRUPTED_OUTCOME_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set379=input.LT(1);
			if ( input.LA(1)==FAILURE_OUTCOME_KYWD||input.LA(1)==INTERRUPTED_OUTCOME_KYWD||input.LA(1)==SKIPPED_OUTCOME_KYWD||input.LA(1)==SUCCESS_OUTCOME_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set379));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeOutcomeKywd"


	public static class nodeCommandHandle_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeCommandHandle"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1066:1: nodeCommandHandle : ( nodeCommandHandleVariable | nodeCommandHandleKywd );
	public final PlexilParser.nodeCommandHandle_return nodeCommandHandle() throws RecognitionException {
		PlexilParser.nodeCommandHandle_return retval = new PlexilParser.nodeCommandHandle_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope nodeCommandHandleVariable380 =null;
		ParserRuleReturnScope nodeCommandHandleKywd381 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1066:19: ( nodeCommandHandleVariable | nodeCommandHandleKywd )
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==CHILD_KYWD||LA84_0==NCNAME||LA84_0==PARENT_KYWD||LA84_0==SELF_KYWD||LA84_0==SIBLING_KYWD) ) {
				alt84=1;
			}
			else if ( ((LA84_0 >= COMMAND_ACCEPTED_KYWD && LA84_0 <= COMMAND_FAILED_KYWD)||(LA84_0 >= COMMAND_RCVD_KYWD && LA84_0 <= COMMAND_SUCCESS_KYWD)) ) {
				alt84=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}

			switch (alt84) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1066:21: nodeCommandHandleVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCommandHandleVariable_in_nodeCommandHandle6129);
					nodeCommandHandleVariable380=nodeCommandHandleVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCommandHandleVariable380.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1066:49: nodeCommandHandleKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCommandHandleKywd_in_nodeCommandHandle6133);
					nodeCommandHandleKywd381=nodeCommandHandleKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCommandHandleKywd381.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeCommandHandle"


	public static class nodeCommandHandleVariable_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeCommandHandleVariable"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1068:1: nodeCommandHandleVariable : nodeReference PERIOD ! COMMAND_HANDLE_KYWD ^;
	public final PlexilParser.nodeCommandHandleVariable_return nodeCommandHandleVariable() throws RecognitionException {
		PlexilParser.nodeCommandHandleVariable_return retval = new PlexilParser.nodeCommandHandleVariable_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PERIOD383=null;
		Token COMMAND_HANDLE_KYWD384=null;
		ParserRuleReturnScope nodeReference382 =null;

		PlexilTreeNode PERIOD383_tree=null;
		PlexilTreeNode COMMAND_HANDLE_KYWD384_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1068:27: ( nodeReference PERIOD ! COMMAND_HANDLE_KYWD ^)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1068:29: nodeReference PERIOD ! COMMAND_HANDLE_KYWD ^
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_nodeReference_in_nodeCommandHandleVariable6142);
			nodeReference382=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeReference382.getTree());

			PERIOD383=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeCommandHandleVariable6144); if (state.failed) return retval;
			COMMAND_HANDLE_KYWD384=(Token)match(input,COMMAND_HANDLE_KYWD,FOLLOW_COMMAND_HANDLE_KYWD_in_nodeCommandHandleVariable6147); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COMMAND_HANDLE_KYWD384_tree = new NodeVariableNode(COMMAND_HANDLE_KYWD384) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(COMMAND_HANDLE_KYWD384_tree, root_0);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeCommandHandleVariable"


	public static class nodeCommandHandleKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeCommandHandleKywd"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1070:1: nodeCommandHandleKywd : ( COMMAND_ACCEPTED_KYWD | COMMAND_DENIED_KYWD | COMMAND_FAILED_KYWD | COMMAND_RCVD_KYWD | COMMAND_SENT_KYWD | COMMAND_SUCCESS_KYWD );
	public final PlexilParser.nodeCommandHandleKywd_return nodeCommandHandleKywd() throws RecognitionException {
		PlexilParser.nodeCommandHandleKywd_return retval = new PlexilParser.nodeCommandHandleKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set385=null;

		PlexilTreeNode set385_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1070:23: ( COMMAND_ACCEPTED_KYWD | COMMAND_DENIED_KYWD | COMMAND_FAILED_KYWD | COMMAND_RCVD_KYWD | COMMAND_SENT_KYWD | COMMAND_SUCCESS_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set385=input.LT(1);
			if ( (input.LA(1) >= COMMAND_ACCEPTED_KYWD && input.LA(1) <= COMMAND_FAILED_KYWD)||(input.LA(1) >= COMMAND_RCVD_KYWD && input.LA(1) <= COMMAND_SUCCESS_KYWD) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set385));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeCommandHandleKywd"


	public static class nodeFailure_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeFailure"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1079:1: nodeFailure : ( nodeFailureVariable | nodeFailureKywd );
	public final PlexilParser.nodeFailure_return nodeFailure() throws RecognitionException {
		PlexilParser.nodeFailure_return retval = new PlexilParser.nodeFailure_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope nodeFailureVariable386 =null;
		ParserRuleReturnScope nodeFailureKywd387 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1079:13: ( nodeFailureVariable | nodeFailureKywd )
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==CHILD_KYWD||LA85_0==NCNAME||LA85_0==PARENT_KYWD||LA85_0==SELF_KYWD||LA85_0==SIBLING_KYWD) ) {
				alt85=1;
			}
			else if ( (LA85_0==EXITED_KYWD||LA85_0==INVARIANT_CONDITION_FAILED_KYWD||(LA85_0 >= PARENT_EXITED_KYWD && LA85_0 <= PARENT_FAILED_KYWD)||LA85_0==POST_CONDITION_FAILED_KYWD||LA85_0==PRE_CONDITION_FAILED_KYWD) ) {
				alt85=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}

			switch (alt85) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1079:15: nodeFailureVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeFailureVariable_in_nodeFailure6204);
					nodeFailureVariable386=nodeFailureVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeFailureVariable386.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1079:37: nodeFailureKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeFailureKywd_in_nodeFailure6208);
					nodeFailureKywd387=nodeFailureKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeFailureKywd387.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeFailure"


	public static class nodeFailureVariable_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeFailureVariable"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1081:1: nodeFailureVariable : nodeReference PERIOD ! FAILURE_KYWD ^;
	public final PlexilParser.nodeFailureVariable_return nodeFailureVariable() throws RecognitionException {
		PlexilParser.nodeFailureVariable_return retval = new PlexilParser.nodeFailureVariable_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PERIOD389=null;
		Token FAILURE_KYWD390=null;
		ParserRuleReturnScope nodeReference388 =null;

		PlexilTreeNode PERIOD389_tree=null;
		PlexilTreeNode FAILURE_KYWD390_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1081:21: ( nodeReference PERIOD ! FAILURE_KYWD ^)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1081:23: nodeReference PERIOD ! FAILURE_KYWD ^
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_nodeReference_in_nodeFailureVariable6217);
			nodeReference388=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeReference388.getTree());

			PERIOD389=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeFailureVariable6219); if (state.failed) return retval;
			FAILURE_KYWD390=(Token)match(input,FAILURE_KYWD,FOLLOW_FAILURE_KYWD_in_nodeFailureVariable6222); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FAILURE_KYWD390_tree = new NodeVariableNode(FAILURE_KYWD390) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(FAILURE_KYWD390_tree, root_0);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeFailureVariable"


	public static class nodeFailureKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeFailureKywd"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1083:1: nodeFailureKywd : ( PRE_CONDITION_FAILED_KYWD | POST_CONDITION_FAILED_KYWD | INVARIANT_CONDITION_FAILED_KYWD | PARENT_FAILED_KYWD | PARENT_EXITED_KYWD | EXITED_KYWD );
	public final PlexilParser.nodeFailureKywd_return nodeFailureKywd() throws RecognitionException {
		PlexilParser.nodeFailureKywd_return retval = new PlexilParser.nodeFailureKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set391=null;

		PlexilTreeNode set391_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1083:17: ( PRE_CONDITION_FAILED_KYWD | POST_CONDITION_FAILED_KYWD | INVARIANT_CONDITION_FAILED_KYWD | PARENT_FAILED_KYWD | PARENT_EXITED_KYWD | EXITED_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set391=input.LT(1);
			if ( input.LA(1)==EXITED_KYWD||input.LA(1)==INVARIANT_CONDITION_FAILED_KYWD||(input.LA(1) >= PARENT_EXITED_KYWD && input.LA(1) <= PARENT_FAILED_KYWD)||input.LA(1)==POST_CONDITION_FAILED_KYWD||input.LA(1)==PRE_CONDITION_FAILED_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set391));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeFailureKywd"


	public static class nodeTimepointValue_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeTimepointValue"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1092:1: nodeTimepointValue : nodeReference PERIOD nodeStateKywd PERIOD timepoint -> ^( NODE_TIMEPOINT_VALUE nodeReference nodeStateKywd timepoint ) ;
	public final PlexilParser.nodeTimepointValue_return nodeTimepointValue() throws RecognitionException {
		PlexilParser.nodeTimepointValue_return retval = new PlexilParser.nodeTimepointValue_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PERIOD393=null;
		Token PERIOD395=null;
		ParserRuleReturnScope nodeReference392 =null;
		ParserRuleReturnScope nodeStateKywd394 =null;
		ParserRuleReturnScope timepoint396 =null;

		PlexilTreeNode PERIOD393_tree=null;
		PlexilTreeNode PERIOD395_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_nodeStateKywd=new RewriteRuleSubtreeStream(adaptor,"rule nodeStateKywd");
		RewriteRuleSubtreeStream stream_nodeReference=new RewriteRuleSubtreeStream(adaptor,"rule nodeReference");
		RewriteRuleSubtreeStream stream_timepoint=new RewriteRuleSubtreeStream(adaptor,"rule timepoint");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1092:20: ( nodeReference PERIOD nodeStateKywd PERIOD timepoint -> ^( NODE_TIMEPOINT_VALUE nodeReference nodeStateKywd timepoint ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1093:4: nodeReference PERIOD nodeStateKywd PERIOD timepoint
			{
			pushFollow(FOLLOW_nodeReference_in_nodeTimepointValue6282);
			nodeReference392=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nodeReference.add(nodeReference392.getTree());
			PERIOD393=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeTimepointValue6284); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD393);

			pushFollow(FOLLOW_nodeStateKywd_in_nodeTimepointValue6286);
			nodeStateKywd394=nodeStateKywd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nodeStateKywd.add(nodeStateKywd394.getTree());
			PERIOD395=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeTimepointValue6288); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD395);

			pushFollow(FOLLOW_timepoint_in_nodeTimepointValue6290);
			timepoint396=timepoint();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_timepoint.add(timepoint396.getTree());
			// AST REWRITE
			// elements: nodeReference, timepoint, nodeStateKywd
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 1094:4: -> ^( NODE_TIMEPOINT_VALUE nodeReference nodeStateKywd timepoint )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1094:7: ^( NODE_TIMEPOINT_VALUE nodeReference nodeStateKywd timepoint )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NODE_TIMEPOINT_VALUE, "NODE_TIMEPOINT_VALUE"), root_1);
				adaptor.addChild(root_1, stream_nodeReference.nextTree());
				adaptor.addChild(root_1, stream_nodeStateKywd.nextTree());
				adaptor.addChild(root_1, stream_timepoint.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeTimepointValue"


	public static class timepoint_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "timepoint"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1097:1: timepoint : ( START_KYWD | END_KYWD );
	public final PlexilParser.timepoint_return timepoint() throws RecognitionException {
		PlexilParser.timepoint_return retval = new PlexilParser.timepoint_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set397=null;

		PlexilTreeNode set397_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1097:11: ( START_KYWD | END_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set397=input.LT(1);
			if ( input.LA(1)==END_KYWD||input.LA(1)==START_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set397));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timepoint"


	public static class nodeReference_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeReference"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1099:1: nodeReference : ( nodeId | CHILD_KYWD ^ LPAREN ! NCNAME RPAREN !| SIBLING_KYWD ^ LPAREN ! NCNAME RPAREN !);
	public final PlexilParser.nodeReference_return nodeReference() throws RecognitionException {
		PlexilParser.nodeReference_return retval = new PlexilParser.nodeReference_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token CHILD_KYWD399=null;
		Token LPAREN400=null;
		Token NCNAME401=null;
		Token RPAREN402=null;
		Token SIBLING_KYWD403=null;
		Token LPAREN404=null;
		Token NCNAME405=null;
		Token RPAREN406=null;
		ParserRuleReturnScope nodeId398 =null;

		PlexilTreeNode CHILD_KYWD399_tree=null;
		PlexilTreeNode LPAREN400_tree=null;
		PlexilTreeNode NCNAME401_tree=null;
		PlexilTreeNode RPAREN402_tree=null;
		PlexilTreeNode SIBLING_KYWD403_tree=null;
		PlexilTreeNode LPAREN404_tree=null;
		PlexilTreeNode NCNAME405_tree=null;
		PlexilTreeNode RPAREN406_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1099:15: ( nodeId | CHILD_KYWD ^ LPAREN ! NCNAME RPAREN !| SIBLING_KYWD ^ LPAREN ! NCNAME RPAREN !)
			int alt86=3;
			switch ( input.LA(1) ) {
			case NCNAME:
			case PARENT_KYWD:
			case SELF_KYWD:
				{
				alt86=1;
				}
				break;
			case CHILD_KYWD:
				{
				alt86=2;
				}
				break;
			case SIBLING_KYWD:
				{
				alt86=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}
			switch (alt86) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1100:5: nodeId
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeId_in_nodeReference6333);
					nodeId398=nodeId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeId398.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1101:5: CHILD_KYWD ^ LPAREN ! NCNAME RPAREN !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					CHILD_KYWD399=(Token)match(input,CHILD_KYWD,FOLLOW_CHILD_KYWD_in_nodeReference6339); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHILD_KYWD399_tree = (PlexilTreeNode)adaptor.create(CHILD_KYWD399);
					root_0 = (PlexilTreeNode)adaptor.becomeRoot(CHILD_KYWD399_tree, root_0);
					}

					LPAREN400=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_nodeReference6342); if (state.failed) return retval;
					NCNAME401=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_nodeReference6345); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME401_tree = (PlexilTreeNode)adaptor.create(NCNAME401);
					adaptor.addChild(root_0, NCNAME401_tree);
					}

					RPAREN402=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_nodeReference6347); if (state.failed) return retval;
					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1102:5: SIBLING_KYWD ^ LPAREN ! NCNAME RPAREN !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					SIBLING_KYWD403=(Token)match(input,SIBLING_KYWD,FOLLOW_SIBLING_KYWD_in_nodeReference6354); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SIBLING_KYWD403_tree = (PlexilTreeNode)adaptor.create(SIBLING_KYWD403);
					root_0 = (PlexilTreeNode)adaptor.becomeRoot(SIBLING_KYWD403_tree, root_0);
					}

					LPAREN404=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_nodeReference6357); if (state.failed) return retval;
					NCNAME405=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_nodeReference6360); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME405_tree = (PlexilTreeNode)adaptor.create(NCNAME405);
					adaptor.addChild(root_0, NCNAME405_tree);
					}

					RPAREN406=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_nodeReference6362); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeReference"


	public static class nodeId_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeId"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1105:1: nodeId : ( SELF_KYWD | PARENT_KYWD | NCNAME );
	public final PlexilParser.nodeId_return nodeId() throws RecognitionException {
		PlexilParser.nodeId_return retval = new PlexilParser.nodeId_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set407=null;

		PlexilTreeNode set407_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1105:8: ( SELF_KYWD | PARENT_KYWD | NCNAME )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set407=input.LT(1);
			if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set407));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeId"


	public static class lookupExpr_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupExpr"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1115:1: lookupExpr : ( lookupOnChange | lookupNow | lookup );
	public final PlexilParser.lookupExpr_return lookupExpr() throws RecognitionException {
		PlexilParser.lookupExpr_return retval = new PlexilParser.lookupExpr_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope lookupOnChange408 =null;
		ParserRuleReturnScope lookupNow409 =null;
		ParserRuleReturnScope lookup410 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1115:12: ( lookupOnChange | lookupNow | lookup )
			int alt87=3;
			switch ( input.LA(1) ) {
			case LOOKUP_ON_CHANGE_KYWD:
				{
				alt87=1;
				}
				break;
			case LOOKUP_NOW_KYWD:
				{
				alt87=2;
				}
				break;
			case LOOKUP_KYWD:
				{
				alt87=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}
			switch (alt87) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1115:14: lookupOnChange
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookupOnChange_in_lookupExpr6405);
					lookupOnChange408=lookupOnChange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupOnChange408.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1115:31: lookupNow
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookupNow_in_lookupExpr6409);
					lookupNow409=lookupNow();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupNow409.getTree());

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1115:43: lookup
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_lookupExpr6413);
					lookup410=lookup();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookup410.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupExpr"


	public static class lookupOnChange_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupOnChange"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1121:1: lookupOnChange : LOOKUP_ON_CHANGE_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! expression )? RPAREN !;
	public final PlexilParser.lookupOnChange_return lookupOnChange() throws RecognitionException {
		PlexilParser.lookupOnChange_return retval = new PlexilParser.lookupOnChange_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LOOKUP_ON_CHANGE_KYWD411=null;
		Token LPAREN412=null;
		Token COMMA414=null;
		Token RPAREN416=null;
		ParserRuleReturnScope lookupInvocation413 =null;
		ParserRuleReturnScope expression415 =null;

		PlexilTreeNode LOOKUP_ON_CHANGE_KYWD411_tree=null;
		PlexilTreeNode LPAREN412_tree=null;
		PlexilTreeNode COMMA414_tree=null;
		PlexilTreeNode RPAREN416_tree=null;

		 m_paraphrases.push("in \"LookupOnChange\" expression"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1124:2: ( LOOKUP_ON_CHANGE_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! expression )? RPAREN !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1125:8: LOOKUP_ON_CHANGE_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! expression )? RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			LOOKUP_ON_CHANGE_KYWD411=(Token)match(input,LOOKUP_ON_CHANGE_KYWD,FOLLOW_LOOKUP_ON_CHANGE_KYWD_in_lookupOnChange6444); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LOOKUP_ON_CHANGE_KYWD411_tree = (PlexilTreeNode)adaptor.create(LOOKUP_ON_CHANGE_KYWD411);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(LOOKUP_ON_CHANGE_KYWD411_tree, root_0);
			}

			LPAREN412=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lookupOnChange6447); if (state.failed) return retval;
			pushFollow(FOLLOW_lookupInvocation_in_lookupOnChange6450);
			lookupInvocation413=lookupInvocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupInvocation413.getTree());

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1125:56: ( COMMA ! expression )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==COMMA) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1125:57: COMMA ! expression
					{
					COMMA414=(Token)match(input,COMMA,FOLLOW_COMMA_in_lookupOnChange6453); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_lookupOnChange6456);
					expression415=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression415.getTree());

					}
					break;

			}

			RPAREN416=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lookupOnChange6460); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupOnChange"


	public static class lookupNow_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupNow"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1131:1: lookupNow : LOOKUP_NOW_KYWD ^ LPAREN ! lookupInvocation RPAREN !;
	public final PlexilParser.lookupNow_return lookupNow() throws RecognitionException {
		PlexilParser.lookupNow_return retval = new PlexilParser.lookupNow_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LOOKUP_NOW_KYWD417=null;
		Token LPAREN418=null;
		Token RPAREN420=null;
		ParserRuleReturnScope lookupInvocation419 =null;

		PlexilTreeNode LOOKUP_NOW_KYWD417_tree=null;
		PlexilTreeNode LPAREN418_tree=null;
		PlexilTreeNode RPAREN420_tree=null;

		 m_paraphrases.push("in \"LookupNow\" expression"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1134:2: ( LOOKUP_NOW_KYWD ^ LPAREN ! lookupInvocation RPAREN !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1135:5: LOOKUP_NOW_KYWD ^ LPAREN ! lookupInvocation RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			LOOKUP_NOW_KYWD417=(Token)match(input,LOOKUP_NOW_KYWD,FOLLOW_LOOKUP_NOW_KYWD_in_lookupNow6488); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LOOKUP_NOW_KYWD417_tree = (PlexilTreeNode)adaptor.create(LOOKUP_NOW_KYWD417);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(LOOKUP_NOW_KYWD417_tree, root_0);
			}

			LPAREN418=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lookupNow6491); if (state.failed) return retval;
			pushFollow(FOLLOW_lookupInvocation_in_lookupNow6494);
			lookupInvocation419=lookupInvocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupInvocation419.getTree());

			RPAREN420=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lookupNow6496); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupNow"


	public static class lookup_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookup"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1142:1: lookup : LOOKUP_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! expression )? RPAREN !;
	public final PlexilParser.lookup_return lookup() throws RecognitionException {
		PlexilParser.lookup_return retval = new PlexilParser.lookup_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LOOKUP_KYWD421=null;
		Token LPAREN422=null;
		Token COMMA424=null;
		Token RPAREN426=null;
		ParserRuleReturnScope lookupInvocation423 =null;
		ParserRuleReturnScope expression425 =null;

		PlexilTreeNode LOOKUP_KYWD421_tree=null;
		PlexilTreeNode LPAREN422_tree=null;
		PlexilTreeNode COMMA424_tree=null;
		PlexilTreeNode RPAREN426_tree=null;

		 m_paraphrases.push("in \"Lookup\" expression"); 
		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1145:2: ( LOOKUP_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! expression )? RPAREN !)
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1146:5: LOOKUP_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! expression )? RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			LOOKUP_KYWD421=(Token)match(input,LOOKUP_KYWD,FOLLOW_LOOKUP_KYWD_in_lookup6526); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LOOKUP_KYWD421_tree = (PlexilTreeNode)adaptor.create(LOOKUP_KYWD421);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(LOOKUP_KYWD421_tree, root_0);
			}

			LPAREN422=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lookup6529); if (state.failed) return retval;
			pushFollow(FOLLOW_lookupInvocation_in_lookup6532);
			lookupInvocation423=lookupInvocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupInvocation423.getTree());

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1146:43: ( COMMA ! expression )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==COMMA) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1146:44: COMMA ! expression
					{
					COMMA424=(Token)match(input,COMMA,FOLLOW_COMMA_in_lookup6535); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_lookup6538);
					expression425=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression425.getTree());

					}
					break;

			}

			RPAREN426=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lookup6542); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookup"


	public static class lookupInvocation_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupInvocation"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1149:1: lookupInvocation : ( stateName | ( LPAREN ! stateNameExp RPAREN !) ) ( LPAREN ! ( argumentList )? RPAREN !)? ;
	public final PlexilParser.lookupInvocation_return lookupInvocation() throws RecognitionException {
		PlexilParser.lookupInvocation_return retval = new PlexilParser.lookupInvocation_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN428=null;
		Token RPAREN430=null;
		Token LPAREN431=null;
		Token RPAREN433=null;
		ParserRuleReturnScope stateName427 =null;
		ParserRuleReturnScope stateNameExp429 =null;
		ParserRuleReturnScope argumentList432 =null;

		PlexilTreeNode LPAREN428_tree=null;
		PlexilTreeNode RPAREN430_tree=null;
		PlexilTreeNode LPAREN431_tree=null;
		PlexilTreeNode RPAREN433_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1149:18: ( ( stateName | ( LPAREN ! stateNameExp RPAREN !) ) ( LPAREN ! ( argumentList )? RPAREN !)? )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1150:3: ( stateName | ( LPAREN ! stateNameExp RPAREN !) ) ( LPAREN ! ( argumentList )? RPAREN !)?
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1150:3: ( stateName | ( LPAREN ! stateNameExp RPAREN !) )
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==NCNAME) ) {
				alt90=1;
			}
			else if ( (LA90_0==LPAREN) ) {
				alt90=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}

			switch (alt90) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1150:5: stateName
					{
					pushFollow(FOLLOW_stateName_in_lookupInvocation6558);
					stateName427=stateName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, stateName427.getTree());

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1152:5: ( LPAREN ! stateNameExp RPAREN !)
					{
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1152:5: ( LPAREN ! stateNameExp RPAREN !)
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1152:7: LPAREN ! stateNameExp RPAREN !
					{
					LPAREN428=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lookupInvocation6572); if (state.failed) return retval;
					pushFollow(FOLLOW_stateNameExp_in_lookupInvocation6575);
					stateNameExp429=stateNameExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, stateNameExp429.getTree());

					RPAREN430=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lookupInvocation6577); if (state.failed) return retval;
					}

					}
					break;

			}

			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1154:3: ( LPAREN ! ( argumentList )? RPAREN !)?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==LPAREN) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1154:5: LPAREN ! ( argumentList )? RPAREN !
					{
					LPAREN431=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lookupInvocation6590); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1154:13: ( argumentList )?
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==ABS_KYWD||LA91_0==ARRAY_MAX_SIZE_KYWD||LA91_0==ARRAY_SIZE_KYWD||LA91_0==BAR||LA91_0==CEIL_KYWD||LA91_0==CHILD_KYWD||(LA91_0 >= COMMAND_ACCEPTED_KYWD && LA91_0 <= COMMAND_FAILED_KYWD)||(LA91_0 >= COMMAND_RCVD_KYWD && LA91_0 <= COMMAND_SUCCESS_KYWD)||LA91_0==DATE_KYWD||LA91_0==DOUBLE||LA91_0==DURATION_KYWD||(LA91_0 >= EXECUTING_STATE_KYWD && LA91_0 <= EXITED_KYWD)||LA91_0==FAILING_STATE_KYWD||(LA91_0 >= FAILURE_OUTCOME_KYWD && LA91_0 <= FLOOR_KYWD)||LA91_0==HASHPAREN||(LA91_0 >= INACTIVE_STATE_KYWD && LA91_0 <= INT)||LA91_0==INTERRUPTED_OUTCOME_KYWD||LA91_0==INVARIANT_CONDITION_FAILED_KYWD||(LA91_0 >= IS_KNOWN_KYWD && LA91_0 <= ITERATION_ENDED_STATE_KYWD)||(LA91_0 >= LOOKUP_KYWD && LA91_0 <= LOOKUP_ON_CHANGE_KYWD)||LA91_0==LPAREN||(LA91_0 >= MAX_KYWD && LA91_0 <= MIN_KYWD)||LA91_0==NCNAME||(LA91_0 >= NODE_EXECUTING_KYWD && LA91_0 <= NODE_FINISHED_KYWD)||(LA91_0 >= NODE_INACTIVE_KYWD && LA91_0 <= NODE_SUCCEEDED_KYWD)||(LA91_0 >= NODE_WAITING_KYWD && LA91_0 <= NO_CHILD_FAILED_KYWD)||(LA91_0 >= PARENT_EXITED_KYWD && LA91_0 <= PARENT_KYWD)||LA91_0==POST_CONDITION_FAILED_KYWD||LA91_0==PRE_CONDITION_FAILED_KYWD||LA91_0==REAL_TO_INT_KYWD||LA91_0==ROUND_KYWD||LA91_0==SELF_KYWD||(LA91_0 >= SIBLING_KYWD && LA91_0 <= SKIPPED_OUTCOME_KYWD)||LA91_0==SQRT_KYWD||LA91_0==STRING||(LA91_0 >= STRLEN_KYWD && LA91_0 <= SUCCESS_OUTCOME_KYWD)||(LA91_0 >= TRUE_KYWD && LA91_0 <= TRUNC_KYWD)||LA91_0==WAITING_STATE_KYWD) ) {
						alt91=1;
					}
					switch (alt91) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1154:14: argumentList
							{
							pushFollow(FOLLOW_argumentList_in_lookupInvocation6594);
							argumentList432=argumentList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentList432.getTree());

							}
							break;

					}

					RPAREN433=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lookupInvocation6598); if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupInvocation"


	public static class stateName_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "stateName"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1157:1: stateName : NCNAME -> ^( STATE_NAME NCNAME ) ;
	public final PlexilParser.stateName_return stateName() throws RecognitionException {
		PlexilParser.stateName_return retval = new PlexilParser.stateName_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME434=null;

		PlexilTreeNode NCNAME434_tree=null;
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1157:11: ( NCNAME -> ^( STATE_NAME NCNAME ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1158:5: NCNAME
			{
			NCNAME434=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_stateName6616); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME434);

			// AST REWRITE
			// elements: NCNAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 1158:12: -> ^( STATE_NAME NCNAME )
			{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1158:15: ^( STATE_NAME NCNAME )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(STATE_NAME, "STATE_NAME"), root_1);
				adaptor.addChild(root_1, stream_NCNAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stateName"


	public static class stateNameExp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "stateNameExp"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1161:1: stateNameExp : expression ;
	public final PlexilParser.stateNameExp_return stateNameExp() throws RecognitionException {
		PlexilParser.stateNameExp_return retval = new PlexilParser.stateNameExp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope expression435 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1161:14: ( expression )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:1161:16: expression
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_expression_in_stateNameExp6634);
			expression435=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression435.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stateNameExp"

	// $ANTLR start synpred1_Plexil
	public final void synpred1_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:374:5: ( baseTypeName LBRACKET )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:374:6: baseTypeName LBRACKET
		{
		pushFollow(FOLLOW_baseTypeName_in_synpred1_Plexil1678);
		baseTypeName();
		state._fsp--;
		if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred1_Plexil1680); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Plexil

	// $ANTLR start synpred2_Plexil
	public final void synpred2_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:376:5: ( baseTypeName NCNAME LBRACKET )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:376:6: baseTypeName NCNAME LBRACKET
		{
		pushFollow(FOLLOW_baseTypeName_in_synpred2_Plexil1714);
		baseTypeName();
		state._fsp--;
		if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred2_Plexil1716); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred2_Plexil1718); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_Plexil

	// $ANTLR start synpred3_Plexil
	public final void synpred3_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:396:5: ( baseTypeName LBRACKET )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:396:6: baseTypeName LBRACKET
		{
		pushFollow(FOLLOW_baseTypeName_in_synpred3_Plexil1861);
		baseTypeName();
		state._fsp--;
		if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred3_Plexil1863); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_Plexil

	// $ANTLR start synpred4_Plexil
	public final void synpred4_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:428:4: ( NCNAME LBRACKET )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:428:5: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred4_Plexil2060); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred4_Plexil2062); if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_Plexil

	// $ANTLR start synpred5_Plexil
	public final void synpred5_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:459:5: ( NCNAME ( LBRACKET | EQUALS ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:459:6: NCNAME ( LBRACKET | EQUALS )
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred5_Plexil2236); if (state.failed) return;

		if ( input.LA(1)==EQUALS||input.LA(1)==LBRACKET ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred5_Plexil

	// $ANTLR start synpred6_Plexil
	public final void synpred6_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:460:5: ( ( NCNAME LPAREN ) | LPAREN )
		int alt93=2;
		int LA93_0 = input.LA(1);
		if ( (LA93_0==NCNAME) ) {
			alt93=1;
		}
		else if ( (LA93_0==LPAREN) ) {
			alt93=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 93, 0, input);
			throw nvae;
		}

		switch (alt93) {
			case 1 :
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:460:6: ( NCNAME LPAREN )
				{
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:460:6: ( NCNAME LPAREN )
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:460:7: NCNAME LPAREN
				{
				match(input,NCNAME,FOLLOW_NCNAME_in_synpred6_Plexil2257); if (state.failed) return;

				match(input,LPAREN,FOLLOW_LPAREN_in_synpred6_Plexil2259); if (state.failed) return;

				}

				}
				break;
			case 2 :
				// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:460:24: LPAREN
				{
				match(input,LPAREN,FOLLOW_LPAREN_in_synpred6_Plexil2264); if (state.failed) return;

				}
				break;

		}
	}
	// $ANTLR end synpred6_Plexil

	// $ANTLR start synpred7_Plexil
	public final void synpred7_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:660:7: ( NCNAME LBRACKET )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:660:8: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred7_Plexil3462); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred7_Plexil3464); if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_Plexil

	// $ANTLR start synpred8_Plexil
	public final void synpred8_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:664:9: ( NCNAME LBRACKET )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:664:10: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred8_Plexil3503); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred8_Plexil3505); if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_Plexil

	// $ANTLR start synpred9_Plexil
	public final void synpred9_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:677:7: ( NCNAME LBRACKET )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:677:8: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred9_Plexil3585); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred9_Plexil3587); if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_Plexil

	// $ANTLR start synpred10_Plexil
	public final void synpred10_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:681:6: ( NCNAME LBRACKET )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:681:7: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred10_Plexil3626); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred10_Plexil3628); if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_Plexil

	// $ANTLR start synpred11_Plexil
	public final void synpred11_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:762:5: ( NCNAME LBRACKET )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:762:7: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred11_Plexil4190); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred11_Plexil4192); if (state.failed) return;

		}

	}
	// $ANTLR end synpred11_Plexil

	// $ANTLR start synpred12_Plexil
	public final void synpred12_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:770:4: ( NCNAME LPAREN )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:770:5: NCNAME LPAREN
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred12_Plexil4227); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred12_Plexil4229); if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_Plexil

	// $ANTLR start synpred13_Plexil
	public final void synpred13_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:772:4: ( LPAREN expression RPAREN LPAREN )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:772:5: LPAREN expression RPAREN LPAREN
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred13_Plexil4243); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred13_Plexil4245);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred13_Plexil4247); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred13_Plexil4249); if (state.failed) return;

		}

	}
	// $ANTLR end synpred13_Plexil

	// $ANTLR start synpred14_Plexil
	public final void synpred14_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:972:5: ( lookupExpr LBRACKET )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:972:6: lookupExpr LBRACKET
		{
		pushFollow(FOLLOW_lookupExpr_in_synpred14_Plexil5363);
		lookupExpr();
		state._fsp--;
		if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred14_Plexil5365); if (state.failed) return;

		}

	}
	// $ANTLR end synpred14_Plexil

	// $ANTLR start synpred15_Plexil
	public final void synpred15_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:976:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:976:7: ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD
		{
		if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred15_Plexil5408); if (state.failed) return;

		match(input,COMMAND_HANDLE_KYWD,FOLLOW_COMMAND_HANDLE_KYWD_in_synpred15_Plexil5410); if (state.failed) return;

		}

	}
	// $ANTLR end synpred15_Plexil

	// $ANTLR start synpred16_Plexil
	public final void synpred16_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:977:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:977:7: ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD
		{
		if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred16_Plexil5435); if (state.failed) return;

		match(input,FAILURE_KYWD,FOLLOW_FAILURE_KYWD_in_synpred16_Plexil5437); if (state.failed) return;

		}

	}
	// $ANTLR end synpred16_Plexil

	// $ANTLR start synpred17_Plexil
	public final void synpred17_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:978:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:978:7: ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD
		{
		if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred17_Plexil5462); if (state.failed) return;

		match(input,OUTCOME_KYWD,FOLLOW_OUTCOME_KYWD_in_synpred17_Plexil5464); if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_Plexil

	// $ANTLR start synpred18_Plexil
	public final void synpred18_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:979:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:979:7: ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD
		{
		if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred18_Plexil5489); if (state.failed) return;

		match(input,STATE_KYWD,FOLLOW_STATE_KYWD_in_synpred18_Plexil5491); if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_Plexil

	// $ANTLR start synpred19_Plexil
	public final void synpred19_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:980:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:980:7: ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd
		{
		if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred19_Plexil5516); if (state.failed) return;

		pushFollow(FOLLOW_nodeStateKywd_in_synpred19_Plexil5518);
		nodeStateKywd();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_Plexil

	// $ANTLR start synpred20_Plexil
	public final void synpred20_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:981:5: ( NCNAME LBRACKET )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:981:6: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred20_Plexil5530); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred20_Plexil5532); if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_Plexil

	// $ANTLR start synpred21_Plexil
	public final void synpred21_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:984:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:984:7: ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD
		{
		if ( input.LA(1)==CHILD_KYWD||input.LA(1)==SIBLING_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred21_Plexil5560); if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred21_Plexil5562); if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred21_Plexil5564); if (state.failed) return;

		match(input,PERIOD,FOLLOW_PERIOD_in_synpred21_Plexil5566); if (state.failed) return;

		match(input,COMMAND_HANDLE_KYWD,FOLLOW_COMMAND_HANDLE_KYWD_in_synpred21_Plexil5568); if (state.failed) return;

		}

	}
	// $ANTLR end synpred21_Plexil

	// $ANTLR start synpred22_Plexil
	public final void synpred22_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:985:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:985:7: ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD
		{
		if ( input.LA(1)==CHILD_KYWD||input.LA(1)==SIBLING_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred22_Plexil5589); if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred22_Plexil5591); if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred22_Plexil5593); if (state.failed) return;

		match(input,PERIOD,FOLLOW_PERIOD_in_synpred22_Plexil5595); if (state.failed) return;

		match(input,FAILURE_KYWD,FOLLOW_FAILURE_KYWD_in_synpred22_Plexil5597); if (state.failed) return;

		}

	}
	// $ANTLR end synpred22_Plexil

	// $ANTLR start synpred23_Plexil
	public final void synpred23_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:986:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:986:7: ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD
		{
		if ( input.LA(1)==CHILD_KYWD||input.LA(1)==SIBLING_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred23_Plexil5618); if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred23_Plexil5620); if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred23_Plexil5622); if (state.failed) return;

		match(input,PERIOD,FOLLOW_PERIOD_in_synpred23_Plexil5624); if (state.failed) return;

		match(input,OUTCOME_KYWD,FOLLOW_OUTCOME_KYWD_in_synpred23_Plexil5626); if (state.failed) return;

		}

	}
	// $ANTLR end synpred23_Plexil

	// $ANTLR start synpred24_Plexil
	public final void synpred24_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:987:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:987:7: ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD
		{
		if ( input.LA(1)==CHILD_KYWD||input.LA(1)==SIBLING_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred24_Plexil5647); if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred24_Plexil5649); if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred24_Plexil5651); if (state.failed) return;

		match(input,PERIOD,FOLLOW_PERIOD_in_synpred24_Plexil5653); if (state.failed) return;

		match(input,STATE_KYWD,FOLLOW_STATE_KYWD_in_synpred24_Plexil5655); if (state.failed) return;

		}

	}
	// $ANTLR end synpred24_Plexil

	// $ANTLR start synpred25_Plexil
	public final void synpred25_Plexil_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:988:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/Plexil.g:988:7: ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd
		{
		if ( input.LA(1)==CHILD_KYWD||input.LA(1)==SIBLING_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred25_Plexil5676); if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred25_Plexil5678); if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred25_Plexil5680); if (state.failed) return;

		match(input,PERIOD,FOLLOW_PERIOD_in_synpred25_Plexil5682); if (state.failed) return;

		pushFollow(FOLLOW_nodeStateKywd_in_synpred25_Plexil5684);
		nodeStateKywd();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred25_Plexil

	// Delegated rules

	public final boolean synpred10_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred22_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred22_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred14_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred25_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA64 dfa64 = new DFA64(this);
	protected DFA81 dfa81 = new DFA81(this);
	static final String DFA64_eotS =
		"\104\uffff";
	static final String DFA64_eofS =
		"\104\uffff";
	static final String DFA64_minS =
		"\1\4\1\10\1\4\31\uffff\1\0\12\uffff\33\0\2\uffff";
	static final String DFA64_maxS =
		"\1\u00bb\1\u00bf\1\u00bb\31\uffff\1\0\12\uffff\33\0\2\uffff";
	static final String DFA64_acceptS =
		"\3\uffff\1\3\76\uffff\1\1\1\2";
	static final String DFA64_specialS =
		"\34\uffff\1\0\12\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
		"\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
		"\1\32\1\33\2\uffff}>";
	static final String[] DFA64_transitionS = {
			"\1\3\7\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff"+
			"\3\3\2\uffff\3\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\11\uffff\2\3\3\uffff"+
			"\1\3\1\uffff\5\3\4\uffff\1\3\3\uffff\2\3\1\uffff\1\3\1\uffff\1\3\3\uffff"+
			"\2\3\6\uffff\3\3\1\uffff\1\2\1\uffff\4\3\3\uffff\1\1\3\uffff\3\3\1\uffff"+
			"\12\3\1\uffff\3\3\7\uffff\3\3\4\uffff\1\3\1\uffff\1\3\5\uffff\1\3\5\uffff"+
			"\1\3\1\uffff\1\3\3\uffff\2\3\3\uffff\1\3\4\uffff\1\3\2\uffff\2\3\2\uffff"+
			"\2\3\10\uffff\1\3",
			"\1\3\11\uffff\1\3\26\uffff\1\3\31\uffff\1\3\1\uffff\1\3\20\uffff\3\3"+
			"\6\uffff\1\34\3\uffff\1\3\2\uffff\1\3\4\uffff\1\3\24\uffff\1\3\7\uffff"+
			"\2\3\1\uffff\1\3\21\uffff\1\3\5\uffff\1\3\33\uffff\1\3",
			"\1\53\7\uffff\1\53\1\uffff\1\53\4\uffff\1\52\2\uffff\1\53\1\uffff\1"+
			"\64\3\uffff\3\76\2\uffff\3\76\3\uffff\1\73\2\uffff\1\71\1\uffff\1\74"+
			"\11\uffff\1\100\1\77\3\uffff\1\100\1\uffff\1\101\1\67\2\100\1\53\4\uffff"+
			"\1\75\3\uffff\1\100\1\70\1\uffff\1\101\1\uffff\1\77\3\uffff\1\55\1\100"+
			"\6\uffff\1\56\1\60\1\57\1\uffff\1\51\1\uffff\1\54\1\61\1\47\1\54\3\uffff"+
			"\1\63\3\uffff\3\62\1\uffff\12\62\1\uffff\1\62\1\50\1\62\7\uffff\2\77"+
			"\1\66\4\uffff\1\77\1\uffff\1\77\5\uffff\1\53\5\uffff\1\53\1\uffff\1\66"+
			"\3\uffff\1\65\1\101\3\uffff\1\53\4\uffff\1\72\2\uffff\1\53\1\101\2\uffff"+
			"\1\67\1\53\10\uffff\1\100",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			""
	};

	static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
	static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
	static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
	static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
	static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
	static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
	static final short[][] DFA64_transition;

	static {
		int numStates = DFA64_transitionS.length;
		DFA64_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
		}
	}

	protected class DFA64 extends DFA {

		public DFA64(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 64;
			this.eot = DFA64_eot;
			this.eof = DFA64_eof;
			this.min = DFA64_min;
			this.max = DFA64_max;
			this.accept = DFA64_accept;
			this.special = DFA64_special;
			this.transition = DFA64_transition;
		}
		@Override
		public String getDescription() {
			return "769:1: assignmentRHS : ( ( NCNAME LPAREN )=> commandInvocation | ( LPAREN expression RPAREN LPAREN )=> commandInvocation | expression );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA64_28 = input.LA(1);
						 
						int index64_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						 
						input.seek(index64_28);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA64_39 = input.LA(1);
						 
						int index64_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_39);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA64_40 = input.LA(1);
						 
						int index64_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_40);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA64_41 = input.LA(1);
						 
						int index64_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_41);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA64_42 = input.LA(1);
						 
						int index64_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_42);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA64_43 = input.LA(1);
						 
						int index64_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_43);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA64_44 = input.LA(1);
						 
						int index64_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_44);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA64_45 = input.LA(1);
						 
						int index64_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_45);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA64_46 = input.LA(1);
						 
						int index64_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_46);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA64_47 = input.LA(1);
						 
						int index64_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_47);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA64_48 = input.LA(1);
						 
						int index64_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_48);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA64_49 = input.LA(1);
						 
						int index64_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_49);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA64_50 = input.LA(1);
						 
						int index64_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_50);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA64_51 = input.LA(1);
						 
						int index64_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_51);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA64_52 = input.LA(1);
						 
						int index64_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_52);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA64_53 = input.LA(1);
						 
						int index64_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_53);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA64_54 = input.LA(1);
						 
						int index64_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_54);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA64_55 = input.LA(1);
						 
						int index64_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_55);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA64_56 = input.LA(1);
						 
						int index64_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_56);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA64_57 = input.LA(1);
						 
						int index64_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_57);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA64_58 = input.LA(1);
						 
						int index64_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_58);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA64_59 = input.LA(1);
						 
						int index64_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_59);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA64_60 = input.LA(1);
						 
						int index64_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_60);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA64_61 = input.LA(1);
						 
						int index64_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_61);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA64_62 = input.LA(1);
						 
						int index64_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_62);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA64_63 = input.LA(1);
						 
						int index64_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_63);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA64_64 = input.LA(1);
						 
						int index64_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_64);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA64_65 = input.LA(1);
						 
						int index64_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index64_65);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 64, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA81_eotS =
		"\116\uffff";
	static final String DFA81_eofS =
		"\116\uffff";
	static final String DFA81_minS =
		"\1\4\5\uffff\1\137\4\uffff\1\10\2\137\1\u0089\14\uffff\2\0\43\uffff\3"+
		"\0\13\uffff";
	static final String DFA81_maxS =
		"\1\u00bb\5\uffff\1\137\4\uffff\1\u00bf\2\137\1\u0089\14\uffff\2\0\43\uffff"+
		"\3\0\13\uffff";
	static final String DFA81_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\uffff\1\10\1\11\4\uffff\1\26"+
		"\7\uffff\1\27\1\30\1\31\1\32\2\uffff\1\17\1\20\44\uffff\1\6\1\12\1\13"+
		"\1\14\1\15\1\16\1\21\1\22\1\23\1\24\1\25";
	static final String DFA81_specialS =
		"\13\uffff\1\0\17\uffff\1\1\1\2\43\uffff\1\3\1\4\1\5\13\uffff}>";
	static final String[] DFA81_transitionS = {
			"\1\3\7\uffff\1\3\1\uffff\1\3\4\uffff\1\2\2\uffff\1\3\1\uffff\1\14\3\uffff"+
			"\3\27\2\uffff\3\27\3\uffff\1\17\2\uffff\1\17\1\uffff\1\17\11\uffff\1"+
			"\31\1\30\3\uffff\1\31\1\uffff\1\32\1\17\2\31\1\3\4\uffff\1\17\3\uffff"+
			"\1\31\1\17\1\uffff\1\32\1\uffff\1\30\3\uffff\1\5\1\31\6\uffff\1\6\2\7"+
			"\1\uffff\1\1\1\uffff\1\4\1\11\1\17\1\4\3\uffff\1\13\3\uffff\3\12\1\uffff"+
			"\12\12\1\uffff\1\12\1\uffff\1\12\7\uffff\2\30\1\16\4\uffff\1\30\1\uffff"+
			"\1\30\5\uffff\1\3\5\uffff\1\3\1\uffff\1\16\3\uffff\1\15\1\32\3\uffff"+
			"\1\3\4\uffff\1\17\2\uffff\1\3\1\32\2\uffff\1\17\1\3\10\uffff\1\31",
			"",
			"",
			"",
			"",
			"",
			"\1\33",
			"",
			"",
			"",
			"",
			"\1\36\11\uffff\2\36\3\uffff\1\36\2\uffff\1\36\13\uffff\2\36\1\uffff"+
			"\4\36\21\uffff\1\36\3\uffff\2\36\1\uffff\1\36\3\uffff\1\36\1\uffff\1"+
			"\36\11\uffff\1\36\1\35\2\36\1\uffff\1\36\4\uffff\1\36\3\uffff\1\36\2"+
			"\uffff\1\36\1\uffff\1\36\2\uffff\1\36\22\uffff\3\36\7\uffff\1\36\1\34"+
			"\1\uffff\1\36\6\uffff\1\36\4\uffff\1\36\3\uffff\1\36\1\uffff\1\36\1\uffff"+
			"\1\36\3\uffff\1\36\6\uffff\1\36\4\uffff\1\36\1\uffff\1\36\1\uffff\3\36"+
			"\6\uffff\2\36\1\uffff\1\36",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
	static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
	static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
	static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
	static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
	static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
	static final short[][] DFA81_transition;

	static {
		int numStates = DFA81_transitionS.length;
		DFA81_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
		}
	}

	protected class DFA81 extends DFA {

		public DFA81(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 81;
			this.eot = DFA81_eot;
			this.eof = DFA81_eof;
			this.min = DFA81_min;
			this.max = DFA81_max;
			this.accept = DFA81_accept;
			this.special = DFA81_special;
			this.transition = DFA81_transition;
		}
		@Override
		public String getDescription() {
			return "966:1: quantity : ( LPAREN ! expression RPAREN !| BAR expression BAR -> ^( ABS_KYWD expression ) | oneArgFn ^ LPAREN ! expression RPAREN !| twoArgFn ^ LPAREN ! expression COMMA ! expression RPAREN !| isKnownExp | ( lookupExpr LBRACKET )=> lookupArrayReference | lookupExpr | messageReceivedExp | nodeStatePredicateExp | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD )=> nodeStateVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd )=> nodeTimepointValue | ( NCNAME LBRACKET )=> simpleArrayReference | variable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD )=> nodeStateVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd )=> nodeTimepointValue | literalValue | nodeCommandHandleKywd | nodeFailureKywd | nodeStateKywd | nodeOutcomeKywd );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA81_11 = input.LA(1);
						 
						int index81_11 = input.index();
						input.rewind();
						s = -1;
						if ( (LA81_11==PERIOD) ) {s = 28;}
						else if ( (LA81_11==LBRACKET) && (synpred20_Plexil())) {s = 29;}
						else if ( (LA81_11==AND_KYWD||(LA81_11 >= ASTERISK && LA81_11 <= BAR)||LA81_11==CHECKED_SEQUENCE_KYWD||LA81_11==COMMA||(LA81_11 >= CONCURRENCE_KYWD && LA81_11 <= DATE_KYWD)||(LA81_11 >= DEQUALS && LA81_11 <= DURATION_KYWD)||LA81_11==FALSE_KYWD||(LA81_11 >= FOR_KYWD && LA81_11 <= GEQ)||LA81_11==GREATER||LA81_11==IF_KYWD||LA81_11==INT||LA81_11==LBRACE||(LA81_11 >= LEQ && LA81_11 <= LESS)||LA81_11==LIBRARY_CALL_KYWD||LA81_11==LPAREN||LA81_11==MINUS||LA81_11==MOD_KYWD||LA81_11==NCNAME||LA81_11==NEQUALS||(LA81_11 >= ON_COMMAND_KYWD && LA81_11 <= OR_KYWD)||LA81_11==PERCENT||LA81_11==PLUS||LA81_11==RBRACKET||LA81_11==REQUEST_KYWD||LA81_11==RPAREN||LA81_11==SEMICOLON||LA81_11==SEQUENCE_KYWD||LA81_11==SLASH||LA81_11==STRING||LA81_11==SYNCHRONOUS_COMMAND_KYWD||LA81_11==TRUE_KYWD||(LA81_11 >= TRY_KYWD && LA81_11 <= UPDATE_KYWD)||(LA81_11 >= WAIT_KYWD && LA81_11 <= WHILE_KYWD)||LA81_11==XOR_KYWD) ) {s = 30;}
						 
						input.seek(index81_11);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA81_27 = input.LA(1);
						 
						int index81_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 7;}
						 
						input.seek(index81_27);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA81_28 = input.LA(1);
						 
						int index81_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred15_Plexil()) ) {s = 68;}
						else if ( (synpred16_Plexil()) ) {s = 69;}
						else if ( (synpred17_Plexil()) ) {s = 70;}
						else if ( (synpred18_Plexil()) ) {s = 71;}
						else if ( (synpred19_Plexil()) ) {s = 72;}
						else if ( (synpred21_Plexil()) ) {s = 73;}
						else if ( (synpred22_Plexil()) ) {s = 74;}
						else if ( (synpred23_Plexil()) ) {s = 75;}
						else if ( (synpred24_Plexil()) ) {s = 76;}
						else if ( (synpred25_Plexil()) ) {s = 77;}
						 
						input.seek(index81_28);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA81_64 = input.LA(1);
						 
						int index81_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred15_Plexil()) ) {s = 68;}
						else if ( (synpred16_Plexil()) ) {s = 69;}
						else if ( (synpred17_Plexil()) ) {s = 70;}
						else if ( (synpred18_Plexil()) ) {s = 71;}
						else if ( (synpred19_Plexil()) ) {s = 72;}
						else if ( (synpred21_Plexil()) ) {s = 73;}
						else if ( (synpred22_Plexil()) ) {s = 74;}
						else if ( (synpred23_Plexil()) ) {s = 75;}
						else if ( (synpred24_Plexil()) ) {s = 76;}
						else if ( (synpred25_Plexil()) ) {s = 77;}
						 
						input.seek(index81_64);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA81_65 = input.LA(1);
						 
						int index81_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred15_Plexil()) ) {s = 68;}
						else if ( (synpred16_Plexil()) ) {s = 69;}
						else if ( (synpred17_Plexil()) ) {s = 70;}
						else if ( (synpred18_Plexil()) ) {s = 71;}
						else if ( (synpred19_Plexil()) ) {s = 72;}
						else if ( (synpred21_Plexil()) ) {s = 73;}
						else if ( (synpred22_Plexil()) ) {s = 74;}
						else if ( (synpred23_Plexil()) ) {s = 75;}
						else if ( (synpred24_Plexil()) ) {s = 76;}
						else if ( (synpred25_Plexil()) ) {s = 77;}
						 
						input.seek(index81_65);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA81_66 = input.LA(1);
						 
						int index81_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred15_Plexil()) ) {s = 68;}
						else if ( (synpred16_Plexil()) ) {s = 69;}
						else if ( (synpred17_Plexil()) ) {s = 70;}
						else if ( (synpred18_Plexil()) ) {s = 71;}
						else if ( (synpred19_Plexil()) ) {s = 72;}
						else if ( (synpred21_Plexil()) ) {s = 73;}
						else if ( (synpred22_Plexil()) ) {s = 74;}
						else if ( (synpred23_Plexil()) ) {s = 75;}
						else if ( (synpred24_Plexil()) ) {s = 76;}
						else if ( (synpred25_Plexil()) ) {s = 77;}
						 
						input.seek(index81_66);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 81, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_declarations_in_plexilPlan1262 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200204L,0x3038800080800000L});
	public static final BitSet FOLLOW_action_in_plexilPlan1265 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_plexilPlan1267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations1301 = new BitSet(new long[]{0x0000108100200002L,0x0000000002001000L,0x0000100000080000L});
	public static final BitSet FOLLOW_commandDeclaration_in_declaration1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupDeclaration_in_declaration1348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_libraryActionDeclaration_in_declaration1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMAND_KYWD_in_commandDeclaration1401 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_commandDeclaration1403 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_paramsSpec_in_commandDeclaration1405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_commandDeclaration1408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnType_in_commandDeclaration1458 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_COMMAND_KYWD_in_commandDeclaration1460 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_commandDeclaration1462 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_paramsSpec_in_commandDeclaration1464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_commandDeclaration1467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnType_in_lookupDeclaration1540 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LOOKUP_KYWD_in_lookupDeclaration1542 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_lookupDeclaration1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_paramsSpec_in_lookupDeclaration1546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_lookupDeclaration1549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_paramsSpec1584 = new BitSet(new long[]{0x0000908000200200L,0x0000000000001000L,0x0000100008080000L});
	public static final BitSet FOLLOW_paramsSpecGuts_in_paramsSpec1586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_paramsSpec1589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramSpec_in_paramsSpecGuts1618 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_paramsSpecGuts1622 = new BitSet(new long[]{0x0000108000200200L,0x0000000000001000L,0x0000100000080000L});
	public static final BitSet FOLLOW_paramSpec_in_paramsSpecGuts1625 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_paramsSpecGuts1632 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ELLIPSIS_in_paramsSpecGuts1635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_paramsSpecGuts1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_paramSpec1691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_paramSpec1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_paramSpec1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBRACKET_in_paramSpec1697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_paramSpec1729 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_paramSpec1731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_paramSpec1733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_paramSpec1735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBRACKET_in_paramSpec1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramTypeName_in_paramSpec1755 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_paramSpec1758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnTypeSpec_in_returnType1838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_returnTypeSpec1874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_returnTypeSpec1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_returnTypeSpec1878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBRACKET_in_returnTypeSpec1880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_returnTypeSpec1896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIBRARY_ACTION_KYWD_in_libraryActionDeclaration1966 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_libraryActionDeclaration1969 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_libraryInterfaceSpec_in_libraryActionDeclaration1971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_libraryActionDeclaration1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_libraryInterfaceSpec1999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L,0x0000000008000000L});
	public static final BitSet FOLLOW_libraryParamSpec_in_libraryInterfaceSpec2003 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_libraryInterfaceSpec2007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
	public static final BitSet FOLLOW_libraryParamSpec_in_libraryInterfaceSpec2009 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_libraryInterfaceSpec2017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_KYWD_in_libraryParamSpec2043 = new BitSet(new long[]{0x0000108000200000L,0x0000000000001000L,0x0000100000080000L});
	public static final BitSet FOLLOW_IN_OUT_KYWD_in_libraryParamSpec2048 = new BitSet(new long[]{0x0000108000200000L,0x0000000000001000L,0x0000100000080000L});
	public static final BitSet FOLLOW_baseTypeName_in_libraryParamSpec2054 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_libraryParamSpec2067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_libraryParamSpec2069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_libraryParamSpec2072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBRACKET_in_libraryParamSpec2074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_libraryParamSpec2081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_action2116 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COLON_in_action2118 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200204L,0x3038800080800000L});
	public static final BitSet FOLLOW_baseAction_in_action2125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifAction_in_baseAction2157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forAction_in_baseAction2166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_onCommandAction_in_baseAction2175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_onMessageAction_in_baseAction2184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doAction_in_baseAction2193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileAction_in_baseAction2202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_baseAction2211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleAction_in_baseAction2220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_simpleAction2249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commandInvocation_in_simpleAction2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_simpleAction2271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_libraryCall_in_simpleAction2278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_request_in_simpleAction2284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_update_in_simpleAction2290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_synchCmd_in_simpleAction2296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_waitBuiltin_in_simpleAction2302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_KYWD_in_forAction2327 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_forAction2334 = new BitSet(new long[]{0x0000108000200000L,0x0000000000001000L,0x0000100000080000L});
	public static final BitSet FOLLOW_baseTypeName_in_forAction2336 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_forAction2338 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_forAction2340 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_forAction2344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_forAction2350 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_forAction2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_forAction2360 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_forAction2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_forAction2370 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200204L,0x3038800080800000L});
	public static final BitSet FOLLOW_action_in_forAction2376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_KYWD_in_ifAction2432 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_ifAction2435 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200004L,0x3038800080800000L});
	public static final BitSet FOLLOW_consequentAction_in_ifAction2437 = new BitSet(new long[]{0x0007000000000002L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ELSEIF_KYWD_in_ifAction2444 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_ifAction2447 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200004L,0x3038800080800000L});
	public static final BitSet FOLLOW_consequentAction_in_ifAction2449 = new BitSet(new long[]{0x0007000000000002L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ELSE_KYWD_in_ifAction2458 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200204L,0x3038800080800000L});
	public static final BitSet FOLLOW_action_in_ifAction2461 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ENDIF_KYWD_in_ifAction2469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_ifAction2477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_consequentAction2496 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COLON_in_consequentAction2498 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200004L,0x3038800080800000L});
	public static final BitSet FOLLOW_consequent_in_consequentAction2505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forAction_in_consequent2533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_onCommandAction_in_consequent2538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_onMessageAction_in_consequent2543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doAction_in_consequent2548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileAction_in_consequent2553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_consequent2558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleAction_in_consequent2563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_COMMAND_KYWD_in_onCommandAction2589 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_onCommandAction2592 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200204L,0x3038800080800000L});
	public static final BitSet FOLLOW_paramsSpec_in_onCommandAction2594 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200204L,0x3038800080800000L});
	public static final BitSet FOLLOW_action_in_onCommandAction2597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_MESSAGE_KYWD_in_onMessageAction2622 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_onMessageAction2628 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200204L,0x3038800080800000L});
	public static final BitSet FOLLOW_action_in_onMessageAction2630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_KYWD_in_whileAction2655 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_whileAction2658 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200204L,0x3038800080800000L});
	public static final BitSet FOLLOW_action_in_whileAction2660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_KYWD_in_doAction2686 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200204L,0x3038800080800000L});
	public static final BitSet FOLLOW_action_in_doAction2689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_WHILE_KYWD_in_doAction2691 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_doAction2694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_doAction2696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYNCHRONOUS_COMMAND_KYWD_in_synchCmd2722 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
	public static final BitSet FOLLOW_commandWithAssignment_in_synchCmd2731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000020000000L});
	public static final BitSet FOLLOW_commandInvocation_in_synchCmd2735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000020000000L});
	public static final BitSet FOLLOW_TIMEOUT_KYWD_in_synchCmd2742 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_synchCmd2745 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_synchCmd2749 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_synchCmd2752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_synchCmd2761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WAIT_KYWD_in_waitBuiltin2784 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_waitBuiltin2787 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_waitBuiltin2790 = new BitSet(new long[]{0x0000040000000000L,0x0000010000000800L});
	public static final BitSet FOLLOW_variable_in_waitBuiltin2794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_INT_in_waitBuiltin2796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_DOUBLE_in_waitBuiltin2798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_waitBuiltin2803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequenceVariantKywd_in_block2836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_block2838 = new BitSet(new long[]{0x010818D000A00000L,0xC000010084271204L,0x3038904481CBA000L});
	public static final BitSet FOLLOW_LBRACE_in_block2854 = new BitSet(new long[]{0x010818D000A00000L,0xC000010084271204L,0x3038904481CBA000L});
	public static final BitSet FOLLOW_comment_in_block2866 = new BitSet(new long[]{0x010818C000A00000L,0xC000010084271204L,0x3038904481CBA000L});
	public static final BitSet FOLLOW_nodeDeclaration_in_block2873 = new BitSet(new long[]{0x010818C000A00000L,0xC000010084271204L,0x3038904481CBA000L});
	public static final BitSet FOLLOW_nodeAttribute_in_block2880 = new BitSet(new long[]{0x0108084000800000L,0xC000010084210204L,0x3038804481C3A000L});
	public static final BitSet FOLLOW_action_in_block2887 = new BitSet(new long[]{0x0000084000800000L,0xC000010084200204L,0x3038800080820000L});
	public static final BitSet FOLLOW_RBRACE_in_block2894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_KYWD_in_comment2962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_STRING_in_comment2965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_comment2967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_nodeDeclaration2981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_nodeDeclaration2987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCondition_in_nodeAttribute2999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_priority_in_nodeAttribute3005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_resource_in_nodeAttribute3011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionKywd_in_nodeCondition3037 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_nodeCondition3040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_nodeCondition3042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESOURCE_KYWD_in_resource3123 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_NAME_KYWD_in_resource3126 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_resource3129 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_resource3132 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_resource3144 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0040000000210000L});
	public static final BitSet FOLLOW_LOWER_BOUND_KYWD_in_resource3159 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_resource3161 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_resource3164 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_UPPER_BOUND_KYWD_in_resource3178 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_resource3180 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_resource3183 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RELEASE_AT_TERM_KYWD_in_resource3193 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_resource3195 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_resource3198 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_PRIORITY_KYWD_in_resource3207 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_resource3209 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_resource3214 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_resource3247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIORITY_KYWD_in_priority3269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_priority3275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_priority3277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_in_interfaceDeclaration3287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inOut_in_interfaceDeclaration3291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_KYWD_in_in3320 = new BitSet(new long[]{0x0000108000200000L,0x0000010000001000L,0x0000100000080000L});
	public static final BitSet FOLLOW_NCNAME_in_in3333 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_in3336 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_in3339 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_interfaceDeclarations_in_in3349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_in3364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_OUT_KYWD_in_inOut3391 = new BitSet(new long[]{0x0000108000200000L,0x0000010000001000L,0x0000100000080000L});
	public static final BitSet FOLLOW_NCNAME_in_inOut3403 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_inOut3406 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_inOut3409 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_interfaceDeclarations_in_inOut3419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_inOut3434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_interfaceDeclarations3452 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_arrayVariableDecl_in_interfaceDeclarations3469 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_scalarVariableDecl_in_interfaceDeclarations3479 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_interfaceDeclarations3491 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_arrayVariableDecl_in_interfaceDeclarations3510 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_scalarVariableDecl_in_interfaceDeclarations3522 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_NCNAME_in_variable3546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_variableDeclaration3576 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_arrayVariableDecl_in_variableDeclaration3592 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_scalarVariableDecl_in_variableDeclaration3602 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_variableDeclaration3617 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_arrayVariableDecl_in_variableDeclaration3633 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_scalarVariableDecl_in_variableDeclaration3642 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_variableDeclaration3658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_scalarVariableDecl3690 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_scalarVariableDecl3694 = new BitSet(new long[]{0x4000148000000000L,0x0000000800000800L,0x0002040000000000L});
	public static final BitSet FOLLOW_literalScalarValue_in_scalarVariableDecl3696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_arrayVariableDecl3732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayVariableDecl3734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_arrayVariableDecl3736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayVariableDecl3738 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_arrayVariableDecl3742 = new BitSet(new long[]{0x4000148000000000L,0x0000000800000840L,0x0002040000000000L});
	public static final BitSet FOLLOW_literalValue_in_arrayVariableDecl3744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_literalScalarValue3780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_literalScalarValue3784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_literalScalarValue3788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_literalScalarValue3792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryMinus_in_literalScalarValue3796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dateLiteral_in_literalScalarValue3804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_durationLiteral_in_literalScalarValue3808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASHPAREN_in_literalArrayValue3821 = new BitSet(new long[]{0x4000148000000000L,0x0000000800000800L,0x0002040008000000L});
	public static final BitSet FOLLOW_literalScalarValue_in_literalArrayValue3823 = new BitSet(new long[]{0x4000148000000000L,0x0000000800000800L,0x0002040008000000L});
	public static final BitSet FOLLOW_RPAREN_in_literalArrayValue3826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literalScalarValue_in_literalValue3850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literalArrayValue_in_literalValue3854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_lookupArrayReference3895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_lookupArrayReference3897 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_lookupArrayReference3899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBRACKET_in_lookupArrayReference3901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_simpleArrayReference3930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_simpleArrayReference3932 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_simpleArrayReference3934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBRACKET_in_simpleArrayReference3936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_commandInvocation3978 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_commandInvocation3994 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_commandInvocation3996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_commandInvocation3998 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_commandInvocation4014 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x080664231C1050E0L});
	public static final BitSet FOLLOW_argumentList_in_commandInvocation4016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_commandInvocation4019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentLHS_in_commandWithAssignment4064 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_commandWithAssignment4066 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
	public static final BitSet FOLLOW_commandInvocation_in_commandWithAssignment4068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argument_in_argumentList4098 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_argumentList4101 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_argument_in_argumentList4103 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_expression_in_argument4129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentLHS_in_assignment4153 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_assignment4155 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_assignmentRHS_in_assignment4157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_assignment4159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleArrayReference_in_assignmentLHS4202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_assignmentLHS4213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commandInvocation_in_assignmentRHS4234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commandInvocation_in_assignmentRHS4254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assignmentRHS4262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UPDATE_KYWD_in_update4291 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_pair_in_update4296 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_update4300 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_pair_in_update4303 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_update4311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REQUEST_KYWD_in_request4338 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_request4341 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_pair_in_request4345 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_request4349 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_pair_in_request4352 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_request4360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_pair4372 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_pair4374 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_pair4377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIBRARY_CALL_KYWD_in_libraryCall4403 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_libraryNodeIdRef_in_libraryCall4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_aliasSpecs_in_libraryCall4410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_libraryCall4415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_libraryNodeIdRef4425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_aliasSpecs4436 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_aliasSpec_in_aliasSpecs4440 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_aliasSpecs4444 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_aliasSpec_in_aliasSpecs4446 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_aliasSpecs4454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_aliasSpec4478 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_aliasSpec4480 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_aliasSpec4482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_nodeParameterName4510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalOr_in_expression4539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalXOR_in_logicalOr4561 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OR_KYWD_in_logicalOr4575 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_logicalXOR_in_logicalOr4579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_logicalAnd_in_logicalXOR4622 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_XOR_KYWD_in_logicalXOR4637 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_logicalAnd_in_logicalXOR4641 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_equality_in_logicalAnd4686 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_AND_KYWD_in_logicalAnd4700 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_equality_in_logicalAnd4704 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_relational_in_equality4751 = new BitSet(new long[]{0x0000020000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_equalityOp_in_equality4765 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_relational_in_equality4769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additive_in_relational4829 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800028L});
	public static final BitSet FOLLOW_relationalOp_in_relational4841 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_additive_in_relational4845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicative_in_additive4922 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_addOp_in_additive4937 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_multiplicative_in_additive4941 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_unary_in_multiplicative5002 = new BitSet(new long[]{0x0000000000040002L,0x0000004000000000L,0x0000000800000100L});
	public static final BitSet FOLLOW_multOp_in_multiplicative5017 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_unary_in_multiplicative5021 = new BitSet(new long[]{0x0000000000040002L,0x0000004000000000L,0x0000000800000100L});
	public static final BitSet FOLLOW_unaryMinus_in_unary5095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryOp_in_unary5105 = new BitSet(new long[]{0xE8C0148E71485010L,0x2BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_quantity_in_unary5108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantity_in_unary5118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_KYWD_in_unaryOp5133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryMinus5143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_unaryMinus5147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryMinus5173 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOUBLE_in_unaryMinus5177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryMinus5202 = new BitSet(new long[]{0xE8C0148E71485010L,0x2BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_quantity_in_unaryMinus5205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_KYWD_in_dateLiteral5226 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_dateLiteral5228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_STRING_in_dateLiteral5232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_dateLiteral5234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_KYWD_in_durationLiteral5254 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_durationLiteral5256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_STRING_in_durationLiteral5260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_durationLiteral5262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_quantity5291 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_quantity5294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_quantity5296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BAR_in_quantity5303 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_quantity5305 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_BAR_in_quantity5307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgFn_in_quantity5321 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_quantity5324 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_quantity5327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_quantity5329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_twoArgFn_in_quantity5336 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_quantity5339 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_quantity5342 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_quantity5344 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_quantity5347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_quantity5349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_isKnownExp_in_quantity5356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupArrayReference_in_quantity5370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupExpr_in_quantity5376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_messageReceivedExp_in_quantity5382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStatePredicateExp_in_quantity5388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCommandHandleVariable_in_quantity5415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeFailureVariable_in_quantity5442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeOutcomeVariable_in_quantity5469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStateVariable_in_quantity5496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeTimepointValue_in_quantity5523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleArrayReference_in_quantity5537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_quantity5543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCommandHandleVariable_in_quantity5573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeFailureVariable_in_quantity5602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeOutcomeVariable_in_quantity5631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStateVariable_in_quantity5660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeTimepointValue_in_quantity5689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literalValue_in_quantity5695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCommandHandleKywd_in_quantity5701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeFailureKywd_in_quantity5707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStateKywd_in_quantity5713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeOutcomeKywd_in_quantity5719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_KNOWN_KYWD_in_isKnownExp5820 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_isKnownExp5826 = new BitSet(new long[]{0xE8C0148E71485010L,0x2BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_quantity_in_isKnownExp5829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_isKnownExp5831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStatePredicate_in_nodeStatePredicateExp5939 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_nodeStatePredicateExp5942 = new BitSet(new long[]{0x0000000001000000L,0x0000010000000000L,0x0000000110000080L});
	public static final BitSet FOLLOW_nodeReference_in_nodeStatePredicateExp5945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_nodeStatePredicateExp5947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MESSAGE_RECEIVED_KYWD_in_messageReceivedExp6017 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_messageReceivedExp6020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_STRING_in_messageReceivedExp6023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_messageReceivedExp6025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStateVariable_in_nodeState6036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStateKywd_in_nodeState6040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeReference_in_nodeStateVariable6049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_nodeStateVariable6051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_STATE_KYWD_in_nodeStateVariable6054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeOutcomeVariable_in_nodeOutcome6067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeOutcomeKywd_in_nodeOutcome6071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeReference_in_nodeOutcomeVariable6080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_nodeOutcomeVariable6082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OUTCOME_KYWD_in_nodeOutcomeVariable6085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCommandHandleVariable_in_nodeCommandHandle6129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCommandHandleKywd_in_nodeCommandHandle6133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeReference_in_nodeCommandHandleVariable6142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_nodeCommandHandleVariable6144 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMAND_HANDLE_KYWD_in_nodeCommandHandleVariable6147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeFailureVariable_in_nodeFailure6204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeFailureKywd_in_nodeFailure6208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeReference_in_nodeFailureVariable6217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_nodeFailureVariable6219 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_FAILURE_KYWD_in_nodeFailureVariable6222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeReference_in_nodeTimepointValue6282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_nodeTimepointValue6284 = new BitSet(new long[]{0x8840000000000000L,0x0000000000100401L,0x0800000000000000L});
	public static final BitSet FOLLOW_nodeStateKywd_in_nodeTimepointValue6286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_nodeTimepointValue6288 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_timepoint_in_nodeTimepointValue6290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeId_in_nodeReference6333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHILD_KYWD_in_nodeReference6339 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_nodeReference6342 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_nodeReference6345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_nodeReference6347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIBLING_KYWD_in_nodeReference6354 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_nodeReference6357 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_nodeReference6360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_nodeReference6362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupOnChange_in_lookupExpr6405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupNow_in_lookupExpr6409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_lookupExpr6413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_ON_CHANGE_KYWD_in_lookupOnChange6444 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_lookupOnChange6447 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
	public static final BitSet FOLLOW_lookupInvocation_in_lookupOnChange6450 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_lookupOnChange6453 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_lookupOnChange6456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_lookupOnChange6460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_NOW_KYWD_in_lookupNow6488 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_lookupNow6491 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
	public static final BitSet FOLLOW_lookupInvocation_in_lookupNow6494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_lookupNow6496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_KYWD_in_lookup6526 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_lookup6529 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
	public static final BitSet FOLLOW_lookupInvocation_in_lookup6532 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_lookup6535 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_lookup6538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_lookup6542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stateName_in_lookupInvocation6558 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_lookupInvocation6572 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_stateNameExp_in_lookupInvocation6575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_lookupInvocation6577 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_lookupInvocation6590 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x080664231C1050E0L});
	public static final BitSet FOLLOW_argumentList_in_lookupInvocation6594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_lookupInvocation6598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_stateName6616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_stateNameExp6634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_synpred1_Plexil1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred1_Plexil1680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_synpred2_Plexil1714 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred2_Plexil1716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred2_Plexil1718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_synpred3_Plexil1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred3_Plexil1863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred4_Plexil2060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred4_Plexil2062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred5_Plexil2236 = new BitSet(new long[]{0x0020000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_set_in_synpred5_Plexil2238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred6_Plexil2257 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred6_Plexil2259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred6_Plexil2264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred7_Plexil3462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred7_Plexil3464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred8_Plexil3503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred8_Plexil3505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred9_Plexil3585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred9_Plexil3587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred10_Plexil3626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred10_Plexil3628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred11_Plexil4190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred11_Plexil4192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred12_Plexil4227 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred12_Plexil4229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred13_Plexil4243 = new BitSet(new long[]{0xE8C0148E71485010L,0x3BFF711EB818AC43L,0x08066423141050E0L});
	public static final BitSet FOLLOW_expression_in_synpred13_Plexil4245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred13_Plexil4247 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred13_Plexil4249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupExpr_in_synpred14_Plexil5363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred14_Plexil5365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred15_Plexil5396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_synpred15_Plexil5408 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMAND_HANDLE_KYWD_in_synpred15_Plexil5410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred16_Plexil5423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_synpred16_Plexil5435 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_FAILURE_KYWD_in_synpred16_Plexil5437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred17_Plexil5450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_synpred17_Plexil5462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OUTCOME_KYWD_in_synpred17_Plexil5464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred18_Plexil5477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_synpred18_Plexil5489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_STATE_KYWD_in_synpred18_Plexil5491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred19_Plexil5504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_synpred19_Plexil5516 = new BitSet(new long[]{0x8840000000000000L,0x0000000000100401L,0x0800000000000000L});
	public static final BitSet FOLLOW_nodeStateKywd_in_synpred19_Plexil5518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred20_Plexil5530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred20_Plexil5532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred21_Plexil5552 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred21_Plexil5560 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred21_Plexil5562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred21_Plexil5564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_synpred21_Plexil5566 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMAND_HANDLE_KYWD_in_synpred21_Plexil5568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred22_Plexil5581 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred22_Plexil5589 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred22_Plexil5591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred22_Plexil5593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_synpred22_Plexil5595 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_FAILURE_KYWD_in_synpred22_Plexil5597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred23_Plexil5610 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred23_Plexil5618 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred23_Plexil5620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred23_Plexil5622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_synpred23_Plexil5624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OUTCOME_KYWD_in_synpred23_Plexil5626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred24_Plexil5639 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred24_Plexil5647 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred24_Plexil5649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred24_Plexil5651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_synpred24_Plexil5653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_STATE_KYWD_in_synpred24_Plexil5655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred25_Plexil5668 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred25_Plexil5676 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred25_Plexil5678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred25_Plexil5680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PERIOD_in_synpred25_Plexil5682 = new BitSet(new long[]{0x8840000000000000L,0x0000000000100401L,0x0800000000000000L});
	public static final BitSet FOLLOW_nodeStateKywd_in_synpred25_Plexil5684 = new BitSet(new long[]{0x0000000000000002L});
}
