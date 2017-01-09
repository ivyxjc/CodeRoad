package xyz.ivyxjc.factory;

/**
 * Created by 2438981 on 2016/11/11.
 */
public class Factory {
}


abstract class Product{
    public void method(){

    }
    public abstract void method2();
}


class ConcreteProduct1 extends Product{
    public void method2(){

    }
}

class ConcreteProduct2 extends Product{
    public void method2(){

    }
}



abstract class Creator{
    public abstract <T extends Product> T createProduct(Class<T> c);
}

class ConcreteCreator extends Creator{
    public <T extends Product> T createProduct(Class<T> c){
        Product product=null;
        try{
            product=(Product)Class.forName(c.getName()).newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
        return (T)product;
    }
}
