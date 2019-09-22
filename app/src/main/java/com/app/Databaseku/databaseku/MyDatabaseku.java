package com.app.Databaseku.databaseku;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class MyDatabaseku extends SQLiteOpenHelper {

    static String DATABASE_NAME = "appDatabaseku";
    static int DATABASE_VERSION = 1;

    static String DATABASE_TABLE = "app_table";
    static String DB_ID = "app_Id";
    static String DB_USERNAME = "app_Username";
    static String DB_PASSWORD = "app_Password";
    static String DB_EMAIL = "app_Email";

    static String CREATE_TABLE = "CREATE TABLE " + DATABASE_TABLE + " ( " + DB_ID + "INTEGER PRIMARY KEY, "
            + DB_USERNAME + "TEXT, "
            + DB_PASSWORD + "TEXT, "
            + DB_EMAIL + "TEXT)";

    public MyDatabaseku(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("dg", "kamu berhasil membuat database");
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }
}
