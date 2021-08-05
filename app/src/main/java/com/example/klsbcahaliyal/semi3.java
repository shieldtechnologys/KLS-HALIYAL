package com.example.klsbcahaliyal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class semi3 extends AppCompatActivity {
    RecyclerView rec;
    sem3adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi3);

        rec = (RecyclerView) findViewById(R.id.recfeg3);
        rec.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<sem3model> options3 =
                new FirebaseRecyclerOptions.Builder<sem3model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("sem3"), sem3model.class)
                        .build();


        adapter = new sem3adapter(options3);
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