package com.example.countingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    Button btn;
    Button reset;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializing buttons and text views with value in activity_main.xml
        btn = (Button) findViewById(R.id.clickButton);
        reset = (Button) findViewById(R.id.resetButton);
        txt = (TextView) findViewById(R.id.textCount);
        //button will listen for clicks, if user clicks button then it adds to the counter
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                txt.setText(Integer.toString(counter));
            }
        });
        // if user clicks reset then it will reset the counter back to 0
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                txt.setText(Integer.toString(counter));
            }
        });

    }
}