package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private View textview;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textview = findViewById(R.id.tv_output);
        textview.setText(getIntent().getStringExtra("key1"));

        findViewById(R.id.btn_allClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                finishAffinity();
                System.exit(0);
                startActivity(intent);

            }
        });
    }
}