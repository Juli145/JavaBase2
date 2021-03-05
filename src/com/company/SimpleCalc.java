package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalc {
    private JFrame window;
    private JPanel panel;
    private JLabel labelNumber1, labelNumber2, labelMathOperation, labelResult;
    private JTextField textFieldNum1, textFieldNum2, textFieldMathOperation, textAreaResult;
    private JButton button;

    public SimpleCalc(){ constructAll();}

    public void constructAll(){
        constructWindow();
        constructLabels();
        constructTextFields();
        constructButton();
        constructFieldResult();
        window.setVisible(true);
    }
    private void getResult() {
        double num1 = 0, num2 = 0;
        char mathOperation = ' ';
        try {
            num1 = Double.parseDouble(textFieldNum1.getText());
            num2 = Double.parseDouble(textFieldNum2.getText());
            mathOperation = textFieldMathOperation.getText().charAt(0);
        } catch (NullPointerException e) {
            textAreaResult.setText("Enter number 1 and number 2");
            throw new NullPointerException();
        } catch (NumberFormatException e) {
            textAreaResult.setText("Incorrect data");
            throw new NumberFormatException();
        }

        double result;
            result = CalcAPI.calc(num1, num2, mathOperation);
            String answer = String.valueOf(result);
            textAreaResult.setText(answer);
    }


    public void constructWindow(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        window = new JFrame("Calculator");
        window.setSize(500, 700);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setVisible(true);
        window.getContentPane().add(panel);
        window.setPreferredSize(new Dimension(500, 700));
        window.setLocationRelativeTo(null);
    }

    private void constructLabels() {
        labelNumber1 = new JLabel("Number 1");
        labelNumber1.setBounds(45, 50, 100, 40);
        panel.add(labelNumber1);
        labelNumber2 = new JLabel("Number 2");
        labelNumber2.setBounds(45, 110, 100, 40);
        panel.add(labelNumber2);
        labelMathOperation = new JLabel("Math operation");
        labelMathOperation.setBounds(45, 170, 100, 40);
        panel.add(labelMathOperation);
        labelResult = new JLabel("Result");
        labelResult.setBounds(45, 290, 100, 40);
        panel.add(labelResult);
    }

    private void constructTextFields() {
        textFieldNum1 = new JTextField();
        textFieldNum1.setBounds(150, 50, 190, 40);
        panel.add(textFieldNum1);
        textFieldNum2 = new JTextField();
        textFieldNum2.setBounds(150, 110, 190, 40);
        panel.add(textFieldNum2);
        textFieldMathOperation = new JTextField();
        textFieldMathOperation.setBounds(150, 170, 190, 40);
        panel.add(textFieldMathOperation);
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
            getResult();
        }
    }
}
