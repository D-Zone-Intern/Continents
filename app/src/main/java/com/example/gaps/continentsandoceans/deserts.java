package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class deserts extends AppCompatActivity implements View.OnClickListener{

    CardView antarcticad,thard,namibd,kalaharid,gobid,saharad,arabiand;
    PhotoView photoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deserts);
        init();

    }

    private void init() {
        photoView = findViewById(R.id.svgthree);

        antarcticad = findViewById(R.id.desertantarctica);
        thard = findViewById(R.id.desertthar);
        namibd = findViewById(R.id.desertnamib);
        kalaharid = findViewById(R.id.desertkalahari);
        gobid = findViewById(R.id.desertgobi);
        saharad = findViewById(R.id.desertsahara);
        arabiand = findViewById(R.id.desertarabian);
        antarcticad.setOnClickListener((View.OnClickListener) this);
        thard.setOnClickListener((View.OnClickListener) this);
        namibd.setOnClickListener((View.OnClickListener) this);
        kalaharid.setOnClickListener((View.OnClickListener) this);
        gobid.setOnClickListener((View.OnClickListener) this);
        saharad.setOnClickListener((View.OnClickListener) this);
        arabiand.setOnClickListener((View.OnClickListener) this);

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
            case R.id.desertthar:
                Intent intenrR = new Intent(this, desertview_activity.class);
                intenrR.putExtra("dataa","Thar Desert");
                startActivity(intenrR);
                break;


        }
    }
}
