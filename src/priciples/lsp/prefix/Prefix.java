package priciples.lsp.prefix;

import edu.princeton.algs4.StdOut;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanjiusuo4 on 2016/10/24.
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
        StdOut.println("父类被执行...");
        return map.values();
    }
}

class Son extends Father{

    public Collection doSomething(HashMap map) {
        StdOut.println("子类被执行");
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
