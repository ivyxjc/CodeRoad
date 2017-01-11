package xyz.ivyxjc.context;

import xyz.ivyxjc.beans.BeanDefinition;
import xyz.ivyxjc.beans.beanFactory.AbstractBeanFactory;
import xyz.ivyxjc.beans.beanFactory.AutowiredBeanFactory;
import xyz.ivyxjc.beans.io.ResourceLoader;
import xyz.ivyxjc.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * Created by ivxyjc on 2017/1/11.
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {
    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(configLocation, new AutowiredBeanFactory());
    }

    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinition(configLocation);
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
    }

}
