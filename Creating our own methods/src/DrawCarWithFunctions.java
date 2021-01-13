import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 * Description: Draws cars using methods
 */
public class DrawCarWithFunctions extends JFrame{

	/**
	 * constructor which builds the window for drawing
	 */
	public DrawCarWithFunctions() {
		//calls window and names it
		super("Drawing some cars");
		setSize(400, 400); // set size of window
		setVisible(true); // make visible
	}

	/**
	 * Create paint function 
	 */
	public void paint(Graphics g) { 
		g.setColor(Color.WHITE); // draw a white background
		g.fillRect(0, 0, 400, 400); // set positioning

		// starting point of the car 
		int x = 50; 
		int y = 50;  
		Color c; 
		
		
		// draw the red car 
		c = Color.red;
		drawCar(g, x, y, c); // call the method to draw the car
		
		// draw the orange car
		x = x + 200;
		c = Color.orange; 
		drawCar(g, x, y, c); // call the method to draw the car
		
		// draw the green car
		y = y + 200;
		c = Color.GREEN;
		drawCar(g, x, y, c); // call the method to draw the car
		
		// draw a magenta car at x 50 and y at 250 with a name 
		x = 50;
		c = Color.MAGENTA;
		drawCar(g, x, y, c, "Jimmy"); 
		
		
		
	}
	
	public static void drawCar(Graphics g, int x, int y, Color c) { 
		g.setColor(c);
		g.fillRect(x, y, 100, 30); // draws the body of the car
		g.setColor(Color.BLUE);
		g.fillRect(x + 25, y - 20, 50, 20); // draws the window of the car
		g.setColor(Color.BLACK);
		g.fillOval(x + 10, y + 25, 25, 25);  // draws the wheels
		g.fillOval(x + 65, y + 25, 25, 25);  // draws the wheels
		g.setColor(Color.YELLOW);
		g.fillRect(x + 90, y + 10, 10, 10); // draws headlights
		
	}
	
	
	public static void drawCar(Graphics g, int x, int y, Color c, String name) {
		g.setColor(c);
		g.fillRect(x, y, 100, 30); // draws the body of the car
		g.setColor(Color.BLUE);
		g.fillRect(x + 25, y - 20, 50, 20); // draws the window of the car
		g.setColor(Color.BLACK);
		g.fillOval(x + 10, y + 25, 25, 25);  // draws the wheels
		g.fillOval(x + 65, y + 25, 25, 25);  // draws the wheels
		g.drawString(name, x + 30, y + 20); // draws the name on the car
		g.setColor(Color.YELLOW);
		g.fillRect(x + 90, y + 10, 10, 10); // draws headlights
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// calls window into the main to show it
		new DrawCarWithFunctions(); 

	}

}
