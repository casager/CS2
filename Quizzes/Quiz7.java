import java.awt.*;
import javax.swing.*;

public class Quiz7{
    public static void main(String[] args){
        JFrame frame = new JFrame("Test1");
        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JLabel l1 = new JLabel("LABEL");

        frame.add(b1);
        frame.add(b2);
        frame.add(l1);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setLocationRelativeTo(null);
        frame.setSize(300,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
