package com.example.blechat.model.db;

import org.litepal.crud.LitePalSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bm-liuzhiyong
 */
public class BleAddress extends LitePalSupport {
    private int mAddress;
    private UserInfor mUserInfor;
    private List<UserFriend> mUsersList = new ArrayList<UserFriend>();

    public int getmAddress() {
        return mAddress;
    }

    public void setmAddress(int mAddress) {
        this.mAddress = mAddress;
    }

    public UserInfor getmUserInfor() {
        return mUserInfor;
    }

    public void setmUserInfor(UserInfor mUserInfor) {
        this.mUserInfor = mUserInfor;
    }

    public List<UserFriend> getmUsersList() {
        return mUsersList;
    }

    public void setmUsersList(List<UserFriend> mUsersList) {
        this.mUsersList = mUsersList;
    }
}

