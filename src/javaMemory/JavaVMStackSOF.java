package javaMemory;

/**
 * Created by ivxyjc on 2016/12/16.
 */
public class JavaVMStackSOF {

    private int stackLength=-1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args){
        JavaVMStackSOF oom=new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.print("stack length: "+oom.stackLength);
            throw e;
        }
    }

}
