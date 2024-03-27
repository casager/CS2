/*Simple calculator program that takes two operands and an operator
 * and calculates the correct value needed.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private JButton[] buttons;

    private double num1, num2;
    private char operator;
    //creating class
    public Calculator() {
        setTitle("Simple Calculator");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setPreferredSize(new Dimension(300, 100)); 
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        buttons = new JButton[16];
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 30));
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
            case "C":
                display.setText("");
                break;
            case "=":
                calculate();
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                num1 = Double.parseDouble(display.getText());
                operator = command.charAt(0);
                display.setText(display.getText() + " " + operator + " ");
                break;
            default:
                display.setText(display.getText() + command);
                break;
        }
    }
    //calculator function
    private void calculate() {
        String[] parts = display.getText().split(" ");
        double result = 0;
    
        if (parts.length != 3) {
            JOptionPane.showMessageDialog(this, "2 operands needed. Resetting.");
            display.setText("");
            return;
        }
    
        double num1 = Double.parseDouble(parts[0]);
        double num2 = Double.parseDouble(parts[2]);
        char operator = parts[1].charAt(0);
    
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero.");
                }
                break;
            default:
                break;
        }
    
        display.setText(Double.toString(result));
    }
    

    public static void main(String[] args) {
        new Calculator();
    }
}

