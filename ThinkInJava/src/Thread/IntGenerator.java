package Thread;

/**
 * Created by xgh on 2016/1/21.
 */
public abstract class IntGenerator {
    private volatile boolean canceled=false;

    public abstract int next();

    public void cancel(){
        canceled = true;
    }

    public boolean isCanceled(){
        return canceled;
    }
}
