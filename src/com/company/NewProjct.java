package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewProjct extends JFrame{

    private JTextField writeTheNameOfTextField;
    private JTextField amountOfItemTextField;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel panel1;
    private JButton saveButton;
    private JButton cancelButton;
    private JTextField selectTheStoreTextField;
    private JComboBox comboBox1;


    public NewProjct() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the windows render to the screen.
        this.setVisible(true);
        this.add(panel1);



        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Saving s = new Saving();
               String b = "name";
               String c = textField1.getText();
               s.save(b, c );


            }
        });
    }
}
