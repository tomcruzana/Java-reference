package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gui extends JFrame
{
    //step one: two variables to store our buttons
    private JButton reg;
    private JButton custom;

    public Gui()
    {
	//step two: added a title and a regular layout window
        super("The title");//one way to call methods from the super class
        setLayout(new FlowLayout());

        reg = new JButton("reg Button"); //add a regular button
        add(reg);
	
	//stored icons in vars b & x
        Icon b = new ImageIcon(getClass().getReseource("custom_button.png"));
        Icon x = new ImageIcon(getClass().getReseource("x.png"));

	//add a custom button
        custom = new JButton("Custom", b);
	//add a rollover icon for the custom button
        custom.setRolloverIcon(x);
        add(custom);

	//add an event so it can interact with the user
        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);
    }

    //create a class and implement the actionlistener
    private class HandlerClass implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }
}