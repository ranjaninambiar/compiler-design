package sample;
import java.util.HashMap;
import java.util.Scanner;

public class HelloWorld{

     static int charMap(char str) {
		if (str == 'i')
			return 0;          
		if (str == 'f')
			return 1;
		if (str >= 'a' && str <= 'z')
			return 2;
		if (str == '.') 
			return 3;
		if (str >= '0' && str <= '9')
			return 4;
		if (str == '-')
			return 5;
		if (str == '\n')
			return 6;
		if (str == ' ')
			return 7;
		return 8;
	}

	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, String> final_state = new HashMap<>();
		
		int[][] transition_table = { 
			{ 2, 4, 4, 5, 7, 9, -1, 12, 13 },
			{ 4, 3, 4, -1, 4, -1, -1, -1, -1 },
			{ 4, 4, 4, -1, 4, -1, -1, -1, -1 }, 
			{ 4, 4, 4, -1, 4, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, 6, -1, -1, -1, -1 }, 
			{ -1, -1, -1, -1, 6, -1, -1, -1, -1 },
			{ -1, -1, -1, 8, 7, -1, -1, -1, -1 }, 
			{ -1, -1, -1, -1, 8, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, 10, -1, -1, -1 }, 
			{ 10, 10, 10, -1, -1, -1, 11, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1 }, 
			{ -1, -1, -1, -1, -1, -1, -1, 12, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1 } };
		// invalid  state are -1
		
		final_state.put(2, "ID");
		final_state.put(3, "IF");
		final_state.put(4, "ID");
		final_state.put(5, "error");
		final_state.put(6, "REAL");
		final_state.put(7, "NUM");
		final_state.put(8, "REAL");
		final_state.put(9, "error");
		final_state.put(11, "white space");
		final_state.put(12, "white space");
		final_state.put(13, "error");
		
		char c;
		int current_state = 1;
		
		System.out.println("Input the string:");
		String str = scanner.nextLine();
		System.out.println("Transition States");
		System.out.print(current_state + "->");
		
		
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			current_state = transition_table[current_state - 1][charMap(c)];
			if (current_state == -1) {
				System.out.println("Trap State");
				break;
			} else
				System.out.print(current_state + "->");
		}
		if (final_state.containsKey(current_state))
			{System.out.println();
			System.out.println("Token Accepted, FINAL STATE : " + final_state.get(current_state));
			}
		else
			System.out.println("Token Rejected");

		scanner.close();
	}}
