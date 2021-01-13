import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Oct 2020
 * Description: This class displays the happy birthday song.
 * this program allows us to put program into the public statics, this then allows us to
 * repeat our code without actually typing everything out, rather we just call the function
 * and this will make it much more smaller and efficient 
 */
public class BirthdayJingle {
	public static void sayHappy() {
		System.out.println("Happy birthday to you!");
	}
	
	// takes in arguement
	public static void greeting(String name) {
		System.out.println("Happy birthday dear..." + name + "!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name; 
		name = JOptionPane.showInputDialog(null, "Enter you name!"); 
		
		// call function
		sayHappy(); 
		sayHappy();
		sayHappy();
		greeting(name);
		sayHappy();

	}

}
