import jdk.nashorn.tools.Shell;

/**
 * Created by jc on 11/8/2015.
 */
import com.Princeton.lib.*;
public class SortCompare {
    public static double time(String alg,Double[] a){
        Stopwatch timer=new Stopwatch();
        if(alg.equals("Insertion"))
            new InsertionSort().sort(a);
        if(alg.equals("Selection"))
            new SelectionSort().sort(a);
        if(alg.equals("Shell"))
            new ShellSort().sort(a);
        if(alg.equals("Merge"))
            new MergeSort().sort(a);
        if(alg.equals("Qucik"))
            new QuickSort().sort(a);
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg,int N,int T){
        double total=0.0;
        Double[] a=new Double[N];
        for(int i=0;i<T;i++){
            for(int j=0; j<N; j++){
                a[j]=StdRandom.uniform();
            }
            total+=time(alg,a);
        }
        return total;
    }


    public static void main(String[] args){
        String alg1=args[0];
        String alg2=args[1];
        int N=Integer.parseInt(args[2]);
        int T=Integer.parseInt(args[3]);

        double t1=timeRandomInput(alg1,N,T);
        double t2=timeRandomInput(alg2,N,T);
        StdOut.print(alg1+" ");
        StdOut.println(t1);
        StdOut.print(alg2+ " ");
        StdOut.println(t2);
        StdOut.printf("For %d random Double\n  %s is",N, alg1);
        StdOut.printf(" %.1f time sfaster than %s\n",t2/t1,alg2);
    }

}
