import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Oct 2020
 * Description: This program draws a number of cars on a window 
 */
public class DrawingCarExample extends JFrame{

	/**
	 * constructor which builds the window for drawing
	 */
	public DrawingCarExample() {
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
		
		// first car (red)
		Color c = Color.RED;
		g.setColor(c);
		g.fillRect(x, y, 100, 30); // draws the body of the car
		g.setColor(Color.BLUE);
		g.fillRect(x + 25, y - 20, 50, 20); // draws the window of the car
		g.setColor(Color.BLACK);
		g.fillOval(x + 10, y + 25, 25, 25);  // draws the wheels
		g.fillOval(x + 65, y + 25, 25, 25);  // draws the wheels
		g.setColor(Color.YELLOW);
		g.fillRect(x + 90, y + 10, 10, 10); // draws headlights
		
		x = x + 200; // position of new car 
		c = Color.ORANGE;
		g.setColor(c);
		g.fillRect(x, y, 100, 30); // draws the body of the car
		g.setColor(Color.BLUE);
		g.fillRect(x + 25, y - 20, 50, 20); // draws the window of the car
		g.setColor(Color.BLACK);
		g.fillOval(x + 10, y + 25, 25, 25);  // draws the wheels
		g.fillOval(x + 65, y + 25, 25, 25);  // draws the wheels
		g.setColor(Color.YELLOW);
		g.fillRect(x + 90, y + 10, 10, 10); // draws headlights
		
		y = y + 200; // position of new car
		c = Color.GREEN;
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
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// calls window into the main to show it
		new DrawingCarExample(); 

	}

}
