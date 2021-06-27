package com.test.finalapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ClubManager {
    private DBClubHelper dbclubhelper;
    private String TBClubNAME;
    private static final String TAG = "ClubManager";


    public ClubManager(Context context) {
        dbclubhelper = new DBClubHelper(context);
        TBClubNAME = DBClubHelper.TB_NAME;
    }
    public void add(Clubitem item) {
        SQLiteDatabase db = dbclubhelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("CURSTUDENTID",item.getStudentid());
        values.put("CURCLUBNAME",item.getName());
        values.put("CURCREATOR",item.getCreator());
        values.put("CURNUMBER",item.getNumber());
        values.put("CURMAIN",item.getMain());

        long r = db.insert(TBClubNAME, null, values);
        Log.i(TAG, "add: ret=" + r);
        db.close();

    }

    public List<Clubitem> listAll() {
        List<Clubitem> ret = new ArrayList<Clubitem>();
        SQLiteDatabase db= dbclubhelper.getReadableDatabase();
        Cursor cursor =db.query(TBClubNAME,null,null,null,null,null,null);
        if(cursor!=null){
            while (cursor.moveToNext()){
                Clubitem item=new Clubitem();
                item.setId(cursor.getInt(cursor.getColumnIndex("ID")));
                item.setName(cursor.getString(cursor.getColumnIndex("CURCLUBNAME")));
                item.setNumber(cursor.getString(cursor.getColumnIndex("CURNUMBER")));
                item.setStudentid(cursor.getString(cursor.getColumnIndex("CURSTUDENTID")));
                item.setCreator(cursor.getString(cursor.getColumnIndex("CURCREATOR")));
                item.setMain(cursor.getString(cursor.getColumnIndex("CURMAIN")));
                ret.add(item);
            }

        }
        db.close();
        return ret;
    }

}
