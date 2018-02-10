package xyz.ivyxjc.concurrency.chp2ThreadSafety;

import java.util.concurrent.atomic.AtomicLong;
import xyz.ivyxjc.concurrency.annotations.ThreadSafe;

/**
 * Created by ivxyjc on 2017/1/16.
 */

@ThreadSafe
public class SafeCountingFactorizer {
    private final AtomicLong count=new AtomicLong(0);

    public long getCount(){
        return count.get();
    }

    public void service(){
        count.incrementAndGet();
    }
}
