package xyz.ivyxjc.bean;

import xyz.ivyxjc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jc on 1/5/2017.
 */
public abstract class AbstractBeanFactory implements BeanFactory {
    private Map<String,BeanDefinition>  mBeanDefinitionMap=new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name) {
        return mBeanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        Object bean=doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        mBeanDefinitionMap.put(name,beanDefinition);
    }


    public abstract Object doCreateBean(BeanDefinition beanDefinition);
}
