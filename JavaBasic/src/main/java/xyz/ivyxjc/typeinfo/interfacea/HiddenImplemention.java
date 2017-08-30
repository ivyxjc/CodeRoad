package xyz.ivyxjc.typeinfo.interfacea;

import java.lang.reflect.Method;

/**
 * Created by ivxyjc on 2017/1/10.
 */

/**
 *  以通过反射来突破访问权限控制
 */
public class HiddenImplemention {
    public static void main(String[] args)throws Exception{
        A a=HiddenC.makeA();
        a.f();

        System.out.println("----------------");
        callHiddenMethod(a,"f");
        callHiddenMethod(a,"g");
        callHiddenMethod(a,"u");
        callHiddenMethod(a,"v");

    }

    static void callHiddenMethod(Object a, String methodName) throws Exception{
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
