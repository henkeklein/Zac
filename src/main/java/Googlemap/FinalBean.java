package Googlemap;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Henke on 2016-03-22.
 */
public class FinalBean implements Serializable{

    @SerializedName(""results"")
    private ArrayList<ResultBean> list = new ArrayList<>();

    public FinalBean (){

    }

    public ArrayList getResultList(){
        return list;
    }

}
