package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


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
    public void next04(View view)
    {
        EditText et_noun4=(EditText) findViewById(R.id.edit_text_noun4);
        EditText et_num1=(EditText) findViewById(R.id.edit_text_num1);
        EditText et_shape1=(EditText) findViewById(R.id.edit_text_shape1);



        String str_noun4= et_noun4.getText().toString();
        String str_num1= et_num1.getText().toString();
        String str_shape1= et_shape1.getText().toString();




        newString =newString+"Next you have to bake it in a very hot" + str_noun4 + "." + "When it is done, cut it into"
                + str_num1 + str_shape1;
        Intent i = new Intent(this, Main5Activity.class );
        i.putExtra("STORY_SO_FAR", newString);
        startActivity(i);
    }
}
