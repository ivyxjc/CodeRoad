package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xgh on 2016/1/21.
 */
public class EvenChecker extends Thread {
    private IntGenerator mGenerator;
    private final int id;

    public EvenChecker(IntGenerator g,int ident){
        //setDaemon(true);
        mGenerator=g;
        id=ident;
    }

    @Override
    public void run() {
        //setDaemon(true);
        while (!mGenerator.isCanceled()){
            int val=mGenerator.next();
            if(val%2!=0){
                System.out.println(val+" not even! "+id);
                mGenerator.cancel();
            }
        }
    }

    public static void test(IntGenerator gp,int count){
        System.out.println("Press Control-C to exist");
        ExecutorService exec= Executors.newCachedThreadPool();
        for(int i=0;i<count;i++){
            exec.execute(new EvenChecker(gp,i));
//            EvenChecker evenChecker=new EvenChecker(gp,i);
//            evenChecker.start();
        }
        exec.shutdown();
    }

    public static void test(IntGenerator gp){
        test(gp,10);
    }
}
