package com.example.teacherassistant;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class start_survey extends AppCompatActivity {

    ListView studentsListview;

    String [] studentNames = {"Menna","Habiba","Ahmed","Mohammed"};

    int [] studentPictures = {R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_survey);
        studentsListview = findViewById(R.id.listView_create_class);
        final MyAdapter myAdapter = new MyAdapter(this,studentNames,studentPictures);
        studentsListview.setAdapter(myAdapter);
    }
}
