package com.shadab.Screens;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import org.json.JSONObject;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.net.URL;
import java.awt.Image;

public class Following extends JLabel {
    JLabel nooffollowing = new JLabel();
    public Following() {
        nooffollowing.setBounds(20,720,100,20);
        nooffollowing.setText("No. of Following : ");
        nooffollowing.setFont(new Font("Aerial", Font.PLAIN, 18));
        nooffollowing.setLayout(null);
    }
}
