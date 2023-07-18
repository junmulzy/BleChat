package com.example.blechat.model.db;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bm-liuzhiyong
 */
public class UserInfor extends LitePalSupport {
    @Column(unique = true,nullable = false)
    private String mName;
    private String  mPassword;
    private List<BleAddress> mAddressesList = new ArrayList<BleAddress>();


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public List<BleAddress> getmAddressesList() {
        return mAddressesList;
    }

    public void setmAddressesList(List<BleAddress> mAddressesList) {
        this.mAddressesList = mAddressesList;
    }
}
