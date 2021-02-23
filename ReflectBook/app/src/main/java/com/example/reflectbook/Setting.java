package com.example.reflectbook;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        TextView color_background = findViewById(R.id.background_top);
        color_background.setBackgroundColor(Color.parseColor("#ff9955"));




    }
}
