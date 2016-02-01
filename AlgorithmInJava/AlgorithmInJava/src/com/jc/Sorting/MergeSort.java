package com.jc.Sorting;
import java.util.Comparator;

/**
 * Created by jc on 11/10/2015.
 */
import com.Princeton.lib.*;
//From Top to Bottom
public class MergeSort extends Sort{

    public static void merge(Comparable[] a,int lo, int mi, int hi){
        int i=lo;
        int j=mi+1;
        Comparable[] aux=new Comparable[a.length];
        for(int k=lo;k<=hi;k++){
            aux[k]=a[k];
        }
        for(int k=lo;k<=hi;k++){
            if(i>mi){
                a[k]=aux[j++];
            }
            else if(j>hi){
                a[k]=aux[i++];
            }
            else if(less(aux[i],aux[j])){
                a[k]=aux[i++];
            }
            else{
                a[k]=aux[j++];
            }

        }

    }

    private static Comparable[] sup;
    private static Comparable[] sup2;

    @Override
    void sort(Comparable[] a) {
        sup=new Comparable[a.length];
        sort(a,0,a.length-1);

    }

    @Override
    void showProcess(Double[] a) {
        sup2=new Comparable[a.length];
        showProcess(a,0,a.length-1);
    }

    void showProcess(Double[] a,int lo, int hi){
        if(hi<=lo)
            return ;
        int mid=lo+(hi-lo)/2;

        showProcess(a,lo,mid);
        showProcess(a,mid+1,hi);
        merge(a,lo,mid,hi);
        show(a);
        StdDraw.show(50);
        StdDraw.clear();
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if(hi<=lo)
            return ;
        int mid=lo+(hi-lo)/2;

        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    public static void main(String[] args){
        int N=1000;

        Double[] a=new Double[N];

        for(int i=0;i<N;i++){
            a[i]=StdRandom.random();
        }

        for(int i=0;i<N;i++){
            System.out.println(a[i]);
        }
        new MergeSort().showProcess(a);
        merge(a,0,N/2,N-1);
    }
}
