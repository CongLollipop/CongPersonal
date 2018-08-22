package com.douyu.aoligouzi.service;

import com.douyu.aoligouzi.Dao.UserDao;
import com.douyu.aoligouzi.model.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wangcong2 on 2018/8/13
 */
@ComponentScan({"com.douyu.aoligouzi.mapper"})
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;


    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    public boolean addUser(User record){
        boolean result = false;
        try {
            userDao.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
