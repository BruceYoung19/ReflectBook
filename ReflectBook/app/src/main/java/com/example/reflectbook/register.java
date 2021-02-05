package com.example.reflectbook;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        TextView text_user = findViewById(R.id.Name_text);
        TextView text_why = findViewById(R.id.TextView_WhyUse);
        TextView hint = findViewById(R.id.textView_hint);

        EditText first_name = findViewById(R.id.EditText_FirstName);
        EditText last_name = findViewById(R.id.EditText_LastName);
        EditText purpose_of_use = findViewById(R.id.EditText_purpose);

        Button Complete_register = findViewById(R.id.register_complete_button);


        text_user.setText("Name");
        text_why.setText("Why are you using this?");
        hint.setText("Please summarize in one word");


        first_name.getText();
        last_name.getText();
        purpose_of_use.getText();

        Complete_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 30/01/21  send the data from this page to profile
                Intent intent_send = new Intent(register.this,profile.class);
                intent_send.putExtra("first_name",first_name.getText().toString());
                intent_send.putExtra("last_name",last_name.getText().toString());
                intent_send.putExtra("purpose_of_use",purpose_of_use.getText().toString());
                startActivity(intent_send);


            }
        });
    }

}
