import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame
{
	//declare J objects
    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;
    private ButtonGroup group;
    
    public Gui()
    {
    	super("the title");
    	setLayout(new FlowLayout());
    	
    	tf = new JTextField("Tom is awesome", 25);
    	add(tf);
    	
    	pb = new JRadioButton("plain", true);
    	bb = new JRadioButton("bold", false);
    	ib = new JRadioButton("italic", false);
    	bib = new JRadioButton("bold and italic", false);
    	add(pb);
    	add(bb);
    	add(ib);
    	add(ib);
    	
    	//group the buttons
    	group = new ButtonGroup();
    	group.add(pb);
    	group.add(bb);
    	group.add(ib);
    	group.add(ib);
    	
    	pf = new Font("Serif", Font.PLAIN, 14);
    	bf = new Font("Serif", Font.BOLD, 14);
    	itf = new Font("Serif", Font.ITALIC, 14);
    	bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
    	tf.setFont(pf); //set the default font for the JTextField
    	
    	//wait for the event to happen
    	pb.addItemListener(new HandlerClass(pf));
    	bb.addItemListener(new HandlerClass(bf));
    	ib.addItemListener(new HandlerClass(itf));
    	bib.addItemListener(new HandlerClass(bif));
    	
    }
    
    private class HandlerClass implements ItemListener //handler class that implements the Java itemListener
    {
    	private Font font;
    	
    	//font obj get variable font
    	public HandlerClass(Font f)
    	{
    		font = f;
    	}
    	
    	//sets the font to the font obj that was passed in
    	public void itemStateChanged(ItemEvent event) 
    	{
    		tf.setFont(font);
    	}
    }
}