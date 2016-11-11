package factory;

import edu.princeton.algs4.StdOut;

/**
 * Created by jc on 10/28/2016.
 */
public class NvWa extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuamn(Class<T> c) {
        Human human=null;
        try{
            human=(Human)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)human;
    }

    public static void main(String[] args){

    }
}

abstract class AbstractHumanFactory{
    public abstract <T extends Human> T  createHuamn(Class<T> c);
}

interface Human{
    public void getColor();
    public void talk();

}

class BlackHuman implements Human{
    @Override
    public void getColor() {
        StdOut.println("black");
    }

    @Override
    public void talk() {
        StdOut.println("black talk");
    }
}

class WhiteHuman implements Human{
    @Override
    public void getColor() {
        StdOut.println("white");
    }

    @Override
    public void talk() {
        StdOut.println("white talk");
    }
}

class YellowHuman implements Human{
    @Override
    public void getColor() {
        StdOut.println("yellow");
    }

    @Override
    public void talk() {
        StdOut.println("yellow talk");
    }
}


