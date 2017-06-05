package com.example.palmdigital.button3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button) findViewById(R.id.buttonMyButton1);
        Button buttonObject02 = (Button) findViewById(R.id.buttonMyButton2);
        buttonObject01.setText("The Blue pill");
        buttonObject02.setText("The Red pill");
        buttonObject01.setBackgroundColor(0xff0000ff);
        buttonObject02.setBackgroundColor(0xffff0000);
        buttonObject01.setOnClickListener(this);
        buttonObject02.setOnClickListener(this);
    }

    public void onClick (View view) {
        if (view.getId() == R.id.buttonMyButton1) {

            Log.i("info", "You took the blue pill");
            Toast.makeText(MainActivity.this, "You stay in wonderland, and i show you just how deep this rabbit hole goes", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "You wake up, and believe what ever you want to believe", Toast.LENGTH_SHORT).show();
            Log.i("info", "You took the red pill");

        }
    }
}
