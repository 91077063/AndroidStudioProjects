package com.example.palmdigital.chooseadventurev01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WakeUp extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);


        TextView textView_story = (TextView) findViewById(R.id.textView_Story);
        textView_story.setText("You wake up and have a boring day.The end");
    }
}
