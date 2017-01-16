package concurrency.chp2ThreadSafety;

import concurrency.annotations.NotThreadSafe;

import java.util.Vector;

/**
 * Created by ivxyjc on 2017/1/16.
 */

/**
 * 竞态条件:
 * 一个很常见的竞态条件类型便是先检查后执行( Check-Then-Act), 即通过一个可能失效的观测结果来决定下一步动作
 */


@NotThreadSafe
public class LazyInitRace {
    private ExpensiveObject instance=null;

    /**
     * 两个线程A, B同时执行, 可能会得到不同的实例.
     * @return
     */
    public ExpensiveObject getInstance(){
        if(instance==null){
            instance=new ExpensiveObject();
        }
        return instance;
    }
}
