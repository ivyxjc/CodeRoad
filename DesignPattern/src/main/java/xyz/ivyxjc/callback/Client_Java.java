package xyz.ivyxjc.callback;


interface Callback {
    void solve(String str);
}

/**
 * Created by jc on 11/18/2016.
 */
public class Client_Java {
    public static void main(String[] args) {
        B b = new B();
        A a = new A(b);
        a.askQuestion("a's question");
    }
}

class A implements Callback {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public void askQuestion(final String question) {

//        //加一个线程就是异步回调, 把线程去掉直接doSomething就是同步调用
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
        b.doSomething(A.this, question);
//            }
//        }).start();
    }

    @Override
    public void solve(String str) {
        System.out.println("the answer is " + str);
    }
}

class B {

    void doSomething(Callback callback, String question) {
        System.out.println("B gets question: " + question);
        System.out.println("B do something");
        callback.solve("solved");
    }
}