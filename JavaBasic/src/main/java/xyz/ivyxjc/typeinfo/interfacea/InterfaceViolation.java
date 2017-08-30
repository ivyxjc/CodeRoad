package xyz.ivyxjc.typeinfo.interfacea;

/**
 * Created by ivxyjc on 2017/1/10.
 */


/**
 * 此时使用B b=(B) a; 则可以直接调用b.g(). 这和程序的预期是不相符的
 */
public class InterfaceViolation {
    public static void main(String[] args){
        A a=new B();
        a.f();
        System.out.println(a.getClass().getSimpleName());
        if(a instanceof B){
            B b=(B) a;
            b.g();
        }
    }
}

class B implements A{
    @Override
    public void f() {
        System.out.println("ag");
    }

    public void g(){

    }

}
