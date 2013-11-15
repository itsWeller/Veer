package com.example.veerbikeapp.gson_classes;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by chrisweller on 11/14/13.
 */
public class Leg {
    @SerializedName("distance")
    public Distance distance;

    @SerializedName("duration")
    public Duration duration;

    @SerializedName("end_address")
    public String endAddress;

    @SerializedName("end_location")
    public Coordinate endLocation;

    @SerializedName("start_address")
    public String startAddress;

    @SerializedName("start_location")
    public Coordinate startLocation;

    @SerializedName("steps")
    public List<Step> steps;

    @SerializedName("via_waypoint")
    public List<ViaWaypoint> viaWaypoints;


}
