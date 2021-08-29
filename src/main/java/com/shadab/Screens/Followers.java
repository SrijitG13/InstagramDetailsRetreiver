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

public class Followers extends JLabel {
    JLabel nooffollowers = new JLabel();
    public Followers() {
        nooffollowers.setBounds(20,680,100,20);
        nooffollowers.setText("No. of Followers : ");
        nooffollowers.setFont(new Font("Aerial", Font.PLAIN, 18));
        nooffollowers.setLayout(null);
    }
}
