package Strategy;

/**
 * Created by xgh on 2016/1/23.
 */
public abstract class Duck {
    protected FlyBehavior mFlyBehavior;
    protected QuackBehavior mQuackBehavior;

    public void performFly(){
        mFlyBehavior.fly();
    }

    public void performQuack(){
        mQuackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        mFlyBehavior=fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        mQuackBehavior=qb;
    }


    public Duck(){

    }

    public abstract void display();



    public void swim(){
        System.out.println("all ducks can swim");
    }


}
