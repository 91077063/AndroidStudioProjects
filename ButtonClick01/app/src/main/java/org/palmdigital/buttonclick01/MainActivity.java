package org.palmdigital.buttonclick01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =(Button) findViewById(R.id.button);
    }
    public void getName (View v)
    {
        Toast.makeText(this, "this button works", Toast.LENGTH_LONG).show();
    }
    public void test1 (View view)
    {
        Toast.makeText(this, "this button works", Toast.LENGTH_LONG).show();
    }
    public void test2 (View view)
    {
        Toast.makeText(this, "this button works", Toast.LENGTH_LONG).show();
    }
}