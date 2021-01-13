import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.String;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Descritption: This program calculates the length of the hypotenuse 
 */
public class Lab_2_QuestionB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables 
		double number1, number2, number3; 								// Declare variables for values 
		int a = 0, b = 0; 									    		// Declare variables for letters for math 
		Double a1,b1,c1;  		                                        // Declare variables for letters for text
		String c; 													    // Declare variable for c (hypotenuse) 
		String hypotenuse;											    // Declare variable for hypotenuse
		double product; 												// Declare varibale for sum of values 
		
		// Setup Decimal format 
		DecimalFormat twoDecimals = new DecimalFormat ("0.00");
		
		
		// Setup input for values 
		Scanner input1 = new Scanner(System.in); 
		
		// Setup input for letters 
		Scanner input2 = new Scanner(System.in);
		
		// Setup input for letters squared 
		Scanner input3 = new Scanner(System.in); 
		
		// Setup input for hypotenuse 
		Scanner input4 = new Scanner(System.in); 
		
		// Setup input for c (hypotenuse) 
		Scanner input5 = new Scanner(System.in);
		
		
		// prompt for  a and b values for triangle 
		a1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the 'a' value for the triangle")); 
		b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the 'b' value for the triangle")); 
		

		
		// Math
		double hypResult = (Math.sqrt(a1 * a1 + b1 * b1)); 
		
		// Display results 
		String hyp = "Here are the results!\n" + "c = " + "\t\t" + hypResult;
		
		JOptionPane.showMessageDialog(null, hyp);
		
		 
		
		
		
		
		
		

	}

}
