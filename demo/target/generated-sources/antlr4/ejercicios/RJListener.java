// Generated from ejercicios/RJ.g4 by ANTLR 4.9.2
package ejercicios;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RJParser}.
 */
public interface RJListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RJParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(RJParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(RJParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(RJParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(RJParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(RJParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(RJParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_if(RJParser.Sentencia_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_if(RJParser.Sentencia_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#sentencia_for}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_for(RJParser.Sentencia_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#sentencia_for}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_for(RJParser.Sentencia_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(RJParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(RJParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(RJParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(RJParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(RJParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(RJParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(RJParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(RJParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(RJParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(RJParser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(RJParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(RJParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#expresion_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_relacional(RJParser.Expresion_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#expresion_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_relacional(RJParser.Expresion_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#expresion_aditiva}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aditiva(RJParser.Expresion_aditivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#expresion_aditiva}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aditiva(RJParser.Expresion_aditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(RJParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(RJParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RJParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(RJParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RJParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(RJParser.FactorContext ctx);
}