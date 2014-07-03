package com.example.gfx.over65methods;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.common.GooglePlayServicesUtil;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("Over 65k Methods!");

        Log.d("XXX", "" + GooglePlayServicesUtil.isGooglePlayServicesAvailable(this));
    }
}
