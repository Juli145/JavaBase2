package com.company.MySimpleCalc;

import javax.swing.*;
import java.awt.*;

public class CalcFrame extends JFrame {

    public CalcFrame(JPanel calcPanel) {
        constructWindow(calcPanel);
    }

    public void constructWindow(JPanel calcPanel) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        setTitle("Calculator");
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(calcPanel);
        setPreferredSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
