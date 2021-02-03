package com.example.reflectbook;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class Note extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note);

        // TODO: 2/02/21  get Entry number 
        // TODO: 2/02/21  get Mood from moodChoice

        TextView date_txt = findViewById(R.id.Date_text);
        Date date = new Date();
        // Changing the format of the date
        String Store_date = date.toString();
        String output_date = Store_date.substring(0,10);

        date_txt.setText("Date: " + output_date);

        // TODO: 2/02/21 EditText
        EditText userInput  = findViewById(R.id.EditText_fortext);
        userInput.getText();

        // TODO: 3/02/21  button for finishing the entry
        Button button;

        // TODO: 3/02/21 create xlsx store data to it

    }
}
