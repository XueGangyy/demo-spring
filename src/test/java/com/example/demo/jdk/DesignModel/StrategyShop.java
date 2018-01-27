package com.example.demo.jdk.DesignModel;

import org.junit.Test;

/**
 * Created by yuyue on 2017/12/7.
 */

//策略模式简单使用,策略模式和工厂模式的结合
public class StrategyShop {
}

abstract class CommonStrategy{
   abstract void ConsoleText();
}

class StrategyA extends CommonStrategy{

    @Override
    void ConsoleText() {
        System.out.println("输出A");
    }
}

class StrategyB extends CommonStrategy{

    @Override
    void ConsoleText() {
        System.out.println("输出B");
    }
}

class StrategyC extends CommonStrategy{

    @Override
    void ConsoleText() {
        System.out.println("输出C");
    }
}

class Context{
    private CommonStrategy commonStrategy;

    public Context(String type) {
        switch (type){
            case "A":
                commonStrategy=new StrategyA();
                break;
            case "B":
                commonStrategy=new StrategyB();
                break;
            case "C":
                commonStrategy=new StrategyC();
                break;
        }
    }

    public void Console(){
        this.commonStrategy.ConsoleText();
    }
}

class main{
  public static void main(String[] args){
      Context context=new Context("C");
      context.Console();
  }
}