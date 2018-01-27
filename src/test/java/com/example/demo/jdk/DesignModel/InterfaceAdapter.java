package com.example.demo.jdk.DesignModel;

/**
 * Created by yuyue on 2017/12/14.
 */
public class InterfaceAdapter {
    public static void main(String[] args){
        TargeTable t1=new SourceSub1();
        t1.methoad1();
        t1.methoad2();
        TargeTable t2=new SourceSub2();
        t2.methoad1();
        t2.methoad2();
    }
}

abstract class Wrapper2 implements TargeTable{
    @Override
    public void methoad1() {
    }

    @Override
    public void methoad2() {
    }
}

class SourceSub1 extends Wrapper2{
    @Override
    public void methoad1() {
        System.out.println("SourceSub1 methoad1");
    }
}

class SourceSub2 extends Wrapper2{
    @Override
    public void methoad2() {
      System.out.println("SourceSub2 methoad2");
    }
}
