package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Main3Activity extends AppCompatActivity {

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


       // TextView tv_story = (TextView) findViewById(R.id.text_view_story);

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

       // tv_story.setText(newString);

    }
    public void next03(View view)
    {
        EditText et_adj3=(EditText) findViewById(R.id.edit_text_adj3);
        EditText et_adj4=(EditText) findViewById(R.id.edit_text_adj4);
        EditText et_noun3=(EditText) findViewById(R.id.edit_text_noun3);



        String str_adj3= et_adj3.getText().toString();
        String str_adj4= et_adj4.getText().toString();
        String str_noun3= et_noun3.getText().toString();




        newString =newString+"Then you cover it with" + str_adj3 + " sauce " + str_adj4 + " cheese, and fresh chopped "
                + str_noun3;
        Intent i = new Intent(this, Main4Activity.class );
        i.putExtra("STORY_SO_FAR", newString);
        startActivity(i);
    }
}
