package com.example.ana.week4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        getSupportActionBar().setTitle("Call");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void call(View v){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        EditText number = (EditText)findViewById(R.id.number);
        String mobile = number.getText().toString();
        Intent callIntent = new Intent();
        callIntent.setAction(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel: "+ mobile));
        startActivity(callIntent);
    }
}
