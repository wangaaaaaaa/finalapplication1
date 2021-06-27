package com.test.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

    }
    public void run (View v ){
        Intent intent = new Intent();
        intent.setClass(UserActivity.this,FormClub.class);
        startActivity(intent);
    }
    public void run1 (View v ){
        Intent intent = new Intent();
        intent.setClass(UserActivity.this,QuerryClub.class);
        startActivity(intent);
    }
    public void run2(View v){
            editText = findViewById(R.id.text_lookfor);
            Intent intent = new Intent();
            String ss = editText.toString();
            intent.setClass(UserActivity.this, QueryClub2.class);
            intent.putExtra("club", ss);
            startActivity(intent);

    }
}