package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void MainActivity(View view){
        Intent a = new Intent(MainActivity2.this,
                MainActivity.class);
        startActivity(a);
    }
    public void MainActivity3(View view){
        Intent a = new Intent(MainActivity2.this,
                MainActivity3.class);
        startActivity(a);
    }
    public void MainActivity4(View view){
        Intent a = new Intent(MainActivity2.this,
                MainActivity4.class);
        startActivity(a);
    }

}