package com.test.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Inputinfor extends AppCompatActivity {
    private static final String TAG = "Inputinfor";
    EditText studentid,name,sex,major,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputinfor);
        studentid=findViewById(R.id.text_id);
        name=findViewById(R.id.text_Name);
        password=findViewById(R.id.text_password);
        sex=findViewById(R.id.text_Sex);
        major=findViewById(R.id.text_Major);



    }
    public void run(View v){
        UserManager rateManager1 = new UserManager(this);
        Useritem item=new Useritem(
                studentid.getText().toString(),
                password.getText().toString(),
                name.getText().toString(),sex.getText().toString(),major.getText().toString());
        rateManager1.add(item);
        Log.i(TAG, "run: "+item.getStudentid());
        Log.i(TAG, "run: "+item.getMajor());
        Log.i(TAG, "run: "+item.getSex());
        Log.i(TAG, "run: "+item.getName());
    }

}