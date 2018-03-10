package xyz.ivyxjc.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ivyxjc on 2016/10/25.
 */
public class Multipleton {
    private static int maxNum = 2;

    private static ArrayList<String> nameList = new ArrayList<>();

    private static ArrayList<Multipleton> list = new ArrayList<>();

    private static int countNum = 0;

    static {
        for (int i = 0; i < maxNum; i++) {
            list.add(new Multipleton("Instance " + i));
        }
    }

    private Multipleton(String name) {
        nameList.add(name);
    }

    public static Multipleton getInstance() {
        Random random = new Random();
        countNum = random.nextInt(maxNum);

        return list.get(countNum);
    }
}
