package com.example.palmdigital.calculator03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewDisplayTop;
    TextView textViewDisplayBottom;
    TextView textViewDisplayBottomBottom;

    Integer Num1;
    Integer Num2;
    ImageView plus;
    ImageView minus;
    ImageView divide;
    ImageView multiply;
    Integer Sum;
    Integer Difference;
    Integer Product;
    Integer Quotient;
    int operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView zero1 = (ImageView) findViewById(R.id.zero1);
        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewNum7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageViewNum8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageViewNum9 = (ImageView) findViewById(R.id.imageView9);
        ImageView imageViewNum11 = (ImageView) findViewById(R.id.imageView11);
        ImageView imageViewNum12 = (ImageView) findViewById(R.id.imageView12);
        ImageView imageViewNum13 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageViewNum14 = (ImageView) findViewById(R.id.imageView14);
        ImageView imageViewNum15 = (ImageView) findViewById(R.id.imageView15);
        ImageView imageViewNum16 = (ImageView) findViewById(R.id.imageView16);
        ImageView imageViewNum17 = (ImageView) findViewById(R.id.imageView17);
        ImageView imageViewNum18 = (ImageView) findViewById(R.id.imageView18);
        ImageView imageViewNum19 = (ImageView) findViewById(R.id.imageView19);
        ImageView zero2 = (ImageView) findViewById(R.id.zero2);

        ImageView equals = (ImageView) findViewById(R.id.equals);
         plus = (ImageView) findViewById(R.id.plus);
         minus = (ImageView) findViewById(R.id.minus);
         multiply = (ImageView) findViewById(R.id.multiply);
         divide = (ImageView) findViewById(R.id.divide);

        zero1.setOnClickListener(this);
        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);
        imageViewNum7.setOnClickListener(this);
        imageViewNum8.setOnClickListener(this);
        imageViewNum9.setOnClickListener(this);
        imageViewNum11.setOnClickListener(this);
        imageViewNum12.setOnClickListener(this);
        imageViewNum13.setOnClickListener(this);
        imageViewNum14.setOnClickListener(this);
        imageViewNum15.setOnClickListener(this);
        imageViewNum16.setOnClickListener(this);
        imageViewNum17.setOnClickListener(this);
        imageViewNum18.setOnClickListener(this);
        imageViewNum19.setOnClickListener(this);
        zero2.setOnClickListener(this);
        equals.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);


    }
    public void onClick(View view)
    {
        if (view.getId()==R.id.plus)
        {
            plus.setBackgroundColor(0xffff0000);
            minus.setBackgroundColor(0xffffffff);
            divide.setBackgroundColor(0xffffffff);
            multiply.setBackgroundColor(0xffffffff);
            operator =1;
        }
        if (view.getId()==R.id.minus)
        {
            plus.setBackgroundColor(0xffffffff);
            minus.setBackgroundColor(0xff0000ff);
            divide.setBackgroundColor(0xffffffff);
            multiply.setBackgroundColor(0xffffffff);

        }
        if (view.getId()==R.id.divide)
    {
        plus.setBackgroundColor(0xffffffff);
        minus.setBackgroundColor(0xffffffff);
        divide.setBackgroundColor(0xffff0000);
        multiply.setBackgroundColor(0xffffffff);
        operator = 3;
    }
        if (view.getId()==R.id.multiply)
    {
        plus.setBackgroundColor(0xffffffff);
        minus.setBackgroundColor(0xffffffff);
        divide.setBackgroundColor(0xffffffff);
        multiply.setBackgroundColor(0xff0000ff);
        operator =4;
    }
        if (view.getId()== R.id.zero1)
        {
            textViewDisplayTop.setText("0");
            Num1 = 0;
        }
        if (view.getId()== R.id.imageView1)
        {
            textViewDisplayTop.setText("1");
            Num1 = 1;
        }
        if (view.getId()== R.id.imageView2)
        {
            textViewDisplayTop.setText("2");
            Num1 = 2;

        }
        if (view.getId()== R.id.imageView3)
        {
            textViewDisplayTop.setText("3");
            Num1 = 3;

        }
        if (view.getId()== R.id.imageView4)
        {
            textViewDisplayTop.setText("4");
            Num1 = 4;

        }
        if (view.getId()== R.id.imageView5)
        {
            textViewDisplayTop.setText("5");
            Num1 = 5;

        }
        if (view.getId()== R.id.imageView6)
        {
            textViewDisplayTop.setText("6");
            Num1 = 6;

        }
        if (view.getId()== R.id.imageView7)
        {
            textViewDisplayTop.setText("7");
            Num1 = 7;

        }
        if (view.getId()== R.id.imageView8)
        {
            textViewDisplayTop.setText("8");
            Num1 = 8;

        }
        if (view.getId()== R.id.imageView9)
        {
            textViewDisplayTop.setText("9");
            Num1 = 9;

        }
        if (view.getId()== R.id.imageView11)
        {
            textViewDisplayBottom.setText("1");
            Num2 = 1;
        }
        if (view.getId()== R.id.imageView12)
        {
            textViewDisplayBottom.setText("2");
            Num2 = 2;
        }
        if (view.getId()== R.id.imageView13)
        {
            textViewDisplayBottom.setText("3");
            Num2 = 3;
        }
        if (view.getId()== R.id.imageView14)
        {
            textViewDisplayBottom.setText("4");
            Num2 = 4;
        }
        if (view.getId()== R.id.imageView15)
        {
            textViewDisplayBottom.setText("5");
            Num2 = 5;
        }
        if (view.getId()== R.id.imageView16)
        {
            textViewDisplayBottom.setText("6");
            Num2 = 6;
        }
        if (view.getId()== R.id.imageView17)
        {
            textViewDisplayBottom.setText("7");
            Num2 = 7;
        }
        if (view.getId()== R.id.imageView18)
        {
            textViewDisplayBottom.setText("8");
            Num2 =8;
        }
        if (view.getId()== R.id.imageView19)
        {
            textViewDisplayBottom.setText("9");
            Num2 = 9;
        }
        if (view.getId()== R.id.zero2)
        {
            textViewDisplayBottom.setText("0");
            Num2 = 0;
        }

        if (view.getId()==R.id.equals)
        {
            if (operator == 1)
            {
                Sum = Num1 + Num2;
                Log.i("info","plus working");

                textViewDisplayBottomBottom.setText(""+Sum);
            }
            if (operator == 2)
            {
                Difference = Num1 - Num2;
                Log.i("info","minus working");
                textViewDisplayBottomBottom.setText(""+Difference);
            }
            if (operator == 3)
            {
                Product = Num1 * Num2;
                textViewDisplayBottomBottom.setText(""+Product);

            }
            if (operator == 4)
            {
                Quotient = Num1 / Num2;
                textViewDisplayBottomBottom.setText(""+Quotient);

            }
        }



    }
}
