package com.example.elijahvarga.rlit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by elijahvarga on 1/14/2016.
 */
public final class rliteDBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "rlitDBEntry";
    public static final String TABLE_NAME = "Days";
    public static final String COLUMN_NAME_DAY_ID = "DayID";
    public static final String COLUMN_NAME_GREEN_OR_RED = "GreenORed";
    public static final String COLUMN_NAME_DESCRIPTION = "Description";

    public rliteDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {//TODO: finish this query!
        db.execSQL("CREATE TABLE" + TABLE_NAME + "(" + COLUMN_NAME_DAY_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_NAME_GREEN_OR_RED + ", " + COLUMN_NAME_DESCRIPTION + ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
