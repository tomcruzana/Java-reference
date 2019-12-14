import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TheWindow extends JFrame
{
	private JSlider slider; //make a slider
	private DrawOval myPanel; //make a panel
	
	public TheWindow()
	{
		super("the title"); //make a title
		myPanel = new DrawOval();
		myPanel.setBackground(Color.ORANGE); //change BG to orange
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10); //slider going left and right w/ min and max values
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				new ChangeListener()
				{
					public void stateChanged(ChangeEvent e)
					{
						myPanel.setD(slider.getValue()); //call the setD method and get the val of the slider
					}
				}
				);
		
		//add the JFrame components 
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
		
	}
	
	
}
