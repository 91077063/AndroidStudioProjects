package com.example.palmdigital.toast03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Today is Wednesday", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "the 11th", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "The month is January", Toast.LENGTH_SHORT).show();


    }
}
