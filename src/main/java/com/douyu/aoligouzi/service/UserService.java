package com.douyu.aoligouzi.service;

import com.douyu.aoligouzi.model.User;

/**
 * Created by wangcong2 on 2018/8/13
 */
public interface UserService {

     User getUserById(int userId);

    boolean addUser(User record);

}
