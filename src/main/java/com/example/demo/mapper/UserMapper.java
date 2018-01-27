package com.example.demo.mapper;


import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yuyue on 2017/7/16.
 */

public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> findAllUsers();

    @Select("SELECT * FROM user WHERE 1=1 LIMIT 1")
    List<User> findOneUser();
}
