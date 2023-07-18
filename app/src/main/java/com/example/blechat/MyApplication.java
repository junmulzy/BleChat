package com.example.blechat;

import android.app.Application;

/**
 * @author bm-liuzhiyong
 */
public class MyApplication extends Application {

    private static MyApplication mContext = null;

    public static MyApplication getApplication() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }
}
