import java.awt.Color;

import javax.swing.*;

public class Main {

    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Peach go = new Peach();
        go.setBackground(Color.WHITE);
        f.add(go);
        f.setSize(500,270);
        f.setVisible(true);
     
    }
}
