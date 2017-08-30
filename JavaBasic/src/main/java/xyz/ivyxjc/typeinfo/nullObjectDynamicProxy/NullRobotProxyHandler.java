package xyz.ivyxjc.typeinfo.nullObjectDynamicProxy;

import xyz.ivyxjc.typeinfo.nullObject.Null;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Created by ivxyjc on 2017/1/9.
 */
public class NullRobotProxyHandler implements InvocationHandler {

    private String nullName;


    //要代理的实例  一个NRobot(实现了Null和Robot接口)
    private Robot proxied = new NRobot();

    NullRobotProxyHandler(Class<? extends Robot> type){
        nullName=type.getSimpleName()+" NullRobot";
    }

    private class NRobot implements Null,Robot{
        @Override
        public String name() {
            return nullName;
        }

        @Override
        public String model() {
            return nullName;
        }

        @Override
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied,args);
    }



}
