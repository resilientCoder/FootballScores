package com.example.android.footballscores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Team A variables
    // Tracks the score Team A.
    int goals_A = 0;
    // Tracks the fouls by Team A players.
    int fouls_A = 0;
    // Tracks Yellow Cards issued to Team A players.
    int yellowCards_A = 0;
    // Tracks Red Cards issued to Team A players.
    int redCards_A = 0;
    // Team B variables
    // Tracks the score Team B.
    int goals_B = 0;
    // Tracks the fouls by Team B players.
    int fouls_B = 0;
    // Tracks Yellow Cards issued to Team B players.
    int yellowCards_B = 0;
    // Tracks Red Cards issued to Team B players.
    int redCards_B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScore_A(goals_A);
        displayScore_B(goals_B);
        displayFouls_A(fouls_A);
        displayFouls_B(fouls_B);
        displayYellowCards_A(yellowCards_A);
        displayYellowCards_B(yellowCards_B);
        displayRedCards_A(redCards_A);
        displayRedCards_B(redCards_B);
    }

    /**
     * Methods for Team A.
     */
    public void buttonPressed_Goal_A(View view) {
        goals_A++;
        displayScore_A(goals_A);
    }

    public void buttonPressed_Foul_A(View view) {
        fouls_A++;
        displayFouls_A(fouls_A);
    }

    public void buttonPressed_YellowCard_A(View view) {
        yellowCards_A++;
        displayYellowCards_A(yellowCards_A);
    }

    public void buttonPressed_RedCard_A(View view) {
        redCards_A++;
        displayRedCards_A(redCards_A);
    }

    /**
     * Methods for Team B.
     */
    public void buttonPressed_Goal_B(View view) {
        goals_B++;
        displayScore_B(goals_B);
    }

    public void buttonPressed_Foul_B(View view) {
        fouls_B++;
        displayFouls_B(fouls_B);
    }

    public void buttonPressed_YellowCard_B(View view) {
        yellowCards_B++;
        displayYellowCards_B(yellowCards_B);
    }

    public void buttonPressed_RedCard_B(View view) {
        redCards_B++;
        displayRedCards_B(redCards_B);
    }

    /**
     * Methods to Reset the Score and Fouls.
     **/
    public void reset(View view) {
        goals_A = 0;
        goals_B = 0;
        fouls_A = 0;
        fouls_B = 0;
        yellowCards_A = 0;
        yellowCards_B = 0;
        redCards_A = 0;
        redCards_B = 0;
        displayScore_A(goals_A);
        displayScore_B(goals_B);
        displayFouls_A(fouls_A);
        displayFouls_B(fouls_B);
        displayYellowCards_A(yellowCards_A);
        displayYellowCards_B(yellowCards_B);
        displayRedCards_A(redCards_A);
        displayRedCards_B(redCards_B);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScore_A(int score) {
        TextView scoreView = findViewById(R.id.a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScore_B(int score) {
        TextView scoreView = findViewById(R.id.b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFouls_A(int score) {
        TextView scoreView = findViewById(R.id.a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFouls_B(int score) {
        TextView scoreView = findViewById(R.id.b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Yellow Cards for Team A.
     */
    public void displayYellowCards_A(int score) {
        TextView scoreView = findViewById(R.id.a_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Yellow Cards for Team B.
     */
    public void displayYellowCards_B(int score) {
        TextView scoreView = findViewById(R.id.b_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Red Cards for Team A.
     */
    public void displayRedCards_A(int score) {
        TextView scoreView = findViewById(R.id.a_red_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Red Cards for Team B.
     */
    public void displayRedCards_B(int score) {
        TextView scoreView = findViewById(R.id.b_red_cards);
        scoreView.setText(String.valueOf(score));
    }
}
