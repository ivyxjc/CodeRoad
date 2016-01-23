package Thread;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by xgh on 2016/1/20.
 */

class TaskWithResult implements Callable<String>{
    private int id;
    public TaskWithResult(int id){
        this.id=id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult"+id;
    }


}

public class CallableDemo {

    public static void main(String[] args){

        ExecutorService exec= Executors.newCachedThreadPool();
        ArrayList<Future<String>> results=new ArrayList<>();

        /*submit方法会产生Future对象，是对Callable返回结果的特定类型进行了参数化
          可以用isDone()方法来查询Future是否已经完成
          可以调用get()来获取结果（若结果未准备好，get()会被阻塞）
         */
        for(int i=0;i<10;i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }

        for(Future<String> fs:results){
            try{
                Thread.sleep(100);
                System.out.println(fs.isDone());
                if(fs.isDone()){
                    System.out.println(fs.get());
                }

            }catch (InterruptedException e) {
                System.out.println(e);
                return;
            }catch (ExecutionException e){
                System.out.println(e);
            }finally {
                exec.shutdown();
            }
        }


    }
}
