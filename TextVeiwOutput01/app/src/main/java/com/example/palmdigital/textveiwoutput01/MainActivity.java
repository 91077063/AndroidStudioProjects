package com.example.palmdigital.textveiwoutput01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewDisplayTop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);

         textViewDisplayTop = (TextView) findViewById(R.id.textVeiw);

        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView)
        {
            //Toast.makeText(MainActivity.this, "you clicked 1", Toast.LENGTH_SHORT).show();
        textViewDisplayTop.setText("1");
        }
        if(view.getId() == R.id.imageView2)
            {
                //Toast.makeText(MainActivity.this, "you clicked 1", Toast.LENGTH_SHORT).show();
                textViewDisplayTop.setText("2");
            }
        if(view.getId() == R.id.imageView3)
        {
            //Toast.makeText(MainActivity.this, "you clicked 1", Toast.LENGTH_SHORT).show();
            textViewDisplayTop.setText("3");
        }

    }
}
