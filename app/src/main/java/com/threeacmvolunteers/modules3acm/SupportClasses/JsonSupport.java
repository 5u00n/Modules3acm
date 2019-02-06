package com.threeacmvolunteers.modules3acm.SupportClasses;

import android.content.Context;
import android.util.Log;

import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class JsonSupport {

    static String fileName = "videoStrings.json";
    private static ObjectOutputStream objectOut;
  
    public static void saveData(Context context, Strings mJsonResponse) {
        try {
            //String filePath = context.getFilesDir().getAbsolutePath() + "/" + fileName;/storage/emulated
            

            String filePath = "/storage/emulated/0" + "/" + fileName;

            Log.d("File Path of files--",filePath);
            FileOutputStream fileOut = new FileOutputStream(filePath);
            objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(mJsonResponse);
            fileOut.getFD().sync();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOut != null) {
                try {
                    objectOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getData(Context context) {
        try {
            File f = new File(context.getFilesDir().getPath() + "/" + fileName);
            //check whether file exists
            FileInputStream is = new FileInputStream(f);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            return new String(buffer);
        } catch (IOException e) {
            Log.e("TAG", "Error in Reading: " + e.getLocalizedMessage());
            return null;
        }
    }

    public static void  logJson(Strings obj)
    {
        //id,name,discription,date,time,url,type;
        Log.d("XXXXXXXXXXXXXXXXX","XXXXXXXXXXXXXXX");
        Log.d("XXXXXXXXXXXXXXXXX","XXXXXXXXXXXXXXX");
        Log.d("XXXXXXXXXXXXXXXXX","XXXXXXXXXXXXXXX");
        Log.d("XXXXXXXXXXXXXXXXX","XXXXXXXXXXXXXXX");
        Log.d("XXXXXXXXXXXXXXXXX","XXXXXXXXXXXXXXX");
        Log.d("ID",obj.getId());
        Log.d("NAME",obj.getName());
        Log.d("DISCRIPTION",obj.getDiscription());
        Log.d("DATE",obj.getDate());
        Log.d("TIME",obj.getTime());
        Log.d("URL",obj.getUrl());
        Log.d("TYPE",obj.getType());

    }
}
