package xyz.ivyxjc.context;

import org.junit.Test;
import xyz.ivyxjc.HelloWorldService;

/**
 * Created by jc on 1/11/2017.
 */


public class ClassPathXmlApplicationContextTest {

    @Test
    public void test() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource_test.xml");
        HelloWorldService helloWorldService = (HelloWorldService) context.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
