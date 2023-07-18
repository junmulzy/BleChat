package com.example.blechat.model.db;

import org.litepal.crud.LitePalSupport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author bm-liuzhiyong
 */
public class ChatInfor extends LitePalSupport {
    private Date mSendTime;
    private String mMessage;
    private List<BleAddress> mAddressesList = new ArrayList<BleAddress>();
    private List<UserFriend> mUsers = new ArrayList<UserFriend>();

    public Date getmSendTime() {
        return mSendTime;
    }

    public void setmSendTime(Date mSendTime) {
        this.mSendTime = mSendTime;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public List<BleAddress> getmAddressesList() {
        return mAddressesList;
    }

    public void setmAddressesList(List<BleAddress> mAddressesList) {
        this.mAddressesList = mAddressesList;
    }

    public List<UserFriend> getmUsers() {
        return mUsers;
    }

    public void setmUsers(List<UserFriend> mUsers) {
        this.mUsers = mUsers;
    }
}
