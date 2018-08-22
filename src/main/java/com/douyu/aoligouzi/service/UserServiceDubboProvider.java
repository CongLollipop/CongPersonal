package com.douyu.aoligouzi.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.douyu.aoligouzi.Dao.UserDao;
import com.douyu.aoligouzi.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wangcong2 on 2018/8/15
 */

@Service(version = "1.0")
public class UserServiceDubboProvider implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User record){
        return true;
    }

    @Override
    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
