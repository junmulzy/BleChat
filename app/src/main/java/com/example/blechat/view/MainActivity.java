package com.example.blechat.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import com.example.blechat.R;
import com.example.blechat.view.selfview.EnrollDialog;
import com.example.blechat.view.selfview.InitCheckDialog;

import org.litepal.LitePal;
import org.litepal.tablemanager.Connector;

/**
 * @author bm-liuzhiyong
 */
public class MainActivity extends AppCompatActivity {
    private BluetoothManager mBluetoothManager;
    private BluetoothAdapter mBluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LitePal.initialize(this);
        Connector.getDatabase();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
        init();
        initFun();
    }

    private void initUi() {

    }
    private void init(){
        //初始化的dialog显示
        InitCheckDialog initCheckDialog =new InitCheckDialog(this);
        initCheckDialog.getWindow().setBackgroundDrawableResource(R.drawable.jamb);
        initCheckDialog.show();
        //蓝牙操作类的获取
        mBluetoothManager = getSystemService(BluetoothManager.class);
        mBluetoothAdapter = mBluetoothManager.getAdapter();

        if (mBluetoothAdapter == null){
            Handler handler = new Handler(Looper.getMainLooper());
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    // 在延时3s后关闭程序
                    ToastAndLogUtils.showToast("该设备不支持该软件运行");
                    initCheckDialog.dismiss();
                    finish();
                }
            };
            long delayMillis = 3000;
            handler.postDelayed(runnable, delayMillis);
        }else{
            //申请权限

        }

    }


    private void initFun() {
    }

}