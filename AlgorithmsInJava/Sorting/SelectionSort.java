
import com.Princeton.lib.*;

import java.security.AlgorithmConstraints;

/**
 * Created by jc on 11/8/2015.
 */
public class SelectionSort extends Sort {
    public void sort(Comparable[] a){
        int N=a.length;
        for(int i=0;i<N;i++){
            int min=i;
            for(int j=i+1;j<N;j++){
                if(less(a[j],a[min])) {
                    min = j;
                }
            }
            exch(a,i,min);
        }
    }

    public void showProcess(Double[] a){

    }


    public static void main(String[] args){
        int N=100;
        Double[] a=new Double[N];
        for(int i=0;i<N;i++){
            a[i]=StdRandom.random();
        }
        //showInPic(a);
        new SelectionSort().sort(a);
        showInNum(a);
        show(a);
    }
}