package com.chenshanru.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by abc on 18-2-1.
 */

public class TestTorchStatus {

    private Context context;

    public TestTorchStatus(Context context) {
        this.context = context;
    }

    public void printStatus(Boolean on) {
        String msg = on ? "turn on" : "turn off";
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
