package xyz.ivyxjc.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Ivyxjc
 * @since 4/1/2018
 */
public class Client {
    public static void main(String[] args) {
        BaseClass realSubject = new BaseClass();
        InvocationHandler invocationHandler = new DynamicProxy(realSubject);

        Base proxyInstance =
            (Base) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(),
                BaseClass.class.getInterfaces(), invocationHandler);
        System.out.println(proxyInstance.getClass().getName());
        proxyInstance.doSomething("hello world");
    }
}
