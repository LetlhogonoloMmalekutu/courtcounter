package com.example.ekasilabalexcdtb.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
   //Tracks the score for Team A
   int scoreTeamA = 0;
   //Tracks the score for Team B
   int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displaysForTeamA(0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is parent.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     *  @Override
    public boolean onOptionsItemsSelected(MenuItems item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
    return true;
    }

    return super.onOptionsItemSelected(item);
    }

     */
    /**
     * Increase  the score Team A by 3 points
     */

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA+3;
        displaysForTeamA(scoreTeamA);
    }

    /**
     * Increase  the score Team A by 2 points
     */

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA+2;
        displaysForTeamA(scoreTeamA);
    }
    /**
     * Increase  the score Team A by 1 point
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA+1;
        displaysForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displaysForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase  the score Team A by 3 points
     */

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB +3;
        displaysForTeamB(scoreTeamB);
    }

    /**
     * Increase  the score Team B by 2 points
     */

    public void addTwoForTeamB(View v) {
       scoreTeamB = scoreTeamB +2;
        displaysForTeamB(scoreTeamB);
    }
    /**
     * Increase  the score Team A by 1 point
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB+1;
        displaysForTeamB(scoreTeamB);
    }

    /**
     * Resets the score for both Teams back to 0
     */
    public void restScore(View v) {
       scoreTeamB = 0;
       scoreTeamA = 0;
       displaysForTeamB(scoreTeamB);
       displaysForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displaysForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
