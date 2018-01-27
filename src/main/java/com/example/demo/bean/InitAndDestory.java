package com.example.demo.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by yuyue on 2017/11/20.
 */
@Component
public class InitAndDestory {
    @PostConstruct
    public void init(){
        System.out.println("bean初始方法开始执行");
    }

    public void testInitAndDestory(String s){
        System.out.println(s);
    }

    @PreDestroy
    public void destory(){
        System.out.println("bean摧毁时候的方法开始执行");
    }


}
