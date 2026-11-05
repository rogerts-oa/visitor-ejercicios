
package ejercicios;

import java.util.HashMap;

import ejercicios.RJParser.ExpresionContext;
import ejercicios.RJParser.FactorContext;
import ejercicios.RJParser.InstruccionContext;
import ejercicios.RJParser.ProgramaContext;

public class RJCustomVisitor extends RJBaseVisitor<Object> {

    public final HashMap<String, Integer> tablaSimbolos = new HashMap<>();

    @Override
    public Object visitExpresion(ExpresionContext ctx) {
                int result = visit(ctx.term(0)); // Term 0
        for (int i = 1; i < ctx.term().size(); i++) {
            String operator = ctx.getChild(i*2-1).getText();
            if (operator.equals("+")) {
                result += visit(ctx.term(i));
            } else if (operator.equals("-")) {
    }

    @Override
    public Object visitPrograma(ProgramaContext ctx) {
        int result = 0;
        for (InstructionContext intr : ctx.instruction()) {
            result = visit(intr)
        }

        return result;
    }

    @Override
    public Object visitInstruction(RJParser.InstructionContext ctx) {
        int result = visit(ctx.factor(0)); // Factor 0
        for (int i = 1; i < ctx.factor().size(); i++) {
            String operator = ctx.getChild(i*2-1).getText();
            if (operator.equals("+")) {
                result += visit(ctx.factor(i));
            }
        }

        return result;
    }

    @Override public Object visitFactor(RJParser.FactorContext ctx) {
        if (ctx.ENT() != null) {
            System.out.println("Se encontró un entero: " + ctx.ENT().getText());
            return Integer.parseInt(ctx.ENT().getText());
        } else if (ctx.ID() != null) {
            System.out.println("Se encontró un identificador: " + ctx.ID().getText());
            return  tablaSimbolos.getOrDefault(ctx.ID().getText(), 0);
        }
        if (ctx.expression(0) != null) {
            System.out.println("Se encontró una expresión: " + ctx.expression(0).getText());
            return visit(ctx.expression(0));
        }
        return 0;
    }



}
