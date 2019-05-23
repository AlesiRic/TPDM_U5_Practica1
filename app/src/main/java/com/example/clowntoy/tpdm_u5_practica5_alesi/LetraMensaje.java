package com.example.clowntoy.tpdm_u5_practica5_alesi;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class LetraMensaje {

    BaseDatos base;

    String letra,mensaje;


    public LetraMensaje(Context context){
        base=new BaseDatos(context,"Mensaje",null,1);

    }

    public LetraMensaje(String a,String b){
        letra=a;mensaje=b;
    }

    public LetraMensaje[] select(){
        LetraMensaje[] res=null;
        try{

            SQLiteDatabase select=base.getReadableDatabase();
            Cursor c=select.rawQuery("SELECT * FROM LetraMensaje;",null);
            if(c.moveToFirst()){
                res=new LetraMensaje[c.getCount()];
                int pos=0;
                do{
                    res[pos]=new LetraMensaje(c.getString(0),c.getString(1));
                    pos++;
                }
                while(c.moveToNext());
            }

        }catch (SQLiteException e){

        }
        return res;
    }


}
