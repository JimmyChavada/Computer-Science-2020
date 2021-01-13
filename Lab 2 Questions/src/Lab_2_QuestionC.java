import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.String;


/**
 * 
 */

/**
 * @author Jimmt Chavada
 * Date: Sept 2020
 * Descritpion: Create a program thats asks the user to enter 2 numbers, then displays its 
 * 				addition, subtraction, multiplication, and division
 */
public class Lab_2_QuestionC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables 
		double number1, number2; 
		double sum, product, difference, division; 
		
		// Decimal formatting
		DecimalFormat twoDecimals = new DecimalFormat ("0.00"); 
		
		// Setup input for number 1 
		Scanner input1 = new Scanner(System.in);
		
		// Setup input for number 2
		Scanner input2 = new Scanner(System.in);

		
		
		// Prompt for number1  
		System.out.println("Enter first number"); 
		
		// Get user's number and convert to double 
		number1 = Double.parseDouble(input1.next());

		
		// Prompt for number2
		System.out.println("Enter second number");
		
		// Get user's second number 
		number2 = Double.parseDouble(input2.next());

		
		
		// Math 
		sum = Double.parseDouble(twoDecimals.format((number1 + number2)));
		product = Double.parseDouble(twoDecimals.format((number1 * number2)));
		difference = Double.parseDouble(twoDecimals.format((number1 - number2)));
		division = Double.parseDouble(twoDecimals.format((number1 / number2)));;
		
		// Display results 
		System.out.println("\nHere are the results!\n");
		System.out.println("Adittion" + "\t\t" + sum +"\n");
		System.out.println("Multiplication" + "\t\t" + product + "\n");
		System.out.println("Subtraction" + "\t\t" + difference + "\n");
		System.out.println("Division" + "\t\t" + division + "\n");
		
		
		
	}

}
