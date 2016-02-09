package com.jc.Digraph;

import com.jc.Graph2.Graph;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by xgh on 2016/2/3.
 */
public class DirectedCycle_test{
    private static String filename="F:\\ivyxjc\\algs4-data\\algs4-data\\tinyDG.txt";

    public static void main(String[] args)throws IOException{
        FileInputStream fis=new FileInputStream(filename);
        Scanner in=new Scanner(fis);
        int v=in.nextInt();
        Digraph G=new Digraph(v);
        int e=in.nextInt();
        for(int i=0;i<e-1;i++){
            int t1=in.nextInt();
            int t2=in.nextInt();
            G.addEdge(t1,t2);
        }
        DirectedCycle dc=new DirectedCycle(G);
        System.out.println(dc.hasCycle());
        if(dc.hasCycle()){
            for(int i:dc.cycle())
                System.out.println(i);
        }
    }
}
