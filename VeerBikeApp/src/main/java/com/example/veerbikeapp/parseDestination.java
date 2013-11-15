package com.example.veerbikeapp;

import android.net.Uri;
import android.util.Log;

import com.example.veerbikeapp.gson_classes.DirectionResponse;
import com.google.gson.Gson;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by chrisweller on 11/14/13.
 */
public class ParseDestination {

    String url;
    String origin = Uri.encode("9450 Gilman Drive, La Jolla, California");
    String sensor = "true";
    DirectionResponse response;

    ParseDestination(String destination){
        url = "http://maps.googleapis.com/maps/api/directions/json?origin="+ origin  +
                "&destination=" + Uri.encode(destination) +"&sensor="+sensor+"&mode=bicycling";

        InputStream source = retrieveStream(url);

        response = new Gson().fromJson(new InputStreamReader(source), DirectionResponse.class);
        Log.e("Response Status",response.status);
    }

    public boolean isValid(){
        return response.status.equals("OK");
    }



//TAKEN FROM ONLINE
    private InputStream retrieveStream(String url) {

        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet(url);

        try {
            HttpResponse getResponse = client.execute(getRequest);
            final int statusCode = getResponse.getStatusLine().getStatusCode();

            if (statusCode != HttpStatus.SC_OK) {
                Log.w(getClass().getSimpleName(),
                        "Error " + statusCode + " for URL " + url);
                return null;
            }

            HttpEntity getResponseEntity = getResponse.getEntity();
            return getResponseEntity.getContent();

        }
        catch (IOException e) {
            getRequest.abort();
            Log.w(getClass().getSimpleName(), "Error for URL " + url, e);
        }

        return null;

    }


}


