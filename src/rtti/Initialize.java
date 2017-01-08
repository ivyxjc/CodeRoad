package rtti;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jc on 1/8/2017.
 */


public class Initialize {
    public static final int staticFinal=100;
    public static final int num=new Integer(10);
    public static final int num2=1000;
    
    static {
        System.out.println(staticFinal);
        System.out.println(num);
        System.out.println(num2);
    }
    
    public Initialize(){
        System.out.println("initialize");
    }
    
    public Initialize(int i){
        System.out.println("initialize 1");
    }
}
