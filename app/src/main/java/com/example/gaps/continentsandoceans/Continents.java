package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.github.chrisbanes.photoview.PhotoView;

public class Continents extends AppCompatActivity implements View.OnClickListener {
        CardView asia,europe,africa,namerica,samerica,antarctica,australia;
        PhotoView photoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.continents);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();
    }

    public void init() {
        photoView = findViewById(R.id.svgone);
        photoView.setImageResource(R.drawable.sevencontinents);
        asia = findViewById(R.id.asia);
        europe = findViewById(R.id.europe);
        africa = findViewById(R.id.africa);
        namerica = findViewById(R.id.namaerica);
        samerica = findViewById(R.id.samerica);
        antarctica = findViewById(R.id.antarctica);
        australia = findViewById(R.id.australia);
        asia.setOnClickListener(this);
        europe.setOnClickListener(this);
        africa.setOnClickListener(this);
        namerica.setOnClickListener(this);
        samerica.setOnClickListener(this);
        antarctica.setOnClickListener(this);
        australia.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        return true;
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.asia:
                Intent intent = new Intent(this, continentsview.class);
                intent.putExtra("data","asia");
                startActivity(intent);
                break;
            case R.id.europe :
                Intent i = new Intent(this, continentsview.class);
                i.putExtra("data","europe");
                startActivity(i);
                break;
            case R.id.namaerica :
                Intent in = new Intent(this, continentsview.class);
                in.putExtra("data","namerica");
                startActivity(in);
                break;
            case R.id.samerica :
                Intent inte = new Intent(this, continentsview.class);
                inte.putExtra("data","samerica");
                startActivity(inte);
                break;
            case R.id.africa :
                Intent inten = new Intent(this, continentsview.class);
                inten.putExtra("data","africa");
                startActivity(inten);
                break;
            case R.id.australia :
                Intent intent1 = new Intent(this, continentsview.class);
                intent1.putExtra("data","australia");
                startActivity(intent1);
                break;
            case R.id.antarctica :
                Intent intent2 = new Intent(this, continentsview.class);
                intent2.putExtra("data","antarctica");
                startActivity(intent2);
                break;


        }
    }


    @Override
    public void onBackPressed() {

        super.onBackPressed();
        finish();

    }






}
