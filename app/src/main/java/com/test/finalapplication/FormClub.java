package com.test.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class FormClub extends AppCompatActivity {
    private static final String TAG = "formclub";
    EditText studentid,creator,large,main,clubname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_club);

        studentid=findViewById(R.id.text_id1);
        creator=findViewById(R.id.text_Craeator);
        large=findViewById(R.id.text_large);
        main=findViewById(R.id.text_MAIN);
        clubname=findViewById(R.id.text_clubname);
    }
    public void run(View V){
        ClubManager rateManager1 = new ClubManager(this);
        Clubitem item=new Clubitem(
                studentid.getText().toString(),
                clubname.getText().toString(),
                creator.getText().toString(),large.getText().toString(),main.getText().toString());
        rateManager1.add(item);
        Log.i(TAG, "run: "+item.getStudentid());
        Log.i(TAG, "run: "+item.getMain());
        Log.i(TAG, "run: "+item.getCreator());
        Log.i(TAG, "run: "+item.getName());
    }

}