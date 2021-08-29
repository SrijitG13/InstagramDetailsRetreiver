package com.shadab.Service;

import java.io.*;
import org.json.JSONObject;
import java.net.*;

public class service {
    public JSONObject get(String url) throws IOException {

        URL urlForGetRequest = new URL(url);
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        int responseCode = conection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in.readLine()) != null) {
                response.append(readLine);
            }
            in.close();
            String s = response.toString();
            System.out.println(s);
            JSONObject object = new JSONObject(s);

            return object;
        } else {
            System.out.println("User not found");
        }

        return null;

    }
}
