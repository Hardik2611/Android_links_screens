package com.example.hardikgoyal_links;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity3 extends AppCompatActivity implements View.OnTouchListener {
    ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cl = findViewById(R.id.cl1);
        cl.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        return true;
    }
}