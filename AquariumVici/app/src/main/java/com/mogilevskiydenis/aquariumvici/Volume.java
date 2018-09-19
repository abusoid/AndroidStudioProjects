package com.mogilevskiydenis.aquariumvici;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Volume extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume);
    }


    public void calculate(View view) {
        EditText length = (EditText) findViewById(R.id.length);
        EditText width = (EditText) findViewById(R.id.width);
        EditText height = (EditText) findViewById(R.id.height);
        double a = 0, b = 0, c = 0;

        if (length.getText().toString().equals("")) {
            Toast.makeText(this, "Введите длину", Toast.LENGTH_SHORT).show();
        }
        else
        {
            a = Double.parseDouble(length.getText().toString());
        }



        if (width.getText().toString().equals("")) {
            Toast.makeText(this, "Введите ширину", Toast.LENGTH_SHORT).show();
        }
        else
            {
            b = Double.parseDouble(width.getText().toString());
        }



        if (height.getText().toString().equals("")) {
            Toast.makeText(this, "Введите высоту", Toast.LENGTH_SHORT).show();
        }
        else {
            c = Double.parseDouble(height.getText().toString());

        }
        double volume = (a*b*c)/1000;
        TextView answer = (TextView) findViewById(R.id.answer);
        answer.setText(Double.toString(volume) + "л.");



    }
}
