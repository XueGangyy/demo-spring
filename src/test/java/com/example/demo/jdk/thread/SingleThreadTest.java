package com.example.demo.jdk.thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Created by yuyue on 2017/12/7.
 */
public class SingleThreadTest {
    public static void main(String[] args){
        long start =System.currentTimeMillis();
        List<Object> list=new ArrayList<>();
        for(int i=0;i<10000000;i++){
            list.add(new Object());
        }
        for(int i=0;i<10000000;i++){
            list.add(new Object());
        }
        long spendTime=System.currentTimeMillis()-start;
        System.out.println("单线程环境下List中增加20万条数据所需要消耗的时间"+spendTime+"  此时list中对象的大小"+list.size());
    }
}
