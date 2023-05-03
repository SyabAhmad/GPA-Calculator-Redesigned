package com.example.gpacalculatorredesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button oldgpa, newGpa, cgpa;
    private ImageButton toLinkedIN, toFacebook, toInstagram, toGithub, toTwitter, toReddit, backButton;
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


        // to LinkedIn

        toLinkedIN = (ImageButton) findViewById(R.id.linkedin);

        toLinkedIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String url = "https://www.linkedin.com/in/syed-syab-ahmad-shah-776a421b7";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }


            }
        });

        toInstagram = (ImageButton) findViewById(R.id.instagram);
        toInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String url = "https://instagram.com/syed_syab_ahmad?igshid=ZDdkNTZiNTM=";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        toFacebook = (ImageButton) findViewById(R.id.facebook);
        toFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String url = "https://www.facebook.com/syed.syab?mibextid=ZbWKwL";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        toGithub = (ImageButton) findViewById(R.id.github);
        toGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String url = "https://www.github.com/SyabAhmad";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        toTwitter = (ImageButton) findViewById(R.id.twitter);
        toTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String url = "https://twitter.com/syab_ahmad?t=NsLGGTBKCXGCdIoVPQET5A&s=09";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        toReddit = (ImageButton) findViewById(R.id.reddit);
        toReddit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String url = "https://www.reddit.com/user/syab";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });






    }
}