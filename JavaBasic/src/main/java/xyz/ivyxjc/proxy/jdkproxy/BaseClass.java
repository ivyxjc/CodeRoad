package xyz.ivyxjc.proxy.jdkproxy;

/**
 * @author Ivyxjc
 * @since 4/1/2018
 */

public class BaseClass implements Base {
    @Override
    public void doSomething(String s) {
        System.out.println(s);
    }
}
