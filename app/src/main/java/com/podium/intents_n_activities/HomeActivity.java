package com.podium.intents_n_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView textTitle = findViewById(R.id.textTitle);
        TextView textCategory = findViewById(R.id.textCategory);
        Intent intent = getIntent();
        if(intent!=null){
            String title = intent.getStringExtra("title");
            String category = intent.getStringExtra("category");
            if (title!=null && title.length()>0){
                textTitle.setText(title);
            }else{
                textTitle.setText("New Title");
            }
            if (category!=null && category.length()>0){
                textCategory.setText(category);
            }else{
                textCategory.setText("New Category");
            }
        }
    }
}