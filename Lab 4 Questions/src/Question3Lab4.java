import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Oct 2020
 * Description: use for loops and nested for loops to write song in the console
 */
public class Question3Lab4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare variables 
		String line = "I’m all about that loop, about that loop, about that loop, about that loop, no trouble";
		int userInput;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("How many lines of the song would you like to repeat?");
		userInput = input.nextInt();
		
		System.out.println("Because you know,");
		
		for (int i = 1; i <= userInput; i++) {
			System.out.println(line);
		}
		System.out.println("Yeah it’s pretty clear, I can do all that looping now…");
		
		

		

	}

}
