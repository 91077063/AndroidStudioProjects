package com.example.palmdigital.chooseadventurev01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class YesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes);

        TextView textView_story =(TextView) findViewById(R.id.textView_Story);

        textView_story.setText("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");




    }
}
