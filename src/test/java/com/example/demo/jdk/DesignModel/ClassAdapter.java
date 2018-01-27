package com.example.demo.jdk.DesignModel;

/**
 * Created by yuyue on 2017/12/14.
 */
public class ClassAdapter {
    public static void main(String[] args){
        TargeTable ad=new Adapter();
        ad.methoad1();
        ad.methoad2();
    }
}

class Source{
    void methoad1(){
        System.out.println("Source Methoad1");
    }
}

interface TargeTable{
    void methoad1();
    void methoad2();
}

class Adapter extends Source implements TargeTable{

    @Override
    public void methoad1() {
        super.methoad1();
    }

    @Override
    public void methoad2() {
        System.out.println("Target Methoad2");
    }
}
