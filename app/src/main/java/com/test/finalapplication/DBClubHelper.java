package com.test.finalapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBClubHelper extends SQLiteOpenHelper {

    public static final int VERSION=1;
    public static final String BD_NAME="NewClub.db";
    public static final String TB_NAME="tb_NewClub";


    public DBClubHelper(@Nullable Context context) {
        super(context, BD_NAME,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql= "CREATE TABLE "+TB_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT, CURSTUDENTID TEXT,CURCLUBNAME TEXT,CURCREATOR TEXT,CURNUMBER TEXT,CURMAIN TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
