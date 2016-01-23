package threadImooc;

/**
 * Created by xgh on 2016/1/20.
 */

public class Actor extends Thread {

    @Override
    public void run() {
        super.run();
        while (!this.isInterrupted()) {
            System.out.println("threa is running....");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }

    public static void main(String[] args){
        Thread actor=new Actor();
        actor.start();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        actor.interrupt();
        System.out.println("interrupt");
    }
}
