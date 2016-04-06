package com.example.ks32.testt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.xwalk.core.XWalkActivity;
import org.xwalk.core.XWalkView;
import org.xwalk.core.internal.XWalkWebChromeClient;

public class MainActivity extends XWalkActivity {
    private XWalkView mXWalkView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onXWalkReady() {
        setContentView(R.layout.activity_main);
        mXWalkView = (XWalkView) findViewById(R.id.mykView);
        mXWalkView.load("http://crosswalk-project.org/", null);
    }
}
