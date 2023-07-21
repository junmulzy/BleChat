package com.example.blechat.present;

import com.example.blechat.model.dbpresenter.DbPresenter;

public class Presenter implements PresenterIml{
    DbPresenter mDbPresenter = new DbPresenter();
    @Override
    public int judgePassword(String userTel,String password) {
        String dbPassword = mDbPresenter.seekPassword(userTel);
        if (dbPassword == null){
            return -1;
        }else if(password.equals(mDbPresenter.seekPassword(userTel))){
            return 0;
        }else {
        return 1;
        }
    }

    @Override
    public  void login(String userTel) {

    }

    @Override
    public void enroll(String mTel, String mPassword) {

        mDbPresenter.enrollUser(mTel, mPassword,null,null);
    }


}
