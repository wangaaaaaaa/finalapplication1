package com.test.finalapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuerryActivity extends AppCompatActivity {
    private static final String TAG = "QuerryActivity";
    private ListView listView;
    List<Useritem1> users = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_querry);

        DBHelper1 openHelper = new DBHelper1(this);
        SQLiteDatabase database = openHelper.getWritableDatabase();
        users = QuerryActivity2.getList(database);

        listView = findViewById(R.id.listView5);
        listView.setAdapter(new MyAdapter());
    }

    private class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return users.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView;
            if(convertView==null){
                LayoutInflater inflater= (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                itemView =inflater.inflate(R.layout.list_activity,null);
            }else itemView=convertView;
            TextView studentid1=itemView.findViewById(R.id.studentid1);
            TextView passwrod1=itemView.findViewById(R.id.password1);
            TextView name1=itemView.findViewById(R.id.name1);
            TextView sex1=itemView.findViewById(R.id.sex1);
            TextView major1=itemView.findViewById(R.id.major1);
            Useritem1 user =users.get(position);
            studentid1.setText(user.getStudentid1());
            passwrod1.setText(user.getPassword1());
            name1.setText(user.getName1());
            sex1.setText(user.getSex1());
            major1.setText(user.getMajor1());
            return itemView;
        }
    }
  }
