package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recylerView;
    String s1[], s2[],s3[];
    int images[] =
            {R.drawable.gambar1,R.drawable.gambar2,R.drawable.gambar3,R.drawable.gambar4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.makanan);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.star);
        destiadapter appAdapter = new
                destiadapter(this,s1,s2,s3,images);
        recylerView.setAdapter(appAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager((this), RecyclerView.HORIZONTAL, false);
        recylerView.setLayoutManager(layoutManager);
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