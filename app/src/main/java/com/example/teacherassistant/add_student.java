package com.example.teacherassistant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class add_student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_studint);
        Button student_add_done = (Button) findViewById(R.id.student_add_done);

        CameraFragment camera_Fragment = new CameraFragment();
        BrowseFragment browse_Fragment = new BrowseFragment();
        FragmentManager manager = getSupportFragmentManager();
        androidx.fragment.app.FragmentTransaction ft = manager.beginTransaction();
        ft.add(R.id.cam_fragment, camera_Fragment);
        //ft.add(R.id.browse_fragment, browse_Fragment);
        ft.commit();
        student_add_done.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent create_class_intent = new Intent(getApplicationContext(), create_class.class);
                startActivity(create_class_intent);
            }
        });
    }
}