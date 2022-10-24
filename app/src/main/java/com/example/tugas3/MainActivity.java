package com.example.tugas3;

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
    public void MainActivity2(View view){
        Intent a = new Intent(MainActivity.this,
                MainActivity2.class);
        startActivity(a);
    }
    public void MainActivity3(View view){
        Intent a = new Intent(MainActivity.this,
                MainActivity3.class);
        startActivity(a);
    }
    public void MainActivity4(View view){
        Intent a = new Intent(MainActivity.this,
                MainActivity4.class);
        startActivity(a);
    }
}