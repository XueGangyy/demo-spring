package com.example.demo.jdk.DesignModel;

/**
 * Created by yuyue on 2017/12/14.
 */
public class ObjectAdapter {
    public static void main(String[] args){
        Source source=new Source();
        TargeTable tar=new Wrapper(source);
        tar.methoad1();
        tar.methoad2();
    }
}

class Wrapper implements TargeTable{
    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void methoad1() {
        source.methoad1();
    }

    @Override
    public void methoad2() {
      System.out.println("Wrapper Methoad2");
    }
}
