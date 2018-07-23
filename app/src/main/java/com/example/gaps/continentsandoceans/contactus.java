package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class contactus extends AppCompatActivity  {

    TextView email;
    TextView fb;
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }








    @Override
    public boolean onSupportNavigateUp(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        return true;
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();

        finish();
    }

}
