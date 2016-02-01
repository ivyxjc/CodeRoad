package com.jc.Searching;

import com.Princeton.lib.StdDraw;
import com.Princeton.lib.StdOut;
import com.Princeton.lib.StdRandom;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by jc on 11/27/2015.
 */
public class VisualAccumulator {
    private double total;
    private int N;

    public VisualAccumulator(int trials, double max){
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(0.002);
    }

    public void addDataValue(double val){
        N++;
        total+=val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);
    }

    public double mean(){
        return total/N;
    }

    public String toString(){
        return "Mean("+N+"Values):"+String.format("%7.5f",mean());
    }

    public static void main(String[] args){
//        int T=Integer.parseInt(args[0]);
//        VisualAccumulator a=new VisualAccumulator(T,1.0);
//        for(int t=0;t<T;t++){
//            a.addDataValue(StdRandom.random());
//            StdOut.println(a);
//        }
//        StdOut.println(a);

        //FrequencyCounter

    }
}
