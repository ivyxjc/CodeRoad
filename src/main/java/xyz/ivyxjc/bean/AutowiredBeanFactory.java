package xyz.ivyxjc.bean;

import xyz.ivyxjc.BeanDefinition;

/**
 * Created by jc on 1/5/2017.
 */
public class AutowiredBeanFactory extends AbstractBeanFactory{

    @Override
    public Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            Object bean=beanDefinition.getBeanClass().newInstance();
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
