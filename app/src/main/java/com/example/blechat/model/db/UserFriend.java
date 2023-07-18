package com.example.blechat.model.db;

import org.litepal.crud.LitePalSupport;

/**
 * @author bm-liuzhiyong
 */
public class UserFriend extends LitePalSupport {
    private String mUsername;
    private String mStatement;
    private String mIsFriend;

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmStatement() {
        return mStatement;
    }

    public void setmStatement(String mStatement) {
        this.mStatement = mStatement;
    }

    public String getmIsFriend() {
        return mIsFriend;
    }

    public void setmIsFriend(String mIsFriend) {
        this.mIsFriend = mIsFriend;
    }
}
