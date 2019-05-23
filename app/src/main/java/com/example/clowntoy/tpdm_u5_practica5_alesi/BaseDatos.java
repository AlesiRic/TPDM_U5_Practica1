package com.example.clowntoy.tpdm_u5_practica5_alesi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {
    public BaseDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE LetraMensaje(Letra CHAR NOT NULL PRIMARY KEY,Mensaje VARCHAR(15))");
        db.execSQL("INSERT INTO LetraMensaje VALUES('a','aire')");
        db.execSQL("INSERT INTO LetraMensaje VALUES('b','bizarro')");
        db.execSQL("INSERT INTO LetraMensaje VALUES('c','curacion')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
