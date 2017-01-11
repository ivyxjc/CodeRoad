package xyz.ivyxjc.beans.beanFactory;

import xyz.ivyxjc.beans.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jc on 1/5/2017.
 */
public abstract class AbstractBeanFactory implements BeanFactory {
    private Map<String,BeanDefinition>  mBeanDefinitionMap=new ConcurrentHashMap<String, BeanDefinition>();

    @Override
    public Object getBean(String name) {
        return mBeanDefinitionMap.get(name).getBean();
    }
//
//    public Map<String, BeanDefinition> getBeanDefinitionMap() {
//        return mBeanDefinitionMap;
//    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception{
        Object bean=doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        mBeanDefinitionMap.put(name,beanDefinition);
    }


    public abstract Object doCreateBean(BeanDefinition beanDefinition)throws Exception;
}
