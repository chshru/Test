package com.abc.testcallback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements MyCallback {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        new AnotherClass().exeMessage("Thread:" + count++, MainActivity.this);
                    }
                }).start();
            }
        });
    }


    @Override
    public void onCallback(String result) {
        System.out.println(result);
    }
}
