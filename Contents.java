package com.learnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);
        Button button3, button4, button5, button6, button7;
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabets();
            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStory();
            }
        });
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTables();
            }
        });
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColors();
            }
        });
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMemoryGame();
            }
        });

    }

    public void openAlphabets()
    {
        Intent intent3 = new Intent(this, MainAlphabets.class);
        startActivity(intent3);
    }

    public void openStory()
    {
        Intent intent4 = new Intent(this, MainStory.class);
        startActivity(intent4);
    }

    public void openTables()
    {
        Intent intent5 = new Intent(this, Tables.class);
        startActivity(intent5);
    }

    public void openColors()
    {
        Intent intent6 = new Intent(this, Colors.class);
        startActivity(intent6);
    }

    public void openMemoryGame()
    {
        Intent intent6 = new Intent(this, MemoryGame.class);
        startActivity(intent6);
    }

}