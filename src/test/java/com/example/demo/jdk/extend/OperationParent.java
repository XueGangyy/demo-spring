package com.example.demo.jdk.extend;

/**
 * Created by yuyue on 2017/12/7.
 * 设计模式之简单工厂模式
 */
//运算类的父类
public class OperationParent {
    private double numberA;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult(){
        double result=0;
        return result;
    }
}

//继承自运算父类的加运算
class OperationAdd extends OperationParent{
    @Override
    public double getResult() {
     double result=0;
     result=getNumberA()+getNumberB();
     return result;
    }
}

//继承自运算父类的减运算
class OperationSub extends OperationParent{
    @Override
    public double getResult() {
        double result=0;
        result=getNumberA()-getNumberB();
        return result;
    }
}

//继承自运算父类的乘运算
class OperationMul extends OperationParent{
    @Override
    public double getResult() {
        double result=0;
        result=getNumberA()*getNumberB();
        return result;
    }
}

//继承自运算父类的除运算
class OperationMulDiv extends  OperationParent{
    @Override
    public double getResult() {
        double result=0;
        if(getNumberB()==0)
            throw new RuntimeException("被除数不能为0");
        result=getNumberA()*getNumberB();
        return result;
    }
}

//可以根据操作符来创建不同的运算实例
class OperationFacory{
    public static OperationParent createOperation(String operation){
        OperationParent oper=null;
        switch (operation){
            case "+":
                oper=new OperationAdd();
                break;
            case "-":
                oper= new OperationSub();
                break;
            case "*":
                oper= new OperationMul();
                break;
            case "/":
                oper= new OperationMulDiv();
                break;
        }
        return oper;
    }
}

class main{
   public static void main(String[] args){
       OperationParent oper=OperationFacory.createOperation("-");
       oper.setNumberA(12);
       oper.setNumberB(9);
       double result=oper.getResult();
       System.out.println("计算后的结果"+result);
   }
}
