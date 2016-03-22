package Start;

import Googlemap.ResultBean;
import Googlemap.StartMap;

/**
 * Created by Henke on 2016-03-22.
 */
public class CreateJson {

    //defines the full description of song
    private String description;
    //defines the songs url
    private String url;

    /**
     * Sets the values of description and url.
     * In order to do that, we need to define a
     * specific radio channel.
     *
     * @param cityName
     */
    public void setValues(String cityName) {
        System.out.println(cityName);
        StartMap map = new StartMap();
        map.startGoogle(cityName);
        ResultBean bean = new ResultBean();


    }
}
