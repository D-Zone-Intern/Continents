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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_activity);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onStart() {
        super.onStart();

        Query myRef = FirebaseDatabase.getInstance().getReference().child("data");
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(myRef, model.class)
                        .build();

        new FirebaseRecyclerAdapter<model, countryviewholder>(options) {
            @NonNull
            @Override
            public countryviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.row, parent, false);

                return new countryviewholder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull countryviewholder holder, int position, @NonNull model model) {

                holder.setImage(model.getImage(), next_Activity.this);
                holder.setName(model.getName());
                holder.setCname(model.getCname());
            }


        };

    }
}
