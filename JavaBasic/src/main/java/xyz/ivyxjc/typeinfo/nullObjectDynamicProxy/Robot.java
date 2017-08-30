package xyz.ivyxjc.typeinfo.nullObjectDynamicProxy;

import xyz.ivyxjc.typeinfo.nullObject.Null;

import java.util.List;

/**
 * Created by ivxyjc on 2017/1/9.
 */
public interface Robot {
    String name();
    String model();
    List<Operation> operations();

    class Test {
        public static void test(Robot r){
            if( r instanceof Null){
                System.out.println("Null Robot");
            }
            System.out.println("Robot name: "+r.name());
            System.out.println("Robot name: "+r.model());
            for(Operation operation:r.operations()){
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
