package com.example.veerbikeapp.gson_classes;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chrisweller on 11/14/13.
 */
public class Distance {
    @SerializedName("text")
    public String humanReadableDist;

    @SerializedName("value")
    public String meters;
}
