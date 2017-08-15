package xyz.ivyxjc.beans.beanFactory;

import org.junit.Assert;
import org.junit.Test;
import xyz.ivyxjc.HelloWorldService;
import xyz.ivyxjc.beans.BeanDefinition;
import xyz.ivyxjc.beans.beanFactory.AutowiredBeanFactory;
import xyz.ivyxjc.beans.io.ResourceLoader;
import xyz.ivyxjc.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * Created by ivxyjc on 2017/1/11.
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception{

        //读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader=new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinition("resource_test.xml");


        //解析bean, 初始化beanFactory并注册bean
        AutowiredBeanFactory beanFactory=new AutowiredBeanFactory();
        for(Map.Entry<String,BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()){
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(),beanDefinitionEntry.getValue());
        }
        HelloWorldService helloWorldService=(HelloWorldService)beanFactory.getBean("helloWorldService");
        Assert.assertNotNull(helloWorldService);
        helloWorldService.helloWorld();
    }
}
