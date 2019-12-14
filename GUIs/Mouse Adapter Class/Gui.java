/*
An adapter class provides the default implementation of all methods in an event listener interface. Adapter classes are very useful when you want to process only few of the events that are handled by a particular event listener interface.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JFrame
{
	//declare J objects
	private String details;
	private JLabel statusbar;
	
	public Gui()
	{
		super("Title");
		
		statusbar = new JLabel("This is default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
	}
	
	
	
	private class Mouseclass extends MouseAdapter
	{
		public void mouseClicked(MouseEvent event)
		{
			details = String.format("You clicked %d ", event.getClickCount());
			
			if(event.isMetaDown())
			{
				details += "with right mouse button";
			}
			else if (event.isAltDown())
				details += "either center mouse button";
			else
				details += "with left mouse button";
			
			statusbar.setText(details);
		}
	}
}