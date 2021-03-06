package xyz.ivyxjc.factory;


interface Human {
    void getColor();

    void talk();

}

/**
 * Created by jc on 10/28/2016.
 */
public class NvWa extends AbstractHumanFactory {
    public static void main(String[] args) {

    }

    @Override
    public <T extends Human> T createHuamn(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}

abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuamn(Class<T> c);
}

class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("black");
    }

    @Override
    public void talk() {
        System.out.println("black talk");
    }
}

class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("white");
    }

    @Override
    public void talk() {
        System.out.println("white talk");
    }
}

class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("yellow");
    }

    @Override
    public void talk() {
        System.out.println("yellow talk");
    }
}


