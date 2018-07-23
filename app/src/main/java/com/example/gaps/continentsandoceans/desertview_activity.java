package com.example.gaps.continentsandoceans;


import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;



public class desertview_activity extends AppCompatActivity {

    TextView txtdes;
    TextView txtd;
    ImageView imageViewd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desertview_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();
        Intent intent = getIntent();
        String value = intent.getStringExtra("dataa");

        if (value.equalsIgnoreCase("Kalahari Desert")){
            txtd.setText(R.string.kalaharidesert);
            imageViewd.setImageResource(R.drawable.kalahari);
            txtdes.setText(R.string.kalahari_desert);


        }else if (value.equalsIgnoreCase("Arabian Desert")){
            txtd.setText(R.string.arabiandesert);
            imageViewd.setImageResource(R.drawable.arabian);
            txtdes.setText(R.string.arabian_desert);


        } else if (value.equalsIgnoreCase("Namib Desert")) {
            txtd.setText(R.string.namibdesert);
            imageViewd.setImageResource(R.drawable.nabim);
            txtdes.setText(R.string.namib_desert);

        } else if (value.equalsIgnoreCase("Antarctica Desert")) {
            txtd.setText(R.string.antarcticadesert);
            imageViewd.setImageResource(R.drawable.antarctic);
            txtdes.setText(R.string.antarctica_desert);


        }else if (value.equalsIgnoreCase("Sahara Desert")){
            txtd.setText(R.string.saharadesert);
            imageViewd.setImageResource(R.drawable.sahara);
            txtdes.setText(R.string.sahara_desert);

        }else if (value.equalsIgnoreCase("Gobi Desert")){
            txtd.setText(R.string.gobidesert);
            imageViewd.setImageResource(R.drawable.gobi);
            txtdes.setText(R.string.gobi_desert);

        }else if (value.equalsIgnoreCase("Arabian Desert")){
            txtd.setText(R.string.arabiandesert);
            imageViewd.setImageResource(R.drawable.arabian);
            txtdes.setText(R.string.arabian_desert);
        }
        else if (value.equalsIgnoreCase("Thar Desert")){
            txtd.setText(R.string.thardesert);
            imageViewd.setImageResource(R.drawable.thar);
            txtdes.setText(R.string.thar_desert);
        }
        else if (value.equalsIgnoreCase("Antarctica desert")){
            txtd.setText(R.string.antarcticadesert);
            imageViewd.setImageResource(R.drawable.antarctic);
            txtdes.setText(R.string.antarctica_desert);
        }
        else if (value.equalsIgnoreCase("Colorado desert")){
            txtd.setText(R.string.colaradudesrt);
            imageViewd.setImageResource(R.drawable.colorado);
            txtdes.setText(R.string.colorado_desert);
        }
        else if (value.equalsIgnoreCase("Karakum desert")){
            txtd.setText(R.string.kurakumdesert);
            imageViewd.setImageResource(R.drawable.karakum);
            txtdes.setText(R.string.karakum_desert);
        }
        else if (value.equalsIgnoreCase("Mojave desert")){
            txtd.setText(R.string.mojavedesert);
            imageViewd.setImageResource(R.drawable.mojave);
            txtdes.setText(R.string.mojave_desert);
        }
        else if (value.equalsIgnoreCase("Patagonian desert")){
            txtd.setText(R.string.patigniandesert);
            imageViewd.setImageResource(R.drawable.patagonion);
            txtdes.setText(R.string.patagonian_desert);
        }
        else if (value.equalsIgnoreCase("Simpson desert")){
            txtd.setText(R.string.simpsondesert);
            imageViewd.setImageResource(R.drawable.simpson);
            txtdes.setText(R.string.simpson_desert);
        }
        else if (value.equalsIgnoreCase("Sonaran desert")){
            txtd.setText(R.string.sonarandesert);
            imageViewd.setImageResource(R.drawable.sonaran);
            txtdes.setText(R.string.sonaran_desert);
        }
        else if (value.equalsIgnoreCase("Tanami desert")){
            txtd.setText(R.string.tanamidesert);
            imageViewd.setImageResource(R.drawable.tanami);
            txtdes.setText(R.string.tanami_desert);
        }
        else if (value.equalsIgnoreCase("Kzyl Kum desert")){
            txtd.setText(R.string.kzyldesert);
            imageViewd.setImageResource(R.drawable.kyzlkum);
            txtdes.setText(R.string.kzyl_kum_desert);
        }
        else if (value.equalsIgnoreCase("Taklamakan desert")){
            txtd.setText(R.string.taklamandesert);
            imageViewd.setImageResource(R.drawable.taklamakan);
            txtdes.setText(R.string.taklamakan_desert);
        }
        else if (value.equalsIgnoreCase("Gibson desert")){
            txtd.setText(R.string.gibsondesert);
            imageViewd.setImageResource(R.drawable.gibson);
            txtdes.setText(R.string.gibson_desert);
        }
        else if (value.equalsIgnoreCase("Australian desert")){
            txtd.setText(R.string.australiandesert);
            imageViewd.setImageResource(R.drawable.australian);
            txtdes.setText(R.string.australian_desert);
        }
        else if (value.equalsIgnoreCase("Great Basin desert")){
            txtd.setText(R.string.grestbasindesert);
            imageViewd.setImageResource(R.drawable.greatbasin);
            txtdes.setText(R.string.great_basin_desert);
        }
        else if (value.equalsIgnoreCase("Great Victoria desert")){
            txtd.setText(R.string.greatvictoriadesert);
            imageViewd.setImageResource(R.drawable.greatvictoria);
            txtdes.setText(R.string.great_victoria_desert);
        }
        else if (value.equalsIgnoreCase("Great Sandy desert")){
            txtd.setText(R.string.greatsandydesert);
            imageViewd.setImageResource(R.drawable.greatsandy);
            txtdes.setText(R.string.great_sandy_desert);
        }
        else if (value.equalsIgnoreCase("Chihuahuan desert")){
            txtd.setText(R.string.chihuhuvandesert);
            imageViewd.setImageResource(R.drawable.chihuvan);
            txtdes.setText(R.string.chihuahuan_desert);
        }
    }

    private void init() {

        imageViewd = findViewById(R.id.imagest);
        txtd = findViewById(R.id.textst);
        txtdes = findViewById(R.id.desertname);
    }


    @Override
    public boolean onSupportNavigateUp(){
        Intent intent = new Intent(this, deserts.class);
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
