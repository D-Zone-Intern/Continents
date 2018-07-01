package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class OceansActivity extends AppCompatActivity implements View.OnClickListener {


    ImageButton indianocean,southernocean,pacificocean,arcticocean,atlanticocean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceans);

        init();
    }

    private void init() {
        indianocean = findViewById(R.id.indianocean);
        southernocean = findViewById(R.id.southernocean);
        pacificocean = findViewById(R.id.pacificocean);
        arcticocean = findViewById(R.id.arcticocean);
        atlanticocean = findViewById(R.id.atlantisocean);

        indianocean.setOnClickListener(this);
        southernocean.setOnClickListener(this);
        pacificocean.setOnClickListener(this);
        arcticocean.setOnClickListener(this);
        atlanticocean.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.indianocean:
                Intent intent = new Intent(this, Indian_ocean.class);
                intent.putExtra("dataa","Indian Ocean");
                startActivity(intent);
                break;
            case R.id.southernocean :
                Intent i = new Intent(this, southern_ocean.class);
                i.putExtra("dataa","Southern Ocean");
                startActivity(i);
                break;
            case R.id.pacificocean :
                Intent in = new Intent(this, pacific_ocean.class);
                in.putExtra("dataa","Pacific Ocean");
                startActivity(in);
                break;
            case R.id.arcticocean :
                Intent inte = new Intent(this, arctic_ocean.class);
                inte.putExtra("dataa","Arctic Ocean");
                startActivity(inte);
                break;
            case R.id.atlantisocean :
                Intent inten = new Intent(this, atlantic_ocean.class);
                inten.putExtra("dataa","Atlantic Ocean");
                startActivity(inten);
                break;


        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Continents and Oceans");
            startActivity(Intent.createChooser(sharingIntent, "Share via"));

            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }





}
