package com.lauren.simplenews;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class CustomApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initSdk();
    }

    private void  initSdk(){
        Logger.addLogAdapter(new AndroidLogAdapter());
    }
}

