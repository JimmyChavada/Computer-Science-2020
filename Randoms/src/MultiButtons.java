
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MultiButtons implements ActionListener
{
   NTJFrame frame = new NTJFrame("Multiple Buttons");
   JButton square = new JButton("Square");
   JButton circle = new JButton("Circle");
   ImageIcon squareIcon = new ImageIcon("square.jpg");
   JButton filledSquare = new JButton(squareIcon);
   Drawing draw = new Drawing();
   int shape = 0;

   public MultiButtons()
   {
      JPanel pane = (JPanel)frame.getContentPane();
      pane.add(draw, "Center");
      JPanel top = new JPanel();
      top.add(square);
      top.add(circle);
      top.add(filledSquare);
      pane.add(top, "North");
      square.addActionListener(this);
      circle.addActionListener(this);
      filledSquare.addActionListener(this);
      frame.setVisible(true);
   }
   
   public static void main(String[] args)
   {
      new MultiButtons();
   }
   
   class Drawing extends JComponent
   {
      public void paint(Graphics g)
      {
         if (shape == 1)
         {
            g.setColor(Color.blue);
            g.drawRect(50, 50, 100, 100);
         }
         else if (shape == 2)
         {
            g.setColor(Color.green);
            g.drawOval(50, 50, 100, 100);
         }
         else if (shape == 3)
         {
            g.setColor(Color.red);
            g.fillRect(50, 50, 100, 100);
         }
      }     
   }
   
   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == square)
         shape = 1;
      else if (e.getSource() == circle)
         shape = 2;
      else
         shape = 3;
      draw.repaint();
   }
} 