package com.podium.intents_n_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.btnSkip);
        b.setOnClickListener(v->{
            Intent i= new Intent(this,HomeActivity.class);
            startActivity(i);
        });

        Button btnC = findViewById(R.id.btnContinue);
        EditText editTitle = findViewById(R.id.editTitle);
        EditText editCategory = findViewById(R.id.editCategory);
        btnC.setOnClickListener(view -> {
            String title = editTitle.getText().toString();
            String category = editCategory.getText().toString();
            Intent i = new Intent(this,HomeActivity.class);
            i.putExtra("title",title);
            i.putExtra("category",category);
            startActivity(i);
        });
    }
}