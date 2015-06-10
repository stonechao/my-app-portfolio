package com.example.stone.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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

    public void CallSpotifyStreamer(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Launch Spotify Streamer";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void CallScoresApp(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Launch Scores App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void CallLibraryApp(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Launch Library App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void CallBuildItBigger(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Launch BuildItBigger";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void CallXYZReader(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Launch XYZ Reader";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void CallCapstone(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Launch Capstone";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
