package com.example.veerbikeapp.gson_classes;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chrisweller on 11/14/13.
 */
public class Duration {
    @SerializedName("text")
    public String humanReadableDuration;

    @SerializedName("value")
    public String seconds;
}
