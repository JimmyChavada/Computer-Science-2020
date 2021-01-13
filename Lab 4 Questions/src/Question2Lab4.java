import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: This program allows the user to enter a times table that they want to display
 */
public class Question2Lab4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare Variables
		int num = 5; 
		int total = 0, timesTable = 0, counter = 0; 
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter the multiplication table you want to see: ");
		timesTable = input.nextInt(); 
		System.out.println("Enter the value you would like to go up to: ");
		counter = input2.nextInt(); 

		for (int i = 1; i <= counter; i++) {
			total = timesTable * i;
			System.out.println(timesTable + " x " + i + " = " + total);
		}
	}

}
