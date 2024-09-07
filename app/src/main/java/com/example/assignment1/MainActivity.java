package com.example.assignment1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2;
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this,"Violate  Button  Clicked", Toast.LENGTH_SHORT).show();
        });
        b2.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this,"Orange  Button  Clicked", Toast.LENGTH_SHORT).show();
        });
    }

}