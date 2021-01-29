package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class tabledrivenscanner {
	static int charMap(char str) {
		if (str == 'r')
			return 0;          
		if (str >= '0' && str <= '9')
			return 1;
		return 2;
	}
	
	
public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> state = new ArrayList<Integer>(5);
		state.add(0);
		String lexeme="";
		ArrayList<String> stack = new ArrayList<>();
		stack.add("bad");
		
		ArrayList<Integer> sa = new ArrayList<Integer>(1);
		sa.add(2);
		
		int[][] transition_table = { 
				{ 1, -1, -1 },
				{ -1, 2, -1 },
				{ -1, 2, -1 }, 
				{ -1, -1, -1 } };
			// invalid  state are -1
		int i=0;
		HashMap<Integer, String> final_state = new HashMap<>();
		
		System.out.println("Input the string:");
		String str = scanner.nextLine();
		int current_state=0;
		char c ;
		while(state.get(state.size()-1)!=-1) {
			try {
				c = str.charAt(i);
				lexeme+=c;}
			catch(Exception e){
				state.add(-1);
				c='E';
				lexeme+=c;
			}
			if(sa.contains(state.get(state.size()-1))) {
				stack.clear();
				stack.add("bad");
				
				}
			if(stack.get(stack.size()-1)!=Integer.toString(state.get(state.size()-1))) 
			stack.add(Integer.toString(state.get(state.size()-1)));
			current_state = transition_table[current_state][charMap(c)];
			
			if(state.get(state.size()-1)!=current_state) 
				state.add(current_state);

			System.out.println("lexeme--"+lexeme);
			System.out.println("stack--"+stack);
			System.out.println("state--"+state);
			i+=1;
			
			
		}
		
		while(!(sa.contains(state.get(state.size()-1))) && !(stack.get(stack.size()-1)=="bad")){
			System.out.println("Rollbacking");
			
			state.remove(state.size()-1);
			try {
				lexeme=lexeme.substring(0, lexeme.length() - 1);}
				catch(Exception e) {
					System.out.println("Input rejected");
					System.out.println("No part of lexeme accepted...");
				break;}
			
			str=str.substring(0, str.length() - 1);
			
			if(state.isEmpty()) {
				System.out.println("Input rejected");
				System.out.println("No part of lexeme accepted...");
				break;
				}
			
			System.out.println("lexeme--"+lexeme);
			System.out.println("stack--"+stack);
			System.out.println("state--"+state);
			if(sa.contains(state.get(state.size()-1))) {
				
				System.out.println("Input accepted");
				System.out.println("Part of lexeme accepted..."+lexeme);
				
				break;
			}
			}

}}
