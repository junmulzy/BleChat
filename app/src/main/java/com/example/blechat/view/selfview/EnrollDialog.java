package com.example.blechat.view.selfview;

import android.app.Dialog;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;

import com.example.blechat.R;
import com.example.blechat.present.Presenter;
import com.example.blechat.view.ToastAndLogUtils;

/**
 * @author bm-liuzhiyong
 */
public class EnrollDialog extends Dialog {
    private final int mMaxPhoneLongth = 6;
    private final String mSpeicalStr = "^\\d+$";
    private EditText mEditTel;
    private EditText mEditPassword;
    String mTel = mEditTel.getText().toString().trim();
    String mPassword = mEditPassword.getText().toString().trim();

    public EnrollDialog(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        Presenter presenter = new Presenter();
        setContentView(R.layout.enroll_dialog_layout);
        setCanceledOnTouchOutside(false);
        mEditTel = (EditText) findViewById(R.id.enroll_dialog_edit_tel);
        mEditPassword = (EditText) findViewById(R.id.enroll_dialog_edit_password);
        Button mBtnOK = (Button) findViewById(R.id.enroll_dialog_btn_ok);
        Button mBtnCancel = (Button) findViewById(R.id.enroll_dialog_btn_cancel);
        mBtnOK.setOnClickListener(v -> {
            if (checkInput()){
                switch (presenter.judgePassword(mTel,mPassword)){
                    case -1:
                        ToastAndLogUtils.showToast("不存在该账户");
                        break;
                    case 0:
                        presenter.login(mTel);
                        break;
                    case 1:
                        ToastAndLogUtils.showToast("密码输入错误，请重新输入");
                        break;
                    default:
                        ToastAndLogUtils.showToast("出现未知错误，请稍后");
                }
            }

        });
        mBtnCancel.setOnClickListener(v->{
            if (checkInput()){
               if(presenter.judgePassword(mTel,mPassword)==-1){
                   presenter.enroll(mTel,mPassword);
               }else {
                   ToastAndLogUtils.showToast("该账户已存在，无法再次注册");
               }
            }
        });
    }





    boolean checkInput(){
        if(mTel.isEmpty()||mPassword.isEmpty()){
            ToastAndLogUtils.showToast("用户账号与密码不能为空");
            return false;
        }else if (mTel.length() != mMaxPhoneLongth) {
            ToastAndLogUtils.showToast("用户账号输入不规范");
            return false;
        } else if (!mTel.matches(mSpeicalStr)) {
            ToastAndLogUtils.showToast("用户账号含有非法字符");
            return false;
        }else {
            return true;
        }
    }
    private void hideSoft() {
        InputMethodManager manager = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (manager.isActive()) {
            manager.hideSoftInputFromWindow(
                    mEditPassword.getWindowToken(),
                    InputMethodManager.HIDE_NOT_ALWAYS
            );
        }
    }

    @Override
    public void dismiss() {
        clearUi();
        hideSoft();
        super.dismiss();
    }

    private void clearUi() {
        mEditTel.setText("");
        mEditPassword.setText("");
    }
}

