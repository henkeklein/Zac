package Googlemap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.*;
import java.net.URLEncoder;

/**
 * Created by Henke on 2016-03-11.
 */
public class StartMap {
    public void startGoogle(String bean){
    String title = bean;
    try {
        title = URLEncoder.encode(title, "UTF-8");
    } catch (UnsupportedEncodingException e) {
    } catch (NullPointerException e) {
        System.out.println("Ingen låt spelas just nu");
    }

    String baseUrl = "https://api.spotify.com/v1/search?query=" + title + "&offset=0&limit=20&type=track";

    HttpClient httpclient = null;
    HttpGet httpGet = null;
    HttpResponse response = null;
    StatusLine status = null;
    HttpEntity entity = null;
    InputStream data = null;
    Reader reader = null;

    GsonBuilder builder = new GsonBuilder();
    Gson json = builder.create();

    ResultBean envelope = null;

    try {
        httpclient = HttpClients.createDefault();
        httpGet = new HttpGet(baseUrl);
        response = httpclient.execute(httpGet);
        status = response.getStatusLine();
        if (status.getStatusCode() == 200) {
            entity = response.getEntity();
            data = entity.getContent();

            try {
                reader = new InputStreamReader(data);
                json = builder.create();
                envelope = json.fromJson(reader, ResultBean.class);


            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Det blev fel.");
            }
        } else {
            System.out.println("API:t svarade inte.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
