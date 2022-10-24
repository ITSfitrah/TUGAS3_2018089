package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void MainActivity(View view){
        Intent a = new Intent(MainActivity4.this,
                MainActivity.class);
        startActivity(a);
    }
    public void MainActivity3(View view){
        Intent a = new Intent(MainActivity4.this,
                MainActivity3.class);
        startActivity(a);
    }
    public void MainActivity2(View view){
        Intent a = new Intent(MainActivity4.this,
                MainActivity2.class);
        startActivity(a);
    }
}