package factory;

import java.lang.reflect.Constructor;

/**
 * Created by 2438981 on 2016/11/16.
 */

class Singleton{
    private Singleton(){}
    public void doSomething(){}
}
public class FactorySingle {
    private static Singleton sSingleton;

    static {
        try{
            Class cl=Class.forName(Singleton.class.getName());
            Constructor constructor=cl.getDeclaredConstructor();
            constructor.setAccessible(true);
            sSingleton=(Singleton)constructor.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton(){
        return sSingleton;
    }
}
