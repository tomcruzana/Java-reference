import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class DrawOval extends JPanel
{
	private int d = 10; //diameter
	
	public void paintComponent(Graphics g)
	{
		//call a component from the JPanel which is currently the super class
		super.paintComponent(g); //paint the oval/circle
		g.fillOval(10, 10, d, d);
	}
	
	public void setD(int newD)
	{
		d = (newD >= 0 ? newD : 10); //if the new diameter is greater than 0 then take the new value
		
		repaint(); //built-in method that reinvokes the paintComponent method
	}
	
	public Dimension getPreferredSize() //optional for house keeping
	{
		return new Dimension(200,200);
	}
	
	public Dimension getMinimumSize()
	{
		return getPreferredSize();
	}

}
