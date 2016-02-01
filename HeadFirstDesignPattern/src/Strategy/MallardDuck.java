package Strategy;

/**
 * Created by xgh on 2016/1/23.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        mQuackBehavior=new Quack();
        mFlyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
