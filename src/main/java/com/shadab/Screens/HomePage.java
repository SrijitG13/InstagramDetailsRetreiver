package com.shadab.Screens;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import com.shadab.Service.service;

import org.json.JSONObject;

import java.awt.Font;
import java.io.IOException;

public class HomePage {

    public HomePage() {
        JFrame frame = new JFrame("Instagram Details");
        JTextField textField = new JTextField();

        textField.setText("shadabdsw");
        textField.setBounds(150, 50, 380, 40);
        textField.setFont(new Font("Aerial", Font.PLAIN, 20));
        // textField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,
        // Color.white));
        textField.setBackground(Color.white);
        textField.setForeground(Color.black);
        textField.setLayout(null);

        JButton button = new JButton("GO");
        button.setFocusable(false);
        button.setBounds(570, 50, 80, 40);
        button.setBackground(Color.green);
        button.setForeground(Color.black);
        // button.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
        // button.setOpaque(true);
        button.setFont(new Font("Callibri", Font.BOLD + Font.ITALIC, 20));
        button.setLayout(null);
        button.addActionListener(e -> {
            String username = textField.getText();
            try {
                // JSONObject obj = new service().get("https://www.instagram.com/" + username +
                // "/?__a=1");
                JSONObject obj = new service().get("https://api.github.com/users/" + username);

                frame.add(new ShowImage(obj));
                frame.repaint();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        frame.setSize(800, 800);
        frame.getContentPane().setBackground((Color.white));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.add(textField);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
