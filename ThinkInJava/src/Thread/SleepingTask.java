package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by xgh on 2016/1/20.
 */
public class SleepingTask extends ListOff{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println(status());
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
    }

    public static void main(String[] args){
        ExecutorService exec= Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
