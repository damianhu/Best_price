package ca.uwaterloo.ece651.pricecompare.DataReq;

import android.util.Log;
import com.google.gson.annotations.*;

public class MyRequest{
    //TODO : I hope myRequest can be an interface, so frontend developer won't have to specify the object they create
    //TODO : use factory pattern


    //responses of querying product:
    @SerializedName("UPC")
    @Expose
    private String UPC;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("category")
    @Expose
    private int category;

    @SerializedName("picture")
    @Expose
    private String picture;

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setCategory(int category) {
        this.category = category;
    }


    public void show(){
        Log.d("upc:", "" + getUPC());
        Log.d("name:", "" + getName());
        Log.d("category:", "" + getCategory());
        Log.d("picture:", "" + getPicture());

    }
}


