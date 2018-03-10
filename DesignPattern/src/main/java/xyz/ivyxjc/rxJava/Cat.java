package xyz.ivyxjc.rxJava;

/**
 * Created by jc on 11/18/2016.
 */
public class Cat implements Comparable<Cat> {
    int cuteness;


    @Override
    public int compareTo(Cat o) {
        return Integer.compare(cuteness, o.cuteness);
    }
}
