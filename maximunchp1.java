package sample;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class maximunchp1 {
	
	
	static int charMap(char str,int pos) {
		if( (str == 'C' || str == 'P' || str == 'H' || str == 'F' || str == 'A' || str == 'T' || str == 'B' || str == 'L' || str == 'J' || str == 'G') && pos==4)
			return 2;
		
		if (str >= 'A' && str <= 'Z')
			return 0;          
		if (str >= '0' && str <= '9')
			return 1;
	
		return 3;
	}
	
	static String catMap(char s) {
		if(s >= 'A' && s <= 'Z' )
			return "character";
		if(s >= '0' && s <= '9' )
			return "digit";
		
		return("Other");
		
	}
	
	
	
public static void main(String[] args) throws Exception {
	    
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> state = new ArrayList<Integer>();
		HashMap<Integer, String> token_table = new HashMap<>();
		
		state.add(0);
		String lexeme="";
		int row=0;
		int col=0;
		
		token_table.put(1, "invalid");
		token_table.put(2, "invalid");
		token_table.put(3, "invalid");
		token_table.put(4, "invalid");
		token_table.put(5, "invalid");
		token_table.put(6, "invalid");
		token_table.put(7, "invalid");
		token_table.put(8, "invalid");
		token_table.put(9, "invalid");
		token_table.put(10, "valid/accepting state");
		token_table.put(11, "invalid");
		
		
	
		
		
		
		
		ArrayList<ArrayList<String>> stack = new ArrayList<ArrayList<String>>();
		 stack.add(row, new ArrayList<>(Arrays.asList("bad","bad"))); 
		
		row+=1;
		String part="";
		int fi=0;
		ArrayList<Integer> sa = new ArrayList<Integer>();
		sa.add(10);
		
		
		Scanner sc = new Scanner(new BufferedReader(new FileReader("sample.txt")));
		
        
	      int rows = 12;
	      int columns = 4;
	      int [][] transition_table = new int[rows][columns];
	      while(sc.hasNextLine()) {
	         for (int i=0; i<transition_table.length; i++) {
	            String[] line = sc.nextLine().trim().split(" ");
	            for (int j=0; j<line.length; j++) {
	               transition_table[i][j] = Integer.parseInt(line[j]);
	            }
	         }
	      }
		/*
		int[][] transition_table = { 
				{ 1, -1, 5, -1},
				{ -1, 2, -1, -1},
				{ 3, -1, 5, -1 }, 
				{ -1, 4, -1, -1 },
				{ 3, -1, 5, -1 },
				{ -1, -1, -1, -1},
				{-1, -1, -1, -1}};*/
		
			// invalid  state are -1
		int i=0;
		
		System.out.println("Input the string:");
		String str = scanner.nextLine();
		int n = str.length();
		int current_state=0;
		char c ;
		int inppos=0;
		String[][] failed = new String[12][n+2];
		for(int k=0;k<7;k++) {
			for(int j=0;j<n+2;j++) {
				failed[k][j]="F";
			}
		}
		System.out.println("failed:"+Arrays.deepToString(failed));
		
		System.out.println("lexeme:"+lexeme);
		System.out.println("inppos:"+inppos);
		try {
		System.out.println("Category:"+catMap(lexeme.charAt(lexeme.length() - 1)));}
		catch(Exception e) {
			System.out.println("Category:"+catMap(' '));
		}
		System.out.println("stack:"+stack);
		System.out.println("state"+state);
		System.out.println("Next iter...");
		
		while(state.get(state.size()-1)!=-1) {
			try {
				c = str.charAt(i);
				lexeme+=c;}
			catch(Exception e){
				state.add(-1);
				c='E';
				lexeme+=c;
			}
			inppos+=1;
			try {
			if(failed[state.get(state.size()-1)][inppos]=="T")
				break;}
			catch(Exception e){
				//come to invalid state
				if(failed[row-1][inppos]=="T")
					break;
			}
			if(sa.contains(state.get(state.size()-1))) {
				stack.clear();
				row=0;
				
				}
			 stack.add(row, new ArrayList<>(Arrays.asList(Integer.toString(state.get(state.size()-1)), Integer.toString(inppos)))); 
			row+=1;
			
		
			current_state = transition_table[current_state][charMap(c,inppos)];
			
			if(state.get(state.size()-1)!=current_state) 
				state.add(current_state);
			System.out.println("lexeme:"+lexeme);
			System.out.println("inppos:"+inppos);
			try {
			System.out.println("Category:"+catMap(lexeme.charAt(lexeme.length() - 1)));}
			catch(Exception e) {
				System.out.println("Category:"+catMap(' '));
			}
			System.out.println("stack:"+stack);
			System.out.println("state"+state);
			System.out.println("Next iter...");
		
			//System.out.println("failed");
			//System.out.println(Arrays.deepToString(failed).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
			i+=1;
			
			
		}
		
		while(!(sa.contains(state.get(state.size()-1)))){
			System.out.println("Rollbacking");
			//if(state.get(state.size()-1)==-1){failed[row-1][inppos]="T";}
			//System.out.println("row"+state.get(state.size()-1));
			//System.out.println("inppos"+inppos);
			if(state.get(state.size()-1)==-1) {
				failed[6][inppos]="T";
				
			}
			else {
				failed[state.get(state.size()-1)][inppos]="T";
			}
			try {
			inppos=	 Integer. valueOf( stack.get(row-1).get(1));}
			catch(Exception e) {//this try catch block is to catch <bad,bad> from stack
				System.out.println("Input rejected");
				System.out.println("No part of lexeme accepted...");
				//System.out.println("Part of lexeme parsed succesfully:"+ part);

				break;
			}
			stack.get(row-1).remove(0);
			
			stack.get(row-1).remove(0);
			row-=1;
			
			state.remove(state.size()-1);
			try {
			lexeme=lexeme.substring(0, lexeme.length() - 1);
			}
			catch(Exception e) {
				System.out.println("Input rejected");
				System.out.println("No part of lexeme accepted...");
				//System.out.println("Part of lexeme parsed succesfully:"+ part);
			break;}
			str=str.substring(0, str.length() - 1);
			
			if(state.isEmpty()) {
				System.out.println("Input rejected");
				System.out.println("No part of lexeme accepted...");
				//System.out.println("Part of lexeme parsed succesfully:"+ part);

				break;
				}
			
			//System.out.println("failed:");
			//System.out.println(Arrays.deepToString(failed).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
			
			System.out.println("lexeme:"+lexeme);
			System.out.println("inppos:"+inppos);
			try {
			System.out.println("Category:"+catMap(lexeme.charAt(lexeme.length() - 1)));}
			catch(Exception e) {
				System.out.println("Category:"+catMap(' '));
			}
			System.out.println("stack:"+stack);
			System.out.println("state"+state);
			System.out.println("Next iter...");
			if(state.get(state.size()-1)==-1 && fi==0) {
				part=lexeme;
				fi=1;
			
			}
			}
		
		if(sa.contains(state.get(state.size()-1))) {
			
			System.out.println("Input accepted");
			System.out.println("Part of lexeme accepted..."+lexeme);
			System.out.println("Category:"+catMap(lexeme.charAt(lexeme.length() - 1)));
			System.out.println("Type of input(from token table)..."+token_table.get(state.get(state.size()-1)));
			
			
			
		}

}

}
