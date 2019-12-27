package com.example.teacherassistant;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class add_student extends AppCompatActivity implements CameraFragment.OnDataPass
{
    EditText student_name;
    Bitmap bp;
    ImageView imageView;
    @Override
    public void onDataPass(Bitmap bpp) {
       bp=bpp;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_studint);
        Button student_add_done = (Button) findViewById(R.id.student_add_done);
        student_name = (EditText) findViewById(R.id.editText_student_name);
        CameraFragment camera_Fragment = new CameraFragment();
        FragmentManager manager = getSupportFragmentManager();
        androidx.fragment.app.FragmentTransaction ft = manager.beginTransaction();
        ft.add(R.id.cam_fragment, camera_Fragment);
        ft.commit();
        student_add_done.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    if (!student_name.getText().toString().equals("") && bp!=null) {
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bp.compress(Bitmap.CompressFormat.PNG, 90, stream);
                        byte[] image = stream.toByteArray();
                        Intent create_class_intent = new Intent(getApplicationContext(), create_class.class);
                        create_class_intent.putExtra("photo", image);
                        startActivity(create_class_intent);
                    } else if (student_name.getText().toString().equals("") && bp==null)
                        Toast.makeText(getBaseContext(), "please enter student name and photo", Toast.LENGTH_LONG).show();
                    else if (student_name.getText().toString().equals("") && bp!=null)
                        Toast.makeText(getBaseContext(), "you must enter student name", Toast.LENGTH_LONG).show();
                    else if (!student_name.getText().toString().equals("") && bp==null)
                        Toast.makeText(getBaseContext(), "you must take student photo", Toast.LENGTH_LONG).show();
                }
        });
    }
}


