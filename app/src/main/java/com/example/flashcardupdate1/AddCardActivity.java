package com.example.flashcardupdate1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        ImageView xButton = findViewById(R.id.cancel);
        ImageView saveButton = findViewById(R.id.save);

        xButton.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v){
                finish();

            }
        });
        saveButton.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v){
                finish();

            }
        });


    }
}