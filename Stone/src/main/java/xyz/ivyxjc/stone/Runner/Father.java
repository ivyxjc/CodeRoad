package xyz.ivyxjc.stone.Runner;

import xyz.ivyxjc.ast.NullStmnt;

/**
 * Created by jc on 11/28/2016.
 */
public abstract class Father {

    public static <T extends Father> T newSingle(String className) {
        Class t;
        try {
            //            System.out.println(className);
            t = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            t = null;
        }
        T tt;
        try {
            tt = (T) t.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            tt = null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            tt = null;
        }

        return tt;
    }

    public void father_1() {
        System.out.println("father_1");
    }

    public void father_2() {
        System.out.println("father_1");
    }

    public abstract void father_3();
}
