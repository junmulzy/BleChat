package com.example.blechat.present;

/**
 * @author bm-liuzhiyong
 */
public interface PresenterIml {
    /**
     * 判断密码是否正确
     *
     * @param userTel  用户账号
     * @param password 用户密码
     * @return 0代表登录成功，-1代表不存在该账号，1表示密码或账号输入错误
     */
    int judgePassword(String userTel,String password);
    void login(String userTel);
    void enroll(String mTel, String mPassword);
}
