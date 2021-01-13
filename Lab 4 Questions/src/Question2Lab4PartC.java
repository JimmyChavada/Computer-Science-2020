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
public class Question2Lab4PartC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare Variables 
		int total = 0, timesTable = 0, counter = 0; 
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter the multiplication table you want to see: ");
		timesTable = input.nextInt(); 
		System.out.println("Enter the value you would like to go up to: ");
		counter = input2.nextInt(); 

		for (int i = 1; i <= counter; i++) {
			total=0;
			for(int j=1; j <= i; j++) {
//				System.out.println("the j val is: " + j + "and i: " + i);
				total = total+timesTable;
			}
			
			System.out.println(timesTable + "x" + i + "=" + total);
			
			

		}
	}

}