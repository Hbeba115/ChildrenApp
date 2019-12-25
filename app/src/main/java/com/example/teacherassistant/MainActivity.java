package com.example.teacherassistant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button create_class = (Button) findViewById(R.id.create_class_btn);
        Button start_survey = (Button) findViewById(R.id.start_survey_btn);
        create_class.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity2Intent = new Intent(getApplicationContext(), create_class.class);
                startActivity(activity2Intent);
            }
        });
        start_survey.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity2Intent = new Intent(getApplicationContext(), start_survey.class);
                startActivity(activity2Intent);
            }
        });
    }
}
