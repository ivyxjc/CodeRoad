package javaMemory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivxyjc on 2016/12/16.
 */
public class HeapOOM {

    static class OOMObject{

    }

    public static void main(String[] args){
        List<OOMObject> list=new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
