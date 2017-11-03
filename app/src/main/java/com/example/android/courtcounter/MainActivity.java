package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //int scoreTeamA = 0;
    int displayForTeamA = 0;
    int displayForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        displayForTeamA = displayForTeamA + 1;
        //change to scoreTeamA in issue cases
        displayForTeamA(displayForTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        displayForTeamA = displayForTeamA + 2;
        displayForTeamA(displayForTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        displayForTeamA = displayForTeamA + 3;
        displayForTeamA(displayForTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamB(View v) {
        displayForTeamB = displayForTeamB + 1;
        //change to scoreTeamA in issue cases
        displayForTeamB(displayForTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        displayForTeamB = displayForTeamB + 2;
        displayForTeamB(displayForTeamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        displayForTeamB = displayForTeamB + 3;
        displayForTeamB(displayForTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View v) {
        displayForTeamA = 0;
        displayForTeamB = 0;
        displayForTeamB(displayForTeamB);
        displayForTeamA(displayForTeamA);
    }
}