package com.example.veerbikeapp.gson_classes;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by chrisweller on 11/14/13.
 */
public class DirectionResponse {
    @SerializedName("routes")
    public List<Route> routes;

    @SerializedName("status")
    public String status;
}
