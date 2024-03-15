import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sudoku extends JFrame {
    private JPanel panels[] = new JPanel[9];
    private JTextField[][] grid = new JTextField[9][9];
    
    public Sudoku() {
        setSize(600, 600);
        setTitle("Sudoku Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3));
        gamePanel.setSize(500, 500);

        for (int i = 0; i < 9; i++){
            JPanel p = new JPanel();
            p.setLayout(new GridLayout(3,3));
            p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            for (int j = 0; j < 9; j++){
                grid[i][j] = new JTextField(1);
                grid[i][j].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
                p.add(grid[i][j]);
            }
            panels[i] = p;
            gamePanel.add(p);
        }
        add(gamePanel, BorderLayout.CENTER);
        JButton solveButton = new JButton();
        //solveButton.setPreferredSize(new Dimension(100, 50));
        add(new JButton("Solve"), BorderLayout.SOUTH);

        // Hard-coding the initial board
        //Panel 1                   
        grid[0][0].setText("1"); grid[0][1].setText("");  grid[0][2].setText("6");
        grid[0][3].setText("");  grid[0][4].setText("5"); grid[0][5].setText("7");
        grid[0][6].setText("2"); grid[0][7].setText("9"); grid[0][8].setText("3");
        //Panel 2
        grid[1][0].setText("");  grid[1][1].setText("7"); grid[1][2].setText("8");
        grid[1][3].setText("3"); grid[1][4].setText("4"); grid[1][5].setText("9");
        grid[1][6].setText("6"); grid[1][7].setText("");  grid[1][8].setText("5");
        //Panel 3
        grid[2][0].setText("");  grid[2][1].setText("3");  grid[2][2].setText("");
        grid[2][3].setText("");  grid[2][4].setText("6");  grid[2][5].setText("2");
        grid[2][6].setText("");  grid[2][7].setText("");  grid[2][8].setText("7");
        //Panel 3
        grid[3][0].setText("");  grid[3][1].setText("");  grid[3][2].setText("");
        grid[3][3].setText("4");  grid[3][4].setText("6");  grid[3][5].setText("1");
        grid[3][6].setText("5");  grid[3][7].setText("8");  grid[3][8].setText("");        
        //Panel 3
        grid[4][0].setText("8");  grid[4][1].setText("");  grid[4][2].setText("1");
        grid[4][3].setText("");  grid[4][4].setText("");  grid[4][5].setText("");
        grid[4][6].setText("");  grid[4][7].setText("6");  grid[4][8].setText("4");
        //Panel 3
        grid[5][0].setText("6");  grid[5][1].setText("");  grid[5][2].setText("4");
        grid[5][3].setText("2");  grid[5][4].setText("8");  grid[5][5].setText("9");
        grid[5][6].setText("3");  grid[5][7].setText("");  grid[5][8].setText("");
        //Panel 3
        grid[6][0].setText("7");  grid[6][1].setText("3");  grid[6][2].setText("4");
        grid[6][3].setText("6");  grid[6][4].setText("1");  grid[6][5].setText("8");
        grid[6][6].setText("");  grid[6][7].setText("");  grid[6][8].setText("");
        //Panel 3
        grid[7][0].setText("1");  grid[7][1].setText("9");  grid[7][2].setText("6");
        grid[7][3].setText("7");  grid[7][4].setText("");  grid[7][5].setText("2");
        grid[7][6].setText("");  grid[7][7].setText("8");  grid[7][8].setText("");
        //Panel 3
        grid[8][0].setText("5");  grid[8][1].setText("");  grid[8][2].setText("8");
        grid[8][3].setText("4");  grid[8][4].setText("9");  grid[8][5].setText("3");
        grid[8][6].setText("");  grid[8][7].setText("1");  grid[8][8].setText("");
        setVisible(true);
    }
    public static void main(String[] args) {
        new Sudoku();
    }


}
