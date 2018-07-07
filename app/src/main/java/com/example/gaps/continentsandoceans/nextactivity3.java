package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class nextactivity3 extends AppCompatActivity {
    TextView textViewd;
    TextView txtd;
    ImageView imageViewd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextactivity3);
        init();
        Intent intent = getIntent();
        String value = intent.getStringExtra("dataa");
        textViewd.setText(value);
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
        textViewd = findViewById(R.id.txte2d);
        imageViewd = findViewById(R.id.imged);
        txtd = findViewById(R.id.txted);

    }
}
