package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


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
    public void next05(View view)
    {
        EditText et_food1=(EditText) findViewById(R.id.edit_text_food1);
        EditText et_food2=(EditText) findViewById(R.id.edit_text_food2);
        EditText et_num2=(EditText) findViewById(R.id.edit_text_num2);



        String str_food1= et_food1.getText().toString();
        String str_food2= et_food2.getText().toString();
        String str_num2= et_num2.getText().toString();




        newString =newString+ "Some kids like" + str_food1 + " pizza the best, but my favorite is the"
        + str_food2 + " pizza. If i could, I would eat pizza " + str_num2 + "times a day";
        Intent i = new Intent(this, Main6Activity.class );
        i.putExtra("STORY_SO_FAR", newString);
        startActivity(i);
    }
}
