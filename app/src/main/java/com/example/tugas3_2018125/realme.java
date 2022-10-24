package com.example.tugas3_2018125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class realme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realme);
    }

    public void iphone (View view){
        Intent a = new Intent(realme.this, MainActivity.class);
        startActivity(a);
    }
    public void oppo(View view){
        Intent a = new Intent(realme.this, oppo.class);
        startActivity(a);
    }
}