package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class displayProject extends JFrame {

    private JPanel panel1;
    private JTextField projectNameTextField;
    private JTextArea textArea1;
    private JButton addItemButton;
    private JButton cancelButton;

    public displayProject () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the windows render to the screen.
        this.setVisible(true);
        this.add(panel1);




        BufferedReader reader;
        String name;
        try {
            reader = new BufferedReader(new FileReader( name  + ".txt"));
            String line ;

           while ((line= reader.readLine())!= null){
               System.out.println(line);
           }
           reader.close();

        }


        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        public void setFilename (String name) {
            String s = name;

        }
        textArea1.setText("text"); // should show text from the file


        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NewProjct();
            }
        });
    }
}
