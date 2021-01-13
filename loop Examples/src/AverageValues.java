import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: sept 2020
 * Description: this program calculates the average of several positive numbers. and the user will
 * 				be asked to enter one number after another and stop with a negative number. 
 */
public class AverageValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare the variables for average, total and the number
		double average = 0, total = 0, number = 0;
		// declare a variable for the counter of the numbers
		int counter = 0;
		
		// prompt for the first value 
		number = Double.parseDouble(JOptionPane.showInputDialog(null, "enter a number. Stop with a negative")); 
		
		// repeat while number is greater than or equal to 0
		while (number >= 0) { 
			counter = counter + 1;  // counts the numbers entered
			total = total + number; // sum of the numbers (accumulator)
			
			// prompt for the next value 
			number = Double.parseDouble(JOptionPane.showInputDialog(null, "enter a number. Stop with a negative")); 
			
		}
		
		average = total / counter;  // calculates the average 
		
		// display the average 
		JOptionPane.showMessageDialog(null, "The average is: " + average);
		
		
		
		

		
		
	}

}
