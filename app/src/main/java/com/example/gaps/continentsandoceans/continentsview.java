package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class continentsview extends AppCompatActivity {

    TextView txtcont;
    ImageView imageViewcont;
    TextView clickbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continentsview);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();
        Intent intent = getIntent();
        String value = intent.getStringExtra("data");

        if (value.equalsIgnoreCase("asia")){
            txtcont.setText(R.string.asia);
            imageViewcont.setImageResource(R.drawable.asia);
            clickbutton.setText(R.string.click_to_view_contries_of_asia);
            clickbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(continentsview.this, next_Activity.class);
                    intent.putExtra("data","asia");
                    startActivity(intent);
                }
            });
        }else if (value.equalsIgnoreCase("samerica")){
            txtcont.setText(R.string.south_america);
            imageViewcont.setImageResource(R.drawable.south_america);
            clickbutton.setText(R.string.click_to_view_contries_of_south_america);
            clickbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(continentsview.this, next_Activity.class);
                    intent.putExtra("data","samerica");
                    startActivity(intent);
                }
            });

        } else if (value.equalsIgnoreCase("namerica"))
        {
            txtcont.setText(R.string.north_america);
            imageViewcont.setImageResource(R.drawable.north_america);
            clickbutton.setText(R.string.click_to_view_contries_of_north_america);
            clickbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(continentsview.this, next_Activity.class);
                    intent.putExtra("data","namerica");
                    startActivity(intent);
                }
            });

        } else if (value.equalsIgnoreCase("africa"))
        {
            txtcont.setText(R.string.africa);
            imageViewcont.setImageResource(R.drawable.africa);
            clickbutton.setText(R.string.click_to_view_contries_of_africa);
            clickbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(continentsview.this, next_Activity.class);
                    intent.putExtra("data","africa");
                    startActivity(intent);
                }
            });


        }else if (value.equalsIgnoreCase("europe")){
            txtcont.setText(R.string.europe);
            imageViewcont.setImageResource(R.drawable.europe);
            clickbutton.setText(R.string.click_to_view_contries_of_europe);
            clickbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(continentsview.this, next_Activity.class);
                    intent.putExtra("data","europe");
                    startActivity(intent);
                }
            });

        }else if (value.equalsIgnoreCase("antarctica")){
            txtcont.setText(R.string.antarctica);
            imageViewcont.setImageResource(R.drawable.antarctica);
            clickbutton.setText(R.string.click_to_view_contries_of_antarctica);
            clickbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(continentsview.this, next_Activity.class);
                    intent.putExtra("data","antacrtica");
                    startActivity(intent);
                }
            });

        }else if (value.equalsIgnoreCase("australia")){
            txtcont.setText(R.string.australia);
            imageViewcont.setImageResource(R.drawable.australia);
            clickbutton.setText(R.string.click_to_view_contries_of_australia);
            clickbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(continentsview.this, next_Activity.class);
                    intent.putExtra("data","australia");
                    startActivity(intent);
                }
            });
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        Intent intent = new Intent(this, Continents.class);
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


    public void init() {

        imageViewcont = findViewById(R.id.imagecont);
        txtcont = findViewById(R.id.textcont);
        clickbutton = findViewById(R.id.txtclick);
    }
}
