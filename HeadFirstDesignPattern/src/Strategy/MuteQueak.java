package Strategy;

/**
 * Created by xgh on 2016/1/23.
 */
public class MuteQueak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Silent");

    }
}
