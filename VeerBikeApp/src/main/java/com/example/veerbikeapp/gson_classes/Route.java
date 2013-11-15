package com.example.veerbikeapp.gson_classes;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by chrisweller on 11/14/13.
 */
public class Route {
    @SerializedName("bounds")
    public Bounds bounds;

    @SerializedName("copyrights")
    public String copyrights;

    @SerializedName("legs")
    public List<Leg> legs;

    @SerializedName("overview_polyline")
    public Polyline polyline;

    @SerializedName("summary")
    public String routeSummary;

    @SerializedName("warnings")
    public List<String> warnings;

    @SerializedName("waypoint_order")
    public List<String> placeHolder;
}
