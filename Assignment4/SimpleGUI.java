/*Program that creates a simple GUI that creates another window itself
 * Simply run and enter name of window in order to run correctly
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI extends JFrame implements ActionListener {
    private JTextField nameField;
    private JButton createButton;

    public SimpleGUI() {
        setTitle("Main Window");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        nameField = new JTextField(20);
        nameField.setPreferredSize(new Dimension(100, 30));
        nameField.setFont(new Font("Arial", Font.PLAIN, 14));
        createButton = new JButton("Create New Window");
        createButton.addActionListener(this);

        JLabel nameLabel = new JLabel("Enter Name: ");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 16)); // Set font size
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(createButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createButton) {
            String name = nameField.getText();
            if (!name.isEmpty()) {
                // Create a new window with the entered name as title
                JFrame newWindow = new JFrame(name);
                newWindow.setSize(400, 300);
                newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newWindow.setLocationRelativeTo(null);

                JLabel welcomeLabel = new JLabel("Welcome to " + name + ".");
                welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 16));

                welcomeLabel.setHorizontalAlignment(JLabel.CENTER); // Center align welcome message
                newWindow.add(welcomeLabel, BorderLayout.CENTER);

                newWindow.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a name.");
            }
        }
    }

    public static void main(String[] args) {
        new SimpleGUI();
    }
}

