package xyz.ivyxjc.aop;

import org.aopalliance.intercept.MethodInterceptor;

/**
 * Created by ivxyjc on 2017/1/12.
 */
public class AdvisedSupport {

    private TargetSource targetSource;

    private MethodInterceptor methodInterceptor;

    public TargetSource getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }

    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }
}
