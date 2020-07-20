package com.bytedance.packagedebug;

import android.content.Context;
import android.widget.Toast;

public class DebugPrint {
    public static void showToast(Context context) {
        Toast.makeText(context, "This is Debug", Toast.LENGTH_SHORT).show();
    }
}
