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

public class ShowImage extends JLabel {
    public ShowImage(JSONObject obj) {
        String imgUrl = obj.getString("avatar_url");
        // String imgUrl = obj.getString("graphql/user/profile_pic_url_hd");

        try {
            System.out.println(imgUrl);
            URL url = new URL(imgUrl);
            Image image = ImageIO.read(url);
            image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);

            this.setBounds(20, 230, 600, 300);
            this.setIcon(new ImageIcon(image));
            // this.setText("Name : " + obj.getString("name"));

            this.setFont(new Font("Aerial", Font.PLAIN, 18));
            this.setForeground(Color.white);
            this.repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setLayout(null);
    }
}
