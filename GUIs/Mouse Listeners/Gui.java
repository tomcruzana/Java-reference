import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JFrame
{
	//declare J objects
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public Gui()
	{
		super("title");
		//setLayout(new FlowLayout()); not necesarry
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);;
	}
	
	private class Handlerclass implements MouseListener, MouseMotionListener
	{
		public void mouseClicked(MouseEvent event)
		{
			statusbar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
		}
		
		public void mousePressed(MouseEvent event)
		{
			statusbar.setText("You pressed down the mouse!");
		}
		
		public void mouseReleased(MouseEvent event)
		{
			statusbar.setText("You released the button!");
		}
		
		public void mouseEntered(MouseEvent event)
		{
			statusbar.setText("You entered the area");
			mousepanel.setBackground(Color.RED);
		}
		
		public void mouseExited(MouseEvent event)
		{
			statusbar.setText("The mouse has left the window");
			mousepanel.setBackground(Color.WHITE);
		}

		//THESE ARE MOUSE MOTION EVENTS
		@Override
		public void mouseDragged(MouseEvent event) {
			statusbar.setText("You are dragging the mouse");
			
		}

		@Override
		public void mouseMoved(MouseEvent event) {
			statusbar.setText("You moved the mouse");
			
		}
		
		
		
		
	}
}