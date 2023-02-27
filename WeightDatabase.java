package com.example.weightlossapp_dakota_mcdonough;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class WeightDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "weights.db";
    private static final int VERSION = 2;

    public WeightDatabase(Context context){
        super(context, DATABASE_NAME, null, VERSION);
    }

    //creating database table for storing login values
    private static final class WeightsTable {
        private static final String TABLE = "loggedWeights";
        private static final String COL_DATE = "date";
        private static final String COL_WEIGHT = "weight";
    }

    //creates a table when the desired parameters are called
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table" + WeightsTable.TABLE + " (" +
                WeightsTable.COL_DATE + "text, " +
                WeightsTable.COL_WEIGHT + "float)");
    }

    //upgrades the table of logins, creating a new version when updates are made
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("drop table if exists " + WeightsTable.TABLE);
        onCreate(db);
    }

    //C - CREATE
    public long createWeight(){
        SQLiteDatabase getWritableDatabase;
        SQLiteDatabase db = getWritableDatabase;

        //would pull these values from the appropriate field in activity_main.xml
        ContentValues values = new ContentValues();
        values.put(WeightsTable.COL_DATE, );
        values.put(WeightsTable.COL_WEIGHT, );

    }
    //R - READ
    //U - UPDATE
    //D - DELETE
}


