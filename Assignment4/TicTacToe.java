/* Tictactoe program that lets you first decide if you 
 * would like to play as X or O. Once chosen, the computer will play
 * by randomly placing their X or O. Game continues until there is a 
 * win or draw.
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener{
    private JButton[][] buttons;
    private boolean userX;
    String player, computer;
    //private boolean player;
    private boolean gameOver;
    private JButton resetButton;
    private JPanel gamePanel;
    private String winner;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(400, 450); // Increased height to accommodate the start button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        startGame();
        setVisible(true);
    }    

    private void startGame(){
        String[] options = {"X", "O"};
        String chosenOption = (String) JOptionPane.showInputDialog(
                this,
                "Choose 'X' or 'O' to start the game:",
                "Choose Your Symbol",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);
        if (chosenOption != null) {
            userX = chosenOption.equals("X"); //sets user X to true if chosen option is X
            //startGame(); //replace this to better play game
            player = "X";
            computer = "O";
            if (!userX) {
                //computerMove(); //computer move if user does not choose X
                player = "O";
                computer = "X";
            }
        }
        else System.exit(0);

        gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3));
        buttons = new JButton[3][3];
        // playerX = true;
        // gameOver = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
                buttons[i][j].addActionListener(this); // uncommment in order to get action listener
                gamePanel.add(buttons[i][j]);
            }
        }

        if (!userX){
            computerMove();
        }

        resetButton = new JButton("Reset Game"); //change to reset game
        resetButton.addActionListener(this); // ACTION LISTENER

        JPanel resetPanel = new JPanel();
        resetPanel.add(resetButton);


        add(gamePanel, BorderLayout.CENTER);
        add(resetPanel, BorderLayout.SOUTH);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            resetGame();
            if (!userX){
                computerMove();
            }
        }
        else{
            JButton clickedButton = (JButton) e.getSource();
            int reset = 0;
            if (!gameOver && clickedButton.getText().isEmpty()) {
                clickedButton.setText(userX ? "X" : "O");
                // if (userX) {
                //     clickedButton.setText(userX ? "X" : "O");
                //     computerMove();
                // }
            }
            if (checkWin()) {
                //JOptionPane.showMessageDialog(this, winner + " wins!");
                int choice = JOptionPane.showOptionDialog(
                    this,
                    winner + " wins!\nWould you like to start over?",
                    "Game Over",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"Restart", "Quit"}, // Customize the button labels here
                    "Restart" // Default selection
                );
                if (choice == JOptionPane.YES_OPTION) {
                    reset = 1;
                } else {
                    System.exit(0);
                }
                gameOver = true;
            } else if (isBoardFull()) {
                //JOptionPane.showMessageDialog(this, "It's a draw!");
                int choice = JOptionPane.showOptionDialog(
                    this,
                    "It's a draw!\nWould you like to start over?",
                    "Game Over",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"Restart", "Quit"}, // Customize the button labels here
                    "Restart" // Default selection
                );
                if (choice == JOptionPane.YES_OPTION) {
                    reset = 1;
                } else {
                    System.exit(0);
                }
                gameOver = true;
            } 
            else computerMove();
            if (checkWin() && gameOver == false) {
                int choice = JOptionPane.showOptionDialog(
                    this,
                    winner + " wins!\nWould you like to start over?",
                    "Game Over",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"Restart", "Quit"}, // Customize the button labels here
                    "Restart" // Default selection
                );
                if (choice == JOptionPane.YES_OPTION) {
                    reset = 1;
                } else {
                    System.exit(0);
                }
                gameOver = true;
            } else if (isBoardFull() && gameOver == false) {
                //JOptionPane.showMessageDialog(this, "It's a draw!");
                int choice = JOptionPane.showOptionDialog(
                    this,
                    "It's a draw!\nWould you like to start over?",
                    "Game Over",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"Restart", "Quit"}, // Customize the button labels here
                    "Restart" // Default selection
                );
                if (choice == JOptionPane.YES_OPTION) {
                    reset = 1;
                } else {
                    System.exit(0);
                }
                gameOver = true;
            } 
            if (reset == 1) resetGame();

        }
    }

    private void resetGame(){
        // Clear the text of each button
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
        // Reset the game status
        gameOver = false;
        // Reset the player to 'X' if user initially chose 'X', otherwise reset it to 'O'
        player = userX ? "X" : "O";
        // If user didn't choose 'X', make computer move
        if (!userX){
            computerMove();
        }
    }

    private boolean checkWin() {
        // Check rows and columns
        winner = "";
        for (int i = 0; i < 3; i++) {
            if (!buttons[i][0].getText().isEmpty() &&
                    buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                    buttons[i][0].getText().equals(buttons[i][2].getText())){
                        winner = buttons[i][0].getText();
                        return true;
                    }
            if (!buttons[0][i].getText().isEmpty() &&
                    buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                    buttons[0][i].getText().equals(buttons[2][i].getText())){
                        winner = buttons[0][i].getText();
                        return true;
                    }
        }

        // Check diagonals
        if (!buttons[0][0].getText().isEmpty() &&
                buttons[0][0].getText().equals(buttons[1][1].getText()) &&
                buttons[0][0].getText().equals(buttons[2][2].getText())){
                    winner = buttons[0][0].getText();
                    return true;
                }
        if (!buttons[0][2].getText().isEmpty() &&
                buttons[0][2].getText().equals(buttons[1][1].getText()) &&
                buttons[0][2].getText().equals(buttons[2][0].getText())){
                    winner = buttons[1][1].getText();
                    return true;
                }

        return false;
    }

    
    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().isEmpty())
                    return false;
            }
        }
        return true;
    }
    private void computerMove() {
        // Randomly select an empty spot for computer's move
        boolean spotFound = false;
        while (!spotFound) {
            int row = (int) (Math.random() * 3);
            int col = (int) (Math.random() * 3);
            if (buttons[row][col].getText().isEmpty()) {
                buttons[row][col].setText(userX ? "O" : "X");
                spotFound = true;
            }
        }
        //playerX = !playerX;
    }
    public static void main(String[] args) {
        new TicTacToe();
    }
}
