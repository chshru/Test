package com.abc.testhandler;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int TEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
    }


    @SuppressLint("HandlerLeak")
    private final Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case TEST:
                    addTextView("receive a message");
                    break;
            }
        }
    };


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                EditText et = findViewById(R.id.edit_text);
                if (et.getText().toString().isEmpty()) {
                    return;
                }
                int delay = Integer.valueOf(et.getText().toString());
                addTextView("send message delay " + delay + " ms");
                mHandler.sendEmptyMessageDelayed(TEST, delay);
                break;
            case R.id.button1:
                mHandler.removeMessages(TEST);
                addTextView("remove all message");
                break;
            case R.id.button3:
                clearLinearLayout();
                break;
        }
    }

    private void clearLinearLayout() {
        ((LinearLayout) findViewById(R.id.linear_layout)).removeAllViews();
    }


    private void addTextView(final String s) {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                LinearLayout ll = findViewById(R.id.linear_layout);
                TextView tv = new TextView(MainActivity.this);
                tv.setText(s);
                ll.addView(tv);
            }
        });
    }
}
