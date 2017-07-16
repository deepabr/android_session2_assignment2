package com.example.deepa.firstapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static android.R.attr.name;

public class MainActivity extends Activity {

    private static final String Tag=MainActivity.class.getSimpleName();
    String name="deepa";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(Tag, "inside onCreate method");
        Log.e(Tag, "Inside onCreate method");
        Log.d(Tag,"My name is "+name );


    }





}
