package com.example.gaps.continentsandoceans;

import android.content.Intent;
<<<<<<< HEAD
=======
import android.support.annotation.NonNull;
>>>>>>> vikash
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
<<<<<<< HEAD
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class next_Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DatabaseReference firebaseDatabase;
=======
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.io.Serializable;

public class next_Activity extends AppCompatActivity  {
    RecyclerView recyclerView;
    DatabaseReference databaseReference;
    FirebaseRecyclerAdapter<model, countryviewholder> adapter;
>>>>>>> vikash

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.activity_next_);
        Intent intent = getIntent();
        String value = intent.getStringExtra("data");
        firebaseDatabase = FirebaseDatabase.getInstance().getReference(value);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

=======
        setContentView(R.layout.next_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();

    }

    public void init() {
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        databaseReference = FirebaseDatabase.getInstance().getReference();
        Intent intent = getIntent();
        String value = intent.getStringExtra("data");
        Query query = FirebaseDatabase.getInstance().getReference().child(value);

        FirebaseRecyclerOptions<model> options = new FirebaseRecyclerOptions.Builder<model>()
                .setQuery(query, model.class)
                .build();
        adapter = new FirebaseRecyclerAdapter<model, countryviewholder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull countryviewholder holder, int position, @NonNull model model) {

                holder.setDesc(model.getDesc());
                holder.setImage(model.getImage(),next_Activity.this);
                holder.setName(model.getName());
            }

            @NonNull
            @Override
            public countryviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
                return new countryviewholder(v);
            }
        };
        recyclerView.setAdapter(adapter);
>>>>>>> vikash
    }

    @Override
    protected void onStart() {
        super.onStart();
<<<<<<< HEAD
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
=======
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }


    @Override
    public boolean onSupportNavigateUp(){
        Intent intent = new Intent(this, continentsview.class);
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

<<<<<<< HEAD
>>>>>>> vikash
=======

>>>>>>> vikash
