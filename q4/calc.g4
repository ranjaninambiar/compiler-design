grammar calc;
start : exp { System.out.println("Syntatically correct ");} ;
exp : factor;
l : l (COMMA) exp 
| exp;

factor: LPAREN l RPAREN
| A ;


LPAREN : '(' ;
RPAREN : ')' ;
COMMA : ',';
A : 'a';
WS : [ \r\n\t $] + -> skip ;
