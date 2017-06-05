package com.example.palmdigital.chooseadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button leftButton;
    Button rightButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView_story =(TextView) findViewById(R.id.textView_Story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("One morning a tortoise woke up in a dream");
        textView_question.setText("do you want to wake up or explore the dream?");

        leftButton = (Button) findViewById(R.id.button_Left);
        rightButton =(Button) findViewById(R.id.button_Right);
        leftButton.setText("wake up");
        rightButton.setText("explore");

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.button_Left)
        {

            Intent i =new Intent(this,WakeUpActvity.class);
            startActivity(i);

            /*
            Intent i = new Intent(this, WakeUp.class);
            startActivity(i);
            */
        }
        else if (view.getId() == R.id.button_Right)
        {
            Intent i =new Intent(this, ExploreActivity.class);
            startActivity(i);
        }
    } // end of onClick()
} // end of class
