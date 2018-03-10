package xyz.ivyxjc.factory;


/**
 * Created by 2438981 on 2016/11/16.
 */


class AudiCarFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> cl) {
        AudiCar car = null;
        try {
            car = (AudiCar) Class.forName(cl.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}

abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> cl);
}


//抽象产品类
abstract class AudiCar {

    public abstract void drive();

    public abstract void selfNavigation();
}

//3个具体产品类
class AudiQ3 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q3 drive");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q3 self navigate");
    }
}

class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q5 drive");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5 self navigate");
    }
}


class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q7 drive");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7 self navigate");
    }
}

public class Factory_2 {
    public static void main(String[] args) {
        AudiFactory factory = new AudiCarFactory();

        AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selfNavigation();

        AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selfNavigation();

        AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
        audiQ7.drive();
        audiQ7.selfNavigation();

    }

}