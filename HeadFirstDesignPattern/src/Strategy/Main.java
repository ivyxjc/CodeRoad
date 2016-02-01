package Strategy;

/**
 * Created by xgh on 2016/1/23.
 */
public class Main {
    public static void main(String[] args){
        Duck mallard=new MallardDuck();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
        mallard.performQuack();
    }
}
