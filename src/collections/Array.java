package collections;

/**
 * Created by ivxyjc on 2016/12/15.
 */
public class Array {

    public static void main(String[] args){
        int [] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=i;
        }
        final int[] b=a;
        b[0]=100;
        System.out.println(a[0]);
        System.out.println(b[0]);
    }
}
