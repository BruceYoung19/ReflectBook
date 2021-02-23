package com.example.reflectbook;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Map;

public class profile extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        TextView Background = findViewById(R.id.profileBackground);
        Background.setBackgroundColor(Color.parseColor("#ff9955"));

        Bundle bundle = getIntent().getExtras();

        String f_name = bundle.getString("first_name");
        String l_name = bundle.getString("last_name");

        TextView name = findViewById(R.id.TextView_fullName);
        String Full_name = f_name + " " + l_name;

        name.setText(Full_name);

        ArrayList <entry_item> entry_list = new ArrayList<>();
        entry_list.add(new entry_item(R.drawable.angryeemoji, "Entry 54","2010"));
        entry_list.add(new entry_item(R.drawable.happyemoji, "Entry 3","2010"));
        entry_list.add(new entry_item(R.drawable.horribleemoji, "Entry 1","2010"));

        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView_entry);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new entryAdapter(entry_list);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

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
        Intent intent = new Intent(this,Setting.class);
        startActivity(intent);
    }

    public void get_Help(){

    }

    // TODO: 17/02/21  generate xlsx file here 
    // TODO: 17/02/21  generate textfile here
}
