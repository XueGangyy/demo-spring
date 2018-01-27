package com.example.demo.jdk.timeScheduled;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by yuyue on 2017/11/20.
 */
public class TimerTest {
    public static void main(String[] args){
     System.out.println("timer类测试");
     new BeginTask(3);
     System.out.println("开始测试");
    }

    public static class BeginTask{
        Timer timer;

        public BeginTask(Integer sec) {
            timer = new Timer();
            timer.schedule(new TimerTask(){
                @Override
                public void run() {
                    System.out.println("启动任务");
                    timer.cancel();
                }
            },sec*1000,2000);
        }
    }
}
