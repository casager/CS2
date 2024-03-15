import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SudokuTEST extends JFrame {
    private JTextField[][] grid;

    public SudokuTEST() {
        setTitle("Sudoku Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 9));

        grid = new JTextField[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = new JTextField(1);
                grid[i][j].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
                add(grid[i][j]);
            }
        }

        JButton solveButton = new JButton("Solve");
        solveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                solveSudoku();
            }
        });
        add(solveButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void solveSudoku() {
        int[][] board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String text = grid[i][j].getText().trim();
                if (!text.isEmpty()) {
                    board[i][j] = Integer.parseInt(text);
                } else {
                    board[i][j] = 0; // Empty cell
                }
            }
        }

        if (solve(board)) {
            // Update the GUI with solved values
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    grid[i][j].setText(Integer.toString(board[i][j]));
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No solution exists for the given Sudoku.", "No Solution", JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean solve(int[][] board) {
        int[] emptyCell = findEmptyCell(board);
        if (emptyCell == null) {
            return true; // No empty cell found, puzzle solved
        }

        int row = emptyCell[0];
        int col = emptyCell[1];

        for (int num = 1; num <= 9; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;

                if (solve(board)) {
                    return true;
                }

                board[row][col] = 0; // Backtrack
            }
        }

        return false; // No valid number found for this cell
    }

    private boolean isValid(int[][] board, int row, int col, int num) {
        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3x3 box
        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;
        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColStart; j < boxColStart + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private int[] findEmptyCell(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        return null; // No empty cell found
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SudokuTEST();
            }
        });
    }
}

