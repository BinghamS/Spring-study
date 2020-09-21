package com.song.service;

import com.song.dao.UserDao;
import com.song.dao.UserDaoImpl;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/7 10:50
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
