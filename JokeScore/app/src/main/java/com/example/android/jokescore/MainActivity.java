package com.example.android.jokescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FiveA(View v) {
        scoreA = scoreA + 5;
        displayScoreA(scoreA);
    }

    public void FourA(View v) {
        scoreA = scoreA + 4;
        displayScoreA(scoreA);
    }

    public void ThreeA(View v) {
        scoreA = scoreA + 3;
        displayScoreA(scoreA);
    }

    public void TwoA(View v) {
        scoreA = scoreA + 2;
        displayScoreA(scoreA);
    }

    public void OneA(View v) {
        scoreA = scoreA + 1;
        displayScoreA(scoreA);
    }

    public void FiveB(View v) {
        scoreB = scoreB + 5;
        displayScoreB(scoreB);
    }

    public void FourB(View v) {
        scoreB = scoreB + 4;
        displayScoreB(scoreB);
    }

    public void ThreeB(View v) {
        scoreB = scoreB + 3;
        displayScoreB(scoreB);
    }

    public void TwoB(View v) {
        scoreB = scoreB + 2;
        displayScoreB(scoreB);
    }

    public void OneB(View v) {
        scoreB = scoreB + 1;
        displayScoreB(scoreB);
    }

    private void displayScoreA(int score) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA_text_view);
        quantityTextView.setText(String.valueOf(score));
    }

    private void displayScoreB(int score) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB_text_view);
        quantityTextView.setText(String.valueOf(score));
    }

    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }
}
