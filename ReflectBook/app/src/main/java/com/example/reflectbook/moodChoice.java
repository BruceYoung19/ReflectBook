package com.example.reflectbook;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class moodChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moodchoice);

        TextView Question_one = findViewById(R.id.QuestionOne);
        Question_one.setText("How are you?");
        // TODO: 30/01/21  Radio buttons
        // TODO: 30/01/21  add mood images to drawable


    }


}
