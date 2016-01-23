package Thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by xgh on 2016/1/21.
 */

class Sleeper extends Thread{
    private int duration;

    public Sleeper(String name,int sleepTime){
        super(name);
        duration=sleepTime;
        start();
    }

    @Override
    public void run() {
        super.run();
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName()+" was interrupted. "+"isInterrupted(): "+isInterrupted());
            return;
        }
        System.out.println(getName()+" is awakened");
    }
}

class Joiner extends Thread{
    private Sleeper mSleeper;

    public Joiner(String name,Sleeper sleeper){
        super(name);
        mSleeper=sleeper;
        start();
    }

    @Override
    public void run() {
        super.run();
        try {
            mSleeper.join();mSleeper.join();
            //TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println(getName()+" join completed");
    }
}

public class Joining extends Thread{
    public static void main(String[] args){
        Sleeper sleepy=new Sleeper("Sleepy",2000);
        Sleeper grumpy=new Sleeper("Grumy",2000);

        Joiner dopey=new Joiner("Dopey",sleepy);
        Joiner doc=new Joiner("doc",grumpy);

        grumpy.interrupt();
    }

}
