package com.jc.Graph2.SymbolGraph;


import javax.management.timer.Timer;
import java.util.concurrent.TimeUnit;

/**
 * Created by xgh on 2016/2/2.
 */
public class SymbolGraph_test {
    public static String filename="F:\\ivyxjc\\algs4-data\\algs4-data\\movies.txt";
    public static String delim="/";

    public static void main(String[] args){
        long time1=System.currentTimeMillis();
        SymbolGraph sg=new SymbolGraph(filename,delim);
        System.out.println(sg.index("Titanic (1997)"));
        System.out.println(sg.index("Animal House (1978)"));
        long time2=System.currentTimeMillis();
        System.out.println(time2-time1);
        System.out.println(sg.name(100));
    }
}
