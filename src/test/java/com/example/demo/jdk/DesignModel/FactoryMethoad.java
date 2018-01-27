package com.example.demo.jdk.DesignModel;

/**
 * Created by yuyue on 2017/12/11.
 */

/**
 * 工厂方法模式
 */
public class FactoryMethoad {
    public static void main(String[] args){
        Ifactory fV=new VolunteerFactory();
        LeiFeng lv=fV.createLeiFeng();
        lv.sweep();
        lv.helpOldMan();
        lv.wash();
    }
}

class LeiFeng{
    void wash(){
        System.out.println("洗衣服");
    }

    void sweep(){
        System.out.println("扫地");
    }

    void helpOldMan(){
        System.out.println("帮助老人");
    }
}

class Volunteer extends LeiFeng{
    @Override
    void wash() {
        System.out.println("志愿者洗衣服");
    }

    @Override
    void sweep() {
        System.out.println("志愿者扫地");
    }

    @Override
    void helpOldMan() {
        System.out.println("志愿者帮助老人");
    }
}

class UnderGraduate extends LeiFeng{
    @Override
    void wash() {
        System.out.println("大学生义工洗衣服");
    }

    @Override
    void sweep() {
        System.out.println("大学生义工扫地");
    }

    @Override
    void helpOldMan() {
        System.out.println("大学生义工帮助老人");
    }
}

interface Ifactory{
    LeiFeng createLeiFeng();
}

class VolunteerFactory implements Ifactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}

class UnderGraduateFactory implements Ifactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new UnderGraduate();
    }
}