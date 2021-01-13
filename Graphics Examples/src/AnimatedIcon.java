import java.awt.Color;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 */

/**
 * @author 652374
 * Date: oct 2020
 * Description: This program moves a rocket from the left to the right of the window
 *
 */
public class AnimatedIcon extends JFrame {

	/*
	 * Declaring needed global variables (Outside of all functions) but inside the class
	 */
	int x = 20, y = 100; // starting coordiantes for the Rocket
	int xSpeed = 1, ySpeed = 1; // speeds for the x and y directions
	int delay= 20; // variable to slow down the animation
	ImageIcon backGnd, pic; 

	/**
	 * This is the window constructor
	 */
	public AnimatedIcon() {
		// this builds a window
		super("Moving A Rocket"); // title for window
		setSize(1000, 1050); // sets the size of the window

		// loading in picture files 
		backGnd = new ImageIcon("push-pull.jpg"); 
		pic = new ImageIcon("omlette.jpg"); 

		// prompt for speed 
		xSpeed = IO.readInt("Please enter a speed from 1 to 5");
		ySpeed = xSpeed; 

		setVisible(true); // displays the window visible
		setDefaultCloseOperation(EXIT_ON_CLOSE); // cleans up program after exited

	}

	/**
	 *
	 * the paint function uses a for loop to draw a background picture then a rocket
	 * over and over to simulate movement, the x and y coordinates of the Rocket are
	 * changed to simulate movement
	 * there is a delay of 5 ms to slow down the ball  
	 * if the Rocket reaches a x position of 300 then we break of the loop and stop yhr
	 * animation.
	 */
	public void paint(Graphics g) {

		// for loop to repaint the ball
		for (int i = 0; i < 1000; i++) {

			backGnd.paintIcon(this, g, 0, 0); // paint the background picture 

			x = x + xSpeed; // moves the rocket omlette by x speed 

			pic.paintIcon(this, g, x, y); // paint the icon 

			// try/catch for the delay 
			try {
				Thread.sleep(delay); // puts computer to sleep for the delay time 


			}
			catch(Exception error) {
				// leave empty 
			}

			if (x > 500) {
				break;  // jump out of the loop and stop the rocket 
			}
		}

		for (int i = 0; i < 2000; i++) {
			backGnd.paintIcon(this, g, 0, 0); // paint the background picture 

			y = y + ySpeed; // moves the rocket down by y speed 

			pic.paintIcon(this, g, x, y); // paint the icon

			// try/catch for delay 
			try {
				Thread.sleep(delay); // puts computer to sleep for the delay time 


			}
			catch(Exception error) {
				// leave empty 
			}
			if (y > 400) {
				break; 
			}
		}
	}

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// call the constructor
		new AnimatedIcon();

	}

}




