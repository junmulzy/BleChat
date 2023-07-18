package com.example.blechat.view.selfview;

import android.app.Dialog;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;

import com.example.blechat.R;

/**
 * @author bm-liuzhiyong
 */
public class EnrollDialog extends Dialog {
    private final int mMaxPhoneLongth = 6;
    private final int mMaxPasswordLongth = 20;
    private final String mSpeicalStr = "^\\d+$";
    private EditText mEditTel;
    private EditText mEditPassword;


    public EnrollDialog(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        setContentView(R.layout.enroll_dialog_layout);
        setCanceledOnTouchOutside(false);
        mEditTel = (EditText) findViewById(R.id.enroll_dialog_edit_tel);
        mEditPassword = (EditText) findViewById(R.id.enroll_dialog_edit_password);
        Button mBtnOK = (Button) findViewById(R.id.enroll_dialog_btn_ok);
        Button mBtnCancel = (Button) findViewById(R.id.enroll_dialog_btn_cancel);
        mBtnOK.setOnClickListener(v -> {
            String tel = mEditTel.getText().toString().trim();
            String password = mEditPassword.getText().toString().trim();
            if(tel.isEmpty()||password.isEmpty())

        });

    }
}
