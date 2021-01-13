import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Oct 2020
 * Description: 
 * Method Lists: 
 * 				Lab6Part2Q2
 * 				void pain (Graphics g)
 * 				void drawBuilding (Graphics g, int x, int y)
 * 				void main (String[] args)
 */
public class Lab6PartAQ2 extends JFrame {

	/**
	 * This program draws a black building with 4 yellow windows and a blue door 
	 * and draws 3 cars in a manner pleasing to the eye
	 * 
	 */
	public Lab6PartAQ2() {
		// name window and set size
		super("Lab 6 Question 2"); 
		setSize(800, 600);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE); // color of background
		g.fillRect(0, 0, 800, 800);
		
		drawBuilding(g, getX(), getY()); 
		
		// set position of building
		int x = 100; 
		int y = 100; 
		
		// Make road for cars
		Color c = Color.DARK_GRAY;
		g.setColor(c);
		g.fillRect(15, 300, 800, 250);
		
		// Make yellow line in road
		c = Color.yellow;
		g.setColor(c); 
		g.fillRect(15, 400, 800, 25);
		
		// draw first car
		c = Color.RED;
		g.setColor(c);
		g.fillRect(100, 300, 100, 30); // draws the body of the car
		g.setColor(Color.BLUE);
		g.fillRect(100 + 25, 300 - 20, 50, 20); // draws the window of the car
		g.setColor(Color.BLACK);
		g.fillOval(100 + 10, 300 + 25, 25, 25);  // draws the wheels
		g.fillOval(100 + 65, 300 + 25, 25, 25);  // draws the wheels
		g.setColor(Color.YELLOW);
		g.fillRect(100 + 90, 300 + 10, 10, 10); // draws headlights
		
		// draw second car
		c = Color.ORANGE;
		g.setColor(c);
		g.fillRect(400, 300, 100, 30); // draws the body of the car
		g.setColor(Color.BLUE);
		g.fillRect(400 + 25, 300 - 20, 50, 20); // draws the window of the car
		g.setColor(Color.BLACK);
		g.fillOval(400 + 10, 300 + 25, 25, 25);  // draws the wheels
		g.fillOval(400 + 65, 300 + 25, 25, 25);  // draws the wheels
		g.setColor(Color.YELLOW);
		g.fillRect(400 + 90, 300 + 10, 10, 10); // draws headlights
		
		// draw third car
		c = Color.BLACK;
		g.setColor(c);
		g.fillRect(365, 500, 100, 30); // draws the body of the car
		g.setColor(Color.BLUE);
		g.fillRect(365 + 25, 500 - 20, 50, 20); // draws the window of the car
		g.setColor(Color.BLACK);
		g.fillOval(365 + 10, 500 + 25, 25, 25);  // draws the wheels
		g.fillOval(365 + 65, 500 + 25, 25, 25);  // draws the wheels
		g.setColor(Color.YELLOW);
		g.fillRect(365 + 90, 500 + 10, 10, 10); // draws headlights
		
	}
	/*
	 * Method to draw building 
	 */
	
	public static void drawBuilding (Graphics g, int x, int y) {
		
		int x1 = 100; 
		int y1 = 100; 
		
		// draw first building 
		Color c = Color.BLACK; 
		g.setColor(c); 
		g.fillRect(x1, y1, 100, 150);
		g.setColor(Color.BLUE); // set color for door
		g.fillRect(x1 + 45, y1 + 110, 30, 40); // set location for door
		g.setColor(Color.YELLOW); // set color for windows
		g.fillRect(x1 + 20, y1 + 10, 20, 20); // set location for windows 
		g.fillRect(x1 + 70, y1 + 10, 20, 20);
		g.fillRect(x1 + 70, y1 + 60, 20, 20);
		g.fillRect(x1 + 20, y1 + 60, 20, 20);
		
		// draw second building
		x1 = x1 + 200; 
		c = Color.DARK_GRAY; 
		g.setColor(c); 
		g.fillRect(300, 100, 100, 150);
		g.setColor(Color.BLUE);
		g.fillRect(x1 + 45, y1 + 110, 30, 40);
		g.setColor(Color.YELLOW);
		g.fillRect(x1 + 20, y1 + 10, 20, 20);
		g.fillRect(x1 + 70, y1 + 10, 20, 20);
		g.fillRect(x1 + 70, y1 + 60, 20, 20);
		g.fillRect(x1 + 20, y1 + 60, 20, 20);
		
		// draw third building
		x1 = x1 + 200; 
		c = Color.ORANGE; 
		g.setColor(c); 
		g.fillRect(500, 100, 100, 150);
		g.setColor(Color.BLUE);
		g.fillRect(x1 + 45, y1 + 110, 30, 40);
		g.setColor(Color.YELLOW);
		g.fillRect(x1 + 20, y1 + 10, 20, 20);
		g.fillRect(x1 + 70, y1 + 10, 20, 20);
		g.fillRect(x1 + 70, y1 + 60, 20, 20);
		g.fillRect(x1 + 20, y1 + 60, 20, 20);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// call window
		new Lab6PartAQ2(); 
		

	}

}
