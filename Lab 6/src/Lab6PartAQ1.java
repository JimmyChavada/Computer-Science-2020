import javax.swing.JOptionPane;

/**
 *
 */

/**
 * @author Jimmy Chavada
 * Date: Oct 2020
 * Description: This program allows the user to enter their salary
 * and percentage increase
 *
 * Method List: 
 * 				double calculatePercentage(double increaseRate, double salary) - calculate the total raise
 * 				void main(String[] args) 
 */
public class Lab6PartAQ1 {


	/*
	 * This block of code takes in the users salary and percentage in which they
	 * got the increase ex. ($2000, 10%)
	 * it calculates the total amount of money they got a raise
	 */
	public static double calculatePercentage(double increaseRate, double salary) {
		// declare any variables used for the calculation
		double totalRaise;

		return totalRaise = salary + (salary * increaseRate/100);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare varibales 
		double userEnteredSalary = 0, userEnteredIncreaseRate = 0; // variable for user inputted salary and raise
		double userTotalRaise = 0, userTotal; // variable for users total raise and total salary
		int entries = 3, counter = 0; // variable for entries and counter 

		JOptionPane.showMessageDialog(null, "Welcome to the salary calculator, please enter the salary and increase of 3 people. Press enter to continue");

		
		// prompt for user input 3 times and display users salary increase and total salary increase each time 
		for (int i = 0; i <= entries; i++) {
			// prompt for the users salary this year
			userEnteredSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your salary this year! Without \"$\" sign!"));
			// prompt for the users increase rate this year
			userEnteredIncreaseRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the percentage you had an increase! Without \"%\" sign!"));
			// calculate the users total raise
			userTotalRaise = userTotalRaise + calculatePercentage(userEnteredSalary, userEnteredIncreaseRate);
			userTotal = userEnteredSalary  + calculatePercentage(userEnteredSalary, userEnteredIncreaseRate);

			// display the total raise
			JOptionPane.showMessageDialog(null, ("Your salary has been raised by: " + userTotalRaise + " Dollars!"));
			JOptionPane.showMessageDialog(null, "Your new salary is "+ userTotal + " dollars per year!");
			counter++;

			// if statement to check if counter is 3
			if (counter == 3) { 
				break;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Thank you for using the program goodbye!");
	}

}
