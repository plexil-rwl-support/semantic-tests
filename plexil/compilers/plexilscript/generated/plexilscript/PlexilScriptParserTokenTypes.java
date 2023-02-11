// $ANTLR 2.7.6 (20060405): "plexilscript.g" -> "PlexilScriptLexer.java"$

  package plexilscript;
  import java.util.List;
  import java.util.LinkedList;

public interface PlexilScriptParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	// "initial-state" = 4
	int LBRACE = 5;
	int RBRACE = 6;
	int LITERAL_simultaneous = 7;
	int LITERAL_script = 8;
	// "update-ack" = 9
	int ID = 10;
	int SEMI = 11;
	int LITERAL_state = 12;
	int EQUALS = 13;
	int COLON = 14;
	// "function-call" = 15
	int LITERAL_command = 16;
	// "command-abort" = 17
	// "command-ack" = 18
	// "command-accepted" = 19
	// "command-denied" = 20
	// "command-sent-to-system" = 21
	// "command-rcvd-by-system" = 22
	// "command-success" = 23
	// "command-failed" = 24
	int LITERAL_delay = 25;
	int LPAREN = 26;
	int COMMA = 27;
	int RPAREN = 28;
	int LITERAL_true = 29;
	int LITERAL_false = 30;
	int UNKNOWN = 31;
	int STRING = 32;
	int NUMBER = 33;
	// "int-array" = 34
	// "string-array" = 35
	// "real-array" = 36
	int LITERAL_string = 37;
	// "bool-array" = 38
	int LITERAL_int = 39;
	int LITERAL_real = 40;
	int LITERAL_bool = 41;
	int LETTER = 42;
	int DIGIT = 43;
	int WS = 44;
	int COMMENT = 45;
}
