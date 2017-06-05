package com.example.palmdigital.chooseyourownadventurev02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button leftButton;
    Button rightButton;
    String page;
    LinearLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView_story    = (TextView) findViewById(R.id.textView_Story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("One morning a tortoise woke up in a dream");
        textView_question.setText("do you want to wake up or explore the dream?");
        leftButton = (Button) findViewById(R.id.button_Left);
        rightButton =(Button) findViewById(R.id.button_Right);
        leftButton.setText("wake up");
        rightButton.setText("explore");
        background = (LinearLayout) findViewById(R.id.activity_main);
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    }
    public void onClick()
    {

    }
    public void loadPage()
    {
        background.setBackgroundColor();
    }
}
