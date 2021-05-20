grammar cl;
start : exp { System.out.println("Syntatically correct.Valid ");} ;

exp : exp (LS ) term
| exp (RS ) term
| term ;
term: factor (A) term
| factor (O) term
| factor (E) term
| factor ;
factor : (N) factor
| p ;
p : LPAREN exp RPAREN
| ID
| NUM;
N:'~';
LS:'>>';
RS:'<<';
O: '|';
A:'&';
E: '^';
ID: [A-Z a-z];
NUM: [0-9];
LPAREN : '(' ;
RPAREN : ')' ;
WS : [ \r\n\t] + -> skip ;
