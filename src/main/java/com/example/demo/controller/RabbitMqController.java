package com.example.demo.controller;

import com.example.demo.amqp.HelloSend1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuyue on 2017/11/4.
 */
@RestController
@RequestMapping("/rabbit")
public class RabbitMqController {
    @Autowired
    private HelloSend1 helloSender1;

    @GetMapping("/hello")
    public void sendHello(){
        helloSender1.send();
    }

}
