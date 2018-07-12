package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class oceanview_activty extends AppCompatActivity {


    TextView txt;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oceanview_activty);
        init();
        Intent intent = getIntent();
        String value = intent.getStringExtra("dataa");


        if (value.equalsIgnoreCase("Indian Ocean")) {
            txt.setText(R.string.indian_ocean_txt);
            imageView.setImageResource(R.drawable.indian_ocean);
        } else if (value.equalsIgnoreCase("Southern Ocean")) {
            txt.setText(R.string.southern_ocean_txt);
            imageView.setImageResource(R.drawable.southern_ocean);

        } else if (value.equalsIgnoreCase("Pacific Ocean")) {
            txt.setText(R.string.pacific_ocean_txt);
            imageView.setImageResource(R.drawable.pacific_ocean);

        } else if (value.equalsIgnoreCase("Arctic Ocean")) {
            txt.setText(R.string.arctic_ocean_txt);
            imageView.setImageResource(R.drawable.arctic_ocean);


        } else if (value.equalsIgnoreCase("Atlantic Ocean")) {
            txt.setText(R.string.atlantis_ocean_txt);
            imageView.setImageResource(R.drawable.atlantic_ocean);
        }
    }

    private void init() {


        imageView = findViewById(R.id.imagestocean);
        txt = findViewById(R.id.textstocean);

    }
}
