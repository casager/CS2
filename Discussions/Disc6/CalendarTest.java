import java.awt.*;
import javax.swing.*;

public class CalendarTest extends JFrame {
    public CalendarTest(){

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(7, 7));

        p1.add(new JButton("Su"));
        p1.add(new JButton("Mo"));
        p1.add(new JButton("Tu"));
        p1.add(new JButton("We"));
        p1.add(new JButton("Th"));
        p1.add(new JButton("Fr"));
        p1.add(new JButton("Sa"));

        for(int i  = 0; i < 5; i++){
            p1.add(new JButton(" "));
        }
        for(int i  = 1; i <= 31; i++){
            p1.add(new JButton(" " + i));
        }
        for(int i  = 0; i < 6; i++){
            p1.add(new JButton(" "));
        }

        add(p1, BorderLayout.CENTER);
        add(new JButton("March 2024"), BorderLayout.NORTH);

    }

    public static void main(String[] args) {
        CalendarTest marchCal = new CalendarTest();
        marchCal.setTitle("Calendar");
        marchCal.setLocationRelativeTo(null); //Center the frame
        marchCal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marchCal.setSize(400,250);
        marchCal.setVisible(true);
    }
}
