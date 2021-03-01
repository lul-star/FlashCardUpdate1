package com.example.flashcardupdate1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView flashcardQuestion = findViewById(R.id.question);
        TextView flashcardAnswer = findViewById(R.id.answer);
        flashcardQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(View.INVISIBLE);
                flashcardAnswer.setVisibility(View.VISIBLE);
            }
        });

        ImageView addButton = findViewById(R.id.add);
        addButton.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v){
                Intent intentAddBt = new Intent(MainActivity.this, AddCardActivity.class);
                MainActivity.this.startActivityForResult(intentAddBt, 1);


            }
        });








    }
}