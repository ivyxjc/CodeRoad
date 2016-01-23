package Thread;

/**
 * Created by xgh on 2016/1/20.
 */
public class ListOff implements Runnable {
    protected int countDown=10;
    private static int taskCount=0;
    private final int id=taskCount++;

    public ListOff(){};
    public ListOff(int countDown){
        this.countDown=countDown;
    }

    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"ListOff!)")+") ";
    }



    @Override
    public void run() {
        while (countDown-->0){
            System.out.print(status());
            Thread.yield();
        }
    }

    public static void main(String[] args){
        Thread lo=new Thread(new ListOff());
        lo.start();
    }
}
