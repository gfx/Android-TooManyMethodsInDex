package com.example.gfx.over65methods;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("Over 65k Methods!");

        Log.d("XXX", "C0 " + C0.f0());
        Log.d("XXX", "C1 " + C1.f0());
        Log.d("XXX", "C2 " + C2.f0());
        Log.d("XXX", "C3 " + C3.f0());
        Log.d("XXX", "C4 " + C4.f0());
        Log.d("XXX", "C5 " + C5.f0());
    }
}
