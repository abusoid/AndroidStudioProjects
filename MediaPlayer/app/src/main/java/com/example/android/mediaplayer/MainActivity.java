package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.example);
    }

    public void play(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Play", Toast.LENGTH_SHORT);
        toast.show();
        mediaPlayer.start();
    }
    public void pause(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Pause", Toast.LENGTH_SHORT);
        toast.show();

    }

}
