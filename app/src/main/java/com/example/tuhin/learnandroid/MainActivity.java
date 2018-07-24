package com.example.tuhin.learnandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends Activity {

    String msg = "Android : ";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");
    }



}
