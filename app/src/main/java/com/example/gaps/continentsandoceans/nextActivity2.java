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

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class nextActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    DatabaseReference databaseReference;
    FirebaseRecyclerAdapter<model2, oceansviewholder> adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next2);

        init();

    }

    private void init() {
        recyclerView = findViewById(R.id.recycler2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        databaseReference = FirebaseDatabase.getInstance().getReference();
        Intent intent = getIntent();
        String value = intent.getStringExtra("data");
        Query query = FirebaseDatabase.getInstance().getReference().child(value);

        FirebaseRecyclerOptions<model2> options = new FirebaseRecyclerOptions.Builder<model2>()
                .setQuery(query, model2.class)
                .build();
        adapter2 = new FirebaseRecyclerAdapter<model2, oceansviewholder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull oceansviewholder holder, int position, @NonNull model2 model2) {
                holder.setoImage(model2.getoImage(), nextActivity2.this);
                holder.setoName(model2.getoDesc());
                holder.setoName(model2.getoName());
            }

            @NonNull
            @Override
            public oceansviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row2, parent, false);
                return new oceansviewholder(v);
            }
        };
        recyclerView.setAdapter(adapter2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter2.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter2.stopListening();
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




    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }



}
