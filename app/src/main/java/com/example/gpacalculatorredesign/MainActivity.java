package com.example.gpacalculatorredesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button oldgpa, newGpa, cgpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oldgpa = (Button) findViewById(R.id.toOldSystem);
        newGpa = (Button) findViewById(R.id.toNewSystem);
        cgpa = (Button) findViewById(R.id.calculateCGPA);


        // to old GPA system
        oldgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, oldSystem.class));
            }
        });

        // to new GPA system
        newGpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, newSystem.class));
            }
        });

        // to calculate CGPA
        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, calculateCGPA.class));
            }
        });
    }
}