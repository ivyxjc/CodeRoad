package xyz.ivyxjc.typeinfo.interfacea;

/**
 * Created by ivxyjc on 2017/1/10.
 */


/**
 * 利用包访问权限来控制, 外部的类看不到类C, 也就无法在外部更改类型为C
 * 但可以通过反射来突破这种限制
 */
class C implements A{
    @Override
    public void f() {
        System.out.println("cf");
    }

    public void g(){
        System.out.println("cg");
    }
}

public class HiddenC {
   public static A makeA(){
       return new C();
   }
}
