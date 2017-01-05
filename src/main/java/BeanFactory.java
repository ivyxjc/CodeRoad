import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jc on 1/5/2017.
 */
public class BeanFactory {
    public Map<String,BeanDefinition> beanDefinitionMap=new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name ,BeanDefinition bean){
        beanDefinitionMap.put(name,bean);
    }
}
