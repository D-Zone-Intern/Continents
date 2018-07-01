package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class nextActivity2 extends AppCompatActivity {
        TextView txte,txte2;
        ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next2);
        txte = findViewById(R.id.txte);
        txte2 = findViewById(R.id.txte2);
        imageView = findViewById(R.id.imge);
        Intent intent = getIntent();
        String value = intent.getStringExtra("dataa");
        if (value.equalsIgnoreCase("Indian Ocean")){
            imageView.setImageResource(R.drawable.indianocean1);
            txte.setText("Indian Ocean");
            txte2.setText(R.string.indianocean);
        }else if (value.equalsIgnoreCase("Southern Ocean")){

            txte.setText("Southern Ocean");
            txte2.setText(R.string.southernocean);

        }
    }
}
