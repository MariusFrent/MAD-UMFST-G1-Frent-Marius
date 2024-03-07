package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double nr1,nr2,sum;
    TextView textView;
    EditText num1;
    EditText num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //nr1=Double.parseDouble(num1.getText().toString());
                nr1=Double.parseDouble(String.valueOf(num1.getText()));
                nr2=Double.parseDouble(String.valueOf(num2.getText()));
                sum = nr1+nr2;
                String s = String.valueOf(sum);
                textView.setText(s);
                //System.out.println("caca");
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nr1=Double.parseDouble(String.valueOf(num1.getText()));
                nr2=Double.parseDouble(String.valueOf(num2.getText()));
                double sub = nr1-nr2;
                String s = String.valueOf(sub);
                textView.setText(s);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nr1=Double.parseDouble(String.valueOf(num1.getText()));
                nr2=Double.parseDouble(String.valueOf(num2.getText()));
                double div = nr1/nr2;
                String s = String.valueOf(div);
                textView.setText(s);
            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nr1=Double.parseDouble(String.valueOf(num1.getText()));
                nr2=Double.parseDouble(String.valueOf(num2.getText()));
                double mul = nr1*nr2;
                String s = String.valueOf(mul);
                textView.setText(s);
            }
        });
    }
}