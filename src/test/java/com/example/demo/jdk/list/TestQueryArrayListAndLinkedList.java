package com.example.demo.jdk.list;

import java.util.*;

/**
 * Created by yuyue on 2017/12/6.
 */
public class TestQueryArrayListAndLinkedList {

    public static final int NUM=50000;

    public static List values;

    static{
      Integer[] ites=new Integer[NUM];
        Random r=new Random();
        for(int i=0,current=0;i<NUM;i++){
            ites[i]=new Integer(current);
            current+=r.nextInt(100)+1;
        }
        values= Arrays.asList(ites);
    }

    static long timeList(List list){
        long start=System.currentTimeMillis();
        for(int i=0;i<NUM;i++){
            int index= Collections.binarySearch(list,values.get(i));
            if(index!=i){
                System.out.println("错误");
            }
        }
        return System.currentTimeMillis()-start;
    }



    public static void main(String[] args){
      System.out.println("ArrayList二分查找所需要时间"+timeList(new ArrayList(values)));
      System.out.println("LinkedList二分查找所需时间"+timeList(new LinkedList(values)));
    }
}
