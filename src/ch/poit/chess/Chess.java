package ch.poit.chess;

import javax.swing.*;
import java.awt.*;

public class Chess {
    public static void main(String args[]) {
        JFrame mainFrame = new JFrame("Chess");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        JButton button = new JButton();
        button.setText("Click Me");
        panel.add(button);
        mainFrame.setContentPane(panel);
        mainFrame.pack();
        mainFrame.setVisible(true);


    }
}
