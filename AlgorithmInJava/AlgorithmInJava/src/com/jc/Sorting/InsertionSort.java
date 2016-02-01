/**
 * Created by jc on 11/8/2015.
 */
package com.jc.Sorting;

import com.Princeton.lib.*;
public class InsertionSort extends Sort {

    public void sort(Comparable[] a){
        int N=a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }

    public void showProcess(Double[] a){
        int N=a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
            show(a);
            StdDraw.show(50);
            StdDraw.clear();
        }
    }

    public void sort(Double[] a,int flag){
        int N=a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
            show(a);
            StdDraw.show(1000);
            StdDraw.clear();
        }
    }

    public static void main(String[] args){
        int N=1000;
        Double[] a=new Double[N];
        for(int i=0;i<N;i++){
            a[i]=StdRandom.random();
        }

        new InsertionSort().showProcess(a);
        //new InsertionSort().sort(a);
    }
}
