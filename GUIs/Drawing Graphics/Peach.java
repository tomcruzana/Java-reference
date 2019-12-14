import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class Peach extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);//call the super classes for house keeping purposes (BUcky didn't explain really)
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE); //tell the class to draw in blue color
		g.fillRect(25, 25, 100, 30); //x, y, width, height of the rectangle 1
		
		g.setColor(new Color(190, 81, 215)); //create custom color via RGB
		g.fillRect(25, 65, 100, 30);//x, y, width, height of the rectangle 2
		
		g.setColor(Color.RED); //tell the class to draw in red color
		g.drawString("this is some text", 25, 120); //the text, x, y coordinates
	}
}
