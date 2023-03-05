package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textview;
    private Integer x, y;
    private Boolean isOperationClick;
    private Boolean isOperationPlus = false;
    private Boolean isOperationDivide = false;
    private Boolean isOperationMinus = false;
    private Boolean isOperationX = false;


    private Integer result;
    private Double resultDouble;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.display);

        findViewById(R.id.btn_CLick).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            String textResult = String.valueOf(result);
            intent.putExtra("key1", textResult);
            startActivity(intent);
        });



    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                View b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                x = Integer.valueOf(textview.getText().toString());
                isOperationPlus = true;
                isOperationMinus = false;
                isOperationDivide = false;
                isOperationX = false;
                break;
            case R.id.plusMinus:
            case R.id.percent:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                break;
            case R.id.btn_minus:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                x = Integer.valueOf(textview.getText().toString());
                isOperationMinus = true;
                isOperationPlus = false;
                isOperationDivide = false;
                isOperationX = false;
                break;
            case R.id.btn_divide:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                x = Integer.valueOf(textview.getText().toString());
                isOperationDivide = true;
                isOperationPlus = false;
                isOperationMinus = false;
                isOperationX = false;
                break;

            case R.id.btn_multiply:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                x = Integer.valueOf(textview.getText().toString());
                isOperationX = true;
                isOperationPlus = false;
                isOperationMinus = false;
                isOperationDivide = false;

                break;
            case R.id.equals:
                y = Integer.valueOf(textview.getText().toString());

                if (isOperationPlus == true) {
                    result = x + y;
                    textview.setText(result.toString());
                    b = findViewById(R.id.btn_CLick);
                    b.setVisibility(View.VISIBLE);
                } else if (isOperationMinus == true) {


                    result = x - y;
                    textview.setText(result.toString());
                    b = findViewById(R.id.btn_CLick);
                    b.setVisibility(View.VISIBLE);
                } else if (isOperationDivide == true) {
                    Double x2 = Double.valueOf(x);
                    Double y2 = Double.valueOf(y);
                    resultDouble = x2 / y2;
                    textview.setText(resultDouble.toString());
                    b = findViewById(R.id.btn_CLick);
                    b.setVisibility(View.VISIBLE);

                } else if (isOperationX == true) {
                    result = x * y;
                    textview.setText(result.toString());
                    b = findViewById(R.id.btn_CLick);
                    b.setVisibility(View.VISIBLE);
                }


                break;
        }
        isOperationClick = true;
    }


    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_nul:
                View b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("0");
                } else {
                    textview.append("0");
                }
                break;
            case R.id.btn_1:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("1");
                } else {
                    textview.append("1");
                }
                break;
            case R.id.btn_2:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("2");
                } else {
                    textview.append("2");
                }
                break;
            case R.id.btn_3:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("3");
                } else {
                    textview.append("3");
                }
                break;
            case R.id.btn_4:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("4");
                } else {
                    textview.append("4");
                }
                break;
            case R.id.btn_5:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("5");
                } else {
                    textview.append("5");
                }
                break;
            case R.id.btn_6:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("6");
                } else {
                    textview.append("6");
                }
                break;
            case R.id.btn_7:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("7");
                } else {
                    textview.append("7");
                }
                break;
            case R.id.btn_8:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("8");
                } else {
                    textview.append("8");
                }
                break;
            case R.id.btn_9:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("9");
                } else {
                    textview.append("9");
                }
                break;

            case R.id.AC:
                b = findViewById(R.id.btn_CLick);
                b.setVisibility(View.GONE);
                textview.setText("0");
                x=0;
                y=0;
                isOperationX = false;
                isOperationPlus = false;
                isOperationMinus = false;
                isOperationDivide = false;
                break;

        }
        isOperationClick = false;
    }
}