package com.example.klsbcahaliyal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class semi5 extends AppCompatActivity {
    RecyclerView rec;
    sem5adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi5);

        rec = (RecyclerView) findViewById(R.id.recfeg5);
        rec.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<sem5model> options5 =
                new FirebaseRecyclerOptions.Builder<sem5model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("sem5"), sem5model.class)
                        .build();


        adapter = new sem5adapter(options5);
        rec.setAdapter(adapter);
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