package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalc {
    private JFrame window;
    private JPanel panel;
    private JTextField textAreaNum1, textAreaNum2, textAreaAction, textAreaResult;
    private JButton button;

    public SimpleCalc(){ constructAll();}

    public void constructAll(){
        constructWindow();
        constructTextFields();
        constructButton();
        constructFieldResult();
        window.setVisible(true);
    }

    public void constructWindow(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        window = new JFrame("Calculator");
        window.setSize(500, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setVisible(true);
        window.getContentPane().add(panel);
        window.setPreferredSize(new Dimension(500, 700));
        window.setLocationRelativeTo(null);
    }

    private void constructTextFields() {
        textAreaNum1 = new JTextField();
        textAreaNum1.setBounds(150, 50, 190, 40);
        panel.add(textAreaNum1);
        textAreaNum2 = new JTextField();
        textAreaNum2.setBounds(150, 110, 190, 40);
        panel.add(textAreaNum2);
        textAreaAction = new JTextField();
        textAreaAction.setBounds(150, 170, 190, 40);
        panel.add(textAreaAction);
    }

    public void constructButton(){
        button = new JButton("=");
        button.setBounds(50, 230, 190, 50);
        button.addActionListener(new MyActionListener());
        panel.add(button);
    }

    public void constructFieldResult(){
        textAreaResult = new JTextField();
        textAreaResult.setBounds(50, 290, 190, 50);
        panel.add(textAreaResult);
    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
}
