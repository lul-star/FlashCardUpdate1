package com.example.flashcardupdate1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
                Intent xbuttn = new Intent(AddCardActivity.this, MainActivity.class);
                AddCardActivity.this.startActivity(xbuttn);
            }
        });
        saveButton.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v){
         String question = ((EditText) findViewById(R.id.questionInput)).getText().toString();
         String answer = ((EditText) findViewById(R.id.answerInput)).getText().toString();

                Intent data = new Intent();
                data.putExtra("q", question);
                data.putExtra("a", answer);
                setResult(RESULT_OK, data);
                finish();
            }
        });


    }
}