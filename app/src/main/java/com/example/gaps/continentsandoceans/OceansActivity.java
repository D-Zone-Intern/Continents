package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class OceansActivity extends AppCompatActivity implements View.OnClickListener {


    ImageButton asia,europe,africa,namerica,samerica,antarctica,australia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceans);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        init();
    }

    private void init() {
        asia = findViewById(R.id.asia);
        europe = findViewById(R.id.europe);
        africa = findViewById(R.id.africa);
        namerica = findViewById(R.id.namaerica);
        samerica = findViewById(R.id.samerica);
        antarctica = findViewById(R.id.antarctica);
        australia = findViewById(R.id.australia);
        asia.setOnClickListener(this);
        europe.setOnClickListener(this);
        africa.setOnClickListener(this);
        namerica.setOnClickListener(this);
        samerica.setOnClickListener(this);
        antarctica.setOnClickListener(this);
        australia.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.asia :
                Intent intent = new Intent(this, nextActivity2.class);
                intent.putExtra("data","asia");
                startActivity(intent);
                break;
            case R.id.europe :
                Intent i = new Intent(this, nextActivity2.class);
                i.putExtra("data","europe");
                startActivity(i);
                break;
            case R.id.namaerica :
                Intent in = new Intent(this, nextActivity2.class);
                in.putExtra("data","namerica");
                startActivity(in);
                break;
            case R.id.samerica :
                Intent inte = new Intent(this, nextActivity2.class);
                inte.putExtra("data","samerica");
                startActivity(inte);
                break;
            case R.id.africa :
                Intent inten = new Intent(this, nextActivity2.class);
                inten.putExtra("data","africa");
                startActivity(inten);
                break;
            case R.id.australia :
                Intent intent1 = new Intent(this, nextActivity2.class);
                intent1.putExtra("data","australia");
                startActivity(intent1);
                break;
            case R.id.antarctica :
                Intent intent2 = new Intent(this, nextActivity2.class);
                intent2.putExtra("data","antarctica");
                startActivity(intent2);
                break;


        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Continents and Oceans");
            startActivity(Intent.createChooser(sharingIntent, "Share via"));

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        return true;
    }

    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }





}
