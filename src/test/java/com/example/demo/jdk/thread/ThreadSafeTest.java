package com.example.demo.jdk.thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/**
 * Created by yuyue on 2017/12/7.
 */
public class ThreadSafeTest {

    public static void main(String[] args){
        for(int i=0;i<10;i++) {
            testSchedule();
        }
    }

    static void testSchedule(){
        List<Object> list=new Vector<>();
        int countThreadNum=1000;
        CountDownLatch countDownLatch=new CountDownLatch(countThreadNum);

        long start =System.currentTimeMillis();
        for(int i=0;i<countThreadNum;i++){
            Thread thread=new Thread(new myThread(list,countDownLatch));
            thread.start();
        }

        try {
            //主线程等待所有子线程完成
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long spendTime=System.currentTimeMillis()-start;
        System.out.println("ArrayList中增加10万条数据所需要消耗的时间"+spendTime+"  此时list中对象的大小"+list.size());
    }

}

class myThread implements Runnable{

    private List<Object> list;

    private CountDownLatch countDownLatch;


    myThread(List<Object> list,CountDownLatch countDownLatch){
       this.list=list;
       this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {
       for(int i=0;i<100;i++){
        list.add(new Object());
       }
       countDownLatch.countDown();
    }
}