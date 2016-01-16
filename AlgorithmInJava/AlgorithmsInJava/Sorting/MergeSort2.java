/**
 * Created by jc on 11/16/2015.
 */
import com.Princeton.lib.*;
public class MergeSort2 extends Sort {
    private static Comparable[] aux;

    private static void merge(Comparable[] a, int lo, int mid, int hi){
        int i=lo;
        int j=mid+1;

        Comparable[] aux=new Comparable[a.length];
        for(int k=lo;k<=hi;k++){
            aux[k]=a[k];
        }

        for(int k=lo;k<=hi;k++){
            if(i>mid)
                a[k]=aux[j++];
            else if(j>hi)
                a[k]=aux[i++];
            else if(less(aux[i],aux[j]))
                a[k]=aux[i++];
            else
                a[k]=aux[j++];
        }
    }

    @Override
    void sort(Comparable[] a) {
        int N=a.length;
        aux=new Comparable[N];

        for(int sz=1;sz<N;sz=sz+sz){
            for(int lo=sz;lo<N-sz;lo +=sz){
                merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));
            }
        }

    }

    @Override
    void showProcess(Double[] a) {
        int N=a.length;
        aux=new Comparable[N];

        for(int sz=1;sz<N;sz=sz+sz){
            for(int lo=0;lo<N-sz;lo +=2*sz){
                merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));
            }
        }

        show(a);
        StdDraw.show(50);
        StdDraw.clear();
    }

    public static void main(String[] args){
        int N=300;

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
