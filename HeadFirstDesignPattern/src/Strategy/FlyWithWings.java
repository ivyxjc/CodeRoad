package Strategy;

/**
 * Created by xgh on 2016/1/23.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly with wings!");
    }
}
