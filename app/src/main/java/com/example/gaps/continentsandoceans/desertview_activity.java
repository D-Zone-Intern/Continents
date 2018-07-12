package com.example.gaps.continentsandoceans;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class desertview_activity extends AppCompatActivity {


    TextView txtd;
    ImageView imageViewd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desertview_activity);

        init();
        Intent intent = getIntent();
        String value = intent.getStringExtra("dataa");

        if (value.equalsIgnoreCase("Antarctica Desert")){
            txtd.setText(R.string.antarcticadesert);
            imageViewd.setImageResource(R.drawable.desertantarctica);
        }else if (value.equalsIgnoreCase("Arabian Desert")){
            txtd.setText(R.string.arabiandesert);
            imageViewd.setImageResource(R.drawable.desertarabian);

        } else if (value.equalsIgnoreCase("Gobi Desert"))
        {
            txtd.setText(R.string.gobidesert);
            imageViewd.setImageResource(R.drawable.desertgobi);

        } else if (value.equalsIgnoreCase("Kalahari Desert"))
        {
            txtd.setText(R.string.kalaharidesert);
            imageViewd.setImageResource(R.drawable.desertkalahari);


        }else if (value.equalsIgnoreCase("Namib Desert")){
            txtd.setText(R.string.namibdesert);
            imageViewd.setImageResource(R.drawable.desertnamib);
        }else if (value.equalsIgnoreCase("Sahara Desert")){
            txtd.setText(R.string.saharadesert);
            imageViewd.setImageResource(R.drawable.desertsahara);
        }else if (value.equalsIgnoreCase("Thar Desert")){
            txtd.setText(R.string.thardesert);
            imageViewd.setImageResource(R.drawable.desertthar);
        }
    }

    private void init() {

        imageViewd = findViewById(R.id.imagest);
        txtd = findViewById(R.id.textst);
    }
}
