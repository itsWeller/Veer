package com.example.veerbikeapp;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;

import java.util.List;

/**
 * Created by chrisweller on 11/16/13.
 */
public class PolylineHandler {

   public List<LatLng> getPoints(Polyline pLine){
        return pLine.getPoints();
    }


}
