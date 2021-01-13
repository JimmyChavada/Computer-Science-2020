import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 *
 */
public class FirstQuestion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables 
		int small; 
		int medium; 
		int large; 
		int score; 
		
		
		Scanner input = new Scanner(System.in); 
		
		small = input.nextInt(); 
		medium = input.nextInt(); 
		large = input.nextInt();
		
		score = (1*small) + (2*medium) + (3*large); 
		
		if(score >= 10) {
			System.out.println("Happy!");
			
		}
		else {
			System.out.println("Sad!");
		}
		
	}

}
