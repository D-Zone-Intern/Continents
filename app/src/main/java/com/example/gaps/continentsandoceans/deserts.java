package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class deserts extends AppCompatActivity implements View.OnClickListener{

    CardView antarcticad,thard,namibd,kalaharid,gobid,saharad,arabiand,coloradod,karakumd,mojaved,
            patagoniond,simsond,sonarand,tanamid,kyzyld,taklamakand,gibsond,australiand,greatbasind,
            greatvictoriad,greatsandyd,chihuhuand;
    PhotoView photoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deserts);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();

    }

    @Override
    public boolean onSupportNavigateUp(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        return true;
    }

    private void init() {
        photoView = findViewById(R.id.svgthree);
        simsond=findViewById(R.id.desertsimpson);
        simsond.setOnClickListener(this);
        sonarand=findViewById(R.id.desertsonaran);
        sonarand.setOnClickListener(this);
        tanamid=findViewById(R.id.deserttanami);
        tanamid.setOnClickListener(this);
        kyzyld=findViewById(R.id.desertkyzylkum);
        kyzyld.setOnClickListener(this);
        taklamakand=findViewById(R.id.deserttaklanam);
        taklamakand.setOnClickListener(this);
        gibsond=findViewById(R.id.desertgibson);
        gibsond.setOnClickListener(this);
        australiand=findViewById(R.id.desertaustralian);
        australiand.setOnClickListener(this);
        greatbasind=findViewById(R.id.desertgrtbasin);
        greatbasind.setOnClickListener(this);
        greatsandyd=findViewById(R.id.desertgrtsany);
        greatsandyd.setOnClickListener(this);
        greatvictoriad=findViewById(R.id.desertgrtvictoria);
        greatvictoriad.setOnClickListener(this);
        chihuhuand=findViewById(R.id.desertchihuhuan);
        chihuhuand.setOnClickListener(this);
        patagoniond=findViewById(R.id.desertpataginion);
        patagoniond.setOnClickListener(this);
        karakumd=findViewById(R.id.desertkarakum);
        karakumd.setOnClickListener(this);
        mojaved=findViewById(R.id.desertmojave);
        mojaved.setOnClickListener(this);
        coloradod = findViewById(R.id.desertcolorado);
        coloradod.setOnClickListener(this);
        antarcticad = findViewById(R.id.desertantarctica);
        thard = findViewById(R.id.desertthar);
        namibd = findViewById(R.id.desertnamib);
        kalaharid = findViewById(R.id.desertkalahari);
        gobid = findViewById(R.id.desertgobi);
        saharad = findViewById(R.id.desertsahara);
        arabiand = findViewById(R.id.desertarabian);
        antarcticad.setOnClickListener(this);
        thard.setOnClickListener(this);
        namibd.setOnClickListener(this);
        kalaharid.setOnClickListener(this);
        gobid.setOnClickListener(this);
        saharad.setOnClickListener(this);
        arabiand.setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();

        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.desertantarctica:
                Intent intent = new Intent(this, desertview_activity.class);
                intent.putExtra("dataa","Antarctica Desert");
                startActivity(intent);
                break;
            case R.id.desertarabian :
                Intent i = new Intent(this, desertview_activity.class);
                i.putExtra("dataa","Arabian Desert");
                startActivity(i);
                break;
            case R.id.desertgobi :
                Intent in = new Intent(this, desertview_activity.class);
                in.putExtra("dataa","Gobi Desert");
                startActivity(in);
                break;
            case R.id.desertkalahari :
                Intent inte = new Intent(this, desertview_activity.class);
                inte.putExtra("dataa","Kalahari Desert");
                startActivity(inte);
                break;
            case R.id.desertnamib :
                Intent inten = new Intent(this, desertview_activity.class);
                inten.putExtra("dataa","Namib Desert");
                startActivity(inten);
                break;
            case R.id.desertsahara:
                Intent intenr = new Intent(this, desertview_activity.class);
                intenr.putExtra("dataa","Sahara Desert");
                startActivity(intenr);
                break;
            case R.id.desertsimpson:
                Intent intenrR = new Intent(this, desertview_activity.class);
                intenrR.putExtra("dataa","Simpson desert");
                startActivity(intenrR);
                break;
            case R.id.desertsonaran:
                Intent intenrRw = new Intent(this, desertview_activity.class);
                intenrRw.putExtra("dataa","Sonaran Desert");
                startActivity(intenrRw);
                break;
            case R.id.desertchihuhuan:
                Intent intenrRq = new Intent(this, desertview_activity.class);
                intenrRq.putExtra("dataa","Chihuahuan desert");
                startActivity(intenrRq);
                break;
            case R.id.desertcolorado:
                Intent intenrRc = new Intent(this, desertview_activity.class);
                intenrRc.putExtra("dataa","Colorado Desert");
                startActivity(intenrRc);
                break;
            case R.id.desertmojave:
                Intent intenrRm = new Intent(this, desertview_activity.class);
                intenrRm.putExtra("dataa","Mojave Desert");
                startActivity(intenrRm);
                break;
            case R.id.desertgibson:
                Intent intenrRgb = new Intent(this, desertview_activity.class);
                intenrRgb.putExtra("dataa","Gibson Desert");
                startActivity(intenrRgb);
                break;
            case R.id.desertgrtbasin:
                Intent intenrRgs = new Intent(this, desertview_activity.class);
                intenrRgs.putExtra("dataa","Great Basin desert");
                startActivity(intenrRgs);
                break;
            case R.id.desertgrtsany:
                Intent intenrRsd = new Intent(this, desertview_activity.class);
                intenrRsd.putExtra("dataa","Great Sandy desert");
                startActivity(intenrRsd);
                break;
            case R.id.desertgrtvictoria:
                Intent intenrRvr = new Intent(this, desertview_activity.class);
                intenrRvr.putExtra("dataa","Great Victoria desert");
                startActivity(intenrRvr);
                break;

            case R.id.desertkarakum:
                Intent intenrRkr = new Intent(this, desertview_activity.class);
                intenrRkr.putExtra("dataa","Karakum desert");
                startActivity(intenrRkr);
                break;
            case R.id.desertkyzylkum:
                Intent intenrRkz = new Intent(this, desertview_activity.class);
                intenrRkz.putExtra("dataa","Kzyl Kum desert");
                startActivity(intenrRkz);
                break;
            case R.id.deserttaklanam:
                Intent intenrRtm = new Intent(this, desertview_activity.class);
                intenrRtm.putExtra("dataa","Taklamakan desert");
                startActivity(intenrRtm);
                break;
            case R.id.deserttanami:
                Intent intenrRtn = new Intent(this, desertview_activity.class);
                intenrRtn.putExtra("dataa","Tanami desert");
                startActivity(intenrRtn);
                break;
            case R.id.desertpataginion:
                Intent intenrRpt = new Intent(this, desertview_activity.class);
                intenrRpt.putExtra("dataa","Patagonian desert");
                startActivity(intenrRpt);
                break;
            case R.id.desertthar:
                Intent intenrRth = new Intent(this, desertview_activity.class);
                intenrRth.putExtra("dataa","Thar desert");
                startActivity(intenrRth);
                break;
            case R.id.desertaustralian:
                Intent intenrRaus = new Intent(this, desertview_activity.class);
                intenrRaus.putExtra("dataa","Australian desert");
                startActivity(intenrRaus);
                break;




        }
    }
}
