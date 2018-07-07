package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.github.chrisbanes.photoview.PhotoView;

public class OceansActivity extends AppCompatActivity implements View.OnClickListener {


    CardView indianocean,southernocean,pacificocean,arcticocean,atlanticocean;
    PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceans);

        init();
    }

    private void init() {
        photoView = findViewById(R.id.svgtwo);
        photoView.setImageResource(R.drawable.indian_ocean);
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
                Intent intent = new Intent(this, nextActivity2.class);
                intent.putExtra("dataa","Indian Ocean");
                startActivity(intent);
                break;
            case R.id.southern_ocean :
                Intent i = new Intent(this, nextActivity2.class);
                i.putExtra("dataa","Southern Ocean");
                startActivity(i);
                break;
            case R.id.pacific_ocean :
                Intent in = new Intent(this, nextActivity2.class);
                in.putExtra("dataa","Pacific Ocean");
                startActivity(in);
                break;
            case R.id.arctic_ocean :
                Intent inte = new Intent(this, nextActivity2.class);
                inte.putExtra("dataa","Arctic Ocean");
                startActivity(inte);
                break;
            case R.id.atlantis_ocean :
                Intent inten = new Intent(this, nextActivity2.class);
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
