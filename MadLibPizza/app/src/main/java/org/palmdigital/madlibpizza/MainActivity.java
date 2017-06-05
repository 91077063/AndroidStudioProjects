package org.palmdigital.madlibpizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void makeStory(View view)
    {
        EditText et_nation1= (EditText)findViewById(R.id.edit_text_nation1);
        EditText et_person1=(EditText) findViewById(R.id.edit_text_person1);
        EditText et_noun1=(EditText) findViewById(R.id.edit_text_noun1);
        EditText et_noun2= (EditText) findViewById(R.id.edit_text_noun2);
        EditText et_noun3= (EditText) findViewById(R.id.edit_text_noun3);
        EditText et_adj1 = (EditText) findViewById(R.id.edit_text_adj1);
        EditText et_ajd2= (EditText) findViewById(R.id.edit_text_adj2);
        EditText et_ajd3= (EditText) findViewById(R.id.edit_text_adj3);
        EditText et_ajd4= (EditText) findViewById(R.id.edit_text_adj4);



        TextView tv_story =(TextView) findViewById(R.id.text_view_story);


        String str_Nation1= et_nation1.getText().toString();
        String str_Person1= et_person1.getText().toString();
        String str_Noun1= et_noun1.getText().toString();
        String str_Noun2=et_noun2.getText().toString();
        String str_Noun3=et_noun3.getText().toString();
        String str_Adj1 = et_adj1.getText().toString();
        String str_Adj2=et_ajd2.getText().toString();
        String str_Adj3=et_ajd3.getText().toString();
        String str_Adj4=et_ajd4.getText().toString();

        String story = "Pizza was invented by a ";
        story = story + str_Adj1+" " + str_Nation1+ " chef named "+str_Person1+"."+ "To make pizza, " +
                " you need to take a lump of " + str_Noun1 + " and make a thin round " + str_Adj2 +" "+  str_Noun2 +"."+
        "Then you cover it with "+ str_Adj3 + " sauce, "+ str_Adj4+ " cheese, and fresh chopped " + str_Noun3 +".";

        tv_story.setText(story);
    }
}
