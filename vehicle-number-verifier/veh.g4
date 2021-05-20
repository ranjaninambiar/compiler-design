lexer grammar veh;
STATE:'TN'{System.out.println("Tamil Nadu");}
		|'KL'{System.out.println("Kerala");}
		| 'DL'{System.out.println("Delhi");}
		| 'MH'{System.out.println("Maharashtra");};
D:[0-9][0-9];
T:[A-Z][A-Z];
NUM:[0-9][0-9][0-9][0-9];
S: ' ';
VEHNO:(STATE)(S)(D)(S)(T)(S)(NUM){System.out.println("Vehicle no. valid");};
WS:[\t\r\n] -> skip;
