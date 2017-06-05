package org.palmdigital.intents_putextra01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        if(savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }
            else
            {
                newString=extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            newString =(String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }



    }
    public void onClick(View view)
    {
        TextView tv_story = (TextView) findViewById(R.id.text_view_story);

        tv_story.setText(newString);
    }
}
