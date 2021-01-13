import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: Showing for loops inside other for loops 
 */
public class NestedLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int stars; 
		int lines; 
		
		stars = JOptionPane.showInputDialog(null, "How Many Stars?");
		
		 lines = JOptionPane.showInputDialog(null, "How Many Lines?");

		for (int j = 1; j <= lines; j++) {
			
			
			for (int i = 1; i <= stars; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
