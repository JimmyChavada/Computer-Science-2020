import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: This program that displays the price of a soccer game ticket based on
 * 				the ticket type (EB) early bird or (LM) last minute and the person's age 
 * 				12 and under or older than 12. 
 */
public class FifaWorldCupTickets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declaring variables for ticket type, age and cost 
		String ticketType = ""; 
		int age = 0; 
		double cost = 0; 
		
		DecimalFormat curr = new DecimalFormat("#.00");     // setting up for currency format 
		
		// Prompt user for ticket type 
		ticketType = JOptionPane.showInputDialog(null, "Enter Ticket Type - \"EB\" or \"LM\"");
		
		// ask for correct information if not correct not EB or LM
		while (!ticketType.equals("EB") && !ticketType.equals("LM")) {
			// wrong entry, prompt for ticket type again
			ticketType = JOptionPane.showInputDialog(null, "Error! Please enter \"EB\" or \"LM\"");
		}
		
		
		// Prompt for age
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
		
		while (age < 0 || age > 150) {
			// prompt for a valid age 
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "Error! Please enter a valid age between 0 and 150")); 
		}
		
		// Checking for the ticket type 
		if (ticketType.equals("EB")) {
			// early bird 
			if (age <= 12) {
				cost = 70.00; 
			}
			else if (age > 12) {
				cost = 150.00;
			}
		}
		else if (ticketType.equals("LM")) {
			// last minute 
			if (age <= 12) {
				cost = 500.00; 
			}
			else if (age > 12) {
				cost = 1000.00;	
			}
		}
		// Display the cost
		JOptionPane.showMessageDialog(null, "The cost of your ticket is: " + " " + "$" + curr.format(cost));  
	}

}
