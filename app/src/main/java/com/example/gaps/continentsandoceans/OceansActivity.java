package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class OceansActivity extends AppCompatActivity implements View.OnClickListener {


    CardView indianocean,southernocean,pacificocean,arcticocean,atlanticocean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceans);

        init();
    }

    private void init() {
        indianocean = findViewById(R.id.indian_ocean);
        southernocean = findViewById(R.id.southern_ocean);
        pacificocean = findViewById(R.id.pacific_ocean);
        arcticocean = findViewById(R.id.arctic_ocean);
        atlanticocean = findViewById(R.id.atlantis_ocean);

        indianocean.setOnClickListener(this);
        southernocean.setOnClickListener(this);
        pacificocean.setOnClickListener(this);
        arcticocean.setOnClickListener(this);
        atlanticocean.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.indian_ocean:
                Intent intent = new Intent(this, Indian_ocean.class);
                intent.putExtra("dataa","Indian Ocean");
                startActivity(intent);
                break;
            case R.id.southern_ocean :
                Intent i = new Intent(this, southern_ocean.class);
                i.putExtra("dataa","Southern Ocean");
                startActivity(i);
                break;
            case R.id.pacific_ocean :
                Intent in = new Intent(this, pacific_ocean.class);
                in.putExtra("dataa","Pacific Ocean");
                startActivity(in);
                break;
            case R.id.arctic_ocean :
                Intent inte = new Intent(this, arctic_ocean.class);
                inte.putExtra("dataa","Arctic Ocean");
                startActivity(inte);
                break;
            case R.id.atlantis_ocean :
                Intent inten = new Intent(this, atlantic_ocean.class);
                inten.putExtra("dataa","Atlantic Ocean");
                startActivity(inten);
                break;


        }
    }





    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }





}
