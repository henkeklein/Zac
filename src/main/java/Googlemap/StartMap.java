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
    public StartMap(){

    }
    public void startGoogle(String bean){
    String cityName = bean;
    try {
        cityName = URLEncoder.encode(cityName, "UTF-8");
    } catch (UnsupportedEncodingException e) {
    } catch (NullPointerException e) {
        System.out.println("Ingen karta hittas");
    }

    String baseUrl = "http://maps.google.com/maps/api/geocode/json?address=" + cityName;

    HttpClient httpclient = null;
    HttpGet httpGet = null;
    HttpResponse response = null;
    StatusLine status = null;
    HttpEntity entity = null;
    InputStream data = null;
    Reader reader = null;

    GsonBuilder builder = new GsonBuilder();
    Gson json = builder.create();

    FinalBean envelope = null;

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
                envelope = json.fromJson(reader, FinalBean.class);


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
