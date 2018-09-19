package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.CYAN;
import static android.hardware.camera2.params.RggbChannelVector.RED;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Wow!");
        textView.setTextSize(80);
        textView.setTextColor(CYAN);
        textView.layout(30, 30, 30, 30);
        textView.setPadding(30, 30, 30, 30);
        textView.setBackgroundColor(BLACK);
        textView.setVisibility(1);

        setContentView(textView);
    }
}
