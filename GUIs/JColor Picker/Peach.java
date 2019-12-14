import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class Peach extends JFrame
{
	private JButton b;
	private Color color = (Color.WHITE);
	private JPanel panel;
	
	public Peach()
	{
		super("Title");
		panel = new JPanel();
		panel.setBackground(color); //set to the private car named color
		
		b = new JButton("Choose a color");
		b.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						color = JColorChooser.showDialog(null, "Pick you color", color);
						if(color == null)
							color=(Color.WHITE);
						
						panel.setBackground(color);
					}
				}
				);
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(425,150);
		setVisible(true);
	}
}
