import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: Create a program that will calculate the customer's 
 * 				bill including tax. 
 */
public class PizzaLab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables 
		int amountOfSlices = 0, amountOfPop = 0;
		double totalBill = 0; 
		double tax = 0; 
		double totalNoTax = 0; 
		double taxAmount = 0; 
		
		// Format decimal to 2 spaces
		DecimalFormat twoDecimals = new DecimalFormat ("0.00");
		
		// setup input for pizza and pop 
		Scanner inputPizza = new Scanner(System.in);
		Scanner inputPop = new Scanner(System.in);
		
		// declare tax
		tax = 0.13;
		
		// prompt for amount of pizza's 
		JOptionPane.showInputDialog(null, "Enter the amount of pizza slices wanted:");
		
		// get amount of pizza and pops 
		amountOfSlices = inputPizza.nextInt(); 
	
		// prompt for amount of pops 
		JOptionPane.showInputDialog(null, "Enter the amount of pops wanted:");
		
		// get amount of pops 
		amountOfPop = inputPop.nextInt(); 
		
		// if slices are under 3
		if (amountOfSlices < 3) {
			totalNoTax = (2.00 * amountOfSlices) + (0.5 * amountOfPop);       // total without tax for under 3 slices 
		} 
		// if slices are over 3
		else {
			totalNoTax = (1.00 * amountOfSlices) + (0.5 * amountOfPop);       // total without tax for over 3 slices
		}
		
		
		//add prices 
		taxAmount = (totalNoTax) * 0.13;                                      // amount of tax
		totalBill = totalNoTax + taxAmount;                                   // total without tax added with amount of tax for total bill
		
		// display results 
		JOptionPane.showMessageDialog(null, "\nHere is your total" + "\n" 
						  +  "Tax Amount" + "\t" + "$" + (twoDecimals.format(taxAmount)) + "\n"
						  + "Subtotal" + "\t" + "$" + (twoDecimals.format(totalNoTax)) +"\n"
				          + "Total" + "\t\t" + "$" + (twoDecimals.format(totalBill)));
		
		
		}
	

}