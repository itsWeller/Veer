package com.example.veerbikeapp.gson_classes;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chrisweller on 11/14/13.
 */
public class Coordinate {
    @SerializedName("lat")
    public double  latitude;

    @SerializedName("lng")
    public double longitude;

}
