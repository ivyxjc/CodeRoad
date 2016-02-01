package com.jc.Sorting;
import javax.smartcardio.CommandAPDU;

/**
 * Created by jc on 11/12/2015.
 */

import com.Princeton.lib.*;
public class QuickSort extends  Sort {

    @Override
    void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a,int lo ,int hi){
        if(hi<=lo)
            return ;
        int j=partition(a,lo,hi);
        sort(a,lo,j);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[] a, int lo, int hi){
        int i=lo;
        int j=hi+1;
        Comparable v=a[lo];
        while(true){
            while(less(a[++i], v))
                if(i==hi)
                    break;
            while(less(v,a[--j]))
                if(j==lo)
                    break;
            if(i>=j)
                break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;

    }

    @Override
    void showProcess(Double[] a) {
        StdRandom.shuffle(a);
        //show(a);
        showProcess(a,0,a.length-1);
    }

    private static void showProcess(Double[] a, int lo ,int hi){
        if(hi<=lo)
            return ;
        int j=showProcessPartition(a,lo,hi);

        showProcess(a,lo,j);
        showProcess(a,j+1,hi);
    }

    private static int showProcessPartition(Double[] a, int lo, int hi){
        int i=lo;
        int j=hi+1;
        Comparable v=a[lo];
        while(true){
            while(less(a[++i], v))
                if(i==hi)
                    break;
            while(less(v,a[--j]))
                if(j==lo)
                    break;
            if(i>=j)
                break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        show(a);
        StdDraw.show(10);
        StdDraw.clear();
        return j;
    }



    public static void main(String[] args){
        int N=10000;

        Double[] a=new Double[N];

        for(int i=0;i<N;i++){
            a[i]=StdRandom.random();
        }

        //new QuickSort().sort(a);
        //show(a);
        new QuickSort().showProcess(a);
    }
}
