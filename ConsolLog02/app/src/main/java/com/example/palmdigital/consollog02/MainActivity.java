package com.example.palmdigital.consollog02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
//fields class level variables
    private int myInt;
    private double myDouble;
    private String myString;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "myInt =" + myInt);
        double myDouble = setDoubleValue();
        Log.i("info", "myDouble" + myDouble);

        //declare a variable mybooblean that calls a function called set booleanvalue
        //it should return a boolean

        Boolean myBoolean = setBooleanValue();
        Log.i("info", "myBoolean = " + myBoolean);

        Float myFloat = setFloatValue();
        Log.i("info", "myFloat = " + myFloat);

    }

    public float setFloatValue()
    {
        return (4.5f + 2.3f);
    }

    public boolean setBooleanValue()
    {
        return false;
    }

    public double setDoubleValue()
    {
        return 10.987;
    }

    public int setIntValue()
    {
        return 10;
    }
}
