package xyz.ivyxjc.beans.beanFactory;

import xyz.ivyxjc.BeanReference;
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
        for(PropertyValue propertyValue:beanDefinition.getPropertyValues().getPropertyValuesList()){
            Field fields=bean.getClass().getDeclaredField(propertyValue.getName());
            fields.setAccessible(true);
            Object value=propertyValue.getValue();

            //注入为bean时 即xml文件 使用ref="..." 的情况
            if(value instanceof BeanReference){
                BeanReference beanReference=(BeanReference) value;
                value=getBean(beanReference.getName());
            }
            fields.set(bean,value);
        }
    }
}
