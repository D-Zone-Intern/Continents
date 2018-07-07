package com.example.gaps.continentsandoceans;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class nextActivity2 extends AppCompatActivity {
        TextView textView;
        TextView txt;
        ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oceans);
        init();
        Intent intent = getIntent();
        String value = intent.getStringExtra("dataa");

        textView.setText(value);
        if (value.equalsIgnoreCase("Indian Ocean")){
            txt.setText(R.string.indianocean);
            imageView.setImageResource(R.drawable.indian_ocean);
        }else if (value.equalsIgnoreCase("Southern Ocean")){
            txt.setText(R.string.southernocean);
            imageView.setImageResource(R.drawable.southern_ocean);

        } else if (value.equalsIgnoreCase("Pacific Ocean"))
        {
            txt.setText(R.string.pacificOceantext);
            imageView.setImageResource(R.drawable.pacific_ocean);

        } else if (value.equalsIgnoreCase("Arctic Ocean"))
        {
            txt.setText(R.string.arctictxt);
            imageView.setImageResource(R.drawable.arctic_ocean);


        }else if (value.equalsIgnoreCase("Atlantic Ocean")){
            txt.setText(R.string.atlantistxt);
            imageView.setImageResource(R.drawable.atlantic_ocean);
        }
    }

    private void init() {

        textView = findViewById(R.id.txte2);
        imageView = findViewById(R.id.imge);
        txt = findViewById(R.id.txte);

    }
}
