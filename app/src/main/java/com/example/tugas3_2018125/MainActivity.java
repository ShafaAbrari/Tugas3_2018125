package com.example.tugas3_2018125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oppo(View view){
        Intent a = new Intent(MainActivity.this, oppo.class);
        startActivity(a);
    }
    public void realme (View view){
        Intent a = new Intent(MainActivity.this, realme.class);
        startActivity(a);
    }

    public void iphone(View view) {
    }
}