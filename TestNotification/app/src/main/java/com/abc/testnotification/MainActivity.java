package com.abc.testnotification;

import android.media.MediaPlayer;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    int index = 0;
    boolean pause = false;
    boolean end = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        java.util.Timer timer = new java.util.Timer(true);
        java.util.TimerTask task = new java.util.TimerTask() {
            @Override
            public void run() {

            }
        };
        timer.schedule(task,500);
    }
}
