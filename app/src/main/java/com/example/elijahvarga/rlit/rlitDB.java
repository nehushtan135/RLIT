package com.example.elijahvarga.rlit;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

/**
 * Created by elijahvarga on 1/14/2016.
 */
public final class rlitDB {
    rlitDB() {
    }

    public static abstract class rlitDBEntry implements BaseColumns{
        public static final String TABLE_NAME = "Days";
        public static final String COLUMN_NAME_DAY_ID = "DayID";
        public static final String COLUMN_NAME_GREEN_OR_RED = "GreenORed";
        public static final String COLUMN_NAME_DESCRIPTION = "Description";
    }
}
