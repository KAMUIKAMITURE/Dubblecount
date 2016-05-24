package com.lifeistech.android.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;

    int count;
    int number;
    int math;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);


    }

    public void add(View v) {
        Random random = new Random();
        count = random.nextInt(1000);

        if (count < 150) {
            math = math - 50;
            textView2.setText(String.valueOf(number));

        } else if (count  < 400) {
            number = number - 50;
            textView.setText(String.valueOf(number));

        } else if (count - 100 < 500) {
            math = math - 100;
            textView2.setText(String.valueOf(math));

        } else if (count - 100 < 600) {
            number = number - 150;
            textView.setText(String.valueOf(number));

        } else if (count - 100 < 700) {
            math = math - 150;
            textView2.setText(String.valueOf(math));

        } else {
            number = number - 200;
            math = math + 50;
            textView.setText(String.valueOf(number));
            textView2.setText(String.valueOf(math));

        }
    }

    public void pulus(View v) {
        Random random = new Random();
        count = random.nextInt(1000);
        if (count < 200) {
            math = math + 50;
            textView2.setText(String.valueOf(number));

        } else if (count - 250 < 450) {
            number = number + 50;
            textView.setText(String.valueOf(number));

        } else if (count - 50 < 500) {
            math = math + 150;
            textView2.setText(String.valueOf(math));

        } else if (count - 250 < 750) {
            number = number + 100;
            textView.setText(String.valueOf(number));

        } else if (count - 50 < 800) {
            math = math + 200;
            textView2.setText(String.valueOf(math));

        } else {
            number = number + 200;
            math = math - 50;
            textView.setText(String.valueOf(number));
            textView2.setText(String.valueOf(math));

        }

    }
}

