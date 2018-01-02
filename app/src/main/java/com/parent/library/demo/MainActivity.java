package com.parent.library.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.parent.library.utils.LibAppUtil;
import com.parent.library.utils.LibListUtil;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LibAppUtil.getScreen();

        boolean s = LibListUtil.isNotEmpty(null);

        boolean s2 = LibListUtil.isNotEmpty(new ArrayList<String>());

        ArrayList<String> d = new ArrayList<>();
        d.add("qwwwwww");
        boolean s3 = LibListUtil.isNotEmpty(d);

        if (s3) {

        }
    }
}
