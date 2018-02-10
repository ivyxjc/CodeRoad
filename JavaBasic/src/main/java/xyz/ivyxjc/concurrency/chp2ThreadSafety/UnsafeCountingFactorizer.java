package xyz.ivyxjc.concurrency.chp2ThreadSafety;

import xyz.ivyxjc.concurrency.annotations.NotThreadSafe;

/**
 * Created by ivxyjc on 2017/1/16.
 */

@NotThreadSafe
public class UnsafeCountingFactorizer {
    private long count = 0;

    public long getCount(){
        return count;
    }

    /**
     * ++count并不是原子操作, 包括"读取-修改-写入"的操作序列. 即读取count的值, 将该值+1, 将结果写入count
      */
    public void service(){
        ++count;
    }
}
