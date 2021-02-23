package com.example.reflectbook;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class Note extends AppCompatActivity {
    // TODO: 2/02/21  get Entry number
    int counter = 0;
    int entry_num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note);

        // Changing the format of the date
        Date date = new Date();
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
        Button button = findViewById(R.id.finishEntryButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 16/02/21  transfer data to profile class
                Intent intentsend = new Intent(Note.this,profile.class);
                intentsend.putExtra("entry_num", Entry_num.getText());
                intentsend.putExtra("Mood",mood_txt.getText() );
                intentsend.putExtra("date", output_date );
                startActivity(intentsend);

            }
        });

        // TODO: 3/02/21 create xlsx store data to it

    }
    // TODO: 5/02/21  entry Number
    public int EntryNumCount(int count){
        counter++;
        System.out.println(counter);
        entry_num = counter++;
        System.out.println(entry_num);
        return count;
    }

    
}
