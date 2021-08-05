package com.example.klsbcahaliyal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class semi1 extends AppCompatActivity {
    RecyclerView rec;
    sem1adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi1);

        rec = (RecyclerView) findViewById(R.id.recfeg);
        rec.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<sem1model> options1 =
                new FirebaseRecyclerOptions.Builder<sem1model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("sem1"), sem1model.class)
                        .build();


        adapter = new sem1adapter(options1);
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