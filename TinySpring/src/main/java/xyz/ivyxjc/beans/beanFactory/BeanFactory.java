package xyz.ivyxjc.beans.beanFactory;

import xyz.ivyxjc.beans.BeanDefinition;

/**
 * Created by jc on 1/5/2017.
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;

}
