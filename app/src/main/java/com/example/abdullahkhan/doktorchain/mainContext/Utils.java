package com.example.abdullahkhan.doktorchain.mainContext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class Utils {


  public static void saveSharedPerference(Context context,String name,String value){
    @SuppressLint("CommitPrefEdits") SharedPreferences.Editor editor = context.getSharedPreferences("doktorApp",0).edit();
    editor.putString(name,value);
    editor.apply();
  }

}
