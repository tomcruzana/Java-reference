import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class Layout extends JFrame
{ 
	private JButton lb;
	private JButton cr;
	private JButton rb;
	
	private FlowLayout layout;
	private Container container;
	
	public Layout()
	{
		super("Title");
		
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		//left button
		lb = new JButton("Left");
		add(lb);
		
		lb.addActionListener(
				new ActionListener() 
				{
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
				);
		
		//center button
				cr = new JButton("Center");
				add(cr);
				
				cr.addActionListener(
						new ActionListener() 
						{
							public void actionPerformed(ActionEvent event)
							{
								layout.setAlignment(FlowLayout.CENTER);
								layout.layoutContainer(container);
							}
						}
						);
		//right button
				rb = new JButton("Right");
				add(rb);
				
				rb.addActionListener(
						new ActionListener() 
						{
							public void actionPerformed(ActionEvent event)
							{
								layout.setAlignment(FlowLayout.RIGHT);
								layout.layoutContainer(container);
							}
						}
						);
		
	}
}
