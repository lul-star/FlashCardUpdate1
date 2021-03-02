package com.example.flashcardupdate1;

import androidx.annotation.NonNull;
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


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            TextView flashcardQuestion = findViewById(R.id.question);
            TextView flashcardAnswer = findViewById(R.id.answer);

            String string1 = data.getExtras().getString("q");
            flashcardQuestion.setText(string1);
            String string2 = data.getExtras().getString("a");
            flashcardAnswer.setText(string2);

            flashcardQuestion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flashcardQuestion.setVisibility(View.INVISIBLE);
                    flashcardAnswer.setVisibility(View.VISIBLE);
                }
            });

        }

    }
}
