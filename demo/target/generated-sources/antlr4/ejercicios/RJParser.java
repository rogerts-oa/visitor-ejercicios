// Generated from ejercicios/RJ.g4 by ANTLR 4.9.2
package ejercicios;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RJParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PR_IF=1, PR_ELSE_IF=2, PR_ELSE=3, PR_FOR=4, PR_INT=5, PR_FLOAT=6, PR_BOOL=7, 
		PR_STR=8, PR_PRINT=9, PR_TRUE=10, PR_FALSE=11, OP_ASIG=12, OP_MAYOR=13, 
		OP_MENOR=14, OP_IGUAL=15, OP_MENOR_IGUAL=16, OP_MAYOR_IGUAL=17, OP_INCREMENTO=18, 
		OP_SUMA=19, OP_RESTA=20, OP_MULT=21, OP_DIV=22, PAR_IZQ=23, PAR_DER=24, 
		LLAVE_IZQ=25, LLAVE_DER=26, PUN_COMA=27, ENT=28, FLOT=29, CADENA=30, ID=31, 
		WS=32;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_bloque = 2, RULE_sentencia_if = 3, 
		RULE_sentencia_for = 4, RULE_declaracion = 5, RULE_tipo = 6, RULE_impresion = 7, 
		RULE_asignacion = 8, RULE_incremento = 9, RULE_expresion = 10, RULE_expresion_relacional = 11, 
		RULE_expresion_aditiva = 12, RULE_termino = 13, RULE_factor = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "bloque", "sentencia_if", "sentencia_for", 
			"declaracion", "tipo", "impresion", "asignacion", "incremento", "expresion", 
			"expresion_relacional", "expresion_aditiva", "termino", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'elseIf'", "'else'", "'for'", "'int'", "'float'", "'bool'", 
			"'str'", "'print'", "'true'", "'false'", "'='", "'>'", "'<'", "'=='", 
			"'<='", "'>='", "'++'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", 
			"'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PR_IF", "PR_ELSE_IF", "PR_ELSE", "PR_FOR", "PR_INT", "PR_FLOAT", 
			"PR_BOOL", "PR_STR", "PR_PRINT", "PR_TRUE", "PR_FALSE", "OP_ASIG", "OP_MAYOR", 
			"OP_MENOR", "OP_IGUAL", "OP_MENOR_IGUAL", "OP_MAYOR_IGUAL", "OP_INCREMENTO", 
			"OP_SUMA", "OP_RESTA", "OP_MULT", "OP_DIV", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", 
			"LLAVE_DER", "PUN_COMA", "ENT", "FLOT", "CADENA", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RJ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RJParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				instruccion();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_IF) | (1L << PR_FOR) | (1L << PR_INT) | (1L << PR_FLOAT) | (1L << PR_BOOL) | (1L << PR_STR) | (1L << PR_PRINT) | (1L << PR_TRUE) | (1L << PR_FALSE) | (1L << OP_SUMA) | (1L << OP_RESTA) | (1L << PAR_IZQ) | (1L << ENT) | (1L << FLOT) | (1L << CADENA) | (1L << ID))) != 0) );
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

	public static class InstruccionContext extends ParserRuleContext {
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public Sentencia_forContext sentencia_for() {
			return getRuleContext(Sentencia_forContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PUN_COMA() { return getToken(RJParser.PUN_COMA, 0); }
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				sentencia_if();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				sentencia_for();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				declaracion();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(38);
					match(PUN_COMA);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				impresion();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(42);
					match(PUN_COMA);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				asignacion();
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(46);
					match(PUN_COMA);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				expresion();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(50);
					match(PUN_COMA);
					}
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVE_IZQ() { return getToken(RJParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(RJParser.LLAVE_DER, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LLAVE_IZQ);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_IF) | (1L << PR_FOR) | (1L << PR_INT) | (1L << PR_FLOAT) | (1L << PR_BOOL) | (1L << PR_STR) | (1L << PR_PRINT) | (1L << PR_TRUE) | (1L << PR_FALSE) | (1L << OP_SUMA) | (1L << OP_RESTA) | (1L << PAR_IZQ) | (1L << ENT) | (1L << FLOT) | (1L << CADENA) | (1L << ID))) != 0)) {
				{
				{
				setState(56);
				instruccion();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(LLAVE_DER);
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

	public static class Sentencia_ifContext extends ParserRuleContext {
		public List<TerminalNode> PR_IF() { return getTokens(RJParser.PR_IF); }
		public TerminalNode PR_IF(int i) {
			return getToken(RJParser.PR_IF, i);
		}
		public List<TerminalNode> PAR_IZQ() { return getTokens(RJParser.PAR_IZQ); }
		public TerminalNode PAR_IZQ(int i) {
			return getToken(RJParser.PAR_IZQ, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> PAR_DER() { return getTokens(RJParser.PAR_DER); }
		public TerminalNode PAR_DER(int i) {
			return getToken(RJParser.PAR_DER, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<TerminalNode> PR_ELSE() { return getTokens(RJParser.PR_ELSE); }
		public TerminalNode PR_ELSE(int i) {
			return getToken(RJParser.PR_ELSE, i);
		}
		public List<TerminalNode> PR_ELSE_IF() { return getTokens(RJParser.PR_ELSE_IF); }
		public TerminalNode PR_ELSE_IF(int i) {
			return getToken(RJParser.PR_ELSE_IF, i);
		}
		public Sentencia_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterSentencia_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitSentencia_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitSentencia_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_ifContext sentencia_if() throws RecognitionException {
		Sentencia_ifContext _localctx = new Sentencia_ifContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(PR_IF);
			setState(65);
			match(PAR_IZQ);
			setState(66);
			expresion();
			setState(67);
			match(PAR_DER);
			setState(68);
			bloque();
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PR_ELSE_IF:
						{
						setState(69);
						match(PR_ELSE_IF);
						}
						break;
					case PR_ELSE:
						{
						setState(70);
						match(PR_ELSE);
						setState(71);
						match(PR_IF);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(74);
					match(PAR_IZQ);
					setState(75);
					expresion();
					setState(76);
					match(PAR_DER);
					setState(77);
					bloque();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_ELSE) {
				{
				setState(84);
				match(PR_ELSE);
				setState(85);
				bloque();
				}
			}

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

	public static class Sentencia_forContext extends ParserRuleContext {
		public TerminalNode PR_FOR() { return getToken(RJParser.PR_FOR, 0); }
		public TerminalNode PAR_IZQ() { return getToken(RJParser.PAR_IZQ, 0); }
		public List<TerminalNode> PUN_COMA() { return getTokens(RJParser.PUN_COMA); }
		public TerminalNode PUN_COMA(int i) {
			return getToken(RJParser.PUN_COMA, i);
		}
		public TerminalNode PAR_DER() { return getToken(RJParser.PAR_DER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public Sentencia_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterSentencia_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitSentencia_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitSentencia_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_forContext sentencia_for() throws RecognitionException {
		Sentencia_forContext _localctx = new Sentencia_forContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PR_FOR);
			setState(89);
			match(PAR_IZQ);
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_INT:
			case PR_FLOAT:
			case PR_BOOL:
			case PR_STR:
				{
				setState(90);
				declaracion();
				}
				break;
			case ID:
				{
				setState(91);
				asignacion();
				}
				break;
			case PUN_COMA:
				break;
			default:
				break;
			}
			setState(94);
			match(PUN_COMA);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_TRUE) | (1L << PR_FALSE) | (1L << OP_SUMA) | (1L << OP_RESTA) | (1L << PAR_IZQ) | (1L << ENT) | (1L << FLOT) | (1L << CADENA) | (1L << ID))) != 0)) {
				{
				setState(95);
				expresion();
				}
			}

			setState(98);
			match(PUN_COMA);
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(99);
				asignacion();
				}
				break;
			case 2:
				{
				setState(100);
				incremento();
				}
				break;
			}
			setState(103);
			match(PAR_DER);
			setState(104);
			bloque();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(RJParser.ID, 0); }
		public TerminalNode OP_ASIG() { return getToken(RJParser.OP_ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			tipo();
			setState(107);
			match(ID);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASIG) {
				{
				setState(108);
				match(OP_ASIG);
				setState(109);
				expresion();
				}
			}

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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode PR_INT() { return getToken(RJParser.PR_INT, 0); }
		public TerminalNode PR_FLOAT() { return getToken(RJParser.PR_FLOAT, 0); }
		public TerminalNode PR_BOOL() { return getToken(RJParser.PR_BOOL, 0); }
		public TerminalNode PR_STR() { return getToken(RJParser.PR_STR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_INT) | (1L << PR_FLOAT) | (1L << PR_BOOL) | (1L << PR_STR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode PR_PRINT() { return getToken(RJParser.PR_PRINT, 0); }
		public TerminalNode PAR_IZQ() { return getToken(RJParser.PAR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(RJParser.PAR_DER, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(PR_PRINT);
			setState(115);
			match(PAR_IZQ);
			setState(116);
			expresion();
			setState(117);
			match(PAR_DER);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RJParser.ID, 0); }
		public TerminalNode OP_ASIG() { return getToken(RJParser.OP_ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(OP_ASIG);
			setState(121);
			expresion();
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

	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RJParser.ID, 0); }
		public TerminalNode OP_INCREMENTO() { return getToken(RJParser.OP_INCREMENTO, 0); }
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ID);
			setState(124);
			match(OP_INCREMENTO);
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

	public static class ExpresionContext extends ParserRuleContext {
		public Expresion_relacionalContext expresion_relacional() {
			return getRuleContext(Expresion_relacionalContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			expresion_relacional();
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

	public static class Expresion_relacionalContext extends ParserRuleContext {
		public List<Expresion_aditivaContext> expresion_aditiva() {
			return getRuleContexts(Expresion_aditivaContext.class);
		}
		public Expresion_aditivaContext expresion_aditiva(int i) {
			return getRuleContext(Expresion_aditivaContext.class,i);
		}
		public TerminalNode OP_MAYOR() { return getToken(RJParser.OP_MAYOR, 0); }
		public TerminalNode OP_MENOR() { return getToken(RJParser.OP_MENOR, 0); }
		public TerminalNode OP_IGUAL() { return getToken(RJParser.OP_IGUAL, 0); }
		public TerminalNode OP_MENOR_IGUAL() { return getToken(RJParser.OP_MENOR_IGUAL, 0); }
		public TerminalNode OP_MAYOR_IGUAL() { return getToken(RJParser.OP_MAYOR_IGUAL, 0); }
		public Expresion_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterExpresion_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitExpresion_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitExpresion_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_relacionalContext expresion_relacional() throws RecognitionException {
		Expresion_relacionalContext _localctx = new Expresion_relacionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			expresion_aditiva();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAYOR) | (1L << OP_MENOR) | (1L << OP_IGUAL) | (1L << OP_MENOR_IGUAL) | (1L << OP_MAYOR_IGUAL))) != 0)) {
				{
				setState(129);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAYOR) | (1L << OP_MENOR) | (1L << OP_IGUAL) | (1L << OP_MENOR_IGUAL) | (1L << OP_MAYOR_IGUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(130);
				expresion_aditiva();
				}
			}

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

	public static class Expresion_aditivaContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> OP_SUMA() { return getTokens(RJParser.OP_SUMA); }
		public TerminalNode OP_SUMA(int i) {
			return getToken(RJParser.OP_SUMA, i);
		}
		public List<TerminalNode> OP_RESTA() { return getTokens(RJParser.OP_RESTA); }
		public TerminalNode OP_RESTA(int i) {
			return getToken(RJParser.OP_RESTA, i);
		}
		public Expresion_aditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_aditiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterExpresion_aditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitExpresion_aditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitExpresion_aditiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_aditivaContext expresion_aditiva() throws RecognitionException {
		Expresion_aditivaContext _localctx = new Expresion_aditivaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expresion_aditiva);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			termino();
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					_la = _input.LA(1);
					if ( !(_la==OP_SUMA || _la==OP_RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(135);
					termino();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
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

	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> OP_MULT() { return getTokens(RJParser.OP_MULT); }
		public TerminalNode OP_MULT(int i) {
			return getToken(RJParser.OP_MULT, i);
		}
		public List<TerminalNode> OP_DIV() { return getTokens(RJParser.OP_DIV); }
		public TerminalNode OP_DIV(int i) {
			return getToken(RJParser.OP_DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			factor();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MULT || _la==OP_DIV) {
				{
				{
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==OP_MULT || _la==OP_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				factor();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ENT() { return getToken(RJParser.ENT, 0); }
		public TerminalNode FLOT() { return getToken(RJParser.FLOT, 0); }
		public TerminalNode CADENA() { return getToken(RJParser.CADENA, 0); }
		public TerminalNode PR_TRUE() { return getToken(RJParser.PR_TRUE, 0); }
		public TerminalNode PR_FALSE() { return getToken(RJParser.PR_FALSE, 0); }
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public TerminalNode ID() { return getToken(RJParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(RJParser.PAR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(RJParser.PAR_DER, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode OP_SUMA() { return getToken(RJParser.OP_SUMA, 0); }
		public TerminalNode OP_RESTA() { return getToken(RJParser.OP_RESTA, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RJListener ) ((RJListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RJVisitor ) return ((RJVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(ENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(FLOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(PR_TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(PR_FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				incremento();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				match(PAR_IZQ);
				setState(157);
				expresion();
				setState(158);
				match(PAR_DER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==OP_SUMA || _la==OP_RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				factor();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\3\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\5\3.\n\3\3\3\3\3\5\3\62\n\3\3\3\3"+
		"\3\5\3\66\n\3\5\38\n\3\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\3\5\3\5\7\5R\n\5\f\5\16"+
		"\5U\13\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\5\6c\n\6\3"+
		"\6\3\6\3\6\5\6h\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\5\r"+
		"\u0086\n\r\3\16\3\16\3\16\7\16\u008b\n\16\f\16\16\16\u008e\13\16\3\17"+
		"\3\17\3\17\7\17\u0093\n\17\f\17\16\17\u0096\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a5\n\20\3\20\2\2"+
		"\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\6\3\2\7\n\3\2\17\23\3\2\25"+
		"\26\3\2\27\30\2\u00b6\2!\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\bB\3\2\2\2\n"+
		"Z\3\2\2\2\fl\3\2\2\2\16r\3\2\2\2\20t\3\2\2\2\22y\3\2\2\2\24}\3\2\2\2\26"+
		"\u0080\3\2\2\2\30\u0082\3\2\2\2\32\u0087\3\2\2\2\34\u008f\3\2\2\2\36\u00a4"+
		"\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2"+
		"\2%8\5\b\5\2&8\5\n\6\2\')\5\f\7\2(*\7\35\2\2)(\3\2\2\2)*\3\2\2\2*8\3\2"+
		"\2\2+-\5\20\t\2,.\7\35\2\2-,\3\2\2\2-.\3\2\2\2.8\3\2\2\2/\61\5\22\n\2"+
		"\60\62\7\35\2\2\61\60\3\2\2\2\61\62\3\2\2\2\628\3\2\2\2\63\65\5\26\f\2"+
		"\64\66\7\35\2\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67%\3\2\2\2\67"+
		"&\3\2\2\2\67\'\3\2\2\2\67+\3\2\2\2\67/\3\2\2\2\67\63\3\2\2\28\5\3\2\2"+
		"\29=\7\33\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2"+
		"\2\2?=\3\2\2\2@A\7\34\2\2A\7\3\2\2\2BC\7\3\2\2CD\7\31\2\2DE\5\26\f\2E"+
		"F\7\32\2\2FS\5\6\4\2GK\7\4\2\2HI\7\5\2\2IK\7\3\2\2JG\3\2\2\2JH\3\2\2\2"+
		"KL\3\2\2\2LM\7\31\2\2MN\5\26\f\2NO\7\32\2\2OP\5\6\4\2PR\3\2\2\2QJ\3\2"+
		"\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TX\3\2\2\2US\3\2\2\2VW\7\5\2\2WY\5\6"+
		"\4\2XV\3\2\2\2XY\3\2\2\2Y\t\3\2\2\2Z[\7\6\2\2[^\7\31\2\2\\_\5\f\7\2]_"+
		"\5\22\n\2^\\\3\2\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`b\7\35\2\2ac\5\26\f"+
		"\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2dg\7\35\2\2eh\5\22\n\2fh\5\24\13\2ge\3"+
		"\2\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\32\2\2jk\5\6\4\2k\13\3\2\2\2"+
		"lm\5\16\b\2mp\7!\2\2no\7\16\2\2oq\5\26\f\2pn\3\2\2\2pq\3\2\2\2q\r\3\2"+
		"\2\2rs\t\2\2\2s\17\3\2\2\2tu\7\13\2\2uv\7\31\2\2vw\5\26\f\2wx\7\32\2\2"+
		"x\21\3\2\2\2yz\7!\2\2z{\7\16\2\2{|\5\26\f\2|\23\3\2\2\2}~\7!\2\2~\177"+
		"\7\24\2\2\177\25\3\2\2\2\u0080\u0081\5\30\r\2\u0081\27\3\2\2\2\u0082\u0085"+
		"\5\32\16\2\u0083\u0084\t\3\2\2\u0084\u0086\5\32\16\2\u0085\u0083\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\31\3\2\2\2\u0087\u008c\5\34\17\2\u0088\u0089"+
		"\t\4\2\2\u0089\u008b\5\34\17\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\33\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0094\5\36\20\2\u0090\u0091\t\5\2\2\u0091\u0093\5\36\20"+
		"\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\35\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u00a5\7\36\2\2\u0098"+
		"\u00a5\7\37\2\2\u0099\u00a5\7 \2\2\u009a\u00a5\7\f\2\2\u009b\u00a5\7\r"+
		"\2\2\u009c\u00a5\5\24\13\2\u009d\u00a5\7!\2\2\u009e\u009f\7\31\2\2\u009f"+
		"\u00a0\5\26\f\2\u00a0\u00a1\7\32\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a3\t"+
		"\4\2\2\u00a3\u00a5\5\36\20\2\u00a4\u0097\3\2\2\2\u00a4\u0098\3\2\2\2\u00a4"+
		"\u0099\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u009c\3\2"+
		"\2\2\u00a4\u009d\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\37\3\2\2\2\24#)-\61\65\67=JSX^bgp\u0085\u008c\u0094\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}