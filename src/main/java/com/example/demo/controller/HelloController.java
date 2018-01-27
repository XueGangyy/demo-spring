package com.example.demo.controller;


import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

import static javafx.scene.input.KeyCode.H;

/**
 * Created by yuyue on 2017/7/11.
 */
@RestController
@EnableAutoConfiguration
public class HelloController {
        @Autowired
        private UserMapper userMapper;

        @Autowired
        private TestService testService;

        @RequestMapping("/hello")
        public String hello(){
        return "hello,world";
        }

        @RequestMapping("/findAllusers")
        public Object getAllUsers(){
         return testService.getAllUsers();
        }

        @RequestMapping("/findOneUser")
        public List<User> getOneUser(){return testService.getOneUser();}

        @RequestMapping("/findOneUserMap")
        public HashMap<String,List<User>> getOneUserMap(){
                HashMap<String,List<User>> usermap=new HashMap<String,List<User>>();
                usermap.put("users",testService.getOneUser());
                return usermap;
        }

        @RequestMapping("/findSelfUserMap")
        public HashMap<String,User> getSelf(){
                HashMap<String,User> userHashMap=new HashMap<String,User>();
                User u=new User();
                u.setUser_id(78);
                u.setUser_name("王华");
                u.setUser_password("67hjashfhj");
                userHashMap.put("userself",u);
                return userHashMap;
        }
}
