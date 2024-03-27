/*Program to simulate a lockscreen with a 3-digit integer password.
* The correct password is 1, 2, 3
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lockscreen extends JFrame implements ActionListener {
    private JButton[] buttons;
    private int[] combination = {1, 2, 3};
    private int[] input = new int[3];
    private int inputCount = 0;
    private JTextField display = new JTextField();

    public Lockscreen() {
        setLayout(new BorderLayout());
        setTitle("Lockscreen");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(2, 5));

        buttons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(Integer.toString(i));
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }
        display.setPreferredSize(new Dimension(100, 50)); 
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        display.setBackground(Color.WHITE);
        display.addActionListener(this);

        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        int buttonValue = Integer.parseInt(buttonClicked.getText());
        input[inputCount++] = buttonValue;
        display.setText(display.getText() + " " + buttonValue + " ");

        if (inputCount == 3) {
            boolean correctCombination = true;
            for (int i = 0; i < 3; i++) {
                if (input[i] != combination[i]) {
                    correctCombination = false;
                    break;
                }
            }

            if (correctCombination) {
                display.setBackground(Color.GREEN);
                JOptionPane.showMessageDialog(this, "Correct combination! Exiting program.");
                System.exit(0);
            } else {
                display.setBackground(Color.RED);
                JOptionPane.showMessageDialog(this, "Incorrect combination!");
                display.setText("");
                display.setBackground(Color.WHITE);
                resetInput();
            }
        }
    }

    private void resetInput() {
        inputCount = 0;
        for (int i = 0; i < input.length; i++) {
            input[i] = 0;
        }
    }

    public static void main(String[] args) {
        new Lockscreen();
    }
}

              
