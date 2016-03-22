package Start;

import Googlemap.FinalBean;
import Googlemap.StartMap;

import java.util.ArrayList;

/**
 * Created by Henke on 2016-03-22.
 */
public class CreateJson {

    //defines the full description of song
    private ArrayList<FinalBean> description;

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
        FinalBean bean = new FinalBean();

        description = bean.getResultList();
    }

    public ArrayList setDesc(){
        return description;
    }
}
