package com.example.demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by yuyue on 2017/11/8.
 */
@Component
public class Receiver {
    @KafkaListener(topics = "mykafka")
    public void processMessage(String content) {
        System.out.println("收到消息"+Message.class);
    }

}
