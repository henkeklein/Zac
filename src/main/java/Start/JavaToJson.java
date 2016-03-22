package Start;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Henke on 2016-03-22.
 */
public class JavaToJson {

    /**
     * Transform and returns JSON-data.
     * We need to specify a radio channel in
     * order to get the right information
     * @param cityName
     * @return data as JSON
     */
    public String getJson(String cityName) {
        CreateJson json = new CreateJson();
        json.setValues(cityName);
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println(gson.toJson(json));
        return gson.toJson(json);
    }

}
