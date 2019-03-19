package com.example.abdullahkhan.doktorchain.mainContext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import com.example.abdullahkhan.doktorchain.R;

import static android.content.SharedPreferences.*;

public class Utils {
Context context;
SharedPreferences sharedPreferences;
public Utils(Context context){
  this.context = context;
  this.sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.preference_key_file),Context.MODE_PRIVATE);
}
  public static void saveSharedPerference(Context context,String name,String value){
    @SuppressLint("CommitPrefEdits")
    Editor editor = context.getSharedPreferences(context.getResources().getString(R.string.preference_key_file),Context.MODE_PRIVATE).edit();
    editor.putString(name,value);
    editor.apply();
  }

  public void writeLoginPerference(boolean status){
    Editor editor = sharedPreferences.edit();
     ((Editor) editor).putBoolean(context.getResources().getString(R.string.preference_key_file),status);
     editor.commit();

  }

  public boolean readLoginPreference(){
   boolean status = false;
   status = sharedPreferences.getBoolean(context.getResources().getString(R.string.preference_key_file),false);
   return status;
  }
}
