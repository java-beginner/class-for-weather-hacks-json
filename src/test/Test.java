package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import weather_hacks_json.WeatherHacks;

public class Test {

    public static void main(String[] args) {

        String json = null;
        try {
            String url = "http://weather.livedoor.com/forecast/webservice/json/v1?city=130010";
            BufferedReader br = null;

            HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
            con.setRequestMethod("GET");
            br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
            json = br.readLine();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        WeatherHacks weatherHacks = new Gson().fromJson(json, WeatherHacks.class);

        Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
        System.out.println(gson.toJson(weatherHacks));

    }

}
