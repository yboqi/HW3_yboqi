package com.example.hw3_yboqi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner song = (Spinner) findViewById(R.id.songspin);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.songs));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        song.setAdapter(myAdapter);

        Spinner overlap = (Spinner) findViewById(R.id.overspin);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.overlaps));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        overlap.setAdapter(myAdapter2);

        Spinner overlap1 = (Spinner) findViewById(R.id.overspin2);
        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.overlaps));
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        overlap1.setAdapter(myAdapter3);

        Spinner overlap2 = (Spinner) findViewById(R.id.overspin3);
        ArrayAdapter<String> myAdapter4 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.overlaps));
        myAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        overlap2.setAdapter(myAdapter4);

        button = (Button) findViewById(R.id.playb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, music.class);
                String data = song.getSelectedItem().toString();
                intent.putExtra("songname", data);
                startActivity(intent);
            }
        });


    }



}