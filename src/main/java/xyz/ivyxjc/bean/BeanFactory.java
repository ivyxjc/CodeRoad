package xyz.ivyxjc.bean;

import xyz.ivyxjc.BeanDefinition;

/**
 * Created by jc on 1/5/2017.
 */
public interface BeanFactory {

    public Object getBean(String name);

    public void registerBeanDefinition(String name , BeanDefinition beanDefinition);
}
