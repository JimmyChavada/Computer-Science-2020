import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jimmy 
 *
 */
public class Work {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws IOException{
		// setup keyboard input 
		BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in)); 

		// declare input and number of drops with the buffered reader 
		int numberOfDrops = Integer.parseInt(keyboard.readLine()); 

		// variable array for drops, x coordinates and y coordinates 
		String drops[] = new String [numberOfDrops];
		int dropsX[] = new int [numberOfDrops];
		int dropsY[] = new int [numberOfDrops];

		for (int i = 0; i < numberOfDrops; i++) {

			//splits all drops coordinates into first part for X and second for Y 
			drops = keyboard.readLine().split(","); 

			// x coordinate declared as first part of drop before comma 
			// y coordinate declared as second part of drop before comma 
			dropsX[i] = Integer.parseInt(drops[0]);
			dropsY[i] = Integer.parseInt(drops[1]);

			for (int j = 0; j < numberOfDrops; j++) {
				
				for (int k = 0; k < numberOfDrops ; k++) {
					
					if(dropsX[k] > dropsX[k] + 1) {
						int tempNum = dropsX[k];
						dropsX[k] = dropsX[k+1];
						dropsX[k+1] = tempNum;
					}
					if(dropsY[k] > dropsY[k] + 1) {
						int tempNum = dropsY[k];
						dropsY[k] = dropsY[k+1];
						dropsY[k+1] = tempNum;
					}
				}
			}
				System.out.println((dropsX[0] -1 ) + "," + (dropsY[0] -1) + "\n" + (dropsX[numberOfDrops-1] +1)+ "," + (dropsY[numberOfDrops -1] +1));
				
		}







	}

}