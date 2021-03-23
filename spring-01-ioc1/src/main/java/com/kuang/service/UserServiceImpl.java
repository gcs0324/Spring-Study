package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoMysqlImpl;

/**
 * @author cs0324
 * @date 2021/03/21 16:54
 */
public class UserServiceImpl implements UserService{

    UserDao userDao = new UserDaoMysqlImpl();
    @Override
    public void getUser() {
        userDao.getUser();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
