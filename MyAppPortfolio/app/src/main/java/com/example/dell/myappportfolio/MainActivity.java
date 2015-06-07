package com.example.dell.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

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

    public void openApp(CharSequence text){

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);

        toast.show();

    }

    public void displayToast(View view) {
        String str = "This button will launch";
        switch (view.getId()) {
            case R.id.andriod_spotify:
                openApp(str + " Spotify!");
                break;
            case R.id.andriod_build_it:
                openApp(str + " Build Bigger!");
                break;
            case R.id.andriod_capstone:
                openApp(str + " My Own App!");
                break;
            case R.id.andriod_lib:
                openApp(str + " Library App!");
                break;
            case R.id.andriod_xyz:
                openApp(str + " Reader App!");
                break;
            case R.id.andriod_scores:
                openApp(str + " Score App");
                break;
        }
    }
}
