package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences settings = getSharedPreferences("prefs",0);
        boolean firstrun = settings.getBoolean("firstrun",false);
        if (!firstrun){
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("firstrun",true);
            editor.apply();
            Intent i = new Intent(getApplicationContext(),splash_acivity.class);
            startActivity(i);
            finish();


        }else {
            Intent i = new Intent(getApplicationContext(),splash_normal.class);
            startActivity(i);
            finish();

        }
    }
}
