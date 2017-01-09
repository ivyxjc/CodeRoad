package xyz.ivyxjc.serializable_practice;

import java.util.ArrayList;

/**
 * Created by jc on 11/30/2016.
 */
public class TestRead {
    public static void main(String[] args){
//        ArrayList<Model> list=new ArrayList<>();
//        list=(ArrayList<Model>)Reader.read();
//        for(Model m:list){
//            System.out.println(m.toString());
//        }
        Object a=null;
        ArrayList<Model> list=(ArrayList<Model>) a;
        System.out.println(list);
    }
}
