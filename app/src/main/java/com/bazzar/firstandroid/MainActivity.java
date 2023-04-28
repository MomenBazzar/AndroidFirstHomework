package com.bazzar.firstandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView textView_hobby;
    EditText editText_hobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView_hobby = findViewById(R.id.textView_hobby);
        editText_hobby = findViewById(R.id.editText_hobbies);
    }

    public void UpdateHobby(View view) {
        String hobby = editText_hobby.getText().toString();

        if (hobby.isEmpty()) return;

        if (textView_hobby.getVisibility() == View.GONE) {
            textView_hobby.setVisibility(View.VISIBLE);
        }

        String prevHobbies = textView_hobby.getText().toString();

        if (prevHobbies.isEmpty()) {
            textView_hobby.setText(hobby);
            return;
        }

        String result = prevHobbies + ',' + hobby;
        textView_hobby.setText(result);
    }
}