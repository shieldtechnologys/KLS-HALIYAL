package com.example.klsbcahaliyal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class semi4 extends AppCompatActivity {
    RecyclerView rec;
    sem4adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi4);

        rec = (RecyclerView) findViewById(R.id.recfeg4);
        rec.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<sem4model> options4 =
                new FirebaseRecyclerOptions.Builder<sem4model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("sem4"), sem4model.class)
                        .build();


        adapter = new sem4adapter(options4);
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