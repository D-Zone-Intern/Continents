package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class next_Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    DatabaseReference databaseReference;
    private Query query;
    private FirebaseRecyclerOptions<model> options;
    FirebaseRecyclerAdapter<model, countryviewholder> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_activity);
        init();

    }

    private void init() {
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        databaseReference = FirebaseDatabase.getInstance().getReference();
        Intent intent = getIntent();
        String value = intent.getStringExtra("data");
        query = FirebaseDatabase.getInstance().getReference().child(value);

        options = new FirebaseRecyclerOptions.Builder<model>()
                .setQuery(query, model.class)
                .build();
        adapter = new FirebaseRecyclerAdapter<model, countryviewholder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull countryviewholder holder, int position, @NonNull model model) {
                holder.setImage(model.getImage(), next_Activity.this);
                holder.setName(model.getName());
                holder.setCname(model.getCname());
            }

            @NonNull
            @Override
            public countryviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
                return new countryviewholder(v);
            }
        };
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}

