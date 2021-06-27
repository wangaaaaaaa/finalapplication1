package com.test.finalapplication;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class QuerryActivity2 {
    private static final String TAG = "QuerryActivity2";
    public static List<Useritem1> getList(SQLiteDatabase db) {
        List<Useritem1> newuser = new ArrayList<>();
        Cursor cursor= db.query("tb_user",new String[]{"CURSTUDENTID","CURPASSWORD","CURNAME","CURSEX","CURMAJOR"},null
        ,null,null,null,null);
        if(cursor.moveToNext()){
            Useritem1 useritem1 =null;
            do{
                useritem1=new Useritem1();
                useritem1.setName1(cursor.getString(cursor.getColumnIndex("CURNAME")));
                useritem1.setPassword1(cursor.getString(cursor.getColumnIndex("CURPASSWORD")));
                useritem1.setStudentid1(cursor.getString(cursor.getColumnIndex("CURSTUDENTID")));
                useritem1.setMajor1(cursor.getString(cursor.getColumnIndex("CURMAJOR")));
                useritem1.setSex1(cursor.getString(cursor.getColumnIndex("CURSEX")));
                Log.i(TAG, "getList: "+cursor.getString(cursor.getColumnIndex("CURNAME")));
                newuser.add(useritem1);
            }
            while (cursor.moveToNext());
        }
        return newuser;
    }
}