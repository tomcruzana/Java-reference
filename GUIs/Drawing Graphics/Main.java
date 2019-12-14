import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Peach go = new Peach();
        f.add(go);
        f.setSize(400,250);
        f.setVisible(true);
    }
}
