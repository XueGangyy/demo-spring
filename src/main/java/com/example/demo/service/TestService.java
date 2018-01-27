package com.example.demo.service;


import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuyue on 2017/7/16.
 */
@Service
public class TestService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers(){
        return userMapper.findAllUsers();
    }

    public List<User> getOneUser(){return userMapper.findOneUser();}
}
