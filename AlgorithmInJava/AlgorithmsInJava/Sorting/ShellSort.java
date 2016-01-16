import java.util.Comparator;
import com.Princeton.lib.*;
/**
 * Created by jc on 11/9/2015.
 */
public class ShellSort extends Sort {
    public void sort(Comparable[] a){

        int N=a.length;
        int h=1;

        while(h<N/3){
            h=3*h+1;
        }

        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i; j>=h && less(a[j],a[j-h]);j-=h){
                    exch(a,j,j-h);
                }
            }
            h=h/3;
        }
    }

    public void showProcess(Double[] a){
        int N=a.length;
        int h=1;

        while(h<N/3){
            h=3*h+1;
        }

        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i; j>=h && less(a[j],a[j-h]);j-=h){
                    exch(a,j,j-h);
                }
                show(a);
                StdDraw.show(1);
                StdDraw.clear();
            }
            h=h/3;


        }
    }


    public static void main(String[] args){
        int N=2000;
        Double[] a=new Double[N];
        for(int i=0;i<N;i++){
            a[i]=StdRandom.random();
        }
        new ShellSort().showProcess(a);
        new ShellSort().sort(a);
        //show(a);
    }
}
