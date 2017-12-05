package xyz.ivyxjc;

import java.util.HashMap;
import java.util.Map;

public class DataNotChange {

    public static void main(String[] args) {
        Map<Data, String> map = new HashMap<>();

        Data data1 = new Data(1, 2);
        map.put(data1, "123");
        System.out.println(map.get(data1));
        data1.setA(5);
        System.out.println(map.get(data1));
    }
}

class Data {
    private int a;
    private int b;

    public Data(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Data)) {
            return false;
        }
        return a == ((Data) obj).a && b == ((Data) obj).b;
    }

    @Override public int hashCode() {
        return a * 31 + b * 17;
    }
}