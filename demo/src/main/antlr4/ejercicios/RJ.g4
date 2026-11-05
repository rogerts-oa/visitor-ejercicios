grammar RJ;

programa : instruccion +;
instruccion
    : sentencia_if
    | sentencia_for
    | declaracion PUN_COMA?
    | impresion PUN_COMA?
    | asignacion PUN_COMA?
    | expresion PUN_COMA?
    ;
bloque : LLAVE_IZQ instruccion* LLAVE_DER;
sentencia_if
    : PR_IF PAR_IZQ expresion PAR_DER bloque
      ((PR_ELSE_IF | PR_ELSE PR_IF) PAR_IZQ expresion PAR_DER bloque)*
      (PR_ELSE bloque)?
    ;
sentencia_for
    : PR_FOR PAR_IZQ (declaracion | asignacion)? PUN_COMA
      expresion? PUN_COMA (asignacion | incremento)? PAR_DER bloque
    ;
declaracion : tipo ID (OP_ASIG expresion)?;
tipo : PR_INT | PR_FLOAT | PR_BOOL | PR_STR;
impresion : PR_PRINT PAR_IZQ expresion PAR_DER;
asignacion : ID OP_ASIG expresion;
incremento : ID OP_INCREMENTO;
expresion : expresion_relacional;
expresion_relacional
    : expresion_aditiva
      ((OP_MAYOR | OP_MENOR | OP_IGUAL | OP_MENOR_IGUAL | OP_MAYOR_IGUAL) expresion_aditiva)?
    ;
expresion_aditiva : termino ((OP_SUMA | OP_RESTA) termino)*;
termino : factor ((OP_MULT | OP_DIV) factor)*;
factor
    : ENT | FLOT | CADENA | PR_TRUE | PR_FALSE
    | incremento | ID | PAR_IZQ expresion PAR_DER
    | (OP_SUMA | OP_RESTA) factor
    ;

PR_IF: 'if';
PR_ELSE_IF: 'elseIf';
PR_ELSE: 'else';
PR_FOR: 'for';
PR_INT: 'int';
PR_FLOAT: 'float';
PR_BOOL: 'bool';
PR_STR: 'str';
PR_PRINT: 'print';
PR_TRUE: 'true';
PR_FALSE: 'false';
OP_ASIG: '=';
OP_MAYOR: '>';
OP_MENOR: '<';
OP_IGUAL: '==';
OP_MENOR_IGUAL: '<=';
OP_MAYOR_IGUAL: '>=';
OP_INCREMENTO: '++';
OP_SUMA: '+';
OP_RESTA: '-';
OP_MULT: '*';
OP_DIV: '/';
PAR_IZQ: '(';
PAR_DER: ')';
LLAVE_IZQ: '{';
LLAVE_DER: '}';
PUN_COMA: ';';
ENT: [0-9]+;
FLOT: [0-9]+ '.' [0-9]+;
CADENA: '"' ('\\' ["\\nrt] | ~["\\\r\n])* '"';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\r\n\f]+ -> skip;
