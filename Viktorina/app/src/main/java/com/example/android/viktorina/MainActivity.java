package com.example.android.viktorina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
     * Нажатие на кнопку вызывает этот метод в котором ведется подсчет и который вызывает остальные
     * методы
     */

    public void calculateScore(View view) {
        score = oneQuest(score);
        score = twoQuest(score);
        score = threeQuest(score);
        score = fourQuest(score);
        if (score >= 4) {
            Toast.makeText(this, getString(R.string.your_score) + score + getString(R.string.score) + getString(R.string.good_boy), Toast.LENGTH_LONG).show();
        }
        if (score >= 0 && score <= 3) {
            Toast.makeText(this, getString(R.string.your_score) + score + getString(R.string.score) + getString(R.string.not_bad), Toast.LENGTH_LONG).show();
        }
        if (score < 0) {
            Toast.makeText(this, getString(R.string.your_score) + score + getString(R.string.score) + getString(R.string.bad), Toast.LENGTH_LONG).show();
        }
        score = 0;
    }

    /*
    Метод подсчета очков за первый вопрос
     */
    private int oneQuest(int score) {
        CheckBox answerOne = (CheckBox) findViewById(R.id.answer_one_true);
        boolean hasAnswerOne = answerOne.isChecked();
        if (hasAnswerOne) {
            score++;
        } else {
            score--;
        }

        CheckBox answerTwo = (CheckBox) findViewById(R.id.answer_two_false);
        boolean hasAnswerTwo = answerTwo.isChecked();
        if (hasAnswerTwo) {
            score--;
        }

        CheckBox answerThree = (CheckBox) findViewById(R.id.answer_three_false);
        boolean hasAnswerThree = answerThree.isChecked();
        if (hasAnswerThree) {
            score--;
        }
        CheckBox answerFour = (CheckBox) findViewById(R.id.answer_four_true);
        boolean hasAnswerFour = answerFour.isChecked();
        if (hasAnswerFour) {
            score++;
        } else {
            score--;
        }
        return score;
    }

    /*
    Метод подсчета очков за второй вопрос
     */
    private int twoQuest(int score) {
        RadioButton radioOne = (RadioButton) findViewById(R.id.radio_answer_one);
        boolean hasAnswerOne = radioOne.isChecked();
        if (hasAnswerOne) {
            score++;
        }
        RadioButton radioTwo = (RadioButton) findViewById(R.id.radio_answer_two);
        boolean hasAnswerTwo = radioTwo.isChecked();
        if (hasAnswerTwo) {
            score--;
        }
        RadioButton radioThree = (RadioButton) findViewById(R.id.radio_answer_three);
        boolean hasAnswerThree = radioThree.isChecked();
        if (hasAnswerThree) {
            score--;
        }
        return score;

    }

    /*
    Метод подсчета очков за третий вопрос
     */
    private int threeQuest(int score) {
        RadioButton radioOne = (RadioButton) findViewById(R.id.radio_two_answer_one);
        boolean hasAnswerOne = radioOne.isChecked();
        if (hasAnswerOne) {
            score--;
        }
        RadioButton radioTwo = (RadioButton) findViewById(R.id.radio_two_answer_two);
        boolean hasAnswerTwo = radioTwo.isChecked();
        if (hasAnswerTwo) {
            score++;
        }
        RadioButton radioThree = (RadioButton) findViewById(R.id.radio_two_answer_three);
        boolean hasAnswerThree = radioThree.isChecked();
        if (hasAnswerThree) {
            score--;
        }
        return score;

    }

    /*
    Метод подсчета очков за четвертый вопрос
     */
    private int fourQuest(int score) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String nameOfBestCompany = editText.getText().toString();
        switch (nameOfBestCompany) {
            case "Вертикаль-М":
                score++;
                break;
            case "Вертикаль-м":
                score++;
                break;
            case "вертикаль-м":
                score++;
                break;
            case "вертикаль-М":
                score++;
                break;
            case "Вертикаль М":
                score++;
                break;
            case "вертикаль м":
                score++;
                break;
            case "Вертикаль м":
                score++;
                break;
            case "вертикаль М":
                score++;
                break;
        }
        return score;
    }
}
