package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next01(View view)
    {
        EditText et_adj1=(EditText) findViewById(R.id.edit_text_adj1);
        EditText et_nation1= (EditText) findViewById(R.id.edit_text_nation1) ;
        EditText et_name1= (EditText) findViewById(R.id.edit_text_name1) ;


        String str_adj01= et_adj1.getText().toString();
        String str_nation1= et_nation1.getText().toString();
        String str_name1= et_name1.getText().toString();


        String story ="Pizza was invented by a " + str_adj01  + str_nation1 + " chef named " +str_name1
                + ".";

        Intent i = new Intent(this, Main2Activity.class );
        i.putExtra("STORY_SO_FAR", story);
        startActivity(i);


    }

}
