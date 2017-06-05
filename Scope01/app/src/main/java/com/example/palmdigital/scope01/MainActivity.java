package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
//outside mainactivity class
//outside any methods

//understanding how scope works in important
public class MainActivity extends AppCompatActivity
{
String myString;
    //declare a field that is a double named enemyHealth
    double enemyHealth;


    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inside onCreate inside MainActivity

        //when declare or define a variable use following format
        //dataType variableName; <--- This is a declaration/definition
        //examples
        int myInt; // <--- this is declaring a variable of a dataType 'int' and 'My int'
        double myDouble;//<---- this is declaring a variable of a dataType 'double' and 'My double'
        TextView textView_story; //this is declaring a variable of a dataType 'TextView' named 'textVeiw story'
        ImageView imageView_ex;//dataType n Image veiw

        //assigning a value to a declared variable
        //after you declare a variable you can assign a value to it
//        variableName = someValueOfTheSameDataTypeAsTheVariable
        //examples
        myInt =10; //setting the vlaue of my in to 10 int has dataType int and 10 is an int
        myDouble =20.12;//myDouble gets the value 20.12
        textView_story =(TextView) findViewById(R.id.textView_st);//set the value of textVeiw_story
                                                                                   // to UI element
                                                                                 //R.id.textView_st
        imageView_ex =(ImageView) findViewById(R.id.android_guy);

        //you can declare and assign in the same step
        //dataType variableName = someValueOfTheSameDataTypeAsTheVariable

        int myInt2 =25;//declaratin and assignment
        myInt2=50; //whats the difference//only an assignment
        //difference in dataType
        String myString ="this is a sting";//declaration and assignment
        myString="another string";//only an assignment
        //!!!!!!!!!!!!!!!!!!!!!!! wherever you declare a variable determines the variables scope!!!!!!!!!
        //if i dec;are a variable in onCreate only onCreate can use it.
   enemyHealth =8.3;
    }// end of onCreate

    public void myAwesomeMethod1()
    {
        enemyHealth=10.2;
       myString="whats going on";
    }
    public void myAwesomeMethod2()
    {
        enemyHealth=9.7;
    }


}//end of class
