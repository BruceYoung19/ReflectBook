package com.example.reflectbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

        Button register_button = findViewById(R.id.Register_Button);
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Start_regsiter();
            }
        });
    }

    public void Start_regsiter(){
        Intent intent = new Intent(this,register.class);
        startActivity(intent);
    }
}
