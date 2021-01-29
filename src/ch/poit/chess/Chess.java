package ch.poit.chess;

import javax.swing.*;
import java.awt.*;

public class Chess {
    public static void main(String args[]) {
        JFrame mainFrame = new JFrame("Chess");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension dimension = new Dimension(800, 800);
        JPanel panel = new JPanel(new GridLayout(8, 8));
        panel.setPreferredSize(dimension);
        panel.setBounds(0, 0, dimension.width, dimension.height);
        for(int i = 0; i < 64; i++)  {
            JPanel square = new JPanel();
            int row = i / 8;
            if (row % 2 == 0) {
                square.setBackground(i % 2 == 0 ? Color.blue : Color.white );
            } else {
                square.setBackground(i % 2 == 0 ? Color.white : Color.blue );
            }
            panel.add(square);
        }

        mainFrame.setContentPane(panel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
