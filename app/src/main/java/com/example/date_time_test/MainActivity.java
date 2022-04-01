package com.example.date_time_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton btn1,btn2,btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClick(View view){
        btn1 = (RadioButton) findViewById(R.id.time);
        btn2 = (RadioButton) findViewById(R.id.date);
        btn3 = (RadioButton) findViewById(R.id.calender);

        
    }
}