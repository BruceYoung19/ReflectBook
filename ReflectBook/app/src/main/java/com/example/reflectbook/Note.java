package com.example.reflectbook;

import android.graphics.Color;
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
        int entry_num = 0;
        Date date = new Date();

        // Changing the format of the date
        String Store_date = date.toString();
        String output_date = Store_date.substring(0,10);

        TextView Entry_num = findViewById(R.id.TextView_EntryNum);
        Entry_num.setText("Entry number: " + entry_num + "\n" + "Date: " + output_date );
        Entry_num.setBackgroundColor(Color.parseColor("#ff9955"));

        Bundle bundle = getIntent().getExtras();
        String mood = bundle.getString("mood");

        TextView mood_txt = findViewById(R.id.textView_mood);
        mood_txt.setText("Mood: " + mood);

        if (mood.equals("Angry")) {
            mood_txt.setBackgroundColor(Color.RED);
        }
        else if(mood.equals("Happy")){
            mood_txt.setBackgroundColor(Color.YELLOW);
            mood_txt.setTextColor(Color.BLACK);
        }
        else if(mood.equals("Sad")){
            mood_txt.setBackgroundColor(Color.GRAY);
        }
        else if(mood.equals("Horrible")){
            mood_txt.setBackgroundColor(Color.BLUE);
        }


        // TODO: 2/02/21 EditText
        EditText userInput  = findViewById(R.id.EditText_fortext);
        userInput.getText();

        // TODO: 3/02/21  button for finishing the entry
        Button button;

        // TODO: 3/02/21 create xlsx store data to it

    }
    // TODO: 5/02/21  entry Number 
    
}
