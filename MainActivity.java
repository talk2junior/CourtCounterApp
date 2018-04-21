package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.screen;
import static com.example.android.courtcounter.R.id.team_a_score;
import static com.example.android.courtcounter.R.id.team_b_score;


public class MainActivity extends AppCompatActivity {
    /**
     * global variables are always outside of the methods within the code
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method will increase the score for Team A by 3
     */
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method will increase the score for Team A by 2
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method will increase the score for Team A by 1
     */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method will reset the score for Team A
     */
    public void resetScoreForTeams(View view) {
        int scoreTeamA = 0;
        int scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method will display the given score for Team A
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * This method will increase the score for Team B by 3
     */
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method will increase the score for Team B by 2
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method will increase the score for Team B by 1
     */
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method will display the given score for Team B
     */
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
}
