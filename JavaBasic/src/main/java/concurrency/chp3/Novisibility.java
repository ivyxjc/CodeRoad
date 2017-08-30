package concurrency.chp3;

/**
 * Created by ivxyjc on 2017/1/16.
 */


public class Novisibility {
    private static volatile boolean ready;
    private static volatile int number;
    
    public static class ReaderThread extends Thread{
        public void run(){
            while (!ready){
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().run();
        number = 40;
        ready = true;
    }
}
