package com.example.demo.controller;

import com.example.demo.kafka.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuyue on 2017/11/8.
 */
@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private Sender sender;

    @GetMapping("/hello")
    public void kafkaTest(){
        sender.sendMessage();
    }
}
