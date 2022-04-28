package com.example.jcameraapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cameralibrary.CameraXLibrary;

public class MainActivity extends AppCompatActivity {

    Button button, button1;
    EditText widtheditText, heighteditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.imgcapture);
        widtheditText = findViewById(R.id.widthedittxt);
        heighteditText = findViewById(R.id.heightedittxt);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(widtheditText.getText().toString())){
                    Toast.makeText(MainActivity.this, "Fileds can't be empty", Toast.LENGTH_SHORT).show();

                }
                else if(TextUtils.isEmpty(heighteditText.getText().toString())){
                    Toast.makeText(MainActivity.this, "Fileds can't be empty", Toast.LENGTH_SHORT).show();

                }
                else{

                }
            }

        });

    }
}