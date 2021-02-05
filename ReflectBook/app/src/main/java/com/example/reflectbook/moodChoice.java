package com.example.reflectbook;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class moodChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moodchoice);

        TextView Question_one = findViewById(R.id.QuestionOne);
        Question_one.setText("How are you?");
        Question_one.setBackgroundColor(Color.parseColor("#ff9955"));

        // TODO: 30/01/21  Radio buttons
        RadioButton angry_button = findViewById(R.id.radioButton_angry);
        angry_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Mood_choice = "Angry";
                Intent intent_send = new Intent(moodChoice.this,Note.class);
                intent_send.putExtra("mood",Mood_choice);
                startActivity(intent_send);
            }
        });

        RadioButton happy_button = findViewById(R.id.radioButton_happy);
        happy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Mood_choice = "Happy";
                Intent intent_send = new Intent(moodChoice.this,Note.class);
                intent_send.putExtra("mood",Mood_choice);
                startActivity(intent_send);
            }
        });

        RadioButton sad_button = findViewById(R.id.radioButton_sad);
        sad_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Mood_choice = "Sad";
                Intent intent_send = new Intent(moodChoice.this,Note.class);
                intent_send.putExtra("mood",Mood_choice);
                startActivity(intent_send);
            }
        });

        RadioButton horrible_button = findViewById(R.id.radioButton_horrible);
        horrible_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Mood_choice = "Horrible";
                Intent intent_send = new Intent(moodChoice.this,Note.class);
                intent_send.putExtra("mood",Mood_choice);
                startActivity(intent_send);
            }
        });
    }



}
