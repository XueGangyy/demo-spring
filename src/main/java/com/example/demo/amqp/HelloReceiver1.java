package com.example.demo.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by yuyue on 2017/11/4.
 */
@Component
@RabbitListener(queues = "topic.message")
public class HelloReceiver1 {


    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver1  : " + hello);
    }

}
