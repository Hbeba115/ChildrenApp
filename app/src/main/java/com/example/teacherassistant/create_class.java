package com.example.teacherassistant;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class create_class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_class2);
        Button class_done_btn = (Button) findViewById(R.id.class_done_btn);
        Button add_student_button = (Button) findViewById(R.id.add_student_btn);
        ListView studentsList_view = (ListView) findViewById(R.id.listView_create_class);

        byte[] byteArray = getIntent().getByteArrayExtra("picture");
        if (byteArray != null) {
            Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);


            String [] studentNames = {"Menna"};

            int [] studentPictures ={bmp.getGenerationId()};


            MyAdapter myAdapter = new MyAdapter(this,studentNames,studentPictures);
            studentsList_view.setAdapter(myAdapter);
        }


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