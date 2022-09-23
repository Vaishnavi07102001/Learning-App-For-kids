package com.learnn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Story extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        textView=findViewById(R.id.txt);
        String dStory=getIntent().getStringExtra("story");
        textView.setText(dStory);
    }
}
