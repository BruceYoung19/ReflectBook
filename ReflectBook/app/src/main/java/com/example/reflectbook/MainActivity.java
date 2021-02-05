package com.example.reflectbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView background = findViewById(R.id.background_top);
        background.setBackgroundColor(Color.parseColor("#ff9955"));

        Button begin = findViewById(R.id.Begin_button);
        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Open_start();
            }
        });
    }

    public void Open_start(){
        Intent intent = new Intent(this,Introduction.class);
        //Intent intent = new Intent(this,register.class);
        startActivity(intent);
    }
}