package com.example.demo.jdk.DesignModel;

/**
 * Created by yuyue on 2017/12/14.
 */

/**
 * 抽象工厂模式
 */
public class AbstractFactory {
    public static void main(String[] args){
        Provider smsProvide=new SmsSenderFactory();
        Sender smsSender=smsProvide.Produce();
        smsSender.Send();
    }
}

interface Sender{
    void Send();
}

class SmsSender implements Sender{

    @Override
    public void Send() {
        System.out.println("发送sms信息");
    }
}

class MailSender implements Sender{

    @Override
    public void Send() {
        System.out.println("发送mail信息");
    }
}

interface Provider{
    Sender Produce();
}

class SmsSenderFactory implements Provider{

    @Override
    public Sender Produce() {
        return new SmsSender();
    }
}

class MailSenderFactory implements Provider{

    @Override
    public Sender Produce() {
        return new MailSender();
    }
}
