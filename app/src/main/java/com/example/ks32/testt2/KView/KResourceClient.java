package com.example.ks32.testt2.KView;

import android.app.Activity;

import org.xwalk.core.XWalkResourceClient;
import org.xwalk.core.XWalkView;

/**
 * Created by asifhisam on 3/28/16.
 */
public class KResourceClient extends XWalkResourceClient {
    Activity activity;
    public KResourceClient(XWalkView view) {
        super(view);
        activity = (Activity) view.getContext();

    }
}
