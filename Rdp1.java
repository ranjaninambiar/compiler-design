package sample;


import java.awt.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Rdp1 {

	private static StreamTokenizer tokens;
	  private static ArrayList<String> words=new ArrayList<String>();
	  private static int index=0;
	  private static String word;
	  public static void main(String[] args) throws IOException
	  {
		  Scanner scanner = new Scanner(System.in);
		  String[] tokenarr= {"id","name","*","/","+","-","(",")"};
		  
		  String str = scanner.nextLine();
		  String[] rw=str.split(" ");
		  for (int i=0;i<rw.length;i++) {
			  words.add(rw[i]);
		  }
		  words.add("$");
	    	  word=words.get(index);
	    	  System.out.println(words);
	    	  
	    	  if(expr()) {
	    		  //System.out.println("Final here"+word);
	    		  if(word.contentEquals("$"))
	    			  System.out.println("Success");
	    		  else
	    			  fail();
	    	  }
	    	  else
    			  fail();
	      }
	  private static void fail() {
		  System.out.println("Failure due to syntax error");
		  
	  }
	  
	  // expr - parse <expr> -> <term> <term_tail>
	  private static boolean expr() throws IOException
	  {
		  System.out.println("Expr");
	    if(term()) {
	    	//System.out.println("expr"+index);
	    	return(expr_tail());
	    }
	    else
	    	fail();
	    return false ;
	  }
	  
	  private static boolean expr_tail() throws IOException
	  {
		  System.out.println("EPrime");
		  word=words.get(index);
		  //System.out.println(word);
		  
	    if(word.contentEquals("+") || word.contentEquals("-")) {
	    	index+=1;
	    	word=words.get(index);
	    	if(term()) {
	    		return(expr_tail());
	    		
	    	}
	    	else
	    		fail();
	    }
	    else if(word.contentEquals(")") || word.contentEquals("$")) {
	    	//System.out.println("et here");
	    	return true;
	    	
	    	
	    }
	    else {
	    	//System.out.println("Expr_tail fail");
	    	fail() ;}
		return false;
	    	
	    	
	  }
	  
	  
	  
	  // term - parse <term> -> <factor> <factor_tail>
	  private static boolean term() throws IOException
	  {
		  System.out.println("Term");
	    if(factor())
	    	return(term_tail());
	    else
	    	fail();
	    return false;
	    	
	  }
	  // term_tail - parse <term_tail> -> <add_op> <term> <term_tail> | empty
	  private static boolean term_tail() throws IOException
	  {
		  System.out.println("TPrime");
		  word=words.get(index);
		  
	    if(word.contentEquals("*") || word.contentEquals("/")) {
	    	index+=1;
	    	word=words.get(index);
	    	if(factor()) {
	    		return(term_tail());
	    		
	    	}
	    	else
	    		fail();
	    }
	    else if(word.contentEquals("+") || word.contentEquals("-") || word.contentEquals(")") || word.contentEquals("$")) {
	    	return true;
	    	
	    	
	    }
	    else
	    	fail() ;
		return false;
	    	
	  }
	  // factor - parse <factor> -> '(' <expr> ')' | '-' <expr> | identifier | number
	  private static boolean factor() throws IOException
	  {
		  //System.out.println("factor"+index);
		  //System.out.println(words);
		  System.out.println("Factor");
		  word=words.get(index);
		  //System.out.println(word);
	    if(word.contentEquals("(")) {
	    	index+=1;
	    	word=words.get(index);
	    	if(!expr()){
	    		fail();
	    	}
	    	if(!(word.contentEquals(")"))) {
	    		fail();
	    	}
	    	
			index+=1;
			try {
			    word=words.get(index);}
		    catch(Exception e) {
			     System.out.println("Unsuccessful");
			     return false;}
			return true;
	    	
	    }
	    else if(word.contentEquals("num") ||word.contentEquals("id")) {
	    	//System.out.println("Here");
	    	index+=1;
			word=words.get(index);
	    	return true;
	    }
	    else {
	    	//System.out.println("factors fail");
	    	fail() ;}
		return false;
	  }
	 
	}
