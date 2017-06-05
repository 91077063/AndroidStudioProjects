package org.palmdigital.hilow_01;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        int value= random.nextInt(101);
        Log.i("info",value+" it works");
    }
    public void onClick(View view)
    {
//       Random random = new Random();
//     int value = random.nextInt(101);
        EditText editText_input = (EditText) findViewById(R.id.editText_input);
         String str_input = editText_input.toString();
        if (TextUtils.isEmpty(str_input)&& TextUtils.isDigitsOnly(str_input))
        {

             input = Integer.parseInt(str_input);
        }
       int value = 85;
        if (input > value)
        {
            Toast.makeText(this,"Its Too high",Toast.LENGTH_LONG).show();
        }
        if (input < value)
        {
            Toast.makeText(this,"Its Too low",Toast.LENGTH_LONG).show();
        }
        if (value == input)
        {
            Toast.makeText(this,"Correct!!!",Toast.LENGTH_LONG).show();
        }
        if(input > 100)
        {
            Toast.makeText(this,"Its too high. Enter a number 1 - 100",Toast.LENGTH_LONG).show();
        }
        if(input < 1)
        {
            Toast.makeText(this,"Its too low. Enter a number 1 - 100",Toast.LENGTH_LONG).show();
        }


    }
}
