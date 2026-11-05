// Generated from ejercicios/RJ.g4 by ANTLR 4.9.2
package ejercicios;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RJParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RJVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RJParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(RJParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(RJParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(RJParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#sentencia_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_if(RJParser.Sentencia_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#sentencia_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_for(RJParser.Sentencia_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(RJParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(RJParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(RJParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(RJParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(RJParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(RJParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#expresion_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_relacional(RJParser.Expresion_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#expresion_aditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_aditiva(RJParser.Expresion_aditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(RJParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RJParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(RJParser.FactorContext ctx);
}