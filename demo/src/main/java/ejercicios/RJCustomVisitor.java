package ejercicios;

import java.util.HashMap;
import java.util.Map;

import ejercicios.RJParser.*;

/** Visitor que evalúa los programas definidos en RJ.g4. */
public class RJCustomVisitor extends RJBaseVisitor<Object> {
    public final Map<String, Object> tablaSimbolos = new HashMap<>();

    @Override public Object visitPrograma(ProgramaContext ctx) {
        Object result = null;
        int n = 1;
        for (InstruccionContext instruccion : ctx.instruccion()) {
            result = visit(instruccion);
            System.out.println(n++ + ") " + instruccion.getText() + " => " + result);
        }
        return result;
    }

    @Override public Object visitInstruccion(InstruccionContext ctx) {
        if (ctx.sentencia_if() != null) return visit(ctx.sentencia_if());
        if (ctx.sentencia_for() != null) return visit(ctx.sentencia_for());
        if (ctx.declaracion() != null) return visit(ctx.declaracion());
        if (ctx.impresion() != null) return visit(ctx.impresion());
        if (ctx.asignacion() != null) return visit(ctx.asignacion());
        return visit(ctx.expresion());
    }

    @Override public Object visitBloque(BloqueContext ctx) {
        Object result = null;
        for (InstruccionContext instruccion : ctx.instruccion()) result = visit(instruccion);
        return result;
    }

    @Override public Object visitDeclaracion(DeclaracionContext ctx) {
        Object value = defaultValue(ctx.tipo().getText());
        if (ctx.expresion() != null) value = visit(ctx.expresion());
        tablaSimbolos.put(ctx.ID().getText(), value);
        return value;
    }

    private Object defaultValue(String type) {
        switch (type) { case "int": return 0; case "float": return 0.0; case "bool": return false; default: return ""; }
    }

    @Override public Object visitAsignacion(AsignacionContext ctx) {
        Object value = visit(ctx.expresion()); tablaSimbolos.put(ctx.ID().getText(), value); return value;
    }

    @Override public Object visitImpresion(ImpresionContext ctx) {
        // El resultado se imprime en visitPrograma para no duplicar salida.
        return visit(ctx.expresion());
    }

    @Override public Object visitExpresion(ExpresionContext ctx) { return visit(ctx.expresion_relacional()); }

    @Override public Object visitExpresion_relacional(Expresion_relacionalContext ctx) {
        Object left = visit(ctx.expresion_aditiva(0));
        if (ctx.expresion_aditiva().size() == 1) return left;
        Object right = visit(ctx.expresion_aditiva(1)); String op = ctx.getChild(1).getText();
        int cmp = compare(left, right);
        switch (op) { case ">": return cmp > 0; case "<": return cmp < 0; case "==": return left.equals(right); case "<=": return cmp <= 0; default: return cmp >= 0; }
    }

    @Override public Object visitExpresion_aditiva(Expresion_aditivaContext ctx) {
        Object value = visit(ctx.termino(0));
        for (int i=1; i<ctx.termino().size(); i++) { String op=ctx.getChild(i*2-1).getText(); Object r=visit(ctx.termino(i)); value=op.equals("+") ? add(value,r) : arithmetic(value,r,'-'); }
        return value;
    }

    @Override public Object visitTermino(TerminoContext ctx) {
        Object value=visit(ctx.factor(0));
        for(int i=1;i<ctx.factor().size();i++){String op=ctx.getChild(i*2-1).getText(); value=arithmetic(value,visit(ctx.factor(i)),op.equals("*")?'*':'/');}
        return value;
    }

    private Object add(Object a,Object b){ if(a instanceof String || b instanceof String)return String.valueOf(a)+b; return arithmetic(a,b,'+'); }
    private Object arithmetic(Object a,Object b,char op){
        if (!(a instanceof Number) || !(b instanceof Number)) throw new IllegalArgumentException("Operación numérica con valores no numéricos: "+a+", "+b);
        Number x=(Number)a,y=(Number)b;
        if (a instanceof Double || b instanceof Double || (op=='/' && x.doubleValue()%y.doubleValue()!=0)) {
            double l=x.doubleValue(),r=y.doubleValue(); switch(op){case '+':return l+r;case '-':return l-r;case '*':return l*r;default:if(r==0)throw new ArithmeticException("División entre cero");return l/r;}
        }
        int l=x.intValue(),r=y.intValue(); switch(op){case '+':return l+r;case '-':return l-r;case '*':return l*r;default:if(r==0)throw new ArithmeticException("División entre cero");return l/r;}
    }
    private int compare(Object a,Object b){ if(a instanceof Number && b instanceof Number)return Double.compare(((Number)a).doubleValue(),((Number)b).doubleValue()); return String.valueOf(a).compareTo(String.valueOf(b)); }

    @Override public Object visitFactor(FactorContext ctx) {
        if(ctx.ENT()!=null)return Integer.parseInt(ctx.ENT().getText());
        if(ctx.FLOT()!=null)return Double.parseDouble(ctx.FLOT().getText());
        if(ctx.CADENA()!=null){String s=ctx.CADENA().getText();return s.substring(1,s.length()-1);}
        if(ctx.PR_TRUE()!=null)return true;
        if(ctx.PR_FALSE()!=null)return false;
        if(ctx.ID()!=null)return tablaSimbolos.getOrDefault(ctx.ID().getText(),0);
        if(ctx.incremento()!=null)return visit(ctx.incremento());
        if(ctx.expresion()!=null)return visit(ctx.expresion());
        Object v=visit(ctx.factor()); return ctx.OP_RESTA()!=null ? arithmetic(0,v,'-') : v;
    }

    @Override public Object visitIncremento(IncrementoContext ctx) {
        String name=ctx.ID().getText(); Object current=tablaSimbolos.getOrDefault(name,0); Object next=arithmetic(current,1,'+'); tablaSimbolos.put(name,next); return next;
    }

    @Override public Object visitSentencia_if(Sentencia_ifContext ctx) {
        int blocks=ctx.bloque().size();
        for(int i=0;i<ctx.expresion().size();i++) if(Boolean.TRUE.equals(visit(ctx.expresion(i)))) return visit(ctx.bloque(i));
        if(blocks>ctx.expresion().size()) return visit(ctx.bloque(blocks-1));
        return null;
    }

    @Override public Object visitSentencia_for(Sentencia_forContext ctx) {
        if(ctx.declaracion()!=null)visit(ctx.declaracion()); else if(ctx.asignacion(0)!=null)visit(ctx.asignacion(0));
        Object result=null; int guard=0;
        while(ctx.expresion()==null || Boolean.TRUE.equals(visit(ctx.expresion()))) {
            if(++guard>1000000)throw new IllegalStateException("Bucle for excedió el límite de iteraciones");
            result=visit(ctx.bloque());
            if(ctx.asignacion().size()> (ctx.declaracion()!=null?0:1)) visit(ctx.asignacion(ctx.asignacion().size()-1));
            else if(ctx.incremento()!=null)visit(ctx.incremento());
            else break;
        }
        return result;
    }
}
