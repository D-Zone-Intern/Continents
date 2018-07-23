package com.example.gaps.continentsandoceans;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class oceanview_activty extends AppCompatActivity {

    TextView txtocn;
    TextView txt;
    ImageView imageView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oceanview_activty);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();
        Intent intent = getIntent();
        String value = intent.getStringExtra("dataa");


        if (value.equalsIgnoreCase("Indian Ocean")) {
            txt.setText(R.string.indianoceantxt);
            imageView.setImageResource(R.drawable.indian_ocean);
            txtocn.setText("Indian Ocean");
        } else if (value.equalsIgnoreCase("Southern Ocean")) {
            txt.setText(R.string.southern_ocean_txt);
            imageView.setImageResource(R.drawable.southern_ocean);
            txtocn.setText("Southern Ocean");

        } else if (value.equalsIgnoreCase("Pacific Ocean")) {
            txt.setText(R.string.pacificOceantext);
            imageView.setImageResource(R.drawable.pacific_ocean);
            txtocn.setText("Pacific Ocean");

        } else if (value.equalsIgnoreCase("Arctic Ocean")) {
            txt.setText(R.string.arctictxt);
            imageView.setImageResource(R.drawable.arctic_ocean);
            txtocn.setText("Arctic Ocean");


        } else if (value.equalsIgnoreCase("Atlantic Ocean")) {
            txt.setText(R.string.atlantistxt);
            imageView.setImageResource(R.drawable.atlantic_ocean);
            txtocn.setText("Atlantis Ocean");
        }
    }

    private void init() {


        imageView = findViewById(R.id.imagestocean);
        txt = findViewById(R.id.textstocean);
        txtocn = findViewById(R.id.txtocn);

    }

    @Override
    public boolean onSupportNavigateUp(){
        Intent intent = new Intent(this, OceansActivity.class);
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
