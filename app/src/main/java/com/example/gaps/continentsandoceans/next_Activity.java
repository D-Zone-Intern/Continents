package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class next_Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DatabaseReference firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_);
        Intent intent = getIntent();
        String value = intent.getStringExtra("data");
        firebaseDatabase = FirebaseDatabase.getInstance().getReference(value);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<model, countryviewholder> firebaseRecyclerAdapter = new
                FirebaseRecyclerAdapter<model, countryviewholder>(model.class, R.layout.row, countryviewholder.class, firebaseDatabase) {


                    @Override
                    protected void populateViewHolder(countryviewholder viewHolder, model model, int position) {
                        viewHolder.setImage(model.getImage(),next_Activity.this);
                        viewHolder.setName(model.getName());
                        viewHolder.setCname(model.getCname());

                    }


                };
    }
}
