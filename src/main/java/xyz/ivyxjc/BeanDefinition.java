package xyz.ivyxjc;

/**
 * Created by jc on 1/5/2017.
 */
public class BeanDefinition {

    private Object bean;

    private Class beanClass;

    private String beanClassName;

    public BeanDefinition(){

    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public String getBeanClassName() {
        return beanClassName;
    }
}
