lexer grammar pan ;
T:[A-Z][A-Z][A-Z];
F:'C'|'P'|'H'|'F'|'A'|'T'|'B'|'L'|'J'|'G';
FI:[A-Z];
SSEN:[0-9][0-9][0-9][0-9];
PAN:(T)(F)(FI)(SSEN)(FI) {System.out.println("\nPan no. valid");};
WS:[\t\r\n]+ ->skip;