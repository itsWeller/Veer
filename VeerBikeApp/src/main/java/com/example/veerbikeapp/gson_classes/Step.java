package com.example.veerbikeapp.gson_classes;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chrisweller on 11/14/13.
 */
public class Step {
    @SerializedName("distance")
    public Distance distance;

    @SerializedName("duration")
    public Duration duration;

    @SerializedName("end_location")
    public Coordinate destination;

    @SerializedName("html_instructions")
    public String humanReadableInstructions;

    @SerializedName("maneuver")
    public String maneuver = "na";

    @SerializedName("polyline")
    public Polyline polyline;

    @SerializedName("start_location")
    public Coordinate origin;

    @SerializedName("travel_mode")
    public String transitMode;


}
