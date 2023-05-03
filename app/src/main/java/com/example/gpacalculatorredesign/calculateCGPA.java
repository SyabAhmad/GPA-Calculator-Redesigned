package com.example.gpacalculatorredesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class calculateCGPA extends AppCompatActivity {

    private EditText totalgpa1, totalgpa2, totalgpa3, totalgpa4, totalgpa5, totalgpa6, totalgpa7, totalgpa8;
    private Button findCGPA, clearAll;
    private TextView viewCGPA;
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_cgpa);

        totalgpa1 = (EditText) findViewById(R.id.totalgpa1);
        totalgpa2 = (EditText) findViewById(R.id.totalgpa2);
        totalgpa3 = (EditText) findViewById(R.id.totalgpa3);
        totalgpa4 = (EditText) findViewById(R.id.totalgpa4);
        totalgpa5 = (EditText) findViewById(R.id.totalgpa5);
        totalgpa6 = (EditText) findViewById(R.id.totalgpa6);
        totalgpa7 = (EditText) findViewById(R.id.totalgpa7);
        totalgpa8 = (EditText) findViewById(R.id.totalgpa8);

        findCGPA = (Button) findViewById(R.id.findCGPA);
        findCGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    double gpa1 = Double.parseDouble(totalgpa1.getText().toString());
                    double gpa2 = Double.parseDouble(totalgpa2.getText().toString());
                    double gpa3 = Double.parseDouble(totalgpa3.getText().toString());
                    double gpa4 = Double.parseDouble(totalgpa4.getText().toString());
                    double gpa5 = Double.parseDouble(totalgpa5.getText().toString());
                    double gpa6 = Double.parseDouble(totalgpa6.getText().toString());
                    double gpa7 = Double.parseDouble(totalgpa7.getText().toString());
                    double gpa8 = Double.parseDouble(totalgpa8.getText().toString());



                    int count = 0;
                    if (gpa1 > 0) {
                        count+=1;
                    }
                    if (gpa2 > 0) {
                        count+=1;
                    }
                    if (gpa3 > 0) {
                        count+=1;
                    }
                    if (gpa4 > 0) {
                        count+=1;
                    }
                    if (gpa5 > 0) {
                        count+=1;
                    }
                    if(gpa6 > 0)  {
                        count+=1;
                    }
                    if (gpa7 > 0) {
                        count+=1;
                    }
                    if (gpa8 > 0) {
                        count+=1;
                    }


                    double value = (gpa1+gpa2+gpa3+gpa4+gpa5+gpa6+gpa7+gpa8)/count;

                    viewCGPA =  (TextView) findViewById(R.id.CGPAView);

                    viewCGPA.setText(String.valueOf(value));
                } catch (Exception e) {
                    Toast.makeText(calculateCGPA.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        clearAll = (Button) findViewById(R.id.clearAll);
        clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    totalgpa1.setText("");
                    totalgpa2.setText("");
                    totalgpa3.setText("");
                    totalgpa4.setText("");
                    totalgpa5.setText("");
                    totalgpa6.setText("");
                    totalgpa7.setText("");
                    totalgpa8.setText("");
                    viewCGPA.setText("");
                } catch (Exception e) {
                    Toast.makeText(calculateCGPA.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        backButton = (ImageButton) findViewById(R.id.backToHomePage);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(calculateCGPA.this, MainActivity.class));
            }
        });

    }
}