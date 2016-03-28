package com.example.ks32.testt2.KView;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

import org.chromium.content.browser.ContentViewCore;
import org.xwalk.core.JavascriptInterface;
import org.xwalk.core.XWalkView;
import org.xwalk.core.internal.XWalkViewBridge;

/**
 * Created by asifhisam on 3/28/16.
 */
public class MYKView extends XWalkView implements ContentViewCore.InternalAccessDelegate {
    protected KResourceClient resourceClient;
    protected KUIClient uiClient;
    JavascriptInterface JSInterface;
    protected static MYKView mykView;
    public static boolean menuDisplay = true;
    public static long setButtonTime;
    static PopupWindow popupWindow;
    Display display;

    private XWalkViewBridge mWalkViewBridge;
    private ContentViewCore mContentViewCore;


    public MYKView(Context context, Activity arg1) {
        super(context, arg1);
        init2();
    }

    public MYKView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init2();
    }
    private void init2(){
        if(this.getChildCount() > 0){
            mWalkViewBridge = (XWalkViewBridge) this.getChildAt(0);
        }else{
            throw new Error("XWalkWebView Bridge not found");
        }
        mContentViewCore = mWalkViewBridge.getXWalkContentForTest();
        mContentViewCore.setContainerViewInternals(this);
    }
    @Override
    public boolean super_awakenScrollBars(int arg0, boolean arg1) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean super_dispatchKeyEvent(KeyEvent arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean super_dispatchKeyEventPreIme(KeyEvent arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void super_onConfigurationChanged(Configuration arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean super_onGenericMotionEvent(MotionEvent arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean super_onKeyUp(int arg0, KeyEvent arg1) {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public boolean awakenScrollBars() {
        // TODO Auto-generated method stub
        return super.awakenScrollBars();
    }

    @Override
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        // TODO Auto-generated method stub
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override
    public void onScrollChanged(int l, int t, int oldl, int oldt) {
        // TODO Auto-generated method stub
        //Log.i("qqq", "Scorlling");
        super.onScrollChanged(l, t, oldl, oldt);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        // TODO Auto-generated method stub
        return super.dispatchTouchEvent(ev);
    }
}
