package xyz.ivyxjc.singleton;


enum SingletonEnum {
    INSTACNE;

    public void doSomething() {
        System.out.println("doSomething...");
    }
}

/**
 * Created by ivyxjc on 2016/10/25.
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();

    private Emperor() {
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public static void main(String[] args) {
        SingletonEnum.INSTACNE.doSomething();
    }
}

//懒汉模式
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}

//静态内部类

//double check lock
class SingletonDCL {
    private static volatile SingletonDCL sInstance;

    private SingletonDCL() {
    }

    public static SingletonDCL getInstance() {
        if (sInstance == null) {
            synchronized (SingletonDCL.class) {
                if (sInstance == null) {
                    sInstance = new SingletonDCL();
                }
            }
        }

        return sInstance;
    }

    private Object readResolve() {
        return sInstance;
    }
}


//枚举单例

class SingletonStatic {
    private SingletonStatic() {
    }

    public static SingletonStatic getInstance() {
        return SingletonStaticHolder.sInstance;
    }

    private static class SingletonStaticHolder {
        private static final SingletonStatic sInstance = new SingletonStatic();
    }

}
