package factory;

/**
 * Created by ivyxjc on 2016/11/11.
 */
public class SimpleFactory {
    public static <T extends Human> T createHuman(Class<T> c){
        Human human=null;
        try{
            human=(Human)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)human;
    }
}
