package com.example.demo.jdk.DesignModel;

/**
 * Created by yuyue on 2017/12/11.
 */

/**
 * 代理模式
 */
public class ProxyDesign {
    public static void main(String[] args){
        ScholGirl sg=new ScholGirl("文鑫");
        ProxyMan pm=new ProxyMan(sg);
        pm.GiveFlower();
        pm.GiveSugar();
        pm.GiveNoddles();
    }
}

interface GiveGift{
    void GiveFlower();
    void GiveSugar();
    void GiveNoddles();
}

class ScholGirl{
    private String girlName;

    public ScholGirl(String girlName) {
        this.girlName = girlName;
    }

    public String getGirlName() {
        return girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }
}

class RealMan implements GiveGift{

    private ScholGirl sg;

    public RealMan(ScholGirl sg) {
        this.sg = sg;
    }

    @Override
    public void GiveFlower() {
        System.out.println("给"+sg.getGirlName()+"送花");
    }

    @Override
    public void GiveSugar() {
        System.out.println("给"+sg.getGirlName()+"送糖果");
    }

    @Override
    public void GiveNoddles() {
        System.out.println("给"+sg.getGirlName()+"送面条");
    }
}

class ProxyMan implements GiveGift{

    private RealMan rm;

    public ProxyMan(ScholGirl sg) {
    rm=new RealMan(sg);
    }

    @Override
    public void GiveFlower() {
     rm.GiveFlower();
    }

    @Override
    public void GiveSugar() {
     rm.GiveSugar();
    }

    @Override
    public void GiveNoddles() {
     rm.GiveNoddles();
    }
}