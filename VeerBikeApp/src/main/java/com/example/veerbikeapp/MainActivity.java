package com.example.veerbikeapp;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.veerbikeapp.gson_classes.Step;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText destination = (EditText) findViewById(R.id.editText);
        final Button confirmDestination = (Button) findViewById(R.id.button);

        final LocationManager manager = (LocationManager) getApplicationContext().getSystemService(Context.LOCATION_SERVICE);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        confirmDestination.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ParseDestination myDest = new ParseDestination(destination.getText().toString());

                if(myDest.response.status.equals("OK")){
                    for(Step step:myDest.response.routes.get(0).legs.get(0).steps){
                        //Log.e("URGENT",Double.toString(step.destination.latitude) + " , " +Double.toString(step.destination.longitude));
                        //manager.addProximityAlert(step.destination.latitude,step.destination.longitude,10,1000,null);
                    }
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
