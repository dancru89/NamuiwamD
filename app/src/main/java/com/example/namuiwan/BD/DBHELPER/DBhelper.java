package com.example.namuiwan.BD.DBHELPER;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelper extends SQLiteOpenHelper {
    public static final String DBNAME = "login.db";

    public DBhelper(Context context) {
        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table users(username TEXT primary key, nick TEXT , edad TEXT, puntaje TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists users");
    }

    public boolean insertDats(String username, String nick, String edad){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("username",username);
        values.put("nick",nick);
        values.put("edad",edad);
        long result = db.insert("users",null,values);
        if(result==-1) return false;
        else
            return true;
    }

    public boolean checkusername(String nick){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users where nick=?",new String[] {nick});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

}
