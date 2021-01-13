import java.util.Scanner;
import java.text.*;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: Create a program that displays a receipt with a user inputed time, date, items, and price. 
 * 				It should also display the total with tax 
 */
public class Lab_2_Question_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables 
		double number1 = 0, number2 = 0, number3 = 0, number4 = 0;		// Variables for numbers
		double tax;                                                     // Variable for tax 
		double total_no_tax; 	                                        // Variable for price without tax
		double tax_amount;                                              // Variable for tax amount (price of tax) 
		double total; 			                                        // Variable for total 						
		String name1, name2, name3, name4;		                        // Variables for name of food
		String date;						                            // Variables for date 
		String time; 		                                            // Variables for time  
		
		// Setup decimal formating
		DecimalFormat twoDecimals = new DecimalFormat ("0.00"); 
		
		// Setup input for numbers 
		Scanner input1 = new Scanner(System.in);
		
		// Setup input for the name of food
		Scanner input = new Scanner(System.in);
		
		// Setup input for date
		Scanner input2 = new Scanner(System.in);
		
		// Setup input for time 
		Scanner input3 = new Scanner(System.in);
		
		// Prompt for date 
		System.out.println("Enter the Date today - dd/mm/yyyy");
		
		
		// get date 
		date = input2.nextLine();
	
		// Prompt for time
		System.out.println("Enter the Time today - hh:mm");
		
		// get time
		time = input3.nextLine();
		
		// Prompt for name of items in order
		System.out.println("Enter the names of 4 food items bought (Press enter after each one)");
		
		// get items 
		name1 = input.nextLine();
		name2 = input.nextLine();
		name3 = input.nextLine();
		name4 = input.nextLine();
		
		// Prompt for price of food in order
		System.out.println("Enter the price of the foods listed in order (Without '$')");
		
		// get price for foods 
		number1 = input1.nextDouble();
		number2 = input1.nextDouble();
		number3 = input1.nextDouble();
		number4 = input1.nextDouble();
		
		
		// display message
		System.out.println("Thank you!");
		
		// declare tax 
		tax = 0.13; 
		
		// add prices together 
		total_no_tax = number1 + number2 + number3 + number4;
		tax_amount = (number1 + number2 + number3 + number4) * tax; 
		total = total_no_tax + tax_amount;  
		
		// display results 
		System.out.println("Welcome " + "Here is the receipt for your purchases today\n" + "\n" + "     Super Supermarket    \n" + date + "\t\t" + time + "\n");  
		System.out.println(name1 + "\t\t" + "$" + (twoDecimals.format(number1)) + "\n" + name2 + "\t\t" + "$" + (twoDecimals.format(number2)) + "\n" + name3 + "\t\t" + "$" + (twoDecimals.format(number3)) + "\n" + name4 + "\t\t" + "$" + (twoDecimals.format(number4))); 
		System.out.println("\n" + "-----------------" + "\n" + "sub-total" +  "\t" + "$" + (twoDecimals.format(total_no_tax)) + "\n" + "HST" + "\t\t" + "13%" + "\n" + "-----------------");  
		System.out.println("\n" + "Tax amount" + "\t" + "$" +(twoDecimals.format(tax_amount)) + "\n" + "Total" + "\t\t" + "$" + (twoDecimals.format(total)) + "\n" + "Thank you for shopping!");

	}

}
