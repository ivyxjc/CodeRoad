package xyz.ivyxjc.priciples.lsp.prefix;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ivyxjc on 2016/10/24.
 */


//class Father {
//
//    public Collection doSomething(HashMap map){
//        StdOut.println("父类被执行...");
//        return map.values();
//    }
//}
//
//class Son extends Father{
//
//    public Collection doSomething(Map map) {
//        StdOut.println("子类被执行");
//        return map.values();
//    }
//}

class Father {

    public Collection doSomething(Map map){
        System.out.println("父类被执行...");
        return map.values();
    }
}

class Son extends Father{

    public Collection doSomething(HashMap map) {
        System.out.println("子类被执行");
        return map.values();
    }
}

public class Prefix{
    public static void main(String[] args){
//        Father f=new Father();
        Son f=new Son();
        Map map=new HashMap();
        f.doSomething(map);
    }
}
