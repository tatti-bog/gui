package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class projectCreation extends JFrame {
    private JPanel panel1;
    private JTextField createANewProjectTextField;
    private JTextField writeTheNameOfTextField;
    private JTextField textField1;
    private JButton saveButton;
    private JButton cancelButton;

    public projectCreation() {
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

// after you press the saving button the file is already create
// should i distroy it by cancel
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saving s = new Saving();
                s.createFile(textField1.getText());
            }
        });
    }
}
