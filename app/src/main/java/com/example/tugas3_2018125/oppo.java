package com.example.tugas3_2018125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class oppo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppo);
    }

    public void iphone (View view){
        Intent a = new Intent(oppo.this, MainActivity.class);
        startActivity(a);
    }
    public void realme (View view){
        Intent b = new Intent(oppo.this, realme.class);
        startActivity(b);
    }
}