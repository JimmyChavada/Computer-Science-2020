/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 */
public class MathClassFunctionsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables
		double x, y, angleDeg, angleRad, sine, cos; 
		
		x = 4; 
		
		// finds absolute value
		y = Math.abs(x); 
		System.out.println(y);
		
		// rounds to nearest integer rounds up or down
		y = Math.round(x);
		System.out.println(y);
		
		// finds square root of x, change x to positive
		y = Math.sqrt(x);
		System.out.println(y);
		
		// raises x to the power of 2 or (b)
		y = Math.pow(x, 2);
		System.out.println(y);
		
		// angle degree is 45 degrees 90 to check
		angleDeg = 90;
		
		// radian of 45 (radians are measures of angles by how far distance they travel)
		y = Math.toRadians(angleDeg); 
		System.out.println(y);
		
		// to find sin of 45 degrees 90 to check
		sine = Math.sin(y);
		System.out.println(sine);
		
		// cos of 90 degrees 
		cos = Math.cos(y);
		System.out.println(cos);
		

	}

}
