package com.example.palmdigital.calculator01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.palmdigital.calculator01.R.id.textView1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewDisplayTop;
    TextView textViewDisplayBottom;
    TextView textViewDisplayBottomBottom;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewNum12 = (ImageView) findViewById(R.id.imageView12);




        textViewDisplayTop = (TextView) findViewById(R.id.textView1);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottomBottom = (TextView) findViewById(R.id.textView3);





        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);

        imageViewNum12.setOnClickListener(this);


    }
    Integer Num1;
    Integer Num2;
    String Sum;

    public void onClick(View view)
    {
if (view.getId()==R.id.imageView)
{
    textViewDisplayTop.setText("1");
Num1 = 1;

}
        if (view.getId()==R.id.imageView2)
        {
            textViewDisplayTop.setText("2");
            Num1 = 2;

        }
        if (view.getId()==R.id.imageView3)
        {
            textViewDisplayTop.setText("3");
            Num1 = 3;

        }
        if (view.getId()==R.id.imageView4)
        {
            textViewDisplayBottom.setText("4");
            Num2 = 4;

        }
        if (view.getId()==R.id.imageView5)
        {
            textViewDisplayBottom.setText("5");
            Num2 = 5;

        }
        if (view.getId()==R.id.imageView6)
        {
            textViewDisplayBottom.setText("6");
            Num2 = 6;

        }

        if (view.getId()==R.id.imageView12)
        {
            Sum = ""+(Num1 + Num2);
            textViewDisplayBottomBottom.setText(Sum);

        }



    }
}
