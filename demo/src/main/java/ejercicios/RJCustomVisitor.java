
package ejercicios;

import ejercicios.RJParser.ExpresionContext;
import ejercicios.RJParser.FactorContext;
import ejercicios.RJParser.InstruccionContext;
import ejercicios.RJParser.ProgramaContext;

public class RJCustomVisitor extends RJBaseVisitor<Object> {

    @Override
    public Object visitExpresion(ExpresionContext ctx) {
        // TODO Auto-generated method stub
        return super.visitExpresion(ctx);
    }

    @Override
    public Object visitFactor(FactorContext ctx) {
        // TODO Auto-generated method stub
        return super.visitFactor(ctx);
    }

    @Override
    public Object visitInstruccion(InstruccionContext ctx) {
        // TODO Auto-generated method stub
        return super.visitInstruccion(ctx);
    }

    @Override
    public Object visitPrograma(ProgramaContext ctx) {
        // TODO Auto-generated method stub
        return super.visitPrograma(ctx);
    }



}
