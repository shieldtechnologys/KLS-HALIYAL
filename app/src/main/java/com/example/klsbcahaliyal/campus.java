package com.example.klsbcahaliyal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class campus extends AppCompatActivity {
    RecyclerView rec;
    myadapter1 adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);
        rec=(RecyclerView)findViewById(R.id.rec);
        rec.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<model1> options =
                new FirebaseRecyclerOptions.Builder<model1>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("camp"), model1.class)
                        .build();
        adapter1=new myadapter1(options);
        rec.setAdapter(adapter1);

    }
    @Override
    protected void onStart() {
        super.onStart();
        adapter1.startListening();
    }
    @Override
    protected void onStop() {
        super.onStop();
        adapter1.stopListening();
    }
}