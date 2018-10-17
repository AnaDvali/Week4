package com.example.ana.week4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Main");
    }

    public void buttonCall(View v){
        Intent call = new Intent(this, CallActivity.class);
        startActivity(call);
    }

    public void buttonSend(View v){
        Intent message = new Intent(this, MessageActivity.class);
        startActivity(message);
    }

    public void buttonMap(View v){
        Intent map = new Intent(this, MapActivity.class);
        startActivity(map);
    }
}
