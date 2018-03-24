package com.chenshanru.mylibrary;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Timer;

public class TestCsrActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_csr);
        findViewById(R.id.test_image_aty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TestCsrActivity.this, "test activity toast", Toast.LENGTH_SHORT).show();
            }
        });
        Timer timer = new Timer();

    }
}
