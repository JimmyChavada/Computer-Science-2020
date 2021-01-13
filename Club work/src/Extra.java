import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 *
 */
public class Extra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apples = 0; 
		int bananas = 0; 
		int threePoint = 3, twoPoint = 2, onePoint = 1; 
		int threePointb = 3, twoPointb = 2, onePointb = 1; 
		
		Scanner input = new Scanner (System.in); 
		Scanner input1 = new Scanner (System.in); 
		Scanner input2 = new Scanner (System.in); 
		Scanner input3 = new Scanner (System.in); 
		Scanner input4 = new Scanner (System.in); 
		Scanner input5 = new Scanner (System.in); 
		
		
		threePoint = input.nextInt(); 
		twoPoint = input1.nextInt(); 
		onePoint = input2.nextInt(); 
		
		threePointb = input3.nextInt(); 
		twoPointb = input4.nextInt(); 
		onePointb = input5.nextInt(); 
		
		int aTotal = threePoint + twoPoint + onePoint;
		int bTotal = threePoint + twoPoint + onePoint; 
		
		if (aTotal > bTotal) {
			System.out.println("A");
		}
		else if (bTotal > aTotal) {
			System.out.println("B");
		}
		else if (aTotal == bTotal) {
			System.out.println("T");
		}
		
		
	}

}
