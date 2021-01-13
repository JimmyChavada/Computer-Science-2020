/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: sept 2020
 * Description: Several examples of for loops
 */
public class ForLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// a while loop to display 10 integers
		int i;
		i = 1; 
		
		while (i <= 10) {
			System.out.println(i);
			i = i + 1; 
		}
		System.out.println("End of while loop \n");
		
		
		
		// converting to a for loop
		for (int j = 100; j >= 0; j = j - 10) {
			System.out.println(j);
		}

	}

}
