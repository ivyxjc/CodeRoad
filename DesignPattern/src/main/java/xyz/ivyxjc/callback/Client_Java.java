package xyz.ivyxjc.callback;

import edu.princeton.algs4.StdOut;

/**
 * Created by jc on 11/18/2016.
 */
public class Client_Java {
    public static void main(String[] args){
        B b=new B();
        A a =new A(b);
        a.askQuestion("a's question");
    }
}

interface Callback{
    public void solve(String str);
}

class A implements Callback{
    private B b;
    public A(B b){
        this.b=b;
    }

    public void askQuestion(final String question){

//        //加一个线程就是异步回调, 把线程去掉直接doSomething就是同步调用
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
                b.doSomething(A.this,question);
//            }
//        }).start();
    }

    @Override
    public void solve(String str) {
        StdOut.println("the answer is "+str);
    }
}

class B{

    void doSomething(Callback callback,String question){
        StdOut.println("B gets question: "+question);
        StdOut.println("B do something");
        callback.solve("solved");
    }
}