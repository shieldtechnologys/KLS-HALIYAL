package com.example.klsbcahaliyal;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    CardView campus;
    CardView faculty;
    CardView events;
    CardView library;
    CardView institute;
    CardView about;
    CardView notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkConnection();

        campus=findViewById(R.id.campus);
        faculty=findViewById(R.id.faculty);
        events=findViewById(R.id.events);
        library=findViewById(R.id.library);
        institute=findViewById(R.id.institute);
        about=findViewById(R.id.about);
        notification=findViewById(R.id.notification);

        campus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( MainActivity.this,campus.class);
                startActivity(intent);

            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               gotoUrl("https://www.kud.ac.in/cmsentities.aspx?type=notifications");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent=new Intent( MainActivity.this,faculty.class);
             startActivity(intent);

            }


        });
        events.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent intent = new Intent(MainActivity.this, event.class);
                                          startActivity(intent);
                                      }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( MainActivity.this,quetion_papers.class);
                startActivity(intent);

            }
        });
        institute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( MainActivity.this,institute.class);
                startActivity(intent);

            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( MainActivity.this,about.class);
                startActivity(intent);

            }

        });



        }
    public void checkConnection() {

        ConnectivityManager connectivityManager= (ConnectivityManager)
                getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (null != networkInfo) {
            if(networkInfo.getType()==ConnectivityManager.TYPE_WIFI)
            Toast.makeText(this, "NO WIFI", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "NO INTERNET CONNECTION", Toast.LENGTH_SHORT).show();
        }
    }
}