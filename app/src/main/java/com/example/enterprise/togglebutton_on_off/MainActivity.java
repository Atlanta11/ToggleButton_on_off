package com.example.enterprise.togglebutton_on_off;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

//additional imported classes
import android.app.Activity;
import android.view.View;
import android.widget.ToggleButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToggleButtonClicked(View v){
        //Get reference of the TextView from XML layout
        TextView tView = (TextView) findViewById(R.id.tv);

        //Check, is the toggle is on?
        boolean on = ((ToggleButton) v).isChecked();

        if(on)
        {
            //do something when toggle is on
            tView.setText("Toggle is on");
        }
        else
        {
            //do something when toggle is off
            tView.setText("Toggle is off");
        }
    }

}
