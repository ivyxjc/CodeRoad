package Strategy;

/**
 * Created by xgh on 2016/1/23.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Can not fly!");
    }
}
