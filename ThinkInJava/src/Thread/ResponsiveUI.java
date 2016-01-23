package Thread;

import java.io.IOError;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xgh on 2016/1/21.
 */

class UnresponsiveUI{
    private volatile double d=1;
    public UnresponsiveUI() throws Exception{
        while (d>0){
            d=d+(Math.PI+Math.E)/d;
        }//无限循环
        System.in.read();
    }
}
public class ResponsiveUI extends Thread{
    private static volatile double d=1;
    public ResponsiveUI(){
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true){
            d=d+(Math.PI+Math.E)/d;
        }
    }

    public static void main(String[] args)throws Exception{
//        new UnresponsiveUI();


//        ExecutorService exec= Executors.newCachedThreadPool();
//        exec.execute(new ResponsiveUI());
//        System.in.read();
//        System.out.println(d);
    }
}
