import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 *
 */
public class SecondQuestion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int limit = input.nextInt();		
		int infected = input.nextInt();	
		int infectedRate = input.nextInt();	
		
		input.close(); 
		
		int day = 0;
		
		double total = infected; 
				
		if (total >= limit) {
			System.out.println(1);
		}
		else {
		
		while (total >= limit) {
			day++;
			
			total = total + (Math.pow(infectedRate,  day)* infected); 
		}
	System.out.println(day);
		

	}
	}

}
