package com.example.klsbcahaliyal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class semi6 extends AppCompatActivity {
    RecyclerView rec;
    sem6adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi6);

        rec = (RecyclerView) findViewById(R.id.recfeg6);
        rec.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<sem6model> options6 =
                new FirebaseRecyclerOptions.Builder<sem6model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("sem6"), sem6model.class)
                        .build();


        adapter = new sem6adapter(options6);
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