package com.example.hardikgoyal_links;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView1);
        t3 = findViewById(R.id.textView2);
        t4 = findViewById(R.id.textView3);
        Linkify.addLinks(t2,Linkify.PHONE_NUMBERS);
        Linkify.addLinks(t3,Linkify.EMAIL_ADDRESSES);
        Linkify.addLinks(t4,Linkify.WEB_URLS);
    }
    public boolean textViewTouch(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
        return true;
    }
}