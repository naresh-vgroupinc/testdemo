package com.vgroup.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class MyLibClass {

    public void showToast(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
