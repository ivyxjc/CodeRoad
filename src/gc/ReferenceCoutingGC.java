package gc;

import java.util.Objects;

/**
 * Created by ivxyjc on 2016/12/16.
 */
public class ReferenceCoutingGC {
    public Object instance=null;
    private static final int _1MB=1024*1024;

    private byte[] bigSize=new byte[2*_1MB];

    public static void testGC(){
        ReferenceCoutingGC objA=new ReferenceCoutingGC();
        ReferenceCoutingGC objB=new ReferenceCoutingGC();
        objA.instance=objB;
        objB.instance=objA;

        objA=null;
        objB=null;


//        System.gc();
    }

    public static void main(String[] args){
        testGC();
    }

}
