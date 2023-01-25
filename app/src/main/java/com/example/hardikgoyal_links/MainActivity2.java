package com.example.hardikgoyal_links;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView im;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        im = findViewById(R.id.imageView);
        im.setBackgroundResource(R.drawable.sample);
        ib = findViewById(R.id.imageButton);
    }
    public boolean backTouch(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        return true;
    }
}