package com.example.klsbcahaliyal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class semi2 extends AppCompatActivity {
    RecyclerView rec;
    sem2adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi2);

        rec = (RecyclerView) findViewById(R.id.recfeg2);
        rec.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<sem2model> options2 =
                new FirebaseRecyclerOptions.Builder<sem2model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("sem2"), sem2model.class)
                        .build();


        adapter = new sem2adapter(options2);
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