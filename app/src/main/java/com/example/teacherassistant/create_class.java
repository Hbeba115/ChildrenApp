package com.example.teacherassistant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class create_class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_class2);
        Button class_done_btn = (Button) findViewById(R.id.class_done_btn);
        Button add_student_button = (Button) findViewById(R.id.add_student_btn);
        class_done_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent main_activity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(main_activity);
            }
        });
        add_student_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent add_student_intent = new Intent(getApplicationContext(), add_student.class);
                startActivity(add_student_intent);
            }
        });
    }
}
