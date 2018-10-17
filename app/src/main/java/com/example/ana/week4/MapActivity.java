package com.example.ana.week4;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        getSupportActionBar().setTitle("Map");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void open(View view) {
        EditText la = (EditText)findViewById(R.id.latitude);
        EditText lo = (EditText)findViewById(R.id.longitude);
        double latitude, longitude;
        latitude = Double.parseDouble(String.valueOf(la.getText()));
        longitude = Double.parseDouble(String.valueOf(lo.getText()));
        String strUri = "http://maps.google.com/maps?q=loc:" + latitude + "," + longitude + " (" + "Location" + ")";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        startActivity(intent);
    }
}
