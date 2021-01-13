import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 * Description: Calculates the area of a circle 
 * allows for us to not reuse the code, instead allows us to use the calcArea to bring 
 * the code inside. upper case is always class, lower case is function.
 */
public class AreaOfCircle {
	
	public static double calcArea(double radius) {
		 final double PI = 3.14259; // to make constant
		 double area;
		 area = PI * Math.pow(radius, 2); // calculates the area 
		 return area; // returns the area that is a double, therefore gives back double removes error
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables for radius and area 
		double r, a;
		String unit = "";
		
		// prompt user for radius
		// convert string into double (can use IO.java)
		r = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the radius for the first circle!"));
		unit = JOptionPane.showInputDialog(null, "Enter the unit of measurment for the radius");
		
		// calculate user inputed radius for area of circle from the function made 
		a = calcArea(r);
		
		// display the area of the circle
		JOptionPane.showMessageDialog(null, "The area of the first circle is " + a + unit + "^2");
		
		
		// prompt for radius of another circle 
		r = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the radius for the second circle!"));
		unit = JOptionPane.showInputDialog(null, "Enter the unit of measurment for the radius");
		
		// calc the area of the second circle 
		a = calcArea(r); 
		
		// display the area of the second circle
		JOptionPane.showMessageDialog(null, "The area of the second circle is " + a + unit + "^2");

		
	}

}
