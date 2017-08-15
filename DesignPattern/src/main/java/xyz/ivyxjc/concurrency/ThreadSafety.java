package xyz.ivyxjc.concurrency;



import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by ivyxjc on 2016/10/26.
 */
public class ThreadSafety {

    public static void main(String[] args){




        for(int i=0;i<10;i++){
            test();
        }

//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(null);
//        list.add(3);
//        StdOut.println(list.size());

    }

    public static void test()
    {
        // 用来测试的List
        ArrayList<Object> list=new ArrayList<>();


        //线程安全的list
//        List<Object> list = Collections.synchronizedList(new ArrayList<Object>());

//        Vector<Object> list=new Vector<>();
        // 线程数量(1000)
        int threadCount = 100;

        // 用来让主线程等待threadCount个子线程执行完毕
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        // 启动threadCount个子线程
        for(int i = 0; i < threadCount; i++)
        {
            Thread thread = new Thread(new MyThread(list, countDownLatch));
            thread.start();
        }

        try
        {
            // 主线程等待所有子线程执行完成，再向下执行
            countDownLatch.await();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        int res=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==null){
                res+=1;
            }
        }
        // List的size
//        System.out.println(res) ;
        System.out.println(list.size());
        if(list.last()!=null){
            System.out.println("not null");
        }else{
            System.out.println("null");
        }
    }
}

class MyThread implements Runnable{

    private List<Object> list;

    private CountDownLatch countDownLatch;

    private String name;

    public MyThread(List<Object> list, CountDownLatch countDownLatch)
    {
        this.list = list;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
//            StdOut.println("第"+name+"线程: size: "+list.size()+" 第"+i+"次add");
            list.add(new Object());
        }

        // 完成一个子线程
        countDownLatch.countDown();
    }
}
