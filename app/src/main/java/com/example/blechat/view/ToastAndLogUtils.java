package com.example.blechat.view;

import static org.litepal.util.LitePalLog.level;

import android.util.Log;
import android.widget.Toast;

import com.example.blechat.MyApplication;

/**
 * @author bm-liuzhiyong
 */
public class ToastAndLogUtils {
    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int ERROR = 5;
    public static final int NOTHING = 6;
    public static int level = 1;
    public static void showToast(String message) {
        Toast.makeText(MyApplication.getApplication(), message, Toast.LENGTH_SHORT).show();
    }
    public static void v(String tag,String msg) {
        if (level <= VERBOSE){
            Log.v(tag,msg);
        }
    }
    public static void d(String tag,String msg) {
        if (level <= DEBUG){
            Log.d(tag,msg);
        }
    }
    public static void i(String tag,String msg) {
        if (level <= INFO){
            Log.i(tag,msg);
        }
    }
    public static void w(String tag,String msg) {
        if (level <= WARN){
            Log.v(tag,msg);
        }
    }
    public static void e(String tag,String msg) {
        if (level <= ERROR){
            Log.v(tag,msg);
        }
    }
}
