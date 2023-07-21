package com.example.blechat.model.dbpresenter;

/**
 * @author bm-liuzhiyong
 */
public interface DbPresenterIml {
    /**
     * 获取该账号的密码
     *
     * @param userTel 用户账号
     * @return 返回该账户对应的密码用于判断
     */
     String seekPassword(String userTel);

    /**
     * 注册用户
     *
     * @param userTel 用户账号
     * @param password 密码
     * @param userName 用户名称
     * @param email 用户邮箱
     */
     void enrollUser(String userTel, String password ,String userName, String email);

}
