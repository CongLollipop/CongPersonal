package com.douyu.aoligouzi.Dao;

import com.douyu.aoligouzi.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by wangcong2 on 2018/8/13
 */
@Mapper
public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
