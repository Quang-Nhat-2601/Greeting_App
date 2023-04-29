package com.example.greetingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_name;
    ImageView logo;
    Button greeting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.imageView);
        et_name = findViewById(R.id.et_input_name);
        greeting = findViewById(R.id.greeting_btn);

        greeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et_name.getText().toString();
                Toast.makeText(MainActivity.this, "Hello " + name, Toast.LENGTH_LONG).show();
            }
        });
    }
}