package com.parent.library.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.parent.library.utils.LibAppUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LibAppUtil.getScreen();
    }
}
