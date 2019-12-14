import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame
{
	//declare J objects
	private JComboBox box;
	private JLabel picture;
	
	//array of filenames
	private static String[] filename = {"custom_button.png", "x.png"};
	//array of icons
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
    
	
	
    public Gui()
    {
    	super("The title");
    	setLayout(new FlowLayout());
    	
    	box = new JComboBox(filename); //create an instance combo box that takes an array of objects (which is the filename array)
    	box.addItemListener( //anonymous inner class
    			new ItemListener() { //event handler
    				public void itemStateChanged(ItemEvent event) 
    		    	{
    		    		if(event.getStateChange()==ItemEvent.SELECTED)
    		    			picture.setIcon(pics[box.getSelectedIndex()]); //gets the selected icon
    		    	}
    			}
    			);
    	
    	//add the objects so it can be displayed on the screen
    	add(box);
    	picture = new JLabel(pics[0]);
    	add(picture);
    }
    
    
}