package com.kuang.dao;

/**
 * @author cs0324
 * @date 2021/03/21 16:48
 */
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("mysql获取用户数据");
    }
}
