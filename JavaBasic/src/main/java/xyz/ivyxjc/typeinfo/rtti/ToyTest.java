package xyz.ivyxjc.typeinfo.rtti;

/**
 * Created by jc on 1/8/2017.
 */


interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    //    Toy(){}
    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}


public class ToyTest {
    static void printInfo(Class c) {
        System.out.println("Class name: " + c.getName() + " is interface? [" + c.isInterface() + "]");
        System.out.println("Simple name: " + c.getSimpleName());
        System.out.println("Canonical name: " + c.getCanonicalName());
    }


    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("xyz.ivyxjc.typeinfo.rtti.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can not find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiation");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());

    }

}
