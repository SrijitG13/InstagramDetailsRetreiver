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

public class Fullname extends JLabel {
    JLabel fullname = new JLabel();
    public Fullname() {
        fullname.setBounds(20,600,100,20);
        fullname.setText("Name : " );
        fullname.setFont(new Font("Aerial", Font.PLAIN, 18));
        fullname.setLayout(null);
    }
    
}
