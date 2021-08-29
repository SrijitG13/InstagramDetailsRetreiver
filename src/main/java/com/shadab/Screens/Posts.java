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

public class Posts extends JLabel {
    JLabel noofposts = new JLabel();
    public Posts() {
        noofposts.setBounds(20,640,100,20);
        noofposts.setText("No. of Posts : " );
        noofposts.setFont(new Font("Aerial", Font.PLAIN, 18));
        noofposts.setLayout(null);
    }
    
}
