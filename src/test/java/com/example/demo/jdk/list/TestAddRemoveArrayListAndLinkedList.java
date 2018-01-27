package com.example.demo.jdk.list;

import java.util.*;

/**
 * Created by yuyue on 2017/12/6.
 */
public class TestAddRemoveArrayListAndLinkedList {
    public static final Number NUM=60000;

    public static List values;

//    static {
//        Integer its[]=new Integer[NUM.intValue()];
//        Random r=new Random();
//        for(int i=0,current=0;i<NUM.intValue();i++){
//            its[i]=new Integer(current);
//            current+=r.nextInt(100)+1;
//        }
//        values= Arrays.asList(its);
//    }

    static long timeCountAdd(List list){
//        if(list instanceof ArrayList)
//                ((ArrayList) list).trimToSize();
        long start=System.currentTimeMillis();
        for(int i=0;i<NUM.intValue();i++) {
            Integer in = new Integer(i);
            list.add(in);
//            if(list instanceof ArrayList)
//                ((ArrayList) list).trimToSize();
        }
        return System.currentTimeMillis()-start;
    }

    public static void main(String[] args){
        System.out.println("ArrayList进行添加元素的时候消耗的时间"+timeCountAdd(new ArrayList()));
        System.out.println("LinkedList进行元素添加时候消耗的时间"+timeCountAdd(new LinkedList()));
    }
}
