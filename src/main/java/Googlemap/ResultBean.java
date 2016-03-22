package Googlemap;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Henke on 2016-03-11.
 */
public class ResultBean implements Serializable{

    @SerializedName(""address_components"")
    private ArrayList<AddressBean> list = new ArrayList<>();

    public ResultBean (){

    }

    public ArrayList getAddressList(){
        return list;
    }
}
