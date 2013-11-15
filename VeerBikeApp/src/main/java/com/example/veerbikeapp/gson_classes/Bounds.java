package com.example.veerbikeapp.gson_classes;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chrisweller on 11/14/13.
 */
public class Bounds {
    @SerializedName("northeast")
    public Coordinate northEastCoord;

    @SerializedName("southwest")
    public Coordinate southWestCoord;
}
