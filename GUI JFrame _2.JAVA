package com.company;
import javax.swing.*;
import java.awt.FlowLayout;  //Libs needed for making a GUI

public class Main {

    public static void main(String[] args) {
        B newB = new B();
        newB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //!important: code for the x button of the GUI
        newB.setSize(275, 180); //size of the GUI form
        newB.setVisible(true); //sets the visibility of the form to true
    }
}

 class B extends JFrame { //The class must inherit JFrame's features

    private JLabel item1; // declares a private object instance of JLabel

    public B(){
        super("The title bar"); //(shorthanded) constructor for the title
        setLayout(new FlowLayout());

        item1 = new JLabel("this is a sentence"); //initializes the constructor fot the label content of the GUI frame/form
        item1.setToolTipText("This is gonna show up on hover"); //invokes the built-in method to add tool tip functionality
        add(item1);
    }
}

