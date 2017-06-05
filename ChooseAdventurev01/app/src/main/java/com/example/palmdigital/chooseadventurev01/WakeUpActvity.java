package com.example.palmdigital.chooseadventurev01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WakeUpActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up_actvity);

        TextView textView_Story = (TextView) findViewById(R.id.textView_Story);
        textView_Story.setText("You wake up and have a boring day. The end");
    }
}
