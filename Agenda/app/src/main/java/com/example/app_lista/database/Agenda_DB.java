package com.example.app_lista.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Agenda_DB extends SQLiteOpenHelper {

    private static final String DB_NAME = "Agenda_DB";
    private static final int DB_VERSION = 1;

    Cursor cursor;

    SQLiteDatabase db;

    public Agenda_DB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }

    // TODO: 10/07/2023 Terminar isso amanha - Banco de dados

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
