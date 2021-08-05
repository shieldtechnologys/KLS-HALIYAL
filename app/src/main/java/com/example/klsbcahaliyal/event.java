package com.example.klsbcahaliyal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class event extends AppCompatActivity {
    RecyclerView recv;
    myadapterevent adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        recv=(RecyclerView)findViewById(R.id.recevent);
        recv.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<eventmodel> options =
                new FirebaseRecyclerOptions.Builder<eventmodel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("events"), eventmodel.class)
                        .build();
        adapter1=new myadapterevent (options);
        recv.setAdapter(adapter1);

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