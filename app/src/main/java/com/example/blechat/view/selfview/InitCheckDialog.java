package com.example.blechat.view.selfview;

import android.app.Dialog;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.blechat.R;


/**
 * @author bm-liuzhiyong
 */
public class InitCheckDialog extends Dialog {

    public InitCheckDialog(@NonNull Context context) {
        super(context);
        init();
    }
    private void init() {
        setContentView(R.layout.init_check_dialog);
        setCanceledOnTouchOutside(false);
    }

}
