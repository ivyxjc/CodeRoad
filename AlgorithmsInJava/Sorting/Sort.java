import java.util.Comparator;

/**
 * Created by jc on 11/9/2015.
 */

import com.Princeton.lib.*;
abstract  class Sort {
    abstract void sort(Comparable[] a);

    abstract void showProcess(Double[] a);//显示sort的过程

    static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    static void exch(Comparable[] a,int i, int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    static void showInNum(Comparable[] a){
        for(int i=0;i<a.length;i++){
            StdOut.print(a[i]+" ");
        }
        StdOut.println();
    }

    static void show(Double[] a){
        int N=a.length;
        for(int i=0;i<N;i++){
            double x=1.0*i/N;
            double y=a[i]/2;
            double rw=0.5/N;
            double rh=a[i]/2;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }

    public static boolean isSorted(Comparable[] a){
        for(int i=1;i<a.length;i++){
            if(less(a[i],a[i-1]))
                return false;
        }
        return true;
    }



}
