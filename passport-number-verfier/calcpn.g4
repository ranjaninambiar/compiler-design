lexer grammar calcpn;
FI : 'A'|'B'|'C'|'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|'M'|'N'|'O'|'P'|'R'|'S'|'T'|'U'|'V'|'W'|'Y';
S  : [1-9];
T : [0-9];
SP: ' '| ;
AL : [A-Z a-z];
PN:(FI)(T)(T)(SP)(S)(T)(T)(T)(S){System.out.println("\nPassport no. is valid");};
PNNV:(AL)(T)(T)(SP)(T)(T)(T)(T)(T){System.out.println("\nPassport no. is not valid");};
WS:[\t\r\n]+ ->skip;