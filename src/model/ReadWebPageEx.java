package model;

//shamelessly quoting from: http://zetcode.com/articles/javareadwebpage/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadWebPageEx {
    private String url;

    public ReadWebPageEx(){

    }

    public void urlread() throws MalformedURLException, IOException {

        BufferedReader br = null;

        try {
            String theURL = url; //this can point to any URL
            URL url = new URL(theURL);
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append(System.lineSeparator());
            }

            System.out.println(sb);
        } finally {

            if (br != null) {
                br.close();
            }
        }
    }
    public String needurl(String s){
        url = s;
        return url;
    }
}