/**
 * Created by jc on 1/5/2017.
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object o){
        this.bean=o;
    }

    public Object getBean(){
        return bean;
    }
}
