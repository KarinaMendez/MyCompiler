// Generated from parser/DecafParser.g by ANTLR 4.4

  package compiler.parser;
  import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=41, BRAKET2=55, CODOBLE=10, CHAR=62, MAY=24, FOR=40, SUB=19, ORR=31, 
		FLOAT=38, ID=64, AND=20, BREAK=43, PARENTESIS2=57, BRACE=52, QUEST=3, 
		IF=39, DIAGS=8, RET=14, EXP=32, CONTINUE=46, HEX=60, MIEQ=34, BOO=37, 
		RETS=7, RETURN=42, PARENTESIS=56, PLUS=16, NL=12, EQ=22, COMMENT=48, BRAKET=54, 
		CALLOUT=45, BRACE2=53, PER=23, PERIOD=1, TABS=6, WSS=4, NO=35, ELSE=47, 
		TAB=13, SEMICOLON=51, INT=36, MULT=17, COMA=49, ENTEROS=58, FF=2, COLON=50, 
		BOOLEANS=63, WS=11, FLOTANTES=59, NOEQ=29, MEN=25, VOD=44, OR=21, PLEQ=33, 
		ErrorCharacter=65, COSIMPLE=9, MAEQ=26, DIV=18, MEEQ=27, EQQ=28, STRING=15, 
		ANDD=30, HEXDIGIT=61, NLS=5;
	public static final String[] tokenNames = {
		"<INVALID>", "PERIOD", "FF", "QUEST", "WSS", "NLS", "TABS", "RETS", "DIAGS", 
		"COSIMPLE", "CODOBLE", "WS", "NL", "TAB", "RET", "STRING", "'+'", "'*'", 
		"'/'", "'-'", "'&'", "'|'", "'='", "'%'", "'>'", "'<'", "'>='", "'<='", 
		"'=='", "'!='", "'&&'", "'||'", "'^'", "'+='", "'-='", "'!'", "'int'", 
		"'boolean'", "'float'", "'if'", "'for'", "'while'", "'return'", "'break'", 
		"'void'", "'callout'", "'continue'", "'else'", "COMMENT", "','", "':'", 
		"';'", "'{'", "'}'", "'['", "']'", "'('", "')'", "ENTEROS", "FLOTANTES", 
		"HEX", "HEXDIGIT", "CHAR", "BOOLEANS", "ID", "ErrorCharacter"
	};
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_callout_decl = 2, RULE_field_decl = 3, 
		RULE_method_decl = 4, RULE_cual = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_assign_op = 8, RULE_method_call = 9, RULE_location = 10, RULE_expr = 11, 
		RULE_expleft = 12, RULE_callout_arg = 13, RULE_bin_op = 14, RULE_add_sub = 15, 
		RULE_mult_div = 16, RULE_arith_op = 17, RULE_rel_op = 18, RULE_eq_op = 19, 
		RULE_cond_op = 20, RULE_literal = 21, RULE_int_literal = 22, RULE_decimal_literal = 23;
	public static final String[] ruleNames = {
		"start", "program", "callout_decl", "field_decl", "method_decl", "cual", 
		"block", "statement", "assign_op", "method_call", "location", "expr", 
		"expleft", "callout_arg", "bin_op", "add_sub", "mult_div", "arith_op", 
		"rel_op", "eq_op", "cond_op", "literal", "int_literal", "decimal_literal"
	};

	@Override
	public String getGrammarFileName() { return "DecafParser.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		public LinkedList<String> list = new LinkedList<String>();

	  	public LinkedList<String> getlist(){
	  		return list;
	  	}  	 


	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); program();
			list.add("start");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Callout_declContext> callout_decl() {
			return getRuleContexts(Callout_declContext.class);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Callout_declContext callout_decl(int i) {
			return getRuleContext(Callout_declContext.class,i);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLOUT) {
				{
				{
				setState(51); callout_decl();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57); field_decl();
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOO) | (1L << VOD))) != 0)) {
				{
				{
				setState(63); method_decl();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			list.add("program");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Callout_declContext extends ParserRuleContext {
		public Callout_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_decl; }
	 
		public Callout_declContext() { }
		public void copyFrom(Callout_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalloutDecContext extends Callout_declContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public CalloutDecContext(Callout_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCalloutDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCalloutDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitCalloutDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_declContext callout_decl() throws RecognitionException {
		Callout_declContext _localctx = new Callout_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_callout_decl);
		try {
			_localctx = new CalloutDecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(71); match(CALLOUT);
			{
			setState(72); match(ID);
			}
			setState(73); match(SEMICOLON);
			}
			list.add("callout_decl");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declContext extends ParserRuleContext {
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
	 
		public Field_declContext() { }
		public void copyFrom(Field_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldDec1Context extends Field_declContext {
		public TerminalNode BOO() { return getToken(DecafParser.BOO, 0); }
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public Int_literalContext int_literal(int i) {
			return getRuleContext(Int_literalContext.class,i);
		}
		public List<TerminalNode> BRAKET2() { return getTokens(DecafParser.BRAKET2); }
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode BRAKET2(int i) {
			return getToken(DecafParser.BRAKET2, i);
		}
		public TerminalNode COMA(int i) {
			return getToken(DecafParser.COMA, i);
		}
		public List<TerminalNode> COMA() { return getTokens(DecafParser.COMA); }
		public List<Int_literalContext> int_literal() {
			return getRuleContexts(Int_literalContext.class);
		}
		public List<TerminalNode> BRAKET() { return getTokens(DecafParser.BRAKET); }
		public TerminalNode VOD() { return getToken(DecafParser.VOD, 0); }
		public TerminalNode BRAKET(int i) {
			return getToken(DecafParser.BRAKET, i);
		}
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public FieldDec1Context(Field_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterFieldDec1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitFieldDec1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitFieldDec1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_decl);
		int _la;
		try {
			_localctx = new FieldDec1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOO) | (1L << VOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(78); match(ID);
					}
					break;
				case 2:
					{
					{
					setState(79); match(ID);
					setState(80); match(BRAKET);
					setState(81); int_literal();
					setState(82); match(BRAKET2);
					}
					}
					break;
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(86); match(COMA);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(96); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declContext extends ParserRuleContext {
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
	 
		public Method_declContext() { }
		public void copyFrom(Method_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDecContext extends Method_declContext {
		public TerminalNode BOO() { return getToken(DecafParser.BOO, 0); }
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public CualContext cual(int i) {
			return getRuleContext(CualContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public List<TerminalNode> COMA() { return getTokens(DecafParser.COMA); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COMA(int i) {
			return getToken(DecafParser.COMA, i);
		}
		public TerminalNode VOD() { return getToken(DecafParser.VOD, 0); }
		public List<CualContext> cual() {
			return getRuleContexts(CualContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public MethodDecContext(Method_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethodDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethodDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethodDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method_decl);
		int _la;
		try {
			_localctx = new MethodDecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOO) | (1L << VOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(99); match(ID);
			setState(100); match(PARENTESIS);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOO) {
				{
				{
				setState(101); cual();
				setState(102); match(ID);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(103); match(COMA);
					setState(104); cual();
					setState(105); match(ID);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117); match(PARENTESIS2);
			setState(118); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CualContext extends ParserRuleContext {
		public TerminalNode BOO() { return getToken(DecafParser.BOO, 0); }
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public CualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitCual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CualContext cual() throws RecognitionException {
		CualContext _localctx = new CualContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Block1Context extends BlockContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode BRACE2() { return getToken(DecafParser.BRACE2, 0); }
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public TerminalNode BRACE() { return getToken(DecafParser.BRACE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block1Context(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitBlock1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			_localctx = new Block1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(BRACE);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOO) | (1L << VOD))) != 0)) {
				{
				{
				setState(123); field_decl();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (IF - 39)) | (1L << (FOR - 39)) | (1L << (WHILE - 39)) | (1L << (RETURN - 39)) | (1L << (BREAK - 39)) | (1L << (CONTINUE - 39)) | (1L << (ID - 39)))) != 0)) {
				{
				{
				setState(129); statement();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135); match(BRACE2);
			list.add("block");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public BreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatementContext {
		public TerminalNode PARENTESIS2(int i) {
			return getToken(DecafParser.PARENTESIS2, i);
		}
		public List<TerminalNode> PARENTESIS2() { return getTokens(DecafParser.PARENTESIS2); }
		public TerminalNode PARENTESIS(int i) {
			return getToken(DecafParser.PARENTESIS, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public List<TerminalNode> PARENTESIS() { return getTokens(DecafParser.PARENTESIS); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EQ() { return getToken(DecafParser.EQ, 0); }
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public MethodCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public ContinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocationSonContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public LocationSonContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocationSon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocationSon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLocationSon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(DecafParser.WHILE, 0); }
		public TerminalNode PARENTESIS(int i) {
			return getToken(DecafParser.PARENTESIS, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> PARENTESIS() { return getTokens(DecafParser.PARENTESIS); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new LocationSonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(138); location();
				setState(139); assign_op();
				setState(140); expr();
				setState(141); match(SEMICOLON);
				}
				}
				break;
			case 2:
				_localctx = new MethodCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(143); method_call();
				setState(144); match(SEMICOLON);
				}
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(146); match(IF);
				setState(147); match(PARENTESIS);
				setState(148); expr();
				setState(149); match(PARENTESIS2);
				setState(150); block();
				setState(153);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(151); match(ELSE);
					{
					setState(152); block();
					}
					}
				}

				}
				}
				break;
			case 4:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(155); match(FOR);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARENTESIS) {
					{
					{
					setState(156); match(PARENTESIS);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162); match(ID);
				setState(163); match(EQ);
				setState(164); expr();
				setState(165); match(COMA);
				setState(166); expr();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARENTESIS2) {
					{
					{
					setState(167); match(PARENTESIS2);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173); block();
				}
				}
				break;
			case 5:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(175); match(WHILE);
				setState(176); match(PARENTESIS);
				setState(177); expr();
				setState(178); match(PARENTESIS);
				setState(179); block();
				}
				}
				break;
			case 6:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(181); match(RETURN);
				setState(182); expr();
				setState(183); match(SEMICOLON);
				}
				}
				break;
			case 7:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(185); match(BREAK);
				setState(186); match(SEMICOLON);
				}
				}
				break;
			case 8:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(187); match(CONTINUE);
				setState(188); match(SEMICOLON);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_opContext extends ParserRuleContext {
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
	 
		public Assign_opContext() { }
		public void copyFrom(Assign_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends Assign_opContext {
		public TerminalNode PLEQ() { return getToken(DecafParser.PLEQ, 0); }
		public TerminalNode MIEQ() { return getToken(DecafParser.MIEQ, 0); }
		public TerminalNode EQ() { return getToken(DecafParser.EQ, 0); }
		public AssignContext(Assign_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_op);
		int _la;
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLEQ) | (1L << MIEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			list.add("assign_op");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	 
		public Method_callContext() { }
		public void copyFrom(Method_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodC2Context extends Method_callContext {
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public MethodC2Context(Method_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethodC2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethodC2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethodC2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodC1Context extends Method_callContext {
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public List<TerminalNode> COMA() { return getTokens(DecafParser.COMA); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public TerminalNode COMA(int i) {
			return getToken(DecafParser.COMA, i);
		}
		public MethodC1Context(Method_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethodC1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethodC1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethodC1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_call);
		int _la;
		try {
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new MethodC1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(194); match(ID);
				setState(195); match(PARENTESIS);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (SUB - 19)) | (1L << (NO - 19)) | (1L << (PARENTESIS - 19)) | (1L << (ENTEROS - 19)) | (1L << (HEX - 19)) | (1L << (CHAR - 19)) | (1L << (BOOLEANS - 19)) | (1L << (ID - 19)))) != 0)) {
					{
					{
					setState(196); expr();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(202); match(COMA);
					setState(203); expr();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209); match(PARENTESIS2);
				}
				}
				break;
			case 2:
				_localctx = new MethodC2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(210); match(ID);
				setState(211); match(PARENTESIS);
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (STRING - 15)) | (1L << (SUB - 15)) | (1L << (NO - 15)) | (1L << (PARENTESIS - 15)) | (1L << (ENTEROS - 15)) | (1L << (HEX - 15)) | (1L << (CHAR - 15)) | (1L << (BOOLEANS - 15)) | (1L << (ID - 15)))) != 0)) {
					{
					{
					setState(212); callout_arg();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218); match(COMA);
				}
				setState(220); match(PARENTESIS2);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	 
		public LocationContext() { }
		public void copyFrom(LocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocationParentContext extends LocationContext {
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BRAKET2() { return getToken(DecafParser.BRAKET2, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode BRAKET() { return getToken(DecafParser.BRAKET, 0); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public LocationParentContext(LocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocationParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocationParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLocationParent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_location);
		try {
			_localctx = new LocationParentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(223); match(ID);
				}
				break;
			case 2:
				{
				{
				setState(224); match(ID);
				setState(225); match(PARENTESIS);
				setState(226); expr();
				setState(227); match(PARENTESIS2);
				}
				}
				break;
			case 3:
				{
				{
				setState(229); match(ID);
				setState(230); match(BRAKET);
				setState(231); expr();
				setState(232); match(BRAKET2);
				}
				}
				break;
			}
			list.add("location");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocationExp1Context extends ExprContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public LocationExp1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocationExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocationExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLocationExp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecursiveExpContext extends ExprContext {
		public ExpleftContext expleft() {
			return getRuleContext(ExpleftContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public RecursiveExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRecursiveExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRecursiveExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitRecursiveExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExp1Context extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExp1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLiteralExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLiteralExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLiteralExp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExp1Context extends ExprContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public MethodCallExp1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethodCallExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethodCallExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethodCallExp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeExp1Context extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NO() { return getToken(DecafParser.NO, 0); }
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public NegativeExp1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterNegativeExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitNegativeExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitNegativeExp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exp1Context extends ExprContext {
		public TerminalNode PARENTESIS(int i) {
			return getToken(DecafParser.PARENTESIS, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> PARENTESIS() { return getTokens(DecafParser.PARENTESIS); }
		public Exp1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new NegativeExp1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==NO) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(239); expr();
				}
				}
				break;
			case 2:
				_localctx = new Exp1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(240); match(PARENTESIS);
				setState(241); expr();
				setState(242); match(PARENTESIS);
				}
				}
				break;
			case 3:
				_localctx = new RecursiveExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(244); expleft();
				setState(245); bin_op();
				setState(246); expr();
				}
				}
				break;
			case 4:
				_localctx = new LiteralExp1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(248); literal();
				}
				break;
			case 5:
				_localctx = new LocationExp1Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(249); location();
				}
				break;
			case 6:
				_localctx = new MethodCallExp1Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(250); method_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpleftContext extends ParserRuleContext {
		public ExpleftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expleft; }
	 
		public ExpleftContext() { }
		public void copyFrom(ExpleftContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocationExp2Context extends ExpleftContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public LocationExp2Context(ExpleftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocationExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocationExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLocationExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExp2Context extends ExpleftContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public MethodCallExp2Context(ExpleftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethodCallExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethodCallExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethodCallExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExp2Context extends ExpleftContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExp2Context(ExpleftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLiteralExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLiteralExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLiteralExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeExp2Context extends ExpleftContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NO() { return getToken(DecafParser.NO, 0); }
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public NegativeExp2Context(ExpleftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterNegativeExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitNegativeExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitNegativeExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exp2Context extends ExpleftContext {
		public TerminalNode PARENTESIS(int i) {
			return getToken(DecafParser.PARENTESIS, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> PARENTESIS() { return getTokens(DecafParser.PARENTESIS); }
		public Exp2Context(ExpleftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpleftContext expleft() throws RecognitionException {
		ExpleftContext _localctx = new ExpleftContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expleft);
		int _la;
		try {
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new LocationExp2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253); location();
				}
				break;
			case 2:
				_localctx = new MethodCallExp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254); method_call();
				}
				break;
			case 3:
				_localctx = new LiteralExp2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(255); literal();
				}
				break;
			case 4:
				_localctx = new NegativeExp2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(256);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==NO) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(257); expr();
				}
				}
				break;
			case 5:
				_localctx = new Exp2Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(258); match(PARENTESIS);
				setState(259); expr();
				setState(260); match(PARENTESIS);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Callout_argContext extends ParserRuleContext {
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
	 
		public Callout_argContext() { }
		public void copyFrom(Callout_argContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalloutArgContext extends Callout_argContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DecafParser.STRING, 0); }
		public CalloutArgContext(Callout_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCalloutArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCalloutArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitCalloutArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callout_arg);
		try {
			_localctx = new CalloutArgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			switch (_input.LA(1)) {
			case SUB:
			case NO:
			case PARENTESIS:
			case ENTEROS:
			case HEX:
			case CHAR:
			case BOOLEANS:
			case ID:
				{
				setState(264); expr();
				}
				break;
			case STRING:
				{
				setState(265); match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			list.add("callout_arg");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_opContext extends ParserRuleContext {
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
	 
		public Bin_opContext() { }
		public void copyFrom(Bin_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinOpContext extends Bin_opContext {
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public BinOpContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bin_op);
		try {
			_localctx = new BinOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			switch (_input.LA(1)) {
			case PLUS:
			case MULT:
			case DIV:
			case SUB:
				{
				setState(270); arith_op();
				}
				break;
			case MAY:
			case MEN:
			case MAEQ:
			case MEEQ:
				{
				setState(271); rel_op();
				}
				break;
			case EQQ:
			case NOEQ:
				{
				setState(272); eq_op();
				}
				break;
			case ANDD:
			case ORR:
				{
				setState(273); cond_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			list.add("bin_op");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_subContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(DecafParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public Add_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAdd_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAdd_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitAdd_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_subContext add_sub() throws RecognitionException {
		Add_subContext _localctx = new Add_subContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_divContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(DecafParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(DecafParser.MULT, 0); }
		public Mult_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMult_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMult_div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMult_div(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_divContext mult_div() throws RecognitionException {
		Mult_divContext _localctx = new Mult_divContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mult_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_opContext extends ParserRuleContext {
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
	 
		public Arith_opContext() { }
		public void copyFrom(Arith_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithOpContext extends Arith_opContext {
		public Mult_divContext mult_div() {
			return getRuleContext(Mult_divContext.class,0);
		}
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
		}
		public ArithOpContext(Arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitArithOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitArithOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arith_op);
		try {
			_localctx = new ArithOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			switch (_input.LA(1)) {
			case MULT:
			case DIV:
				{
				setState(282); mult_div();
				}
				break;
			case PLUS:
			case SUB:
				{
				setState(283); add_sub();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			list.add("arith_op");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
	 
		public Rel_opContext() { }
		public void copyFrom(Rel_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelOpContext extends Rel_opContext {
		public TerminalNode MAEQ() { return getToken(DecafParser.MAEQ, 0); }
		public TerminalNode MAY() { return getToken(DecafParser.MAY, 0); }
		public TerminalNode MEEQ() { return getToken(DecafParser.MEEQ, 0); }
		public TerminalNode MEN() { return getToken(DecafParser.MEN, 0); }
		public RelOpContext(Rel_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rel_op);
		int _la;
		try {
			_localctx = new RelOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAY) | (1L << MEN) | (1L << MAEQ) | (1L << MEEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			list.add("rel_op");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
	 
		public Eq_opContext() { }
		public void copyFrom(Eq_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqOpContext extends Eq_opContext {
		public TerminalNode EQQ() { return getToken(DecafParser.EQQ, 0); }
		public TerminalNode NOEQ() { return getToken(DecafParser.NOEQ, 0); }
		public EqOpContext(Eq_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitEqOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitEqOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_eq_op);
		int _la;
		try {
			_localctx = new EqOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==EQQ || _la==NOEQ) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			list.add("eq_op");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_opContext extends ParserRuleContext {
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
	 
		public Cond_opContext() { }
		public void copyFrom(Cond_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondOpContext extends Cond_opContext {
		public TerminalNode ORR() { return getToken(DecafParser.ORR, 0); }
		public TerminalNode ANDD() { return getToken(DecafParser.ANDD, 0); }
		public CondOpContext(Cond_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCondOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCondOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitCondOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cond_op);
		int _la;
		try {
			_localctx = new CondOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==ANDD || _la==ORR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			list.add("cond_op");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LitContext extends LiteralContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode BOOLEANS() { return getToken(DecafParser.BOOLEANS, 0); }
		public TerminalNode CHAR() { return getToken(DecafParser.CHAR, 0); }
		public LitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			_localctx = new LitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			switch (_input.LA(1)) {
			case ENTEROS:
			case HEX:
				{
				setState(297); int_literal();
				}
				break;
			case CHAR:
				{
				setState(298); match(CHAR);
				}
				break;
			case BOOLEANS:
				{
				setState(299); match(BOOLEANS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			list.add("literal");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
	 
		public Int_literalContext() { }
		public void copyFrom(Int_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntLitContext extends Int_literalContext {
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
		}
		public TerminalNode HEX() { return getToken(DecafParser.HEX, 0); }
		public IntLitContext(Int_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterIntLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitIntLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_int_literal);
		try {
			_localctx = new IntLitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			switch (_input.LA(1)) {
			case ENTEROS:
				{
				setState(304); decimal_literal();
				}
				break;
			case HEX:
				{
				setState(305); match(HEX);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			list.add("int_literal");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decimal_literalContext extends ParserRuleContext {
		public Decimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_literal; }
	 
		public Decimal_literalContext() { }
		public void copyFrom(Decimal_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLitContext extends Decimal_literalContext {
		public TerminalNode ENTEROS(int i) {
			return getToken(DecafParser.ENTEROS, i);
		}
		public List<TerminalNode> ENTEROS() { return getTokens(DecafParser.ENTEROS); }
		public DecimalLitContext(Decimal_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterDecimalLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitDecimalLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitDecimalLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decimal_literalContext decimal_literal() throws RecognitionException {
		Decimal_literalContext _localctx = new Decimal_literalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_decimal_literal);
		try {
			int _alt;
			_localctx = new DecimalLitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(310); match(ENTEROS);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311); match(ENTEROS);
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
			list.add("decimal_literal");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3C\u0142\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5W\n\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\6\5_\n\5\r\5\16"+
		"\5`\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13"+
		"\6\7\6s\n\6\f\6\16\6v\13\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\7\b\177\n\b\f\b"+
		"\16\b\u0082\13\b\3\b\7\b\u0085\n\b\f\b\16\b\u0088\13\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009c\n\t"+
		"\3\t\3\t\7\t\u00a0\n\t\f\t\16\t\u00a3\13\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u00ab\n\t\f\t\16\t\u00ae\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c0\n\t\3\n\3\n\3\n\3\13\3\13\3\13\7\13"+
		"\u00c8\n\13\f\13\16\13\u00cb\13\13\3\13\3\13\7\13\u00cf\n\13\f\13\16\13"+
		"\u00d2\13\13\3\13\3\13\3\13\3\13\7\13\u00d8\n\13\f\13\16\13\u00db\13\13"+
		"\3\13\3\13\3\13\5\13\u00e0\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00ed\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00fe\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0109\n\16\3\17\3\17\5\17\u010d\n\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\5\20\u0115\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u011f"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\5\27\u012f\n\27\3\27\3\27\3\30\3\30\5\30\u0135\n\30\3\30\3\30\3"+
		"\31\3\31\7\31\u013b\n\31\f\31\16\31\u013e\13\31\3\31\3\31\3\31\2\2\32"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\13\4\2&\'..\3\2"+
		"&\'\4\2\30\30#$\4\2\25\25%%\4\2\22\22\25\25\3\2\23\24\3\2\32\35\3\2\36"+
		"\37\3\2 !\u0155\2\62\3\2\2\2\48\3\2\2\2\6I\3\2\2\2\bO\3\2\2\2\nd\3\2\2"+
		"\2\fz\3\2\2\2\16|\3\2\2\2\20\u00bf\3\2\2\2\22\u00c1\3\2\2\2\24\u00df\3"+
		"\2\2\2\26\u00ec\3\2\2\2\30\u00fd\3\2\2\2\32\u0108\3\2\2\2\34\u010c\3\2"+
		"\2\2\36\u0114\3\2\2\2 \u0118\3\2\2\2\"\u011a\3\2\2\2$\u011e\3\2\2\2&\u0122"+
		"\3\2\2\2(\u0125\3\2\2\2*\u0128\3\2\2\2,\u012e\3\2\2\2.\u0134\3\2\2\2\60"+
		"\u0138\3\2\2\2\62\63\5\4\3\2\63\64\b\2\1\2\64\3\3\2\2\2\65\67\5\6\4\2"+
		"\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29>\3\2\2\2:8\3\2\2\2;"+
		"=\5\b\5\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?D\3\2\2\2@>\3\2\2\2"+
		"AC\5\n\6\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2"+
		"GH\b\3\1\2H\5\3\2\2\2IJ\7/\2\2JK\7B\2\2KL\7\65\2\2LM\3\2\2\2MN\b\4\1\2"+
		"N\7\3\2\2\2O^\t\2\2\2PW\7B\2\2QR\7B\2\2RS\78\2\2ST\5.\30\2TU\79\2\2UW"+
		"\3\2\2\2VP\3\2\2\2VQ\3\2\2\2W[\3\2\2\2XZ\7\63\2\2YX\3\2\2\2Z]\3\2\2\2"+
		"[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^V\3\2\2\2_`\3\2\2\2`^\3\2\2"+
		"\2`a\3\2\2\2ab\3\2\2\2bc\7\65\2\2c\t\3\2\2\2de\t\2\2\2ef\7B\2\2ft\7:\2"+
		"\2gh\5\f\7\2ho\7B\2\2ij\7\63\2\2jk\5\f\7\2kl\7B\2\2ln\3\2\2\2mi\3\2\2"+
		"\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rg\3\2\2\2sv\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7;\2\2xy\5\16\b\2y\13\3\2"+
		"\2\2z{\t\3\2\2{\r\3\2\2\2|\u0080\7\66\2\2}\177\5\b\5\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0086\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0085\5\20\t\2\u0084\u0083\3\2\2\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7\67\2\2\u008a\u008b\b\b\1\2\u008b\17\3\2\2"+
		"\2\u008c\u008d\5\26\f\2\u008d\u008e\5\22\n\2\u008e\u008f\5\30\r\2\u008f"+
		"\u0090\7\65\2\2\u0090\u00c0\3\2\2\2\u0091\u0092\5\24\13\2\u0092\u0093"+
		"\7\65\2\2\u0093\u00c0\3\2\2\2\u0094\u0095\7)\2\2\u0095\u0096\7:\2\2\u0096"+
		"\u0097\5\30\r\2\u0097\u0098\7;\2\2\u0098\u009b\5\16\b\2\u0099\u009a\7"+
		"\61\2\2\u009a\u009c\5\16\b\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u00c0\3\2\2\2\u009d\u00a1\7*\2\2\u009e\u00a0\7:\2\2\u009f\u009e\3\2\2"+
		"\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7B\2\2\u00a5\u00a6\7\30\2\2\u00a6"+
		"\u00a7\5\30\r\2\u00a7\u00a8\7\63\2\2\u00a8\u00ac\5\30\r\2\u00a9\u00ab"+
		"\7;\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\5\16"+
		"\b\2\u00b0\u00c0\3\2\2\2\u00b1\u00b2\7+\2\2\u00b2\u00b3\7:\2\2\u00b3\u00b4"+
		"\5\30\r\2\u00b4\u00b5\7:\2\2\u00b5\u00b6\5\16\b\2\u00b6\u00c0\3\2\2\2"+
		"\u00b7\u00b8\7,\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\7\65\2\2\u00ba\u00c0"+
		"\3\2\2\2\u00bb\u00bc\7-\2\2\u00bc\u00c0\7\65\2\2\u00bd\u00be\7\60\2\2"+
		"\u00be\u00c0\7\65\2\2\u00bf\u008c\3\2\2\2\u00bf\u0091\3\2\2\2\u00bf\u0094"+
		"\3\2\2\2\u00bf\u009d\3\2\2\2\u00bf\u00b1\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf"+
		"\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\21\3\2\2\2\u00c1\u00c2\t\4\2"+
		"\2\u00c2\u00c3\b\n\1\2\u00c3\23\3\2\2\2\u00c4\u00c5\7B\2\2\u00c5\u00c9"+
		"\7:\2\2\u00c6\u00c8\5\30\r\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d0\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00cd\7\63\2\2\u00cd\u00cf\5\30\r\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00e0\7;\2\2\u00d4\u00d5\7B\2\2\u00d5\u00d9"+
		"\7:\2\2\u00d6\u00d8\5\34\17\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00dd\7\63\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\7;\2\2\u00df"+
		"\u00c4\3\2\2\2\u00df\u00d4\3\2\2\2\u00e0\25\3\2\2\2\u00e1\u00ed\7B\2\2"+
		"\u00e2\u00e3\7B\2\2\u00e3\u00e4\7:\2\2\u00e4\u00e5\5\30\r\2\u00e5\u00e6"+
		"\7;\2\2\u00e6\u00ed\3\2\2\2\u00e7\u00e8\7B\2\2\u00e8\u00e9\78\2\2\u00e9"+
		"\u00ea\5\30\r\2\u00ea\u00eb\79\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e1\3\2"+
		"\2\2\u00ec\u00e2\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\b\f\1\2\u00ef\27\3\2\2\2\u00f0\u00f1\t\5\2\2\u00f1\u00fe\5\30\r"+
		"\2\u00f2\u00f3\7:\2\2\u00f3\u00f4\5\30\r\2\u00f4\u00f5\7:\2\2\u00f5\u00fe"+
		"\3\2\2\2\u00f6\u00f7\5\32\16\2\u00f7\u00f8\5\36\20\2\u00f8\u00f9\5\30"+
		"\r\2\u00f9\u00fe\3\2\2\2\u00fa\u00fe\5,\27\2\u00fb\u00fe\5\26\f\2\u00fc"+
		"\u00fe\5\24\13\2\u00fd\u00f0\3\2\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f6\3"+
		"\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\31\3\2\2\2\u00ff\u0109\5\26\f\2\u0100\u0109\5\24\13\2\u0101\u0109\5,"+
		"\27\2\u0102\u0103\t\5\2\2\u0103\u0109\5\30\r\2\u0104\u0105\7:\2\2\u0105"+
		"\u0106\5\30\r\2\u0106\u0107\7:\2\2\u0107\u0109\3\2\2\2\u0108\u00ff\3\2"+
		"\2\2\u0108\u0100\3\2\2\2\u0108\u0101\3\2\2\2\u0108\u0102\3\2\2\2\u0108"+
		"\u0104\3\2\2\2\u0109\33\3\2\2\2\u010a\u010d\5\30\r\2\u010b\u010d\7\21"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\b\17\1\2\u010f\35\3\2\2\2\u0110\u0115\5$\23\2\u0111\u0115\5&\24"+
		"\2\u0112\u0115\5(\25\2\u0113\u0115\5*\26\2\u0114\u0110\3\2\2\2\u0114\u0111"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\b\20\1\2\u0117\37\3\2\2\2\u0118\u0119\t\6\2\2\u0119!\3\2\2\2\u011a"+
		"\u011b\t\7\2\2\u011b#\3\2\2\2\u011c\u011f\5\"\22\2\u011d\u011f\5 \21\2"+
		"\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\b\23\1\2\u0121%\3\2\2\2\u0122\u0123\t\b\2\2\u0123\u0124\b\24\1\2\u0124"+
		"\'\3\2\2\2\u0125\u0126\t\t\2\2\u0126\u0127\b\25\1\2\u0127)\3\2\2\2\u0128"+
		"\u0129\t\n\2\2\u0129\u012a\b\26\1\2\u012a+\3\2\2\2\u012b\u012f\5.\30\2"+
		"\u012c\u012f\7@\2\2\u012d\u012f\7A\2\2\u012e\u012b\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b\27\1\2"+
		"\u0131-\3\2\2\2\u0132\u0135\5\60\31\2\u0133\u0135\7>\2\2\u0134\u0132\3"+
		"\2\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b\30\1\2\u0137"+
		"/\3\2\2\2\u0138\u013c\7<\2\2\u0139\u013b\7<\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013f\u0140\b\31\1\2\u0140\61\3\2\2\2\358>DV"+
		"[`ot\u0080\u0086\u009b\u00a1\u00ac\u00bf\u00c9\u00d0\u00d9\u00df\u00ec"+
		"\u00fd\u0108\u010c\u0114\u011e\u012e\u0134\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}