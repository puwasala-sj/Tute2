package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        num1 = (EditText)findViewById(R.id.n1);
        num2 = (EditText)findViewById(R.id.n2);
        ok = (Button)findViewById(R.id.ok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();
                intent.putExtra("Number1",number1);
                intent.putExtra("Number2",number2);
                startActivity(intent);
            }
        });
    }
}
