package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JPanel jPanel = new JPanel();
        JFrame jFrame = new JFrame();
        jFrame.setSize(350,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(jPanel);
        //jFrame.setLayout(null);

        JLabel userlable = new JLabel("user");
        userlable.setBounds(20,10,10,25);
        jPanel.add(userlable);

        JTextField textField = new JTextField(20);
        textField.setBounds(100,20,165,25);
        jPanel.add(textField);
        JLabel passwordlabel = new JLabel("password");
        passwordlabel.setBounds(20,10,10,25);
        jPanel.add(passwordlabel);
        jFrame.setVisible(true);
    }
}
