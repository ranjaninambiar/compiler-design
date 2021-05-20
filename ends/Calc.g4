grammar Calc;
@header {
import java.util.HashMap;
import java.util.*;
}
@members {
/** Map variable name to Integer object holding value */
ArrayList<String> v = new ArrayList<String>();
HashMap memory = new HashMap();
void print(String value) {
	System.out.println(value);
}
}
start : l+  ;
l returns [int val]: expr NEWLINE{System.out.println("Evaluated expr is"+$expr.val);}
| ID '=' expr NEWLINE {memory.put($ID.text, new Integer($expr.val));}
| NEWLINE
;

expr returns [int val] : term exprp[$term.val] {$val = $exprp.syn;}
;
exprp [int inh] returns [int syn] : {print("+");} '+' term e1p=exprp [$inh + $term.val] {$syn = $e1p.syn;
	try{int index = v.size() - 2;
	print(v.remove(index));
	print(v.remove(index));}
	catch (Exception e) {
}
	
	
	
}
|{print("-");} '-' term e1p=exprp [$inh - $term.val] {$syn = $e1p.syn;
	try{
	int index = v.size() - 2;
	print(v.remove(index));
	print(v.remove(index));
}catch (Exception e) {
}

}
| {$syn = $inh;}
;
term returns [int val] : fact termp[$fact.val] { $val = $termp.syn; }
;
termp [int inh] returns [int syn] : {print("*");} '*' fact t1p=termp [$inh * $fact.val] { $syn = $t1p.syn;
	try{
	int index = v.size() - 2;
	print(v.remove(index));
	print(v.remove(index));}
	catch (Exception e) {
}
	
	
}
|{print("/");} '/' fact t1p=termp [$inh / $fact.val] { $syn = $t1p.syn;
	try{
	int index = v.size() - 2;
	print(v.remove(index));
	print(v.remove(index));
}
catch (Exception e) {
}

}
| { $syn = $inh; }
;
fact returns [int val] : LP expr RP {$val= $expr.val;}
| NUM { $val = Integer.parseInt($NUM.text); 
	v.add($NUM.text);
}
| ID
{
Integer v = (Integer)memory.get($ID.text);
if ( v!=null ) $val = v.intValue();
else System.err.println("undefined variable "+$ID.text);
}

;
LP : '(';
RP : ')';
ID : ('a'..'z'|'A'..'Z')+ ;
NEWLINE:'\r'? '\n' ; 
NUM : '0'.. '9'+ ;
WS : [ \r\n\t] + -> skip ;
