package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ContainerAdapter;

public class wind extends JFrame{

    private JTabbedPane tabbedPane1;
    private JButton a1Button;
    private JPanel b;
    private JButton a2Button;
    private JButton storesButton;
    private JTextField allProjectsTextField;
    private JTextField listOfLeftoversTextField;
    private JTextField ongoingProjectsTextField;
    private JTextField finnishedProjectsTextField;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel c;
    private JButton project2Button;
    private JButton project1Button;
    private JButton createNewProjectButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextField listOfStoresTextField;

    public wind() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(0);
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the windows render to the screen.

        this.setVisible(true);
        this.add(panel1);

        textArea1.setText("1"); // how to display text in text area, area  for leftovers list to display



        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(1);
            }
        });


        createNewProjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new projectCreation();


            }
        });

        storesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(2);
            }
        });


        //createNewProjectButton.addActionListener(new ActionListener() {
           // @Override
            //public void actionPerformed(ActionEvent e) {
             //  JOptionPane.showInputDialog("what","add item");

          //  }

        project1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               displayProject d = new displayProject();
                String s = project1Button.getText();


            }
        });
    }


}
