package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  GUI implements ActionListener {
    int count = 0;
    JFrame frame;
    JPanel panel;
    JLabel label;
    JButton button;

    public  GUI(){
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Sign In");
        button.addActionListener((ActionListener) this);
        label = new JLabel("count 0");
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout());
        panel.add(button);
        panel.add(label);
        frame.add(panel,BorderLayout.CENTER);
        frame.setSize(455,56);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("new GUI");
        frame.pack();
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.green);

    }
    public static void main(String[] args) {
	    new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        count++;
        label.setText("count 0"+count);
    }
}
