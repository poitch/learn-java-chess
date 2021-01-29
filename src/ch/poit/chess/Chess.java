package ch.poit.chess;

import javax.swing.*;
import java.awt.*;

public class Chess {
    public static void main(String args[]) {
        JFrame mainFrame = new JFrame("Chess");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension dimension = new Dimension(800, 800);
        JPanel grid = new JPanel(new GridLayout(8, 8));
        grid.setPreferredSize(dimension);
        grid.setBounds(0, 0, dimension.width, dimension.height);
        for(int i = 0; i < 64; i++)  {
            JPanel square = new JPanel();
            int row = i / 8;
            if (row % 2 == 0) {
                square.setBackground(i % 2 == 0 ? Color.blue : Color.white );
            } else {
                square.setBackground(i % 2 == 0 ? Color.white : Color.blue );
            }
            grid.add(square);
        }

        mainFrame.setContentPane(grid);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
