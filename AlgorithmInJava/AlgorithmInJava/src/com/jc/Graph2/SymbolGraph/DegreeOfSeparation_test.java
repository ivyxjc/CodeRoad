package com.jc.Graph2.SymbolGraph;

/**
 * Created by xgh on 2016/2/2.
 */
public class DegreeOfSeparation_test {
    public static String filename="F:\\ivyxjc\\algs4-data\\algs4-data\\movies.txt";
    public static String delim="/";

    public static void main(String[] args){
        DegreeOfSeparation ds=new DegreeOfSeparation(filename,delim);
//        String res=ds.ConnectingPath("Animal House (1978)","Titanic (1997)");
        String res=ds.ConnectingPath(110427,9138);

        System.out.println(res);
    }
}
