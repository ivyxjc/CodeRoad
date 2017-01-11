package xyz.ivyxjc.beans.beanFactory;

import xyz.ivyxjc.beans.BeanDefinition;
import xyz.ivyxjc.beans.PropertyValue;

import java.lang.reflect.Field;

/**
 * Created by jc on 1/5/2017.
 */
public class AutowiredBeanFactory extends AbstractBeanFactory{

    @Override
    public Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean=createBeanInstance(beanDefinition);
        applyPropertyValue(bean,beanDefinition);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition definition)throws Exception{
        return definition.getBeanClass().newInstance();
    }

    protected void applyPropertyValue(Object bean, BeanDefinition beanDefinition) throws Exception{
        for(PropertyValue value:beanDefinition.getPropertyValues().getPropertyValuesList()){
            Field fields=bean.getClass().getDeclaredField(value.getName());
            fields.setAccessible(true);
            fields.set(bean,value.getValue());
        }
    }
}
