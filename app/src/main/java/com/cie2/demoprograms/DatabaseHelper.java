package com.cie2.demoprograms;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String COL_1 = "id";
    public static final String COL_2 = "firstname";
    public static final String COL_3 = "lastname";
    public static final String COL_4 = "username";
    public static final String COL_5 = "password";
    public static final String COL_6 = "city";

    public DatabaseHelper(Context context) {
        super(context, MyUtil.DB_NAME, null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "create table " + MyUtil.TBL_USERS +" (" +
                COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COL_2 + " VARCHAR," +
                COL_3 + " VARCHAR," +
                COL_4 + " VARCHAR," +
                COL_5 + " VARCHAR," +
                COL_6 + " VARCHAR)";
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+MyUtil.TBL_USERS);
        onCreate(db);
    }
}