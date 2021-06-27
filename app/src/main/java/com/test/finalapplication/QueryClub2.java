package com.test.finalapplication;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class QueryClub2 {
    private static final String TAG = "QuerryActivity2";
    public static List<ClubItem2> getList(SQLiteDatabase db) {
        List<ClubItem2> newuser = new ArrayList<>();
        Cursor cursor= db.query("tb_NewClub",new String[]{"CURCREATOR","CURSTUDENTID","CURMAIN"},null
                ,null,null,null,null);
        if(cursor.moveToNext()){
            ClubItem2 clubItem2 =null;
            do{
                clubItem2 = new ClubItem2();
                clubItem2.setCreator(cursor.getString(cursor.getColumnIndex("CURCREATOR")));
                clubItem2.setLarge(cursor.getString(cursor.getColumnIndex("CURSTUDENTID")));
                clubItem2.setMian(cursor.getString(cursor.getColumnIndex("CURMAIN")));
                newuser.add(clubItem2);

            }
            while (cursor.moveToNext());
        }
        return newuser;
    }
}

