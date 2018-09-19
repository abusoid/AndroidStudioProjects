package com.mogilevskiydenis.aquariumvici;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void freshwaterClick(View view){
        Intent freshwaterIntent = new Intent(MainActivity.this, SecondMenu.class);

        // Start the new activity
        startActivity(freshwaterIntent);
    }
    public void saltwaterClick(View view){
        Intent freshwaterIntent = new Intent(MainActivity.this, SaltwaterSecondMenu.class);

        // Start the new activity
        startActivity(freshwaterIntent);
    }
    public void calcClick(View view){
        Intent freshwaterIntent = new Intent(MainActivity.this, calcMenu.class);

        // Start the new activity
        startActivity(freshwaterIntent);
    }

}
