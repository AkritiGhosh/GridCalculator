package com.example.gridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView number, values;
    double num1=0, num2=0, ans = 0;
    boolean add, minus, product, divide, decimal;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, sum, sub, mul, div, deci, equal, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.showResults);
        values = findViewById(R.id.showValues);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        sum = findViewById(R.id.add);
        sub = findViewById(R.id.subtract);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);
        deci = findViewById(R.id.bpoint);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.delete);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "9");
            }
        });
        deci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + ".");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("");
                values.setText("");
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number.getText() != null) {
                    num1 = Float.parseFloat(number.getText() + "");
                    add = true;
                }
                values.setText(number.getText() + " +");
                number.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number.getText() != null) {
                    num1 = Float.parseFloat(number.getText() + "");
                    minus = true;
                }
                values.setText(number.getText() + " -");
                number.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number.getText() != null) {
                    num1 = Float.parseFloat(number.getText() + "");
                    product = true;
                }
                values.setText(number.getText() + " *");
                number.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number.getText() != null) {
                    num1 = Float.parseFloat(number.getText() + "");
                    divide = true;
                }
                values.setText(number.getText() + " /");
                number.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (add == true || minus == true || product == true || divide == true) {
                    if (number.getText() != null ) {
                        num2 = Float.parseFloat(number.getText() + "");
                        values.setText(values.getText() + " " + number.getText());

                        if (add == true)
                            ans = num1 + num2;
                        add = false;
                        if (minus == true)
                            ans = num1 - num2;
                        minus = false;
                        if (product == true)
                            ans = num1 * num2;
                        product = false;
                        if (divide == true)
                            ans = num1 / num2;
                        divide = false;

                        number.setText(ans + "");
                        num2 = ans;
                        num1 = 0;
                    }
                }
            }
        });
    }
}
