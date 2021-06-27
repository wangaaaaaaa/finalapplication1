package com.test.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Adamin1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adamin1);
    }
    public  void run(View x){
        Intent intent = new Intent();
        intent.setClass(Adamin1.this,QuerryActivity.class);
        startActivity(intent);
    }
    public void run1(View xx){

    }
}