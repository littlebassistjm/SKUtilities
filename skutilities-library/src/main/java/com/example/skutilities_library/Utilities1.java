package com.example.skutilities_library;

import android.content.Context;
import android.widget.Toast;

public class Utilities1 {

    public static void Toast(String text, Context context){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
