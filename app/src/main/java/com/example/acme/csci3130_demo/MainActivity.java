package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
    Code has been adapted from the following YouTube tutorial:
    John's Android Studio Tutorials
    "Android Studio how to change textview text on button click"
    https://www.youtube.com/watch?time_continue=80&v=0RLWnSG5AkU

    Brent Crane
    B00712515
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeText();
    }

    private void changeText()
    {
        final TextView changingText = findViewById(R.id.textView);
        Button changeTextButton = findViewById(R.id.button);
        final TextView textBox = findViewById(R.id.textBox);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                changingText.setText(textBox.getText());
            }
        });

    }
}
