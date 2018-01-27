package com.example.demo.jdk.DesignModel;

/**
 * Created by yuyue on 2017/12/13.
 */

/**
 * 模板方法模式
 */
public class TemplateMethod {
    public static void main(String[] args){
        AbsC a1=new ConcreateClass1();
        a1.TempleMethoadInit();
        AbsC a2=new ConcreateClass2();
        a2.TempleMethoadInit();
    }
}

abstract class AbsC{
    abstract void TestMethoad1();
    abstract void TestMethoad2();

    public void TempleMethoadInit(){
        TestMethoad1();
        TestMethoad2();
    }
}

class ConcreateClass1 extends AbsC{

    @Override
    void TestMethoad1() {
        System.out.println("测试类一方法一的实现");
    }

    @Override
    void TestMethoad2() {
       System.out.println("测试类一方法二的实现");
    }
}

class ConcreateClass2 extends AbsC{

    @Override
    void TestMethoad1() {
        System.out.println("测试类二方法一的实现");
    }

    @Override
    void TestMethoad2() {
        System.out.println("测试类二方法二的实现");
    }
}
