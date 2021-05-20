grammar Calctest;
start : exp { System.out.println("Syntatically correct ");} ;
exp : exp f exp
| ;
f : LPAREN exp RPAREN;



LPAREN : '(' ;
RPAREN : ')' ;
WS : [ \r\n\t] + -> skip ;
