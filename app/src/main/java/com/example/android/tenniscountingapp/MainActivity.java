package com.example.android.tenniscountingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.tenniscountingapp.R.id.federer_ace;
import static com.example.android.tenniscountingapp.R.id.federer_points;
import static com.example.android.tenniscountingapp.R.id.nadal_ace;
import static com.example.android.tenniscountingapp.R.id.nadal_points;
import static com.example.android.tenniscountingapp.R.id.nadal_score;

public class MainActivity extends AppCompatActivity {

    int scoreNadal = 0;
    int scoreFederer = 0;
    int pointsForNadal = 0;
    int pointsForFederer = 0;
    int aceNadal = 0;
    int aceFederer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * add 1 score to Nadal
     */
    public void plusScoreNadal(View view) {
        scoreNadal = scoreNadal + 1;
        displayNadal(scoreNadal);
    }

    /**
     * displays the score for Nadal
     */
    public void displayNadal(int score) {
        TextView scoreView = (TextView) findViewById(nadal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * add 15 points to Nadal
     */
    public void addPointsNadal(View view) {
        pointsForNadal = pointsForNadal + 15;
        displayForNadal(pointsForNadal);
        if (pointsForNadal > 45) {
            scoreNadal = scoreNadal + 1;
            displayNadal(scoreNadal);
            Toast.makeText(this, "Point for Nadal", Toast.LENGTH_SHORT).show();
            pointsForNadal = 0;
            displayForNadal(pointsForNadal);
        }
    }

    /**
     * displays the points for Nadal
     */
    public void displayForNadal(int score) {
        TextView scoreView = (TextView) findViewById(nadal_points);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * add 1 score to Federer
     */
    public void plusScoreFederer(View view) {
        scoreFederer = scoreFederer + 1;
        displayFederer(scoreFederer);
    }

    /**
     * displays the score for Federer
     */
    public void displayFederer(int score) {
        TextView scoreView = (TextView) findViewById(R.id.federer_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * add 15 points to Federer
     */
    public void addPointsFederer(View view) {
        pointsForFederer = pointsForFederer + 15;
        displayForFederer(pointsForFederer);
        if (pointsForFederer > 45) {
            scoreFederer = scoreFederer + 1;
            displayFederer(scoreFederer);
            Toast.makeText(this, "Point for Federer", Toast.LENGTH_SHORT).show();
            pointsForFederer = 0;
            displayForFederer(pointsForFederer);
        }
    }

    /**
     * displays the points for Federer
     */
    public void displayForFederer(int score) {
        TextView scoreView = (TextView) findViewById(federer_points);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * add 1 ace to Nadal
     */
    public void aceNadal(View view) {
        aceNadal = aceNadal + 1;
        displayAceNadal(aceNadal);
    }

    /**
     * displays the aces for Federer
     */
    public void displayAceNadal(int score) {
        TextView scoreView = (TextView) findViewById(nadal_ace);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * add 1 ace to Federer
     */
    public void aceFederer(View view) {
        aceFederer = aceFederer + 1;
        displayAceFederer(aceFederer);
    }

    /**
     * displays the aces for Federer
     */
    public void displayAceFederer(int score) {
        TextView scoreView = (TextView) findViewById(federer_ace);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score
     */
    public void resetScore(View view) {
        scoreNadal = 0;
        scoreFederer = 0;
        displayNadal(scoreNadal);
        displayFederer(scoreFederer);
        pointsForNadal = 0;
        pointsForFederer = 0;
        displayForNadal(pointsForNadal);
        displayForFederer(pointsForFederer);
        aceFederer = 0;
        aceNadal = 0;
        displayAceFederer(aceFederer);
        displayAceNadal(aceNadal);
    }
}
