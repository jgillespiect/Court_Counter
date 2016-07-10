package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    //On click listener for button1
    final View.OnClickListener mButton3_OnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {

            scoreTeamA = (scoreTeamA + 3);
            displayForTeamA(scoreTeamA);
        }
    };
    final View.OnClickListener mButton2_OnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {

            scoreTeamA = (scoreTeamA + 2);
            displayForTeamA(scoreTeamA);
        }
    };
    final View.OnClickListener mButtonFreeThrow_OnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {

            scoreTeamA = (scoreTeamA + 1);
            displayForTeamA(scoreTeamA);
        }
    };
    int scoreTeamB = 0;
    final View.OnClickListener mButtonFreeThrowb_OnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {

            scoreTeamB = (scoreTeamB + 1);
            displayForTeamB(scoreTeamB);
        }
    };
    final View.OnClickListener mButton2b_OnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {

            scoreTeamB = (scoreTeamB + 2);
            displayForTeamB(scoreTeamB);
        }
    };
    final View.OnClickListener mButton3b_OnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {

            scoreTeamB = (scoreTeamB + 3);
            displayForTeamB(scoreTeamB);
        }
    };
    final View.OnClickListener mButtonReset = new View.OnClickListener() {
        public void onClick(final View v) {

            scoreTeamB = 0;
            scoreTeamA = 0;
            displayForTeamB(scoreTeamB);
            displayForTeamA(scoreTeamA);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2Pts = (Button) findViewById(R.id.button2Points);
        button2Pts.setOnClickListener(mButton2_OnClickListener);
        Button button3Pts = (Button) findViewById(R.id.button3Points);
        button3Pts.setOnClickListener(mButton3_OnClickListener);
        Button buttonFreeThrow = (Button) findViewById(R.id.buttonFreeThrow);
        buttonFreeThrow.setOnClickListener(mButtonFreeThrow_OnClickListener);
        Button button2PtsB = (Button) findViewById(R.id.button2Pointsb);
        button2PtsB.setOnClickListener(mButton2b_OnClickListener);
        Button button3PtsB = (Button) findViewById(R.id.button3Pointsb);
        button3PtsB.setOnClickListener(mButton3b_OnClickListener);
        Button buttonFreeThrowb = (Button) findViewById(R.id.buttonFreeThrowb);
        buttonFreeThrowb.setOnClickListener(mButtonFreeThrowb_OnClickListener);
        Button buttonReset = (Button) findViewById(R.id.buttonReset);
        buttonReset.setOnClickListener(mButtonReset);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
