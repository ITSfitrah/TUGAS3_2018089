package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void MainActivity(View view){
        Intent a = new Intent(MainActivity3.this,
                MainActivity.class);
        startActivity(a);
    }
    public void MainActivity2(View view){
        Intent a = new Intent(MainActivity3.this,
                MainActivity2.class);
        startActivity(a);
    }
    public void MainActivity4(View view){
        Intent a = new Intent(MainActivity3.this,
                MainActivity4.class);
        startActivity(a);
    }
}