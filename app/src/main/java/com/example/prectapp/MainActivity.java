package com.example.prectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView number;
    TextView member;
    TextView color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.Number);
        member = findViewById(R.id.Member);
        color = findViewById(R.id.Color);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            //Implementing intent using on click listener so in xml don't need onclick method
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this,NumberActivity.class);
                startActivity(n);
            }
        });
        member.setOnClickListener(new View.OnClickListener() {
            @Override
            //Implementing intent using on click listener so in xml don't need onclick method
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this, MemberActivity.class);
                startActivity(n);
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            //Implementing intent using on click listener so in xml don't need onclick method
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this,ColorActivity.class);
                startActivity(n);
            }
        });
    }

    /*This implements onclick method defined in xml file for every view here
    public void opennumber(View view){
        Intent n = new Intent(this,NumberActivity.class);
        startActivity(n);
    }*/
}