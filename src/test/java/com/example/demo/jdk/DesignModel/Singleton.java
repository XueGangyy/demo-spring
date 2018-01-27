package com.example.demo.jdk.DesignModel;

/**
 * Created by yuyue on 2017/12/14.
 */

/**
 * 单例模式
 */
public class Singleton {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton(){
    }

    private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonFactory.instance;
    }

    public Object readResolve() {
        return getInstance();
    }

    public void test(){
        System.out.println("输出test消息");
    }
}

class maing{
    public static void main(String[] args){
        Singleton.getInstance().test();
    }
}
