import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame
{
	//declare J objects
	private JList list;
	private static String[] colorNames = {"black", "blue", "red", "white"};
	private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
	
    public Gui()
    {
    	super("The title");
    	setLayout(new FlowLayout());
    	
    	list = new JList(colorNames);
    	list.setVisibleRowCount(4); //sets the number of rows
    	list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //sets the selection mode of the list to single obj only
    	add(new JScrollPane(list)); //add the list to the scrollpane & make it visible
    	
    	list.addListSelectionListener(
    			new ListSelectionListener()
    			{
    				public void valueChanged(ListSelectionEvent event)
    				{
    					getContentPane().setBackground(colors[list.getSelectedIndex()]); //sets the color of the background. Note that there are three layers before you can get there.
    				}
    			});
    }
    	
    	
    
    
}