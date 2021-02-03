package com.example.reflectbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);


        // TODO: 30/01/21  Receive the information
        Bundle bundle = getIntent().getExtras();

        String f_name = bundle.getString("first_name");
        String l_name = bundle.getString("last_name");

        TextView name = findViewById(R.id.TextView_fullName);
        String Full_name = f_name + " " + l_name;

        name.setText(Full_name);

        Button help = findViewById(R.id.help_button);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            get_Help();
            }
        });

        Button entry_button = findViewById(R.id.Make_entry_button);
        entry_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                note_take();
            }
        });

        Button setting = findViewById(R.id.Setting_button);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_Setting();
            }
        });
    }

    public void note_take(){
        Intent intent = new Intent(this,moodChoice.class);
        startActivity(intent);
    }

    public void open_Setting(){
        Intent intent = new Intent(this,security.class);
        startActivity(intent);
    }

    public void get_Help(){
        Intent intent = new Intent(this,Note.class);
        startActivity(intent);
    }
}
