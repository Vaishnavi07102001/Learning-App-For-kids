package com.learnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainStory extends AppCompatActivity {

    ListView listView;
    String[] tStory;
    String[] dStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_story);
        listView = findViewById(R.id.list);
        tStory = getResources().getStringArray(R.array.title_story);
        dStory = getResources().getStringArray(R.array.details_story);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, tStory);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String t = dStory[position];
                Intent intent = new
                        Intent(MainStory.this, Story.class);
                intent.putExtra("story", t);
                startActivity(intent);

            }
        });
    }
}

