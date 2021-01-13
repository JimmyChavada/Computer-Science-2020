import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: This program allows the user to enter a name and 2 integers (whole numbers)
 * 				And displays the sum of the integers. 
 *
 */
public class IntegerAddition1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number1, number2;  // declaring variables for numbers and name
		String userName;
		int sum;  			  // variable for the result
		
		// setting up the input for the name
		Scanner input = new Scanner(System.in);
		
		
		// setting up input for the integers 
		Scanner input1 = new Scanner (System.in);
		
		// prompt user for their name
		System.out.println("Enter your name");
		
		// get the user's name
		userName = input.nextLine();
		
		// prompt for the first number
		System.out.println("Enter the first number");
		
		// get the user's number 
		number1 = input1.nextInt();
		
		// prompt for the second number
		System.out.println("Enter the second number");
		
		// get the user's number
		number2 = input1.nextInt();
		
		// add the two numbers 
		sum = number1 + number2;
		
		// Display results
		System.out.println("Hello" + " " + userName + "\nThe sum of" + " " + number1 + " + " + " " + number2 + " =  " + " " + sum);
		
		
		
		
	}

}
