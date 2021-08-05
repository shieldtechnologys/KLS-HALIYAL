package com.example.klsbcahaliyal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quetion_papers extends AppCompatActivity {
    private Button sem1;
    private Button sem2;
    private Button sem3;
    private Button sem4;
    private Button sem5;
    private Button sem6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quetion_papers);

        sem1=(Button)findViewById(R.id.button);
        sem2=(Button)findViewById(R.id.button1);
        sem3=(Button)findViewById(R.id.button2);
        sem4=(Button)findViewById(R.id.button3);
        sem5=(Button)findViewById(R.id.button4);
        sem6=(Button)findViewById(R.id.button5);

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( quetion_papers.this,semi1.class);
                startActivity(intent);

            }
        });
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( quetion_papers.this,semi2.class);
                startActivity(intent);

            }
        });
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( quetion_papers.this,semi3.class);
                startActivity(intent);

            }
        });
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( quetion_papers.this,semi4.class);
                startActivity(intent);

            }
        });
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( quetion_papers.this,semi5.class);
                startActivity(intent);

            }
        });
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( quetion_papers.this,semi6.class);
                startActivity(intent);

            }
        });
    }
}