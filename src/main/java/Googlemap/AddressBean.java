package Googlemap;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Henke on 2016-03-11.
 */
public class AddressBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @SerializedName("\"long_name\"")
    private String cityName;

    public AddressBean(){

    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String name){
        this.cityName = name;
    }


}
