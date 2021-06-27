package com.test.finalapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private DBHelper1 dbHelper;
    private String TBNAME;
    private static final String TAG = "UserManager";

    public UserManager(Context context) {
        dbHelper = new DBHelper1(context);
        TBNAME = DBHelper1.TB_NAME;
    }
    public void add(Useritem item) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("CURSTUDENTID",item.getStudentid());
        values.put("CURNAME", item.getName());
        values.put("CURPASSWORD", item.getPassword());
        values.put("CURSEX", item.getSex());
        values.put("CURMAJOR", item.getMajor());


        long r = db.insert(TBNAME, null, values);
        Log.i(TAG, "add: ret=" + r);
        db.close();
    }
    public List<Useritem> listAll() {
        List<Useritem> ret = new ArrayList<Useritem>();
        SQLiteDatabase db= dbHelper.getReadableDatabase();
        Cursor cursor =db.query(TBNAME,null,null,null,null,null,null);
        if(cursor!=null){
            while (cursor.moveToNext()){
                Useritem item=new Useritem();
                item.setId(cursor.getInt(cursor.getColumnIndex("ID")));
                item.setName(cursor.getString(cursor.getColumnIndex("CURNAME")));
                item.setPassword(cursor.getString(cursor.getColumnIndex("CURPASSWORD")));
                item.setStudentid(cursor.getString(cursor.getColumnIndex("CURSTUDENTID")));
                item.setMajor(cursor.getString(cursor.getColumnIndex("CURMAJOR")));
                item.setSex(cursor.getString(cursor.getColumnIndex("CURSEX")));
                ret.add(item);
            }

        }
        db.close();
        return ret;
    }

}
