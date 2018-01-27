package com.example.demo.jdk.DesignModel;

/**
 * Created by yuyue on 2017/12/11.
 */

/**
 * 装饰者模式
 */
public class Decorator {
    public static void main(String[] args) {
        Person xc = new Person("小菜");
        System.out.println("第一种装饰");

        TShirts ts=new TShirts();
        Jeans js=new Jeans();
        ts.decorate(xc);
        js.decorate(ts);
        js.show();

        System.out.println("/***********************第一种和第二种装饰的分割线******************/");
        System.out.println("第二种装饰");
        Socks socks=new Socks();
        Shorts shorts=new Shorts();
        socks.decorate(xc);
        shorts.decorate(socks);
        shorts.show();
    }

}

class Person{
    public Person(){
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("进行装扮的人:"+name);
    }
}

class Finery extends Person{
    protected Person component;

    public void decorate(Person component){
        this.component=component;
    }

    @Override
    public void show() {
        if (component!=null){
            component.show();
        }
    }
}

class TShirts extends Finery{
    @Override
    public void show() {
        super.show();
        System.out.println("大T桖");
//        super.show();
    }
}

class Jeans extends Finery{
    @Override
    public void show() {
        super.show();
        System.out.println("牛仔裤");
//        super.show();
    }
}

class Socks extends Finery{
    @Override
    public void show() {
        super.show();
        System.out.println("大袜子");
//        super.show();
    }
}

class Shorts extends Finery{
    @Override
    public void show() {
        super.show();
        System.out.println("大短裤");
//        super.show();
    }
}
