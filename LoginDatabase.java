package com.example.weightlossapp_dakota_mcdonough.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class LoginDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "logins.db";
    private static final int VERSION = 2;

    public LoginDatabase(Context context){
        super(context, DATABASE_NAME, null, VERSION);
    }

    //creating database table for storing login values
    private static final class LoginTable {
        private static final String TABLE = "logins";
        private static final String COL_USERNAME = "username";
        private static final String COL_PASSWORD = "password";
    }

    //creates a table when the desired parameters are called
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table" + LoginTable.TABLE + " (" +
                LoginTable.COL_USERNAME + "text, " +
                LoginTable.COL_PASSWORD + "text)");
    }

    //upgrades the table of logins, creating a new version when updates are made
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("drop table if exists " + LoginTable.TABLE);
        onCreate(db);
    }
}


