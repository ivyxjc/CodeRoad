package xyz.ivyxjc.typeinfo.nullObjectDynamicProxy;

import xyz.ivyxjc.typeinfo.nullObject.Null;

import java.lang.reflect.Proxy;

/**
 * Created by ivxyjc on 2017/1/10.
 */
public class NullRobot {
    public static Robot newNullRobot(Class<? extends Robot> type){
        return (Robot) Proxy.newProxyInstance(NullRobot.class.getClassLoader(),new Class[]{Null.class,Robot.class},new NullRobotProxyHandler(type));

    }

    public static void main(String[] args){
        Robot[] bots={
                new SnowRemoveRobot("SnowBee"),
                newNullRobot(SnowRemoveRobot.class)
        };

        for(Robot bot:bots){
            Robot.Test.test(bot);
        }
    }
}
