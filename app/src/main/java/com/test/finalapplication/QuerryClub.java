package com.test.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class QuerryClub extends AppCompatActivity {
    private static final String TAG = "QuerryClub";
    private ListView listView;
    List<ClubItem2> users = null;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_querry_club);

        DBClubHelper openHelper = new DBClubHelper(this);
        SQLiteDatabase database = openHelper.getWritableDatabase();
        users = QueryClub2.getList(database);

        listView = findViewById(R.id.listviewclub);
        listView.setAdapter(new QuerryClub.MyAdapter2());
    }

    private class MyAdapter2 extends BaseAdapter {


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
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                itemView = inflater.inflate(R.layout.list2_activity, null);
            } else itemView = convertView;
            TextView craetor = itemView.findViewById(R.id.text_Creator1);
            TextView large = itemView.findViewById(R.id.text_large1);
            TextView main = itemView.findViewById(R.id.text_main1);
            ClubItem2 user = users.get(position);
            craetor.setText(user.getCreator());
            large.setText(user.getLarge());
            main.setText(user.getMian());
            return itemView;
        }
    }
    public void run(){

    }

}

