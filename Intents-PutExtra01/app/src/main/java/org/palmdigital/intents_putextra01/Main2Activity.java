package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

      //  TextView tv_story = (TextView) findViewById(R.id.text_view_story);

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
    public void next02(View view)
    {
        EditText et_noun1=(EditText) findViewById(R.id.edit_text_noun1);
        EditText et_adj2=(EditText) findViewById(R.id.edit_text_adj2);
        EditText et_noun2=(EditText) findViewById(R.id.edit_text_noun2);



        String str_noun1= et_noun1.getText().toString();
        String str_adj2= et_adj2.getText().toString();
        String str_noun2= et_noun2.getText().toString();




        newString =newString+" To make pizza, you need to take a lump of "+ str_noun1 +" and make a thin round "
                + str_adj2 + str_noun2;

        Intent i = new Intent(this, Main3Activity.class );
        i.putExtra("STORY_SO_FAR", newString);
        startActivity(i);
    }
}
