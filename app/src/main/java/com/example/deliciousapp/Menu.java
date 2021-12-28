package com.example.deliciousapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button button100 = findViewById(R.id.button100);
        button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), com.example.deliciousapp.Diyet.class);
                startActivity(i);
            }
        });
        Button button101 = findViewById(R.id.button101);
        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), com.example.deliciousapp.Diyabet.class);
                startActivity(ii);
            }
        });
        Button button102 = findViewById(R.id.button102);
        button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), com.example.deliciousapp.Turk.class);
                startActivity(a);
            }
        });
        Button button103 = findViewById(R.id.button103);
        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iiiiii = new Intent(getApplicationContext(), com.example.deliciousapp.Pratik.class);
                startActivity(iiiiii);
            }
        });
        Button button104 = findViewById(R.id.button104);
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii = new Intent(getApplicationContext(), com.example.deliciousapp.MainActivity.class);
                startActivity(iii);
            }
        });
    }
    }
