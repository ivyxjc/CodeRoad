package xyz.ivyxjc.factory;

import edu.princeton.algs4.StdOut;

/**
 * Created by 2438981 on 2016/11/16.
 */
public class AbstractFactory_main {
    public static void main(String[] args){
        ConcreteFactory1 concreteFactory1=new ConcreteFactory1();
        concreteFactory1.createProductA().method();
        concreteFactory1.createProductB().method();


        ConcreteFactory2 concreteFactory2=new ConcreteFactory2();
        concreteFactory2.createProductA().method();
        concreteFactory2.createProductB().method();
    }
}


class ConcreteFactory1 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}

class ConcreteFactory2 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}

//抽象工厂类
abstract class AbstractFactory{
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}

//两个抽象产品类
abstract class AbstractProductA{
    public abstract void method();
}

abstract class AbstractProductB{
    public abstract void method();
}

//两个具体产品类A1, A2, 两个具体产品类 B1, B2
class ConcreteProductA1 extends AbstractProductA{
    @Override
    public void method() {
        StdOut.println("concrete product A1");
    }
}

class ConcreteProductA2 extends AbstractProductA{
    @Override
    public void method() {
        StdOut.println("concrete product A2");
    }
}

class ConcreteProductB1 extends AbstractProductB{
    @Override
    public void method() {
        StdOut.println("concrete product B1");
    }
}

class ConcreteProductB2 extends AbstractProductB{
    @Override
    public void method() {
        StdOut.println("concrete product B2");
    }
}

