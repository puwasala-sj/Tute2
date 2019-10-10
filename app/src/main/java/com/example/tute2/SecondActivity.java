package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText num1, num2, displayA;
    Button add, sub, mul, div;
    int n1, n2,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        final String number1 = intent.getStringExtra("Number1");
        final String number2 = intent.getStringExtra("Number2");

        num1 = findViewById(R.id.n1);
        num2 = findViewById(R.id.n2);

        num1.setText(number1);
        num2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);

        add = (Button)findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = n1+n2;
                String display = number1 + " + " + number2 + " = " +ans;
                displayAnswer(display);
            }
        });

        sub = (Button)findViewById(R.id.sub);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = n1-n2;
                String display = number1 + " - " + number2 + " = " +ans;
                displayAnswer(display);
            }
        });

        mul = (Button)findViewById(R.id.mul);

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = n1*n2;
                String display = number1 + " * " + number2 + " = " +ans;
                displayAnswer(display);
            }
        });

        div = (Button)findViewById(R.id.div);
        
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = n1/n2;
                String display = number1 + " / " + number2 + " = " +ans;
                displayAnswer(display);
            }

        });
    }

    private void displayAnswer(String display) {
        displayA = (EditText)findViewById(R.id.display);
        displayA.setText(display);
    }
}
