package xyz.ivyxjc.xml;


import xyz.ivyxjc.BeanDefinition;
import xyz.ivyxjc.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jc on 1/5/2017.
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private Map<String,BeanDefinition> registry;
    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(ResourceLoader resourceLoader){
        this.registry=new HashMap<String, BeanDefinition>();
        this.resourceLoader=resourceLoader;
    }

}
