package com.example.ahmedelbasha.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A.
    int scoreTeamA = 0;
    // Tracks the score for Team B.
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     *  This Method Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Method Increases scoreTeamA by 3.
    * */
    public void addThreePointsForTeamAButtonWasPressed(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This Method Increases scoreTeamA by 2.
     * */
    public void addTwoPointsForTeamAWasPressed(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This Method Increases scoreTeamA by 1.
     * */
    public void addFreeThrowForTeamAWasPressed(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This Method Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Method Increases scoreTeamB by 3.
     * */
    public void addThreePointsForTeamBButtonWasPressed(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This Method Increases scoreTeamB by 2.
     * */
    public void addTwoPointsForTeamBWasPressed(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This Method Increases scoreTeamB by 1.
     * */
    public void addFreeThrowForTeamBWasPressed(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This Method resets scoreTeamA and scoreTeamB to their initial value and displays them again.
     * */
    public void resetButtonWasPressed(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
