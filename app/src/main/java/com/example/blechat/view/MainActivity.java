package com.example.blechat.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.blechat.R;

import org.litepal.tablemanager.Connector;

/**
 * @author bm-liuzhiyong
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Connector.getDatabase();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}